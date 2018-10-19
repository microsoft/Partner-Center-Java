// -----------------------------------------------------------------------
// <copyright file="BillingCycleType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The way billing is processed for a subscription.
 */
public enum BillingCycleType {
	/**
	 * Enum initializer
	 */
    @JsonProperty("unknown")
    UNKNOWN,

    /**
     * Indicates that the partner will be charged monthly for the subscription
     */
    @JsonProperty("monthly")
    MONTHLY,

    /**
     * Indicates that the partner will be charged annually for the subscription.
     */
    @JsonProperty("annual")
    ANNUAL,

    /**
     * Indicates that the partner will be charged annually for the subscription.
     */
    @JsonProperty("none")
    NONE,

    /**
     * Indicates that the partner will be charged one-time This value does not apply
     * to all products.
     */
    @JsonProperty("one_time")
    ONE_TIME
}