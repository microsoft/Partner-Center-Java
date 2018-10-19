// -----------------------------------------------------------------------
// <copyright file="ISkuDownloadOptions" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.SkuDownloadOptions;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on availabilities for a specific target segment.
 */
public interface ISkuDownloadOptions
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<SkuDownloadOptions, ResourceCollection<SkuDownloadOptions>>
{
    /**
     * Retrieves all download options for the provided SKU
     * 
     * @return The SKU download options
     */
    ResourceCollection<SkuDownloadOptions> get();
}