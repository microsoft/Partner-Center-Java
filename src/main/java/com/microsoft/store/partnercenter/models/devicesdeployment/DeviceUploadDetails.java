// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents the status of batch upload of devices.
 */
public class DeviceUploadDetails extends ResourceBase {
	/**
	 * Gets or sets the device Id.
	 */
	@JsonProperty( "deviceId" )
	private String __DeviceId;

	public String getDeviceId()
	{
		return __DeviceId;
	}

	public void setDeviceId( String value )
	{
		__DeviceId = value;
	}

	/**
     * Gets or sets the serial number.
	 */
	@JsonProperty( "serialNumber" )
	private String __SerialNumber;

	public String getSerialNumber()
	{
		return __SerialNumber;
	}

	public void setSerialNumber( String value )
	{
		__SerialNumber = value;
	}

	/**
	 * Gets or sets the product key.
	 */
	@JsonProperty( "productKey" )
	private String __ProductKey;

	public String getProductKey()
	{
		return __ProductKey;
	}

	public void setProductKey( String value )
	{
		__ProductKey = value;
	}

	/**
	 * Gets or sets the device upload status.
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

	/**
	 * Gets or sets the error code upon device upload failure.
	 */
	@JsonProperty( "errorCode" )
	private String __ErrorCode;

	public String getErrorCode()
	{
		return __ErrorCode;
	}

	public void setErrorCode( String value )
	{
		__ErrorCode = value;
    }

	/**
	 * Gets or sets the error description upon device upload failure.
	 */
	@JsonProperty( "errorDescription" )
	private String __ErrorDescription;

	public String getErrorDescription()
	{
		return __ErrorDescription;
	}

	public void setErrorDescription( String value )
	{
		__ErrorDescription = value;
	}
}