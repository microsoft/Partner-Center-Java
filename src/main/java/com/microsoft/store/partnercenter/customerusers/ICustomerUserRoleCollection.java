// -----------------------------------------------------------------------
// <copyright file="ICustomerUserRoleCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/***
 * Represents the behavior of the customers user's directory roles.
 */
public interface ICustomerUserRoleCollection 
	extends IPartnerComponent<Tuple<String,String>>,
    IEntireEntityCollectionRetrievalOperations<DirectoryRole, ResourceCollection<DirectoryRole>>{
    /***
     * Retrieves the customer user's directory roles.
     * <returns>The customer user's directory roles.</returns>
     */
    ResourceCollection<DirectoryRole> get();

}
