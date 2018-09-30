// -----------------------------------------------------------------------
// <copyright file="BillingCycleType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Types of Participants
 */
public enum BillingCycleType {
    /***
     * Default value if not known
     */
    @JsonProperty("unknown")
    UNKNOWN,

    /***
     * Indicates that the partner will be charged monthly.
     */
    @JsonProperty("monthly")
    MONTHLY,

    /***
     * Indicates that the partner will be charged annuallu.
     */
    @JsonProperty("annual")
    ANNUAL,

    /***
     * Indicates that the partner will not be charged. This value is used for trial offers.
     */
    @JsonProperty("none")
    NONE,

    /***
     * Indicates that the partner will be charged one time. This value is used for modern product SKUs.
     */
    @JsonProperty("one_time")
    ONE_TIME
}