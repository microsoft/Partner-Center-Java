// -----------------------------------------------------------------------
// <copyright file="DirectoryRoleCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class DirectoryRoleCollectionOperations
	extends BasePartnerComponentString
	implements IDirectoryRoleCollection
{

	/***
	 * Initializes a new instance of the DirectoryRoleCollectionOperations class.
	 * 
	 * @param rootPartnerOperations: The root partner operations instance.
	 * @param customerId: The customer id.
	 */
	public DirectoryRoleCollectionOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrEmpty( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }
	}

	/***
	 * Gets a directory role operations object.
	 * 
	 * @param roleId: The directory role id.
	 * @return: The directory role operations object.
	 */
	@Override
	public IDirectoryRole byId(String roleId)
	{
		return new DirectoryRoleOperations( this.getPartner(), this.getContext(), roleId );
	}

	/***
	 * Retrieves all customer directory roles.
	 * 
	 * @return: All the customer directory roles.
	 */
	@Override
	public ResourceCollection<DirectoryRole> get()
	{
        IPartnerServiceProxy<DirectoryRole, ResourceCollection<DirectoryRole>> partnerServiceProxy =
                new PartnerServiceProxy<DirectoryRole, ResourceCollection<DirectoryRole>>( new TypeReference<ResourceCollection<DirectoryRole>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerDirectoryRoles" ).getPath(),
        				this.getContext(), Locale.US ) );
        
        return partnerServiceProxy.get();
	}

}
