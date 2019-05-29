// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;

public interface IInvoiceDocuments extends IPartnerComponentString
{
    /**
     * Gets an invoice statement operations.
     * 
     * @return An invoice statement operations.
     */
    IInvoiceStatement getStatement();
}