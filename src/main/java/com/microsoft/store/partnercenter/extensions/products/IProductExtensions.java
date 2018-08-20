// -----------------------------------------------------------------------
// <copyright file="IProductExtensions.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions.products;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/***
 *  Holds extension operations for products.
 */
public interface IProductExtensions 
	extends IPartnerComponentString
{
	/***
	 * Retrieves the extension operations that can be applied on products from a given country.
	 * 
	 * @param country: The country name.
	 * @return: The product extensions operations by country.
	 */
    IProductExtensionsByCountry byCountry(String country);
}