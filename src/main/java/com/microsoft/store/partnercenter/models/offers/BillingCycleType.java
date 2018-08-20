// -----------------------------------------------------------------------
// <copyright file="BillingCycleType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * The way billing is processed for a subscription.
 */
public enum BillingCycleType {
	/***
	 * Enum initializer
	 */
    @JsonProperty("unknown")
    Unknown,

    /***
     * Indicates that the partner will be charged monthly for the subscription
     */
    @JsonProperty("monthly")
    Monthly,

    /***
     * Indicates that the partner will be charged annually for the subscription.
     */
    @JsonProperty("annual")
    Annual,

    /***
     * Indicates that the partner will be charged annually for the subscription.
     */
    @JsonProperty("none")
    none,

    /***
     * Indicates that the partner will be charged one-time This value does not apply
     * to all products.
     */
    @JsonProperty("one_time")
    OneTime
}