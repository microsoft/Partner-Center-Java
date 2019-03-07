// -----------------------------------------------------------------------
// <copyright file="IReceiptCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;

/**
 * Represents the available operations for receipts.
 */
public interface IReceiptCollection
    extends IPartnerComponentString, IEntitySelector<IReceipt>
{
}