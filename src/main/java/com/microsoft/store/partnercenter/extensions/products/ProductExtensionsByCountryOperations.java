// -----------------------------------------------------------------------
// <copyright file="ProductExtensionsByCountryOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions.products;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.InventoryCheckRequest;
import com.microsoft.store.partnercenter.models.products.InventoryItem;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * Product extensions operations implementation by country.
 */
public class ProductExtensionsByCountryOperations 
    extends BasePartnerComponentString implements IProductExtensionsByCountry 
{
    /**
     * Initializes a new instance of the ProductExtensionsByCountryOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param country               The country on which to base the corresponding products.
     */
    public ProductExtensionsByCountryOperations(IPartner rootPartnerOperations, String country) {
        super(rootPartnerOperations, country);

        if (StringHelper.isNullOrWhiteSpace(country)) {
            throw new IllegalArgumentException("country must be set");
        }
    }

	/***
	 * Retrieves inventory validation results for the provided country.
	 * 
	 * @param checkRequest The request for the inventory check.
	 * @return The inventory check results.
	 */
    public List<InventoryItem> checkInventory(InventoryCheckRequest checkRequest)
    {
        IPartnerServiceProxy<InventoryCheckRequest, List<InventoryItem>> partnerServiceProxy = 
            new PartnerServiceProxy<InventoryCheckRequest, List<InventoryItem>>(
                new TypeReference<List<InventoryItem>>() {
                }, this.getPartner(),
                PartnerService.getInstance().getConfiguration().getApis().get("CheckInventory").getPath());

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "CheckInventory" ).getParameters().get( "Country" ),
                this.getContext()));
            
        return partnerServiceProxy.post(checkRequest);
    }
}