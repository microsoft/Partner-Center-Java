// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeEligibility;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeRequest;

import okhttp3.Response;

/**
 * Implements the operations for product upgrades
 */
public class ProductUpgradeCollectionOperations
    extends BasePartnerComponentString
	implements IProductUpgradeCollection 
{
	/**
	 * Initializes a new instance of the ProductUpgradeCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
    public ProductUpgradeCollectionOperations(IPartner rootPartnerOperations)
	{
        super(rootPartnerOperations);
    }

    /**
     * Gets the product upgrade by identifier operations for a specific customer.
     * 
     * @param id The identifier for the upgrade.
     * @return The available product upgrade operations.
     */
    @Override
    public IProductUpgrade byId(String id)
    {
        return new ProductUpgradeOperations(this.getPartner(), id);
    }

    /**
     * Checks the product upgrade eligibility.
     * 
     * @param productUpgradeRequest The product upgrade request.
     * @return The product upgrade eligibility for the customer.
     */
    @Override
    public ProductUpgradeEligibility checkEligibility(ProductUpgradeRequest productUpgradeRequest)
    {
		if (productUpgradeRequest == null)
		{
			throw new IllegalArgumentException("The productUpgradeRequest parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ProductUpgradeEligibility>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProductUpgradeEligibility").getPath(),
				this.getContext()),
            productUpgradeRequest);
    }

    /**
     * Create the product upgrade request.
     * 
     * @param newEntity The product upgrade request.
     * @return The identifier for the product upgrade.
     */
    @Override
    public String create(ProductUpgradeRequest newEntity)
    {
		if (newEntity == null)
		{
			throw new IllegalArgumentException("The newEntity parameter cannot be null.");
        }
        
		Response response = this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<Response>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("UpgradeProduct").getPath(),
				this.getContext()),
            newEntity);

		return response.header("location");
    }
}