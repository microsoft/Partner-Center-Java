// -----------------------------------------------------------------------
// <copyright file="IEntitlementCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.entitlements;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.entitlements.Entitlement;

/***
 *  Holds operations that can be performed on entitlements associated to the customer based on the logged in partner.
 */
public interface IEntitlementCollection 
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>>
{
	/***
	 * Retrieves the operations that can be applied on entitlements with a given entitlement type.
	 * 
	 * @param entitlementType The type of entiltment.
	 * @return The entitlement collection operations by entitlement type.
	 */
     IEntireEntityCollectionRetrievalOperations<Entitlement, ResourceCollection<Entitlement>> byEntitlementType(String entitlementType);
}