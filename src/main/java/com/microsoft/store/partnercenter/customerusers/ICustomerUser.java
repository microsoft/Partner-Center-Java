// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerusers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.users.CustomerUser;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Encapsulates a customer user behavior.
 */
public interface ICustomerUser
	extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<CustomerUser>, 
	IEntityDeleteOperations<CustomerUser>, IEntityPatchOperations<CustomerUser>
{
    /**
     * Gets the current user's directory role collection operations.
     * 
     * @return The current user's directory role collection operations.
     */
	ICustomerUserRoleCollection getDirectoryRoles();

    /**
     * Gets the current user's licenses collection operations.
     * 
     * @return The current user's licenses collection operations.
     */
    ICustomerUserLicenseCollection getLicenses();

    /**
     * Gets the current user's license updates operations.
     * 
     * @return The current user's license updates operations.
     */
    ICustomerUserLicenseUpdates getLicenseUpdates();

    /**
     * Retrieves the customer user.
     * 
     * @return The customer user.
     */    
    CustomerUser get();

    /**
     * Deletes a user.
     */
    void delete();

    /**
     * Updates the customer user.
     * 
     * @param entity Customer user entity.
     * @return The updated user. 
     */
    CustomerUser patch( CustomerUser entity );
}