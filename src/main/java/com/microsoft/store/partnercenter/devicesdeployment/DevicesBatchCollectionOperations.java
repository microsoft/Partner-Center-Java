// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatch;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatchCreationRequest;
import com.microsoft.store.partnercenter.utils.StringHelper;

import okhttp3.Response;

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
	
	/**
	 * Retrieves a specific customer devices batch behavior.
	 * 
	 * @param deviceBatchId The devices batch identifier.
	 * @return The devices batch behavior.
	 */
	public IDevicesBatch byId( String deviceBatchId )
	{
		return new DevicesBatchOperations(this.getPartner(), this.getContext(), deviceBatchId); 
	}

	/**
	 * Creates a new devices batch along with the devices.
	 * 
	 * @param newDeviceBatch The new devices batch.
	 * @return The location which indicates the URL of the API to query for status of the create request.
	 */
	public String create( DeviceBatchCreationRequest newDeviceBatch )
	{
		Response response = this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<Response>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("CreateDeviceBatch").getPath(),
				this.getContext()),
			newDeviceBatch);

		return response.header("location");
	}

	/**
	 * Retrieves all devices batches.
	 * 
	 * @return All of the device batches.
	 */
	public ResourceCollection<DeviceBatch> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<DeviceBatch>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetDeviceBatches").getPath(),
				this.getContext()));
	}
}