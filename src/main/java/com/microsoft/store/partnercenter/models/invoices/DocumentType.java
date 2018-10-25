// -----------------------------------------------------------------------
// <copyright file="DocumentType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Different providers of billing information.
 */
public enum DocumentType
{
    /**
     * Value if not set.
     */
    NONE("none"),

    /**
     * Indicates that document type is an invoice.
     */
    INVOICE("invoice"),

    /**
     * Indicates that document type is an void note.
     */
    VOID_NOTE("void_note"),

    /**
     * Indicates that document type is an adjustment note.
     */
    ADJUSTMENT_NOTE("adjustment_note");

    private final String value;

    DocumentType(String value)
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