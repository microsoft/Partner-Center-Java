// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations that can be done on the partner's devices batches.
 */
public interface IDevicesBatch 
	extends IPartnerComponent<Tuple<String, String>>
{
	/**
	 * Obtains the devices behavior of the devices batch.
	 * 
	 * @return The devices behavior of the devices batch.
	 */
    IDeviceCollection getDevices();
}