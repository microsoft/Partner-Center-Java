// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeEligibility;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeRequest;

/**
 * Represents operations that apply to product upgrades.
 */
public interface IProductUpgradeCollection
    extends IPartnerComponent<String>, IEntityCreateOperations<ProductUpgradeRequest, String>, IEntitySelector<String, IProductUpgrade>
{
    /**
     * Checks the product upgrade eligibility
     * 
     * @param productUpgradesRequest The product upgrade request
     * @return The product upgrade eligibility for the customer.
     */
    ProductUpgradeEligibility checkEligibility(ProductUpgradeRequest productUpgradesRequest);
}