// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the supported service incident search fields.
 */
public enum ServiceIncidentSearchField
{
    /**
     * Search by service health incidents resolved status.
     */
    RESOLVED("Resolved");

    private final String value;

    ServiceIncidentSearchField(String value)
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