// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesRequest;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesStatus;

/**
 * Implements the operations for product upgrades
 */
public class ProductUpgradesOperations
    extends BasePartnerComponentString
	implements IProductUpgrades 
{
    /**
	 * Initializes a new instance of the ProductUpgradesOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
    public ProductUpgradesOperations(IPartner rootPartnerOperations, String upgradeId)
	{
        super(rootPartnerOperations, upgradeId);
    }

    /**
     * Checks the product upgrade status
     * 
     * @param productUpgradesRequest The product upgrade status request.
     * @return The eligibility object for the customer.
     */
    public ProductUpgradesStatus CheckStatus(ProductUpgradesRequest productUpgradesRequest)
    {
        if (productUpgradesRequest == null)
		{
			throw new IllegalArgumentException("The productUpgradesRequest parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ProductUpgradesStatus>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProductUpgradeStatus").getPath(),
				this.getContext()),
            productUpgradesRequest);   
    }
}