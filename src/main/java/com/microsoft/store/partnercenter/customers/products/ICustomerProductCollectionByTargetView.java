// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on products in a given catalog view that apply to a given customer.
 */
public interface ICustomerProductCollectionByTargetView
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<Product, ResourceCollection<Product>>
{
    /**
     * Retrieves all the products in a given catalog view that apply to a given customer.
     * 
     * @return The products in a given catalog view that apply to a given customer.
     */
    ResourceCollection<Product> get();
    
    /**
     * Retrieves the operations that can be applied on products in a given catalog view and that apply to a given customer, filtered by target segment.
     * 
     * @param targetSegment The product segment filter.
     * @return The product collection operations by customer, by target view and by target segment.
     */
    ICustomerProductCollectionByTargetViewByTargetSegment byTargetSegment(String targetSegment);
}