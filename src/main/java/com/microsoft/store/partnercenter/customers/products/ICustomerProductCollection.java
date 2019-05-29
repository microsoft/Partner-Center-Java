// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.products.IProduct;

/**
 * Holds operations that can be performed on products that apply to a given customer.
 */
public interface ICustomerProductCollection
    extends IPartnerComponentString, IEntitySelector<String, IProduct>
{
    /**
     * Retrieves the operations tied with a specific product for a given customer.
     * 
     * @param productId Identifier for the product.
     * @return The operations that can be performed on a single product.
     */
    IProduct byId( String productId );

    /**
     * Retrieves the operations that can be applied on products in a given catalog view and that apply to a given customer.
     * 
     * @param targetView The product target view.
     * @return The catalog view operations by target view
     */
    ICustomerProductCollectionByTargetView byTargetView(String targetView);
}