// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents the list of devices to be updated with a policy.
 */
public class DevicePolicyUpdateRequest extends ResourceBase {
	/**
	 * Gets or sets the list of devices to be updated.
	 */
	@JsonProperty("devices")
	private List<Device> __Devices;

	public List<Device> getSetDevices()
	{
		return __Devices;
	}

	public void setDevices(List<Device> value)
	{
		__Devices = value;
	}
}