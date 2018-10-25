// -----------------------------------------------------------------------
// <copyright file="FieldType.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FieldType
{
    /**
     * Enumerates supported field types. String Type
     */
    STRING("String"),

    /**
     * Integer Type
     */
    INTEGER("Integer"),

    /**
     * Enum Type
     */
    ENUM("Enum"),

    /**
     * DateTimeOffset Type
     */
    DATE_TIME_OFFSET("DateTimeOffset");

    private final String value;

    FieldType(String value)
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