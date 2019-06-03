// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerdirectoryroles;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * DirectoryRoleCollectionOperations
 *
 */
public class DirectoryRoleCollectionOperations
	extends BasePartnerComponentString
	implements IDirectoryRoleCollection
{

	/**
	 * Initializes a new instance of the DirectoryRoleCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public DirectoryRoleCollectionOperations(IPartner rootPartnerOperations, String customerId)
	{
		super(rootPartnerOperations, customerId);
		if (StringHelper.isNullOrEmpty(customerId))
		{
			throw new IllegalArgumentException("customerId must be set.");
		}
	}

	/**
	 * Gets a directory role operations object.
	 * 
	 * @param roleId The directory role id.
	 * @return The directory role operations object.
	 */
	@Override
	public IDirectoryRole byId(String roleId)
	{
		return new DirectoryRoleOperations(this.getPartner(), this.getContext(), roleId);
	}

	/**
	 * Retrieves all customer directory roles.
	 * 
	 * @return All the customer directory roles.
	 */
	@Override
	public ResourceCollection<DirectoryRole> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<DirectoryRole>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerDirectoryRoles").getPath(),
				this.getContext()));
	}
}