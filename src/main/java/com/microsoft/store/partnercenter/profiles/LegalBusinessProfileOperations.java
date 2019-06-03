// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.profiles;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.LegalBusinessProfile;

/**
 * The legal business profile operations implementation.
 */
public class LegalBusinessProfileOperations
	extends BasePartnerComponentString
	implements ILegalBusinessProfile
{
	/**
	 * Initializes a new instance of the LegalBusinessProfileOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public LegalBusinessProfileOperations(IPartner rootPartnerOperations)
	{
		super(rootPartnerOperations);
	}

	/**
	 * Retrieves the legal business profile.
	 * 
	 * @return The legal business profile.
	 */
	@Override
	public LegalBusinessProfile get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<LegalBusinessProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetLegalBusinessProfile").getPath());
	}

	/**
	 * Updates the Legal Business Profile.
	 * 
	 * @param legalBusinessProfile Payload of the update request.
	 * @return Updated Legal Business Profile.
	 */
	@Override
	public LegalBusinessProfile update(LegalBusinessProfile legalBusinessProfile)
	{
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<LegalBusinessProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetLegalBusinessProfile").getPath(),
			legalBusinessProfile);
	}
}