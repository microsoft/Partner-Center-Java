// -----------------------------------------------------------------------
// <copyright file="IInvoice.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.invoices.BillingPeriod;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;

/**
 * Represents all the operations that can be done on an invoice
 */
public interface IInvoice
    extends IPartnerComponentString, IEntityGetOperations<Invoice>
{
	/**
	 * Gets an invoice document operations.
     * 
     * @return An invoice document operations.
	 */
    IInvoiceDocuments getDocuments();

    /**
     * Gets the available receipt operations.
     * 
     * @return The available receipt opreations.
     */    
    IReceiptCollection getReceipts();
	
    /**
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param billingProvider The billing provider.
     * @param invoiceLineItemType The invoice line item type.
     * @return The invoice line item collection operations.
     */
    IInvoiceLineItemCollection by(BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType);
 
    /**
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param provider The type of billing provider.
     * @param invoiceLineItemType The type of invoice line item type.
     * @param currencyCode The currency code.
     * @param period The period for unbilled recon.
     */
    IReconLineItemCollection By(BillingProvider provider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period);

    /**
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param provider The type of billing provider.
     * @param invoiceLineItemType The type of invoice line item type.
     * @param currencyCode The currency code.
     * @param period The period for unbilled recon.
     * @param pageSize The number of records returned in a single operation.
     */
    IReconLineItemCollection By(BillingProvider provider, InvoiceLineItemType invoiceLineItemType, String currencyCode, BillingPeriod period, int pageSize);
}