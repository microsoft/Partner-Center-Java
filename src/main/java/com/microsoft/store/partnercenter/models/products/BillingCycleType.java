// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of Participants
 */
public enum BillingCycleType
{
    /**
     * Default value if not known
     */
    UNKNOWN("unknown"),

    /**
     * Indicates that the partner will be charged monthly.
     */
    MONTHLY("monthly"),

    /**
     * Indicates that the partner will be charged annual.
     */
    ANNUAL("annual"),

    /**
     * Indicates that the partner will not be charged. This value is used for trial offers.
     */
    NONE("none"),

    /**
     * Indicates that the partner will be charged one time. This value is used for modern product SKUs.
     */
    ONE_TIME("one_time");

    private final String value;

    BillingCycleType(String value)
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