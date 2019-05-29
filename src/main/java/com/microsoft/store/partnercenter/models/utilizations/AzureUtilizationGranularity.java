// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.utilizations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the time granularity options for retrieving A subscription's azure utilization.
 */
public enum AzureUtilizationGranularity
{
    /**
     * Daily utilization.
     */
    DAILY("daily"),

    /**
     * Hourly utilization.
     */
    HOURLY("hourly");

    private final String value;

    AzureUtilizationGranularity(String value)
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