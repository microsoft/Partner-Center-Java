// -----------------------------------------------------------------------
// <copyright file="ISkuCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on SKUs.
 */
public interface ISkuCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntitySelector<String, ISku>, IEntireEntityCollectionRetrievalOperations<Sku, ResourceCollection<Sku>>
{
    /**
     * Retrieves the operations tied with a specific SKU.
     * 
     * @param skuId Identifier for the SKU.
     * @return The available SKU operations.
     */
    ISku byId(String skuId);
    
    /**
     * Retrieves the operations that can be applied on SKUs that belong to a segment.
     * 
     * @param targetSegment The SKU segment filter.
     * @return The SKU collection operations by target segment.
     */
    ISkuCollectionByTargetSegment byTargetSegment(String targetSegment);

    /**
     * Retrieves all the SKUs for the provided product.
     * 
     * @return The SKUs for the provided product.
     */
    ResourceCollection<Sku> get();
}