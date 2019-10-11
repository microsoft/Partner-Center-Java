// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesEligibility;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradesRequest;

/**
 * Represents operations that apply to product upgrades.
 */
public interface IProductUpgradesCollection
    extends IPartnerComponent<String>, IEntityCreateOperations<ProductUpgradesRequest, String>, IEntitySelector<String, IProductUpgrades>
{
    /**
     * Checks the product upgrade eligibility
     * 
     * @param productUpgradesRequest The product upgrade request
     * @return The product upgrade eligibility for the customer.
     */
    ProductUpgradesEligibility CheckEligibility(ProductUpgradesRequest productUpgradesRequest);
}