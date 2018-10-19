// -----------------------------------------------------------------------
// <copyright file="ILegalBusinessProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.partners.LegalBusinessProfile;

/**
 * Encapsulates behavior of a legal business profile.
 */
public interface ILegalBusinessProfile
    extends IPartnerComponentString, IEntityGetOperations<LegalBusinessProfile>,
    IEntityUpdateOperations<LegalBusinessProfile>
{
	/**
	 * Retrieves the legal business profile.
	 * @return The legal business profile.
	 */
	LegalBusinessProfile get();
    
    /**
     * Updates the partner's legal business profile.
     * @param legalBusinessProfile The legal business profile information.
     * @return The updated legal business profile.
     */
	LegalBusinessProfile update( LegalBusinessProfile legalBusinessProfile );
}
