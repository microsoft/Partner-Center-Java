// ----------------------------------------------------------------
// <copyright file="ServiceRequestSearchField.java" company="Microsoft Corporation">
// Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// ----------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lists the supported service request search fields
 */
public enum ServiceRequestSearchField
{
    /**
     * Service request status
     */
    STATUS("Status");

    private String value;

    ServiceRequestSearchField(String value)
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
