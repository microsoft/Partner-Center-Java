// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesEligibility;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesRequest;

import okhttp3.Response;

/**
 * Implements the operations for product upgrades
 */
public class ProductUpgradesCollectionOperations
    extends BasePartnerComponentString
	implements IProductUpgradesCollection 
{
	/**
	 * Initializes a new instance of the ProductUpgradesCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
    public ProductUpgradesCollectionOperations(IPartner rootPartnerOperations)
	{
        super(rootPartnerOperations);
    }

    /**
     * Gets the product upgrade by identifier operations for a specific customer.
     * 
     * @param upgradeId The identifier for the upgrade.
     * @return The available product upgrade operations.
     */
    @Override
    public IProductUpgrades byId(String upgradeId)
    {
        return new ProductUpgradesOperations(this.getPartner(), upgradeId);
    }

    /**
     * Checks the product upgrade eligibility.
     * 
     * @param productUpgradesRequest The product upgrade request.
     * @return The product upgrade eligibility for the customer.
     */
    @Override
    public ProductUpgradesEligibility CheckEligibility(ProductUpgradesRequest productUpgradesRequest)
    {
		if (productUpgradesRequest == null)
		{
			throw new IllegalArgumentException("The productUpgradesRequest parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ProductUpgradesEligibility>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProductUpgradeEligibility").getPath(),
				this.getContext()),
            productUpgradesRequest);
    }

    /**
     * Create the product upgrade request.
     * 
     * @param productUpgradesRequest The product upgrade request.
     * @return The identifier for the product upgrade.
     */
    @Override
    public String create(ProductUpgradesRequest newEntity)
    {
		if (newEntity == null)
		{
			throw new IllegalArgumentException("The productUpgradesRequest parameter cannot be null.");
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