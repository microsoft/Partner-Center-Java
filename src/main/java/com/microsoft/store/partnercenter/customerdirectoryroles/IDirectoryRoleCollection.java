// -----------------------------------------------------------------------
// <copyright file="IDirectoryRoleCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;

/**
 * Interface for Directory Roles Collection
 *
 */
public interface IDirectoryRoleCollection 
	extends IPartnerComponentString,
	IEntireEntityCollectionRetrievalOperations<DirectoryRole, ResourceCollection<DirectoryRole>>, IEntitySelector<IDirectoryRole>
{
	/**
	 * Gets a directory role behavior.
	 * 
	 * @param roleId The directory role identifier.
	 * @return The directory role operations.
	 */
    IDirectoryRole byId( String roleId );

    /**
     * Retrieves all customer directory roles.
     * @return All the customer directory roles.
     */
    ResourceCollection<DirectoryRole> get();
}
