// -----------------------------------------------------------------------
// <copyright file="IInvoice.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.invoices.BillingProvider;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItemType;

/**
 * Represents all the operations that can be done on an invoice
 */
public interface IInvoice
    extends IPartnerComponentString, IEntityGetOperations<Invoice>
{
	/***
	 * Gets an invoice document operations.
	 */
    IInvoiceDocuments getDocuments();
	
    /***
     * Creates an invoice line item collection operations given a billing provider and invoice line item type.
     * 
     * @param billingProvider: billingProvider">The billing provider.
     * @param invoiceLineItemType: invoiceLineItemType">The invoice line item type.
     * @return: The invoice line item collection operations.
     */
    IInvoiceLineItemCollection by(BillingProvider billingProvider, InvoiceLineItemType invoiceLineItemType);
    
    /**
     * Retrieves the invoice. This operation is currently only supported for user based credentials.
     * 
     * @return The invoice.
     */
    Invoice get();
}