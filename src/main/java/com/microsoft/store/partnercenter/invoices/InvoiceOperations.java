// -----------------------------------------------------------------------
// <copyright file="InvoiceOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Operations available for the reseller's invoice.
 */
public class InvoiceOperations
    extends BasePartnerComponentString
    implements IInvoice
{
    /**
     * Initializes a new instance of the {@link #InvoiceOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param invoiceId The invoice id.
     */
    public InvoiceOperations( IPartner rootPartnerOperations, String invoiceId )
    {
        super( rootPartnerOperations, invoiceId );
        if ( StringHelper.isNullOrWhiteSpace( invoiceId ) )
        {
            throw new IllegalArgumentException( "invoiceId has to be set." );
        }
    }

	/***
	 * Gets an invoice documents operations.
	 */
    @Override
	public IInvoiceDocuments getDocuments()
    {
    	return new InvoiceDocumentsOperations( this.getPartner(), this.getContext() );
	}

    /***
     * Creates an invoice line item collection operation given a billing provider and invoice line item type.
     * 
     * @param billingProvider: The billing provider.
     * @param invoiceLineItemType: The invoice line item type.
     * @return: The invoice line item collection operations.
     */
    public IInvoiceLineItemCollection by( BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType )
    {
        return new InvoiceLineItemCollectionOperations( this.getPartner(), this.getContext(), billingProvider, invoiceLineItemType );
    }

    /**
     * Retrieves information about a specific invoice.
     * 
     * @return The invoice.
     */
    @Override
    public Invoice get()
    {
        IPartnerServiceProxy<Invoice, Invoice> partnerServiceProxy =
            new PartnerServiceProxy<Invoice, Invoice>( new TypeReference<Invoice>()
            {
            }, 
            this.getPartner(), MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetInvoice" ).getPath(),
                this.getContext(),
                Locale.US ) );

        return partnerServiceProxy.get();
    }
}