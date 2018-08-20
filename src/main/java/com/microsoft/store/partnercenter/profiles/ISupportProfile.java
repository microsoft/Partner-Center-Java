// -----------------------------------------------------------------------
// <copyright file="ISupportProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.partners.SupportProfile;

/**
 * Encapsulates behavior of a partner support profile.
 */
public interface ISupportProfile
    extends IPartnerComponentString, IEntityGetOperations<SupportProfile>,
    IEntityUpdateOperations<SupportProfile>
{
    /**
     * Retrieves the partner's support profile. This operation is currently only supported for user based credentials.
     * 
     * @return The partner's support profile.
     */
    SupportProfile get();

    /**
     * Updates the partner's support profile. This operation is currently only supported for user based credentials.
     * 
     * @param supportProfile The support profile.
     * @return The updated support profile.
     */
    SupportProfile update( SupportProfile supportProfile );

}
