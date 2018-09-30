// -----------------------------------------------------------------------
// <copyright file="InvoiceLineItemCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class InvoiceLineItemCollectionOperations
	extends BasePartnerComponentString
	implements IInvoiceLineItemCollection
{
    /***
     * The provider of billing information.
     */
    private BillingProvider billingProvider;

    /***
     * The type of invoice line item.
     */
    private InvoiceLineItemType invoiceLineItemType;
	
	/***
	 * Initializes a new instance of the InvoiceLineItemCollectionOperations class.
	 * 
	 * @param rootPartnerOperations: The partner operations.
	 * @param invoiceId: The invoice Id.
	 * @param billingProvider: The provider of billing information.
	 * @param invoiceLineItemType: The type of invoice line item.
	 */
    public InvoiceLineItemCollectionOperations( IPartner rootPartnerOperations, String invoiceId, BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType )
	{
		super( rootPartnerOperations, invoiceId );
		
        if ( StringHelper.isNullOrEmpty( invoiceId ) )
        {
        	throw new IllegalArgumentException( "invoiceId has to be set." );
        }
        
        if ( billingProvider == BillingProvider.NONE )
        {
            throw new IllegalArgumentException("The billing provider is not valid.");
        }

        if ( invoiceLineItemType == InvoiceLineItemType.NONE )
        {
            throw new IllegalArgumentException("The invoice line item type is not valid.");
        }

        this.billingProvider = billingProvider;
        this.invoiceLineItemType = invoiceLineItemType;
	}

	/***
	 * Retrieves invoice line items for a specific billing provider and invoice line item type 
	 * 
	 * @return: The collection of invoice line items.
	 */
    @Override
	public ResourceCollection<InvoiceLineItem> get()
	{
        IPartnerServiceProxy<InvoiceLineItem, ResourceCollection<InvoiceLineItem>> partnerServiceProxy =
                new PartnerServiceProxy<InvoiceLineItem, ResourceCollection<InvoiceLineItem>>( 
                    new TypeReference<ResourceCollection<InvoiceLineItem>>()
                    {
                    },
                    this.getPartner(), 
                    MessageFormat.format( 
                        PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoiceLineItems" ).getPath(),
                        this.getContext(),
                        this.billingProvider, 
                        this.invoiceLineItemType, 
                        Locale.US ) );

        return partnerServiceProxy.get();
	}

	/***
	 * Retrieves invoice line items for a specific billing provider and invoice line item type and allows paging
	 * 
	 * @return: The collection of invoice line items.
	 */
	@Override
	public ResourceCollection<InvoiceLineItem> get( int size, int offset )
	{
        IPartnerServiceProxy<InvoiceLineItem, ResourceCollection<InvoiceLineItem>> partnerServiceProxy =
                new PartnerServiceProxy<InvoiceLineItem, ResourceCollection<InvoiceLineItem>>( 
                    new TypeReference<ResourceCollection<InvoiceLineItem>>()
                    {
                    }, 
                    this.getPartner(), 
                    MessageFormat.format( 
                        PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoiceLineItems" ).getPath(),
                        this.getContext(), this.billingProvider, 
                        this.invoiceLineItemType, 
                        Locale.US ) );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoiceLineItems" ).getParameters().get( "Size" ),
            String.valueOf( size ) ) );

        partnerServiceProxy.getUriParameters().add( 
            new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoiceLineItems" ).getParameters().get( "Offset" ),
            String.valueOf( offset ) ) );

        return partnerServiceProxy.get();
	}
}