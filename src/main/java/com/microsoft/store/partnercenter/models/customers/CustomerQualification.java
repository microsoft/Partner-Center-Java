// -----------------------------------------------------------------------
// <copyright file="CustomerQualification.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * When a partner creates a new customer by default the customer is assigned "CustomerQualification.None". If the partner validates that the customer
 * belongs to Education segment they can set the qualification of the Customer to "CustomerQualification.Education". This operation is irreversible and
 * the partner will not be allowed to override the customer qualification once set.
 */
public enum CustomerQualification
{
    /**
     * No Qualification
     */
    NONE("none"),

    /**
     * Education Qualification
     */
    EDUCATION("education"),

    /**
     *  Non-Profit / Charity Qualification
     */
    NONPROFIT("nonprofit");

    private final String value;

    CustomerQualification(String value)
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