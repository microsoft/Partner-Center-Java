// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Types of Participants
 */
public enum ParticipantType
{
    /**
     * Default value if not known
     */
    UNKNOWN("unknown"),

    /**
     * An indirect reseller with a transaction role.
     */
    TRANSACTION_RESELLER("transaction_reseller");

    private final String value;

    ParticipantType(String value)
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