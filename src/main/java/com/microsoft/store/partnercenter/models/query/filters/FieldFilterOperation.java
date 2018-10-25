// -----------------------------------------------------------------------
// <copyright file="FieldFilterOperation.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FieldFilterOperation
{
    /**
     * Enumerates supported filter operations. Equals filter.
     */
    EQUALS("Equals"),

    /**
     * Not equals filter.
     */
    NOT_EQUALS("NotEquals"),

    /**
     * Greater than filter.
     */
    GREATER_THAN("GreaterThan"),

    /**
     * Greater than or equal filter.
     */
    GREATER_THAN_OR_EQUALS("GreaterThanOrEquals"),

    /**
     * Less than filter.
     */
    LESS_THAN("LessThan"),

    /**
     * Less than or equals filter.
     */
    LESS_THAN_OR_EQUALS("LessThanOrEquals"),

    /**
     * Substring filter.
     */
    SUBSTRING("Substring"),

    /**
     * And filter.
     */
    AND("And"),

    /**
     * Or filter.
     */
    OR("Or"),

    /**
     * String starts with filter.
     */
    STARTS_WITH("StartsWith"),

    /**
     * String does not starts with filter.
     */
    NOT_STARTS_WITH("NotStartsWith");

    private final String value;

    FieldFilterOperation(String value)
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