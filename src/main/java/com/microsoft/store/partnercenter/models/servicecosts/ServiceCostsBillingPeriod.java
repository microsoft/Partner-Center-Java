// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicecosts;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents service costs billing periods.
 */
public enum ServiceCostsBillingPeriod
{
    /**
     * None.
     */
    NONE("none"),

    /**
     * Most recent.
     */
    MOST_RECENT("most_recent"),

    /**
     * Current.
     */
    CURRENT("current");

    private final String value;

    ServiceCostsBillingPeriod(String value)
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