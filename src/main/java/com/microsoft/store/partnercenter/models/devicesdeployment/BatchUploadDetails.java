// -----------------------------------------------------------------------
// <copyright file="BatchUploadDetails.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import java.util.Iterator;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Represents the result of devices batch upload.
 */
public class BatchUploadDetails extends ResourceBase {
	/***
	 * Gets or sets the tracking ID of the batch of devices uploaded.
	 */
	@JsonProperty( "batchTrackingId" )
	private String __BatchTrackingId;

	public String getBatchTrackingId()
	{
		return __BatchTrackingId;
	}

	public void setBatchTrackingId( String value )
	{
		__BatchTrackingId = value;
	}

	/***
	 * Gets or sets the status.
	 */
	@JsonProperty( "status" )
	private DeviceUploadStatusType __Status;

	public DeviceUploadStatusType getStatus()
	{
		return __Status;
	}

	public void setStatus( DeviceUploadStatusType value )
	{
		__Status = value;
	}

	/***
	 * Gets or sets the batch started time.
	 */
	@JsonProperty( "startedTime" )
	private DateTime __StartedTime;

	public DateTime getStartedTime()
	{
		return __StartedTime;
	}

	public void setStartedTime( DateTime value )
	{
		__StartedTime = value;
	}

	/***
	 * Gets or sets the batch upload completed time.
	 */
	@JsonProperty( "completedTime" )
	private DateTime __CompletedTime;

	public DateTime getCompletedTime()
	{
		return __CompletedTime;
	}

	public void setCompletedTime( DateTime value )
	{
		__CompletedTime = value;
	}

	/***
	 *  Gets or sets the device upload status.
	 */
	@JsonProperty( "devicesStatus" )
	private Iterator<DeviceUploadDetails> __DevicesStatus;

	public Iterator<DeviceUploadDetails> getDevicesStatus()
	{
		return __DevicesStatus;
	}

	public void setDevicesStatus( Iterator<DeviceUploadDetails> value )
	{
		__DevicesStatus = value;
	}
}