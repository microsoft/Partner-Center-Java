// -----------------------------------------------------------------------
// <copyright file="IInvoiceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.Invoice;
import com.microsoft.store.partnercenter.models.query.IQuery;

/**
 * Represents the operations that can be done on Partner's invoices
 */
public interface IInvoiceCollection
    extends IPartnerComponentString, IEntityCollectionRetrievalOperations<Invoice, ResourceCollection<Invoice>>,
    IEntitySelector<IInvoice>
{
    /**
     * Retrieves the partner's current account balance.
     * 
     * @return invoice summary operations.
     */
    IInvoiceSummary getSummary();
    
    /**
     * Retrieves the invoice summary collection operations.
     * 
     * @return The invoice summary collection operations.
     */
    IInvoiceSummaryCollection getSummaries();

    /**
     * Gets a single invoice operations.
     * 
     * @param invoiceId The invoice id.
     * @return The invoice operations.
     */
    IInvoice byId( String invoiceId );
    
    /**
     * Retrieves all the invoices.
     * @return The invoices.
     */
    ResourceCollection<Invoice> get();
    
    /**
     * Queries invoices associated to the partner.
     * @param query The query.
     * @return The invoices.
     */
    ResourceCollection<Invoice> query( IQuery query );
}