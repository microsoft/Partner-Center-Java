// -----------------------------------------------------------------------
// <copyright file="IReconLineItemCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;

/**
 * Represents the operations that can be done on partner's recon line items.
 */
public interface IReconLineItemCollection 
    extends IPartnerComponent<String>, IEntireEntityCollectionRetrievalOperations<InvoiceLineItem, SeekBasedResourceCollection<InvoiceLineItem>>
{
}