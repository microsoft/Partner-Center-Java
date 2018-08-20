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
    Unknown,

    /***
     * Indicates that the partner will be charged monthly.
     */
    @JsonProperty("monthly")
    Monthly,

    /***
     * Indicates that the partner will be charged annuallu.
     */
    @JsonProperty("annual")
    Annual,

    /***
     * Indicates that the partner will not be charged. This value is used for trial offers.
     */
    @JsonProperty("none")
    None,

    /***
     * Indicates that the partner will be charged one time. This value is used for modern product SKUs.
     */
    @JsonProperty("one_time")
    OneTime
}