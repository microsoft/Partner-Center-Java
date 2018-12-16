// -----------------------------------------------------------------------
// <copyright file="MpnProfileOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.partners.MpnProfile;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * Class which contains operations for Partner Network Profile
 */
public class MpnProfileOperations
	extends BasePartnerComponentString
	implements IMpnProfile
{
	/**
	 * Initializes a new instance of the MpnProfileOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public MpnProfileOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	/**
	 * Retrieves the logged in reseller's MpnProfile.
	 * 
	 * @return The partner network profile.
	 */
	@Override
	public MpnProfile get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<MpnProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetMpnProfile").getPath());
	}

	/**
	 * Retrieves a MpnProfile by MPN Id.
	 * 
	 * @param mpnId The MPN Id.
	 * @return The partner network profile.
	 */
	@Override
	public MpnProfile get( String mpnId )
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetMpnProfile").getParameters().get("MpnId"),
				mpnId
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<MpnProfile>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetMpnProfile").getPath(),
			parameters);
	}
}