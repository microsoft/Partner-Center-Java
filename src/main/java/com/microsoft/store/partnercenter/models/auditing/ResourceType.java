// -----------------------------------------------------------------------
// <copyright file="ResourceType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enumeration to represent type of resource being performed.
 */
public enum ResourceType
{
    /**
     * The undefined
     */
    @JsonProperty("undefined")
    UNDEFINED, 

    /**
     * Customer Resource
     */
    @JsonProperty("customer")
    CUSTOMER,

    /**
     * Customer User
     */
    @JsonProperty("customer_user")
    CUSTOMER_USER,

    /**
     * Order Resource
     */
    @JsonProperty("order")
    ORDER,

    /**
     * Subscription Resource
     */
    @JsonProperty("subscription")
    SUBSCRIPTION,

    /**
     * License Resource
     */
    @JsonProperty("license")
    LICENSE,

    /**
     * Third party add on Resource
     */
    @JsonProperty("third_party_add_on")
    THIRD_PARTY_ADD_ON,

    /**
     * MPN association Resource
     */
    @JsonProperty("mpn_association")
    MPN_ASSOCIATION,

    /**
     * Transfer Resource
     */
    @JsonProperty("transfer")
    TRANSFER, 

    /**
     * Application Resource
     */
    @JsonProperty("application")
    APPLICATION,
 
    /**
     * Application Credential Resource
     */
    @JsonProperty("application_credential")
    APPLICATION_CREDENTIAL,

    /**
     * Partner User Resource
     */
    @JsonProperty("partner_user")
    PARTNER_USER,

    /**
     * Partner Relationship Resource
     */
    @JsonProperty("partner_relationship")
    PARTNER_RELATIONSHIP
}