// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.devicesdeployment.BatchUploadDetails;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Cart collection operations implementation class.
 */
public class BatchJobStatusOperations 
	extends BasePartnerComponent<Tuple<String, String>> implements IBatchJobStatus 
{
	/**
	 * Initializes a new instance of the BatchJobStatusOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId            Identifier for the customer.
	 * @param trackingId            The tracking identifier.
	 */
	public BatchJobStatusOperations(IPartner rootPartnerOperations, String customerId, String trackingId) {
		super(rootPartnerOperations, new Tuple<String, String>(customerId, trackingId));

		if (StringHelper.isNullOrWhiteSpace(customerId)) {
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(trackingId)) {
			throw new IllegalArgumentException("trackingId must be set");
		}
	}
	/**
	 * Retrieves devices batch upload status of the customer.
	 * 
	 * @return Devices batch upload status.
	 */
	@Override
	public BatchUploadDetails get() 
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<BatchUploadDetails>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetBatchUploadStatus").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()));
	}
}