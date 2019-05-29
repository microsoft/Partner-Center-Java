// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerusers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the behavior of the customers user's directory roles.
 */
public interface ICustomerUserRoleCollection 
	extends IPartnerComponent<Tuple<String,String>>,
    IEntireEntityCollectionRetrievalOperations<DirectoryRole, ResourceCollection<DirectoryRole>>
{
    /**
     * Gets the customer user's directory roles.
     * 
     * @return The customer user's directory roles.
     */
    ResourceCollection<DirectoryRole> get();
}