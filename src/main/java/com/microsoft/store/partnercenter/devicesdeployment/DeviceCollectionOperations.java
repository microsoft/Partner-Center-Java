// -----------------------------------------------------------------------
// <copyright file="DeviceCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.ConfigurationPolicy;
import com.microsoft.store.partnercenter.models.devicesdeployment.Device;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

import org.apache.http.HttpResponse;

/**
 * Implements operations that apply to device collections.
 */
public class DeviceCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IDeviceCollection
{
    /**
     * Initializes a new instance of the {@link #DeviceCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     * @param deviceBatchId         Identifier for te device batch.
     */
    public DeviceCollectionOperations( IPartner rootPartnerOperations, String customerId, String deviceBatchId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, deviceBatchId ) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( deviceBatchId ) )
        {
            throw new IllegalArgumentException( "deviceBatchId must be set" );
        }
    }

	/***
	 * Retrieves a specific customer's device behavior.
	 * 
	 * @param deviceId: The device identifier.
	 * @return: The customer device behavior.
	 */
    @Override
    public IDevice byId( String deviceId )
    {
        return new DeviceOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), deviceId);
    }

    /***
	 * Adds devices to existing devices batch.
	 * 
	 * @param newDevices: The new devices to be created.
	 * @return: The location which indicates the URL of the API to query for status of the create request.
	 */
    @Override
    public String create( List<Device> newDevices )
    {
        IPartnerServiceProxy<List<Device>, HttpResponse> partnerServiceProxy = new PartnerServiceProxy<List<Device>, HttpResponse>(
                new TypeReference<HttpResponse>() 
                {
                }, 
                this.getPartner(),
                MessageFormat.format(
                    PartnerService.getInstance().getConfiguration().getApis().get("AddDevicestoDeviceBatch").getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2() ));

        HttpResponse response = partnerServiceProxy.post( newDevices );

        return response.getFirstHeader("Location").getValue();        
    }

    /***
     * Retrieves all devices.
     * 
     * @return: All of the devices.
     */
    @Override
    public ResourceCollection<Device> get()
    {
        IPartnerServiceProxy<ConfigurationPolicy, ResourceCollection<Device>> partnerServiceProxy = new PartnerServiceProxy<ConfigurationPolicy, ResourceCollection<Device>>(
                new TypeReference<ResourceCollection<Device>>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetDevices").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2() ));

        return partnerServiceProxy.get();
    }
}