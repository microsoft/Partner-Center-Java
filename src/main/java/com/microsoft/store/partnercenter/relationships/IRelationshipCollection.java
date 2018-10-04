// -----------------------------------------------------------------------
// <copyright file="IRelationshipCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.relationships;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.relationships.PartnerRelationship;
import com.microsoft.store.partnercenter.models.relationships.PartnerRelationshipType;

/**
 * This interface represents the operations that can be done on a partner's relationships.
 */
public interface IRelationshipCollection
    extends IPartnerComponentString
{
    /***
     * Retrieves all the partner relationships.
     * 
     * @param partnerRelationshipType The type of partner relationship.
     * @return The available partner relationships.
     */
    ResourceCollection<PartnerRelationship> get(PartnerRelationshipType partnerRelationshipType);

    /***
     * Queries partner relationships associated to the partner.
     * 
     * @param partnerRelationshipType The type of partner relationship.
     * @param query A query to apply onto partner relationships. 
     * @return TThe partner relationships that match the given query.
     */
    ResourceCollection<PartnerRelationship> Query(PartnerRelationshipType partnerRelationshipType, IQuery query);
}