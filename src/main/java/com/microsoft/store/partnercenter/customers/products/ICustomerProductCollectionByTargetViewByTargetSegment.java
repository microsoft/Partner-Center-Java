// -----------------------------------------------------------------------
// <copyright file="ICustomerProductCollectionByTargetViewByTargetSegment.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on products in a given catalog view and that apply to a given customer, filtered by target segment.
 */
public interface ICustomerProductCollectionByTargetViewByTargetSegment
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Product, ResourceCollection<Product>>
{
    /***
     * Retrieves all the products in a given catalog view and that apply to a given customer, filtered by target segment.
     * 
     * @return: The products in a given catalog view and that apply to a given customer, filtered by target segment.
     */
    ResourceCollection<Product> get();    
}