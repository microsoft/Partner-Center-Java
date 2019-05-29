// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.entitlements;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 *  Represents the operations that can be performed on entitlements (by type) associated to the customer based on the logged in partner.
 */
public interface IEntitlementCollectionByEntitlementType 
	extends IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>>
{
    /**
     * Gets an entitlement collection with the given entitlement type.
     * 
     * @param showExpiry A flag to indicate if the expiry date is required to be returned along with the entitlement (if applicable).
     * @return The collection of entitlements corresponding to a specific entitlement type for the customer.
     */
    ResourceCollection<Entitlement> get(Boolean showExpiry);
}