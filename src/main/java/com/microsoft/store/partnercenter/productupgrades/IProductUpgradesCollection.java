// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesEligibility;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesRequest;

/**
 * Represents operations that apply to product upgrades.
 */
public interface IProductUpgradesCollection
    extends IPartnerComponent<String>
{
    /**
     * Gets the product upgrade by identifier operations for a specific customer.
     * 
     * @param upgradeId The identifier for the upgrade.
     * @return The available product upgrade operations.
     */
    IProductUpgrades ById(String upgradeId);

    /**
     * Checks the product upgrade eligibility
     * 
     * @param productUpgradesRequest The product upgrade request
     * @return The product upgrade eligibility for the customer.
     */
    ProductUpgradesEligibility CheckEligibility(ProductUpgradesRequest productUpgradesRequest);

    /**
     * Create the product upgrade request.
     * 
     * @param productUpgradesRequest The product upgrade request.
     * @return The identifier for the product upgrade.
     */
    String Create(ProductUpgradesRequest productUpgradesRequest);
}