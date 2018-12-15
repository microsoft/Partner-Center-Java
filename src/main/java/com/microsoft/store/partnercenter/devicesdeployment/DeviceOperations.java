// -----------------------------------------------------------------------
// <copyright file="DeviceOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.models.devicesdeployment.Device;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations that apply to a device.
 */
public class DeviceOperations 
    extends BasePartnerComponent<TripletTuple<String, String, String>> implements IDevice 
{
    /**
     * Initializes a new instance of the DeviceOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            The customer identifier.          
     * @param deviceBatchId         The device batch identifier.
     * @param deviceId              The device identifier.
     */
    public DeviceOperations(IPartner rootPartnerOperations, String customerId, String deviceBatchId, String deviceId) {
        super(rootPartnerOperations, new TripletTuple<String, String, String>(customerId, deviceBatchId, deviceId));

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(deviceBatchId)) {
            throw new IllegalArgumentException("deviceBatchId must be set");
        }
        
        if (StringHelper.isNullOrWhiteSpace(deviceId)) {
            throw new IllegalArgumentException("deviceId must be set");
        }
    }

    /**
     * Updates a device associated to the customer with a configuration policy.
     * 
     * @param updateDevice Payload of the update request.
     * @return The updated device.
     */
    @Override
    public Device patch(Device updateDevice)
    {
        return this.getPartner().getServiceClient().put(
            this.getPartner(),
            new TypeReference<Device>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("UpdateDevice").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()),
            updateDevice);
    }

    /**
     *  Deletes a device associated to the customer.
     */
    public void delete()
    {
        this.getPartner().getServiceClient().delete(
            this.getPartner(),
            new TypeReference<ConfigurationPolicy>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("DeleteDevice").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2(), 
                this.getContext().getItem3()));
    }
}