// -----------------------------------------------------------------------
// <copyright file="CustomerPartnerRelationship.java" company="Microsoft">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CustomerPartnerRelationship
{
    /**
     *  Unknown. Used for initialization.
     */
    UNKNOWN("unknown"),

    /**
     * None. Used to remove reseller relationship between the customer and partner.
     */
    NONE("none"),

    /**
     * The reseller relationship
     */
    RESELLER("reseller"),

    /**
     * The advisor relationship
     */
    ADVISOR("advisor"),

    /**
     * Indicates that the partner is a syndication partner of the customer.
     */
    SYNDICATION("syndication"),

    /**
     * Indicates that the partner is a Microsoft Support agent for the customer.
     */
    MICROSOFT_SUPPORT("microsoftSupport");

    private final String value;

    CustomerPartnerRelationship(String value)
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