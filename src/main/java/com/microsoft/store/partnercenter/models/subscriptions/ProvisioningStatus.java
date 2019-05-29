// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the available status for a subscription provisioning status.
 */
public enum ProvisioningStatus 
{
    /**
     * None.
     */
    NONE("none"),

    /**
     * Success.
     */
    SUCCESS("success"),

    /**
     * Pending.
     */
    PENDING("pending"),

    /**
     * Failed.
     */
    FAILED("failed");

    private final String value;

    ProvisioningStatus(String value)
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