// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    /**
     * Gets the operations that can be applied on products that belong to a given target segment, and reservation scope.
     * 
     * @param reservationScope The reservation scope filter.
     * @return The availability collection operations by target segment by reservation scope.
     */
    IAvailabilityCollectionByTargetSegmentByReservationScopeOperations byReservationScope(String reservationScope);
}