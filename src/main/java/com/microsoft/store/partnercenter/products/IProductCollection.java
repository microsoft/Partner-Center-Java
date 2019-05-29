// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/**
 * Holds operations that can be performed on products.
 */
public interface IProductCollection
    extends IPartnerComponentString
{
    /**
     *  Retrieves the operations that can be applied on products from a given country.
     * 
     * @param country The country name.
     * @return The product collection operations by country.
     */    
    IProductCollectionByCountry byCountry(String country);
}