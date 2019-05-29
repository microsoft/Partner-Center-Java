// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.devicesdeployment.DevicePolicyUpdateRequest;
import com.microsoft.store.partnercenter.utils.StringHelper;

import okhttp3.Response;

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
		Response response = this.getPartner().getServiceClient().patch(
			this.getPartner(), 
			new TypeReference<Response>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateDevicesWithPolicies").getPath(),
				this.getContext()),
			devicePolicyUpdateRequest);

		return response.header("location");
	}
}