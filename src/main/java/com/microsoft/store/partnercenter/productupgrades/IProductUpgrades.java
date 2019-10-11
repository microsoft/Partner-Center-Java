// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesRequest;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesStatus;

/**
 * Represents operations that apply to product upgrades.
 */
public interface IProductUpgrades
    extends IPartnerComponent<String>
{
    /**
     * Checks the product upgrade status
     * 
     * @param productUpgradesRequest The product upgrade status request.
     * @return The status of the product upgrade.
     */
    ProductUpgradesStatus CheckStatus(ProductUpgradesRequest productUpgradesRequest);
}