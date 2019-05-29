// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on products that apply to a given customer.
 */
public interface IProduct
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<Product>
{
    /**
     * Retrieves the SKUs for the product.
     * 
     * @return The SKUs for the product.
     */
    ISkuCollection getSkus();

    /**
     * Retrieves the product information
     * 
     * @return The product information.
     */
    Product get();
}