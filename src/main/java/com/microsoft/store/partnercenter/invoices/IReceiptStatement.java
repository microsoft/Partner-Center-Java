// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.invoices;

import java.io.InputStream;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations available to an invoice receipt statement.
 */
public interface IReceiptStatement extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Retrieves the invoice statement. This operation is currently only supported for user based credentials.
     * 
     * @return The invoice statement.
     */
    InputStream get();
}