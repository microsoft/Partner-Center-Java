// -----------------------------------------------------------------------
// <copyright file="CustomerDevicesCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.devicesdeployment.DevicePolicyUpdateRequest;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

import org.apache.http.HttpResponse;

/**
 * Implements operations that apply to device collections.
 */
public class CustomerDevicesCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerDeviceCollection
{
    /**
     * Initializes a new instance of the CustomerDevicesCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     */
    public CustomerDevicesCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
    }

    /**
	 * Updates the devices with configuration policies.
	 * 
	 * @param devicePolicyUpdateRequest The device policy update request with devices to be updated..
	 * @return The location of the status to track the update.
	 */
    @Override
    public String update(DevicePolicyUpdateRequest devicePolicyUpdateRequest)
    {
        IPartnerServiceProxy<DevicePolicyUpdateRequest, HttpResponse> partnerServiceProxy = 
            new PartnerServiceProxy<>(
                new TypeReference<HttpResponse>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("UpdateDevicesWithPolicies").getPath(),
                        this.getContext() ));

        HttpResponse response = partnerServiceProxy.patch( devicePolicyUpdateRequest );  

        return response.getFirstHeader("Location").getValue();
    }
}