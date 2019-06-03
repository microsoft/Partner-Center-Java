// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a devices batch creation model.
 */
public class DeviceBatchCreationRequest extends ResourceBase {
	/**
	 * Gets or sets the devices batch unique identifier.
	 */
	@JsonProperty("batchId")
	private String __BatchId;

	public String getBatchId()
	{
		return __BatchId;
	}

	public void setBatchId(String value)
	{
		__BatchId = value;
	}

	/**
	 * Gets or sets the list of devices to be uploaded.
	 */
	@JsonProperty("devices")
	private List<Device> __Devices;

	public List<Device> getDevices()
	{
		return __Devices;
	}

	public void setDevices(List<Device> value)
	{
		__Devices = value;
	}
}