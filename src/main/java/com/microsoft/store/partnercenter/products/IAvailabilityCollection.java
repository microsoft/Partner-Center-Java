// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on availabilities.
 */
public interface IAvailabilityCollection
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Availability, ResourceCollection<Availability>>, IEntitySelector<String, IAvailability>
{
    /**
     * Retrieves the operations tied with a specific availability.
     * 
     * @param availabilityId Identifier for the availability.
     * @return The availability operations.
     */    
    IAvailability byId( String availabilityId );

    /**
     * Retrieves the operations that can be applied on availabilities filtered by a specific target segment.
     * 
     * @param targetSegment The availability segment filter.
     * @return The availability collection operations by target segment.
     */    
    IAvailabilityCollectionByTargetSegment byTargetSegment(String targetSegment);

    /**
     * Retrieves all the availabilities for the provided SKU.
     * 
     * @return The availabilities for the provided SKU.
     */
    ResourceCollection<Availability> get();
}