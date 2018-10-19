// -----------------------------------------------------------------------
// <copyright file="DocumentType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different providers of billing information.
 */
public enum DocumentType {
    /**
     * Value if not set.
     */
    @JsonProperty("none")
    NONE,

    /**
     * Indicates that document type is an invoice.
     */
    @JsonProperty("invoice")
    INVOICE,

    /**
     * Indicates that document type is an void note.
     */
    @JsonProperty("void_note")
    VOID_NOTE,

    /**
     * Indicates that document type is an adjustment note.
     */
    @JsonProperty("adjustment_note")
    ADJUSTMENT_NOTE
}