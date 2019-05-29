// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.profiles;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.OrganizationProfile;

/**
 * The organization profile operations implementation.
 */
public class OrganizationProfileOperations
	extends BasePartnerComponentString
	implements IOrganizationProfile
{
	/**
	 * Initializes a new instance of the OrganizationProfileOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public OrganizationProfileOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	/**
	 * Retrieves the organization profile.
	 * 
	 * @return The organization profile.
	 */
	@Override
	public OrganizationProfile get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<OrganizationProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOrganizationProfile").getPath());
	}

	/**
	 * Updates the Organization Profile
	 * 
	 * @param updatePayload Payload of the update request
	 * @return Updated Organization Profile
	 */
	@Override
	public OrganizationProfile update( OrganizationProfile updatePayload )
	{
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<OrganizationProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetOrganizationProfile").getPath(),
			updatePayload);   
	}
}