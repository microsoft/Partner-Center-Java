// -----------------------------------------------------------------------
// <copyright file="BillingCycleType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The way billing is processed for a subscription.
 */
public enum BillingCycleType
{
    /**
     * Enum initializer
     */
    UNKNOWN("unknown"),

    /**
     * Indicates that the partner will be charged monthly for the subscription
     */
    MONTHLY("monthly"),

    /**
     * Indicates that the partner will be charged annually for the subscription.
     */
    ANNUAL("annual"),

    /**
     * Indicates that the partner will be charged annually for the subscription.
     */
    NONE("none"),

    /**
     * Indicates that the partner will be charged one-time This value does not apply
     * to all products.
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