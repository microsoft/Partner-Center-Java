// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;
import com.microsoft.store.partnercenter.models.query.SeekOperation;

/**
 * Represents the operations that can be done on partner's recon line items.
 */
public interface IReconciliationLineItemCollection 
    extends IPartnerComponent<String>, IEntireEntityCollectionRetrievalOperations<InvoiceLineItem, SeekBasedResourceCollection<InvoiceLineItem>>
{
    /**
     * Seek the recon line items collection of the partner.
     *
     * @return The collection of recon line items.
     */
    SeekBasedResourceCollection<InvoiceLineItem> get(String continuationToken, SeekOperation seekOperation);
}
