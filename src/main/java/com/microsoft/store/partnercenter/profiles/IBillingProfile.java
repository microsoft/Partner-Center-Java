// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.partners.BillingProfile;

/**
 * Encapsulates behavior of a partner billing profile.
 */
public interface IBillingProfile
    extends IPartnerComponentString, IEntityGetOperations<BillingProfile>,
    IEntityUpdateOperations<BillingProfile>
{
	/**
	 * Retrieves a partner's billing profile.
	 * @return The billing profile.
	 */
    BillingProfile get();
    
    /**
     * Updates the partner's billing profile.
     * @param billingProfile The billing profile information.
     * @return The updated billing profile.
     */
    BillingProfile update(BillingProfile billingProfile);
}
