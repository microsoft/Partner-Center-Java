// -----------------------------------------------------------------------
// <copyright file="DocumentType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Different providers of billing information.
 */
public enum DocumentType {
    /***
     * Value if not set.
     */
    @JsonProperty("none")
    None,

    /***
     * Indicates that document type is an invoice.
     */
    @JsonProperty("invoice")
    Invoice,

    /***
     * Indicates that document type is an void note.
     */
    @JsonProperty("void_note")
    VoidNote,

    /***
     * Indicates that document type is an adjustment note.
     */
    @JsonProperty("adjustment_note")
    AdjustmentNote
}