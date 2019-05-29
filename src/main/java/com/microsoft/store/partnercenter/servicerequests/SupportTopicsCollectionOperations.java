// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.servicerequests.SupportTopic;

/**
 * The operations that can be performed on support topics. Support Topics operations are localizable.
 */
public class SupportTopicsCollectionOperations
	extends BasePartnerComponentString
	implements ISupportTopicsCollection
{
	/**
	 * Initializes a new instance of the SupportTopicsCollectionOperations class with default locale.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public SupportTopicsCollectionOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	/**
	 * Gets a collection of available support topics to create service request.
	 * 
	 * @return Collection of Support Topic Info.
	 */
	@Override
	public ResourceCollection<SupportTopic> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<SupportTopic>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetServiceRequestSupportTopics").getPath());
	}
}