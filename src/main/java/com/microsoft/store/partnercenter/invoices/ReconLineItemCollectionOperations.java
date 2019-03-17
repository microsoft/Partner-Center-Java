// -----------------------------------------------------------------------
// <copyright file="ReconLineItemCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.BillingPeriod;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Represents the operations that can be done on partner's recon line items.
 */
public class ReconLineItemCollectionOperations 
    extends BasePartnerComponent<String>
    implements IReconLineItemCollection 
{
    /**
     * The maximum page size for recon line items.
     */
    private final int maxPageSizeReconLineItems = 2000;

    /**
     * The type of billing provider.
     */
    private BillingProvider billingProvider;

    /**
     * The currency code.
     */
    private String currencyCode;

    /**
     * The type of invoice line item.
     */
    private InvoiceLineItemType invoiceLineItemType;

    /**
     * The page size;
     */
    private int pageSize; 

    /**
     * The billing period.
     */
    private BillingPeriod period;

	/**
	 * Initializes a new instance of the ReconLineItemCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param billingProvider The billing provider type.
     * @param invoiceLineItemType The invoice line item type.
     * @param currencyCode The currency code.
     * @param period The billing period.
	 */
	public ReconLineItemCollectionOperations(IPartner rootPartnerOperations, String invoiceId, BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period)
	{
        super(rootPartnerOperations, invoiceId);

        if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(currencyCode))
        {
			throw new IllegalArgumentException("currencyCode must be set");
        }

        this.billingProvider = billingProvider;
        this.invoiceLineItemType = invoiceLineItemType;
        this.currencyCode = currencyCode;
        this.period = period;

        pageSize = maxPageSizeReconLineItems;
    }

    /**
	 * Initializes a new instance of the ReconLineItemCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param invoiceId The invoice identifier.
     * @param billingProvider The billing provider type.
     * @param invoiceLineItemType The invoice line item type.
     * @param currencyCode The currency code.
     * @param period The billing period.
     * @param pageSize The number of records returned in a single operation.
	 */
	public ReconLineItemCollectionOperations(IPartner rootPartnerOperations, String invoiceId, BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period, int pageSize)
	{
        super(rootPartnerOperations, invoiceId);

        if (StringHelper.isNullOrWhiteSpace(invoiceId))
		{
			throw new IllegalArgumentException("invoiceId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(currencyCode))
        {
			throw new IllegalArgumentException("currencyCode must be set");
        }

        this.billingProvider = billingProvider;
        this.invoiceLineItemType = invoiceLineItemType;
        this.currencyCode = currencyCode;
        this.period = period;

        this.pageSize = pageSize;
    }
    
    /**
     * Gets the recon line items collection of the partner.
     * 
     * @return The collection of recon line items.
     */
    @Override
    public SeekBasedResourceCollection<InvoiceLineItem> get() 
    {
        Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getParameters().get("CurrencyCode"),
                currencyCode));
        
        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getParameters().get("InvoiceLineItemType"),
                invoiceLineItemType.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getParameters().get("Period"),
                period.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getParameters().get("Provider"),
                billingProvider.toString()));

        parameters.add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getParameters().get("Size"),
                String.valueOf(pageSize)));

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SeekBasedResourceCollection<InvoiceLineItem>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetReconLineItems").getPath(),
                this.getContext()),
            parameters);
    }
}