// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;

/**
 * Holds operations that can be performed on products from a given country.
 */
public interface IProductCollectionByCountry
    extends IPartnerComponentString,
    IEntitySelector<String, IProduct>
{
    /**
     * Retrieves the operations tied with a specific product.
     * 
     * @param productId The identifier for the product.
     * @return The available product operations.
     */
    IProduct byId(String productId);

    /**
     * Retrieves the operations that can be applied on products that belong to a given country, catalog view and target segment.
     * 
     * @param targetView The product target view.
     * @return The product collection operations by country and by target view.
     */
    IProductCollectionByCountryByTargetView byTargetView(String targetView);
}