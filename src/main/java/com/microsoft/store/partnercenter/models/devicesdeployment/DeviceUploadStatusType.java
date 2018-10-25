// -----------------------------------------------------------------------
// <copyright file="DeviceUploadStatusType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 *  Devices Batch upload status.
 */
public enum DeviceUploadStatusType
{
    /**
     * Should never happen.
     */
    UNKNOWN("unknown"),

    /**
     * Batch is queued.
     */
    QUEUED("queued"),

    /**
     * Batch is processing.
     */
    PROCESSING("processing"),

    /**
     * Batch is complete.
     */
    FINISHED("finished"),

    /**
     * Batch is complete with an error.
     */
    FINISHED_WITH_ERRORS("finished_with_errors");

    private final String value;

    DeviceUploadStatusType(String value)
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