// -----------------------------------------------------------------------
// <copyright file="ServiceCostsBillingPeriod.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicecosts;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents service costs billing periods.
 */
public enum ServiceCostsBillingPeriod {
    @JsonProperty("none")
    NONE,

    @JsonProperty("most_recent")
    MOST_RECENT,

    @JsonProperty("current")
    CURRENT
}