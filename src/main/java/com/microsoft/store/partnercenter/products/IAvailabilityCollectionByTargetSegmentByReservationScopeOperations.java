// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.QuintupleTuple;

/**
 * Represents the operations that can be performed on availabilities for a specific reservation scope given a target segment.
 */
public interface IAvailabilityCollectionByTargetSegmentByReservationScopeOperations
    extends IPartnerComponent<QuintupleTuple<String, String, String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Availability, ResourceCollection<Availability>>
{
}