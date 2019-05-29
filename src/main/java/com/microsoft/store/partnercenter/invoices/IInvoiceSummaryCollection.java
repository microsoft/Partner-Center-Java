// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.InvoiceSummary;

/**
 * Represents all the operations that can be done on invoice summary collection.
 */
public interface IInvoiceSummaryCollection
	extends IPartnerComponentString, IEntityGetOperations<ResourceCollection<InvoiceSummary>>
{
	/**
	 * Retrieves the invoice summary collection. This operation is currently only supported for user based credentials.
	 */
    ResourceCollection<InvoiceSummary> get();
}