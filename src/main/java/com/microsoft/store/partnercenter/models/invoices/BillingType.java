// ----------------------------------------------------------------
// <copyright file="BillingType.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BillingType
{
    /**
     * The way billing is processed for a subscription Indicates nothing - not set, used as an initializer
     */
    NONE("none"),

    /**
    * The usage based billing
    */
    USAGE("usage"),

    /**
    * The license based billing
    */
    LICENSE("license");

    private final String value;

    BillingType(String value)
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