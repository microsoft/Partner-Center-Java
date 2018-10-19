// -----------------------------------------------------------------------
// <copyright file="IUserMemberCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.roles.UserMember;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Interface for Managing User Membership in Directory Roles
 *
 */
public interface IUserMemberCollection
	extends IPartnerComponent<Tuple<String, String>>, IEntityCreateOperations<UserMember, UserMember>,
		IEntireEntityCollectionRetrievalOperations<UserMember, SeekBasedResourceCollection<UserMember>>, 
		IEntitySelector<IUserMember>
{
    /**
     * Gets a single user member behavior.
     * @param userId The user identifier.
     * @return The user member operations.
     */
    IUserMember byId( String userId );

    /**
     * Adds customer user to a directory role.
     * @param newEntity UserMember to add.
     * @return The customer directory role user member.
     */
    UserMember create( UserMember newEntity );

    /**
     * Queries the user members of a customer directory role.
     * @param query A query to apply onto user member collection.
     * @return The directory role user members.
     */
    SeekBasedResourceCollection<UserMember> query( IQuery query );

    /**
     * Gets all the user members of a customer directory role.
     * @return The directory role user memberships.
     */
    SeekBasedResourceCollection<UserMember> get();

}
