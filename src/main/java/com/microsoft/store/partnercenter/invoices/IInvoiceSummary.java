// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.invoices.InvoiceSummary;

public interface IInvoiceSummary
	extends IPartnerComponentString, IEntityGetOperations<InvoiceSummary>
{
    /**
     * Retrieves the invoice summary. This operation is currently only supported for user based credentials.
     * 
     * @return The invoice summary.
     */
    InvoiceSummary get();
}
