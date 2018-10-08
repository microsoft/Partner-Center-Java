// -----------------------------------------------------------------------
// <copyright file="DevicesBatchOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Represents the operations that apply to devices batch of the customer.
 */
public class DevicesBatchOperations 
    extends BasePartnerComponent<Tuple<String, String>> implements IDevicesBatch 
{
    private IDeviceCollection devices;

    /**
     * Initializes a new instance of the DevicesBatchOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            The customer identifier.
     * @param deviceBatchId         The device batch identifier.
     */
    public DevicesBatchOperations(IPartner rootPartnerOperations, String customerId, String deviceBatchId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, deviceBatchId));

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(deviceBatchId)) {
            throw new IllegalArgumentException("deviceBatchId must be set");
        }
    }

	/***
	 * Gets the devices behavior of the devices batch.
	 * 
	 * @return The devices behavior of the devices batch.
	 */
    @Override
    public IDeviceCollection getDevices()
    {
        if(devices == null)
        {
            devices = new DeviceCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }

        return devices;
    }
}