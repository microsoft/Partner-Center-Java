// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.partners.OrganizationProfile;

/**
 * Encapsulates behavior of a organization profile.
 */
public interface IOrganizationProfile
    extends IPartnerComponentString, IEntityGetOperations<OrganizationProfile>,
    IEntityUpdateOperations<OrganizationProfile>
{
    /**
     * Retrieves the partner's organization profile. 
     *  
     * @return The organization profile.
     */
    OrganizationProfile get();

    /**
     * Updates the partner's organization profile. 
     * 
     * @param entity The organization profile.
     * @return The updated organization profile.
     */
    OrganizationProfile update(OrganizationProfile entity);

}
