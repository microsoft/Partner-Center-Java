// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;

/**
 * Represents the available operations for receipts.
 */
public interface IReceiptCollection
    extends IPartnerComponentString, IEntitySelector<String, IReceipt>
{
}