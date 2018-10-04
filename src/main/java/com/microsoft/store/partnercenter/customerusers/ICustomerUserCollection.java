// -----------------------------------------------------------------------
// <copyright file="ICustomerUserCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.users.CustomerUser;

/***
 * Represents the behavior of the customers users
 */
public interface ICustomerUserCollection     
	extends IPartnerComponentString, IEntityCreateOperations<CustomerUser, CustomerUser>,
	IEntireEntityCollectionRetrievalOperations<CustomerUser, SeekBasedResourceCollection<CustomerUser>>
{
    /*** 
     * Gets a single customer user operations.
     */
    ICustomerUser byId( String userId );

    /***
     * Queries users associated to the customer.
     * - Count queries are not supported by this operation.
     * - You can set page size, filter and sort option.
     * - You can navigate to other pages by specifying a seek query with the seek operation and the continuation
     * 	 token sent by the previous operation.
     * @param customerUsersQuery A query to apply onto customer users. Check <see cref="QueryFactory"/> to see how to build queries.
     * @return The requested customer users.
     */
    SeekBasedResourceCollection<CustomerUser> query( IQuery customerUsersQuery );

    /***
     * Create a new user for the customer.
     * 
     * @param newEntity The user object containing details for the new user to be created.
     * @return User entity
     */
    CustomerUser create( CustomerUser newEntity );
    
    /***
     * Retrieves all the customer users.
     * 
     * @return All the customer orders.
     */
    SeekBasedResourceCollection<CustomerUser> get();

}
