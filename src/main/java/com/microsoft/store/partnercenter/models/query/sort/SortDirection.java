// -----------------------------------------------------------------------
// <copyright file="SortDirection.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.sort;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SortDirection
{
    /**
     * Sort direction enumeration. Ascending sort.
     */
    ASCENDING("ascending"),

    /**
     * Descending sort.
     */
    DESCENDING("descending");

    private final String value;

    SortDirection(String value)
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