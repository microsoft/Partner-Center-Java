// -----------------------------------------------------------------------
// <copyright file="ProductCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Product collection operations implementation.
 */
public class ProductCollectionOperations
    extends BasePartnerComponentString
    implements IProductCollection
{
    /**
     * Initializes a new instance of the ProductCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public ProductCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations, null );
    }

    /***
     *  Retrieves the operations that can be applied on products from a given country.
     * 
     * @param country The country name.
     * @return The product collection operations by country.
     */    
    public IProductCollectionByCountry byCountry(String country)
    {
        return new ProductCollectionByCountryOperations(this.getPartner(), country);
    }
}