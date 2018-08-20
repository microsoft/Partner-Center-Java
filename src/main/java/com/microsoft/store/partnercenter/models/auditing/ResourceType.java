// -----------------------------------------------------------------------
// <copyright file="ResourceType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enumeration to represent type of
 * Resource being performed
 */
public enum ResourceType {
    /***
     * Customer Resource
     */
    @JsonProperty("customer")
    Customer,

    /***
     * Customer User
     */
    @JsonProperty("customer_user")
    CustomerUser,

    /***
     * Order Resource
     */
    @JsonProperty("order")
    Order,

    /***
     * Subscription Resource
     */
    @JsonProperty("subscription")
    Subscription,

    /***
     * License Resource
     */
    @JsonProperty("license")
    License,

    /***
     * Third party add on Resource
     */
    @JsonProperty("third_party_add_on")
    ThirdPartyAddOn,

    /***
     * MPN association Resource
     */
    @JsonProperty("mpn_association")
    MpnAssociation,

    /***
     * Transfer Resource
     */
    @JsonProperty("transfer")
    Transfer
}