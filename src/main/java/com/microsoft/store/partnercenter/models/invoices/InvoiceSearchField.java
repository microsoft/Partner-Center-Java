// -----------------------------------------------------------------------
// <copyright file="InvoiceSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lists the supported invoice search fields.
 */
public enum InvoiceSearchField {
    /***
     * The invoice date.
     */
    @JsonProperty("invoice_date")
    INVOICE_DATE
}