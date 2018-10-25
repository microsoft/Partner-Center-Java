// -----------------------------------------------------------------------
// <copyright file="ResourceType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration to represent type of resource being performed.
 */
public enum ResourceType
{
    /**
     * The undefined
     */
    UNDEFINED("undefined"),

    /**
     * Customer Resource
     */
    CUSTOMER("customer"),

    /**
     * Customer User
     */
    CUSTOMER_USER("customer_user"),

    /**
     * Order Resource
     */
    ORDER("order"),

    /**
     * Subscription Resource
     */
    SUBSCRIPTION("subscription"),

    /**
     * License Resource
     */
    LICENSE("license"),

    /**
     * Third party add on Resource
     */
    THIRD_PARTY_ADD_ON("third_party_add_on"),

    /**
     * MPN association Resource
     */
    MPN_ASSOCIATION("mpn_association"),

    /**
     * Transfer Resource
     */
    TRANSFER("transfer"),

    /**
     * Application Resource
     */
    APPLICATION("application"),

    /**
     * Application Credential Resource
     */
    APPLICATION_CREDENTIAL("application_credential"),

    /**
     * Partner User Resource
     */
    PARTNER_USER("partner_user"),

    /**
     * Partner Relationship Resource
     */
    PARTNER_RELATIONSHIP("partner_relationship");

    private final String value;

    ResourceType(String value)
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