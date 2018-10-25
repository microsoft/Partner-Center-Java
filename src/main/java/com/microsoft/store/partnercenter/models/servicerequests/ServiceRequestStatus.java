// ----------------------------------------------------------------
// <copyright file="ServiceRequestStatus.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceRequestStatus
{
    /**
     * Describes service request status Default Service Request Status
     */
    NONE("none"),

    /**
     * Service Request Status Open
     */
    OPEN("open"),

    /**
     * Service Request Status Closed
     */
    CLOSED("closed"),

    /**
     * Service Request Status Action Required
     */
    ATTENTION_NEEDED("attention_needed");

    private final String value;

    ServiceRequestStatus(String value)
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