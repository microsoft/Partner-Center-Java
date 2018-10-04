// -----------------------------------------------------------------------
// <copyright file="ProductExtensionsOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions.products;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Extensions operations implementation.
 */
public class ProductExtensionsOperations 
    extends BasePartnerComponentString implements IProductExtensions 
{
    /**
     * Initializes a new instance of the ProductExtensionsOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public ProductExtensionsOperations(IPartner rootPartnerOperations) {
        super(rootPartnerOperations, null);
    }

	/***
	 * Retrieves the extension operations that can be applied on products from a given country.
	 * 
	 * @param country The country name.
	 * @return The product extensions operations by country.
	 */
    public IProductExtensionsByCountry byCountry(String country)
    {
        return new ProductExtensionsByCountryOperations(this.getPartner(), country);
    }
}