// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the available receipt operations.
 */
public interface IReceipt extends IPartnerComponent<Tuple<String, String>>
{
    /**
     *  Gets the available document operations.
     * 
     * @return The available document operations.
     */
    IReceiptDocuments getDocuments();
}