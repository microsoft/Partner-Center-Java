// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.relationships;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.relationships.PartnerRelationship;

/**
 * For two-tier partner scenarios, holds the operations for retrieving partner relationships
 * of a customer with respect to the logged in partner.
 */
public interface ICustomerRelationshipCollection
    extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<PartnerRelationship, ResourceCollection<PartnerRelationship>>
{
    /**
     * Retrieves all the partner relationships associated to the customer based on the logged in partner.
     * 
     * @return The partner relationships.
     */
    ResourceCollection<PartnerRelationship> get();
}