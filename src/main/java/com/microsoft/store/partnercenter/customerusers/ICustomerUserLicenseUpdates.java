// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerusers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.models.licenses.LicenseUpdate;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the behavior of the customers user's directory roles.
 */
public interface ICustomerUserLicenseUpdates 
	extends IPartnerComponent<Tuple<String,String>>,
    IEntityCreateOperations<LicenseUpdate, LicenseUpdate>  
{
    /**
     * Assign licenses to a user.
     * This method serves three scenarios:
     * 1. Add license to a customer user.
     * 2. Remove license from a customer user.
     * 3. Update existing license for a customer user.
     * 
     * @param newLicenseUpdate License update object.
     * @return The customer user's directory roles.
     */
	LicenseUpdate create( LicenseUpdate newLicenseUpdate );
}