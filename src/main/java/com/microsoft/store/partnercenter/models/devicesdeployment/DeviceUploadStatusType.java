// -----------------------------------------------------------------------
// <copyright file="DeviceUploadStatusType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 *  Devices Batch upload status.
 */
public enum DeviceUploadStatusType {
	/***
	 *  Should never happen.
	 */
    @JsonProperty("unknown")
    Unknown,

    /***
     * Batch is queued.
     */
    @JsonProperty("queued")
    Queued,

    /***
     * Batch is processing.
     */
    @JsonProperty("processing")
    Processing,

    /***
     * Batch is complete.
     */
    @JsonProperty("finished")
    Finished,

    /***
     * Batch is complete with an error.
     */
    @JsonProperty("finished_with_errors")
    FinishedWithErrors
}