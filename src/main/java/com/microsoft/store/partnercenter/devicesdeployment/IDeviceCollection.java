// -----------------------------------------------------------------------
// <copyright file="IDeviceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.util.List;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.Device;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/***
 * Represents the operations that can be done on the partner's devices.
 */
public interface IDeviceCollection 
	extends IPartnerComponent<Tuple<String, String>>,
	IEntireEntityCollectionRetrievalOperations<Device, ResourceCollection<Device>>, IEntityCreateOperations<List<Device>, String>, IEntitySelector<IDevice>
{
	/***
	 * Retrieves a specific customer's device behavior.
	 * 
	 * @param deviceId The device identifier.
	 * @return The customer device behavior.
	 */
    IDevice byId( String deviceId );

    /***
	 * Adds devices to existing devices batch.
	 * 
	 * @param newDevices The new devices to be created.
	 * @return The location which indicates the URL of the API to query for status of the create request.
	 */
    String create( List<Device> newDevices );

    /***
     * Retrieves all devices.
     * 
     * @return All of the devices.
     */
    ResourceCollection<Device> get();
}
