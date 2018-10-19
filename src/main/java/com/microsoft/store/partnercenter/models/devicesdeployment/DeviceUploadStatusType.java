// -----------------------------------------------------------------------
// <copyright file="DeviceUploadStatusType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  Devices Batch upload status.
 */
public enum DeviceUploadStatusType {
	/**
	 *  Should never happen.
	 */
    @JsonProperty("unknown")
    UNKNOWN,

    /**
     * Batch is queued.
     */
    @JsonProperty("queued")
    QUEUED,

    /**
     * Batch is processing.
     */
    @JsonProperty("processing")
    PROCESSING,

    /**
     * Batch is complete.
     */
    @JsonProperty("finished")
    FINISHED,

    /**
     * Batch is complete with an error.
     */
    @JsonProperty("finished_with_errors")
    FINISHED_WITH_ERRORS
}