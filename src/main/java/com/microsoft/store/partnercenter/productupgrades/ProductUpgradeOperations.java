// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeRequest;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeStatus;

/**
 * Implements the operations for product upgrades
 */
public class ProductUpgradeOperations
    extends BasePartnerComponentString
	implements IProductUpgrade
{
    /**
	 * Initializes a new instance of the ProductUpgradeOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
     * @param upgradeId The identifier for the product upgrade.
	 */
    public ProductUpgradeOperations(IPartner rootPartnerOperations, String upgradeId)
	{
        super(rootPartnerOperations, upgradeId);
    }

    /**
     * Checks the product upgrade status
     * 
     * @param productUpgradeRequest The product upgrade status request.
     * @return The status of the product upgrade.
     */
    public ProductUpgradeStatus CheckStatus(ProductUpgradeRequest productUpgradeRequest)
    {
        if (productUpgradeRequest == null)
		{
			throw new IllegalArgumentException("The productUpgradeRequest parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ProductUpgradeStatus>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProductUpgradeStatus").getPath(),
				this.getContext()),
                productUpgradeRequest);   
    }
}