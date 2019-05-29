// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of errors that prevent trial subscription conversion from happening.
 */
public enum ConversionErrorCode
{
    /**
     * Other.
     */
    OTHER("other"),

    /**
     * Conversions not found.
     */
    CONVERSIONS_NOT_FOUND("conversions_not_found"),

    /**
     * Pending.
     */
    PENDING("pending"),

    /**
     * Failed.
     */
    FAILED("failed");

    private final String value;

    ConversionErrorCode(String value)
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