// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.devicesdeployment.DevicePolicyUpdateRequest;

/**
 *  Represents the operations that can be done on the partner's devices.
 */
public interface ICustomerDeviceCollection 
	extends IPartnerComponentString
{
	/**
	 * Updates the devices with configuration policies.
	 * 
	 * @param devicePolicyUpdateRequest The device policy update request with devices to be updated.
	 * @return The location of the status to track the update.
	 */
	String update(DevicePolicyUpdateRequest devicePolicyUpdateRequest);
}