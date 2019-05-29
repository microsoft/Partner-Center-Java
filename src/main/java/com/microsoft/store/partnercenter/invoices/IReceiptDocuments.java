// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations available on receipt documents.
 */
public interface IReceiptDocuments extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Gets the receipt statement operations.
     * 
     * @return The available receipt statement operations.
     */
    IReceiptStatement getStatement();
}