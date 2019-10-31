// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.productupgrades;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeRequest;
import com.microsoft.store.partnercenter.models.productupgrades.ProductUpgradeStatus;

/**
 * Represents operations that apply to product upgrades.
 */
public interface IProductUpgrade
    extends IPartnerComponent<String>
{
    /**
     * Checks the product upgrade status
     * 
     * @param productUpgradeRequest The product upgrade status request.
     * @return The status of the product upgrade.
     */
    ProductUpgradeStatus checkStatus(ProductUpgradeRequest productUpgradeRequest);
}