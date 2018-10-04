// -----------------------------------------------------------------------
// <copyright file="IProductExtensionsByCountry.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions.products;

import java.util.List;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.products.InventoryItem;
import com.microsoft.store.partnercenter.models.products.InventoryCheckRequest;

/***
 *  Holds extension operations for products by country.
 */
public interface IProductExtensionsByCountry 
	extends IPartnerComponentString
{
	/***
	 * Retrieves inventory validation results for the provided country.
	 * 
	 * @param checkRequest The request for the inventory check.
	 * @return The inventory check results.
	 */
     List<InventoryItem> checkInventory(InventoryCheckRequest checkRequest);
}