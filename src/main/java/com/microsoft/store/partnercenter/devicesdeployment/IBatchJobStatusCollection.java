// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;

/**
 * Represents the operations that can be done on the partner's batch upload status collection.
 */
public interface IBatchJobStatusCollection 
    extends IPartnerComponentString,
    IEntitySelector<String, IBatchJobStatus>
{
	/**
	 * Retrieves a specific customer's devices batch upload status behavior.
	 * 
	 * @param trackingId The tracking identifier.
	 * @return The customer's devices batch upload status operations.
	 */
    IBatchJobStatus byId(String trackingId);
}