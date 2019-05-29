// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * DirectoryRoleOperations
 *
 */
public class DirectoryRoleOperations extends BasePartnerComponent<Tuple<String, String>> implements IDirectoryRole
{
    private IUserMemberCollection directoryRoleUserMemberOperations;

	/**
	 * Initializes a new instance of the DirectoryRoleOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance
	 * @param customerId The customer identifier.
	 * @param roleId The directory role id
	 */
	public DirectoryRoleOperations( IPartner rootPartnerOperations, String customerId, String roleId )
	{
		super( rootPartnerOperations, new Tuple<String, String>( customerId, roleId ) );
		
		if ( StringHelper.isNullOrEmpty( customerId ) )
        {
            throw new IllegalArgumentException("customerId must be set.");
        }

        if ( StringHelper.isNullOrEmpty( roleId ) )
        {
            throw new IllegalArgumentException("roleId must be set.");
        }
        
        this.directoryRoleUserMemberOperations = new UserMemberCollectionOperations( this.getPartner(), customerId, roleId );
	}

	/**
	 * Gets the current directory role's user member collection operations.
	 * 
	 * @return current directory role's user member collection operations
	 */
	@Override
	public IUserMemberCollection getUserMembers()
	{
		return this.directoryRoleUserMemberOperations;
	}
}