// -----------------------------------------------------------------------
// <copyright file="AuditRecordSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the supported audit search fields.
 */
public enum AuditRecordSearchField
{
    /**
     * Customer company name.
     */
    COMPANY_NAME("CompanyName"),

    /**
     * Customer identifier (GUID).
     */
    CUSTOMER_ID("CustomerId"),

    /**
     * Resource Type as defined in available Resource Types (Example: Order, Subscription).
     */
    RESOURCE_TYPE("ResourceType");

    private final String value;

    AuditRecordSearchField(String value)
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