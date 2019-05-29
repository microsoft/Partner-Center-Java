// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the supported invoice search fields.
 */
public enum InvoiceSearchField
{
    /**
     * The invoice date.
     */
    INVOICE_DATE("invoice_date");

    private final String value;

    InvoiceSearchField(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}