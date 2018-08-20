// -----------------------------------------------------------------------
// <copyright file="IInvoiceDocuments.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;

public interface IInvoiceDocuments extends IPartnerComponentString
{
    /***
     * Gets an invoice statement operations.
     */
    IInvoiceStatement getStatement();

}
