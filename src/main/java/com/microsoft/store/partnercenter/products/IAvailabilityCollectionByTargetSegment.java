// -----------------------------------------------------------------------
// <copyright file="IAvailabilityCollectionByTargetSegment" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;

/**
 * Holds operations that can be performed on availabilities for a specific target segment.
 */
public interface IAvailabilityCollectionByTargetSegment
    extends IPartnerComponent<QuadrupleTuple<String, String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Availability, ResourceCollection<Availability>>
{
    /***
     * Retrieves all the availabilities for the provided SKU on a specific target segment.
     * 
     * @return: The availability for the provided SKU on a specific target segment.
     */
    ResourceCollection<Availability> get();
}