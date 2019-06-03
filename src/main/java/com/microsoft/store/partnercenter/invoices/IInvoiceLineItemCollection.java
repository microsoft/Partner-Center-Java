// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.InvoiceLineItem;

public interface IInvoiceLineItemCollection
	extends IPartnerComponentString, IEntityCollectionRetrievalOperations<InvoiceLineItem, ResourceCollection<InvoiceLineItem>>
{
	/**
	 * Retrieves invoice line items for a specific billing provider and invoice line item type
	 * @return The collection of invoice line items. 
	 */
   ResourceCollection<InvoiceLineItem> get();
   
   /**
    * Retrieves a subset of invoice line items for a specific billing provider and invoice line item type 
    * @param size The maximum number of invoice line items to return.
    * @param offset The page offset.
    * @return The subset of invoice line items.
    */
   ResourceCollection<InvoiceLineItem> get(int size, int offset);
}