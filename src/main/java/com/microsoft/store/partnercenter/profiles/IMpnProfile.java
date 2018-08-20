// -----------------------------------------------------------------------
// <copyright file="IMpnProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.partners.MpnProfile;

/**
 * Operations for MpnProfile
 */
public interface IMpnProfile
    extends IPartnerComponentString, IEntityGetOperations<MpnProfile>
{
    /**
     * Retrieves the logged in partner's MPN profile.
     * 
     * @return The partner's MPN profile.
     */
    MpnProfile get();

    /**
     * Retrieves a partner's MPN profile by MPN Id.
     * 
     * @param mpnId The MPN id.
     * @return The partner's MPN profile.
     */
    MpnProfile get( String mpnId );

}
