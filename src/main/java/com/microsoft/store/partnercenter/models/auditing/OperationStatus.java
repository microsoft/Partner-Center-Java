// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents status of an operation
 */
public enum OperationStatus
{
    /**
     * Indicates success of the operation
     */
    SUCCEEDED("succeeded"),

    /**
     * Indicates failure of the operation
     */
    FAILED("failed"),

    /**
     * Indicates that the operation is still in progress
     */
    PROGRESS("progress"),

    /**
     * Indicates that the operation is declined
     */
    DECLINE("decline");

    private final String value;

    OperationStatus(String value)
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