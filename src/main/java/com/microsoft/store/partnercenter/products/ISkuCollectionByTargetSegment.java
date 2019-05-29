// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on skus from a specific target segment.
 */
public interface ISkuCollectionByTargetSegment
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Sku, ResourceCollection<Sku>>
{
    /**
     * Retrieves all the skus for the provided product and target segment.
     * 
     * @return The SKUs for the provided product and target segment.
     */
    ResourceCollection<Sku> get();
}