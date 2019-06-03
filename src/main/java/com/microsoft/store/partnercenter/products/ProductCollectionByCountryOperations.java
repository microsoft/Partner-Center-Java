// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * Product operations by country implementation class.
 */
public class ProductCollectionByCountryOperations
    extends BasePartnerComponentString
    implements IProductCollectionByCountry
{
    /**
     * Initializes a new instance of the ProductCollectionByCountryOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param country               The country on which to base the products.
     */
    public ProductCollectionByCountryOperations(IPartner rootPartnerOperations, String country)
    {
        super(rootPartnerOperations, country);

        ParameterValidator.isValidCountryCode(country);
    }

    /**
     * Retrieves the operations tied with a specific product.
     * 
     * @param productId The identifier for the product.
     * @return The available product operations.
     */
    public IProduct byId(String productId)
    {
        return new ProductOperations(this.getPartner(), productId, this.getContext());
    }

    /**
     * Retrieves the operations that can be applied on products that belong to a given country, catalog view and target segment.
     * 
     * @param targetView The product target view.
     * @return The product collection operations by country and by target view.
     */
    public IProductCollectionByCountryByTargetView byTargetView(String targetView)
    {
        return new ProductCollectionByCountryByTargetViewOperations(this.getPartner(), targetView, this.getContext());
    }
}