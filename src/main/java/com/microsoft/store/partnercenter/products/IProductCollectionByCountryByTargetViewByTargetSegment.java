// -----------------------------------------------------------------------
// <copyright file="IProductCollectionByCountryByTargetViewByTargetSegment.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on products that belong to a given country, a catalog view and a specific target segment.
 */
public interface IProductCollectionByCountryByTargetViewByTargetSegment
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Product, ResourceCollection<Product>>
{
    /***
     * Retrieves all the products in the given country, catalog view and target segment.
     * 
     * @return: The products in the given country, catalog view and target segment.
     */
    ResourceCollection<Product> get();
}