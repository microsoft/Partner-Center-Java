// -----------------------------------------------------------------------
// <copyright file="IProductCollectionByCountryByTargetView.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on products that belong to a given country and a catalog view.
 */
public interface IProductCollectionByCountryByTargetView
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<Product, ResourceCollection<Product>>
{
    /**
     * Retrieves the operations that can be applied on products that belong to a given country, catalog view and target segment.
     * 
     * @param targetSegment The target segment filter.
     * @return The product collection operations by country, by target view and by target segment.
     */
    IProductCollectionByCountryByTargetViewByTargetSegment byTargetSegment(String targetSegment);

    /**
     * Retrieves all the products in the given country and catalog view.
     * 
     * @return The products in the given country and catalog view.
     */
    ResourceCollection<Product> get();
}