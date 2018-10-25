// -----------------------------------------------------------------------
// <copyright file="SeekOperation.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SeekOperation
{
    /**
     * Specifies how to seek a query. Gets the next set of results.
     */
    NEXT("Next"),

    /**
     * Gets the previous set of results.
     */
    PREVIOUS("Previous"),

    /**
     * Gets the first set of results.
     */
    FIRST("First"),

    /**
     * Gets the last set of results.
     */
    LAST("Last"),

    /**
     * Gets a set of results using a page index. E.g. Get the seventh set of results.
     */
    PAGE_INDEX("PageIndex");

    private final String value;

    SeekOperation(String value)
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