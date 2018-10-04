// -----------------------------------------------------------------------
// <copyright file="DevicesBatchCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatch;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatchCreationRequest;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

import org.apache.http.HttpResponse;

/**
 * Implements operations that apply to devices batch collection.
 */
public class DevicesBatchCollectionOperations
    extends BasePartnerComponentString
    implements IDevicesBatchCollection
{
    /**
     * Initializes a new instance of the DevicesBatchOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     */
    public DevicesBatchCollectionOperations(IPartner rootPartnerOperations, String customerId) {
        super(rootPartnerOperations, customerId);

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }
    }
    
	/***
	 * Retrieves a specific customer devices batch behavior.
	 * 
	 * @param deviceBatchId The devices batch identifier.
	 * @return The devices batch behavior.
	 */
    public IDevicesBatch byId( String deviceBatchId )
    {
        return new DevicesBatchOperations(this.getPartner(), this.getContext(), deviceBatchId); 
    }

    /***
	 * Creates a new devices batch along with the devices.
	 * 
	 * @param newDevices The new devices batch.
	 * @return The location which indicates the URL of the API to query for status of the create request.
	 */
    public String create( DeviceBatchCreationRequest newDeviceBatch )
    {
        IPartnerServiceProxy<DeviceBatchCreationRequest, HttpResponse> partnerServiceProxy = new PartnerServiceProxy<DeviceBatchCreationRequest, HttpResponse>(
                new TypeReference<HttpResponse>() {
                }, this.getPartner(),
                MessageFormat.format(
                    PartnerService.getInstance().getConfiguration().getApis().get("CreateDeviceBatch").getPath(),
                    this.getContext() ));

        HttpResponse response = partnerServiceProxy.post( newDeviceBatch );

        return response.getFirstHeader("location").getValue();
    }

    /***
     * Retrieves all devices batches.
     * 
     * @return All of the device batches.
     */
    public ResourceCollection<DeviceBatch> get()
    {
        IPartnerServiceProxy<DeviceBatch, ResourceCollection<DeviceBatch>> partnerServiceProxy = new PartnerServiceProxy<DeviceBatch, ResourceCollection<DeviceBatch>>(
            new TypeReference<ResourceCollection<DeviceBatch>>() 
            {
            }, 
            this.getPartner(),
            MessageFormat.format(
                PartnerService.getInstance().getConfiguration().getApis().get("GetDeviceBatches").getPath(),
                    this.getContext() ));

        return partnerServiceProxy.get();
    }
}