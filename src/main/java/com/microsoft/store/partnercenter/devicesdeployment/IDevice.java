// -----------------------------------------------------------------------
// <copyright file="IDevice.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.devicesdeployment.Device;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/***
 * Represents the operations that can be done on the partner's device.
 */
public interface IDevice
	extends IPartnerComponent<TripletTuple<String,String, String>>, 
	IEntityDeleteOperations<Device>, IEntityPatchOperations<Device>
{
    /***
     *  Updates a device associated to the customer with a configuration policy.
     * 
     * @param updateDevice The device to be updated.
     * @return The device that was updated.
     */
	Device patch(Device updateDevice);

    /***
     * Deletes the device.
     */
    void delete();
}