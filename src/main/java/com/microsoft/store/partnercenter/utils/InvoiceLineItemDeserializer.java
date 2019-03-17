// -----------------------------------------------------------------------
// <copyright file="InvoiceLineItemDeserializer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utils;

import java.io.IOException;
import java.text.MessageFormat;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.DailyRatedUsageReconLineItem;
import com.microsoft.store.partnercenter.models.invoices.DailyUsageLineItem;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.invoices.LicenseBasedLineItem;
import com.microsoft.store.partnercenter.models.invoices.OneTimeInvoiceLineItem;
import com.microsoft.store.partnercenter.models.invoices.UsageBasedLineItem;

public class InvoiceLineItemDeserializer
    extends StdDeserializer<InvoiceLineItem>
{
    private static final long serialVersionUID = 2L;

    public InvoiceLineItemDeserializer() 
    { 
        this(null); 
    } 
 
    public InvoiceLineItemDeserializer(Class<?> vc) 
    { 
        super(vc); 
    }

    @Override
    public InvoiceLineItem deserialize(JsonParser parser, DeserializationContext ctxt) 
      throws IOException, JsonProcessingException 
    {
        ObjectMapper mapper = (ObjectMapper)parser.getCodec();
        ObjectReader reader = null; 
        JsonNode jsonNode = parser.readValueAsTree();
        Object target = null;
        String billingProvider = jsonNode.get( "billingProvider" ).textValue();
        String invoiceLineItemType = jsonNode.get( "invoiceLineItemType" ).textValue();

        if (invoiceLineItemType.equals("usage_line_items"))
        {
            if (billingProvider.equalsIgnoreCase(BillingProvider.AZURE.toString()))
            {
                reader = mapper.readerFor(DailyUsageLineItem.class);
            }
            else if(billingProvider.equalsIgnoreCase(BillingProvider.MARKETPLACE.toString()))
            {
                reader = mapper.readerFor(DailyRatedUsageReconLineItem.class);
            }
        }
        else if (invoiceLineItemType.equals("billing_line_items"))
        {
            if (billingProvider.equalsIgnoreCase(BillingProvider.AZURE.toString()))
            {
                reader = mapper.readerFor(UsageBasedLineItem.class);
            }
            else if (billingProvider.equalsIgnoreCase(BillingProvider.OFFICE.toString()))
            {
                reader = mapper.readerFor(LicenseBasedLineItem.class);
            }
            else if (billingProvider.equalsIgnoreCase(BillingProvider.ONE_TIME.toString()))
            {
                reader = mapper.readerFor(OneTimeInvoiceLineItem.class);
            }
            else if (billingProvider.equalsIgnoreCase(BillingProvider.ALL.toString()))
            {
                reader = mapper.readerFor(OneTimeInvoiceLineItem.class);
            }  
        }
        else
        {
            throw new IOException(MessageFormat.format( "InvoiceLineItemConverter cannot deserialize invoice line items with type {0}", invoiceLineItemType));
        }
        
        if (reader == null)
        {
            throw new IOException(MessageFormat.format( "InvoiceLineItemConverter cannot deserialize invoice line items with type {0} and billing provider: {1}", invoiceLineItemType, billingProvider));
        }

        target = reader.readValue(jsonNode);

        return (InvoiceLineItem)target;
    }
}