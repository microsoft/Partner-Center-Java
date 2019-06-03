// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    IEntitySelector<String, IInvoice>
{
    /**
     * Gets the available estimate operations.
     * 
     * @return THe available estimate operations.
     */
    IEstimateCollection getEstimates();

    /**
     * Gets the partner's current account balance.
     * 
     * @return invoice summary operations.
     */
    IInvoiceSummary getSummary();
    
    /**
     * Gets the invoice summary collection operations.
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
    IInvoice byId(String invoiceId);
    
    /**
     * Gets all the invoices.
     * @return The invoices.
     */
    ResourceCollection<Invoice> get();
    
    /**
     * Queries invoices associated to the partner.
     * @param query The query.
     * @return The invoices.
     */
    ResourceCollection<Invoice> query(IQuery query);
}