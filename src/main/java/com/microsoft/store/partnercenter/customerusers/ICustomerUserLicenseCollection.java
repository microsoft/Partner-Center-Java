// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerusers;

import java.util.List;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.licenses.License;
import com.microsoft.store.partnercenter.models.licenses.LicenseGroupId;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the behavior of the customers user's directory roles.
 */
public interface ICustomerUserLicenseCollection 
	extends IPartnerComponent<Tuple<String,String>>,
    IEntireEntityCollectionRetrievalOperations<License, ResourceCollection<License>>{
    
    /**
     * Retrieves the assigned licenses to a customer user.
     * 
     * @return The customer user's directory roles.
     */
    ResourceCollection<License> get();

    /**
     * Retrieves the assigned licenses to a customer user.
     * 
     * @param licenseGroupIds License group identifier
     * @return The customer user's directory roles.
     */
    ResourceCollection<License> get(List<LicenseGroupId> licenseGroupIds);
}