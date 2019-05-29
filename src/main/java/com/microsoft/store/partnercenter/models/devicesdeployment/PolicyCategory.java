// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the policy type that can be assigned to a device.
 */
public enum PolicyCategory
{
    /**
     * Default settings for the policy.
     */
    NONE("none"),

    /**
     * OOBE - Out of box experience policy setting.
     */

    OOBE("o_o_b_e");

    private final String value;

    PolicyCategory(String value)
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