// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the status of partner center services.
 */
public enum ServiceIncidentStatus
{
    /**
     * Default status - normal.
     */
    NORMAL("normal"),

    /**
     * Informational status.
     */
    INFORMATION("information"),

    /**
     * Warning status.
     */
    WARNING("warning"),

    /**
     * Critical status.
     */
    CRITICAL("critical");

    private final String value;

    ServiceIncidentStatus(String value)
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