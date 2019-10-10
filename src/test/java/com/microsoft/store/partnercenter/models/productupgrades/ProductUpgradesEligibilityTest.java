// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductUpgradesEligibilityTest
{
    @Test
    void getCustomerId()
    {
        ProductUpgradesEligibility resource = new ProductUpgradesEligibility();
        String value = "d0064aa7-6de8-4106-ade8-30c56765db9a";

        resource.setCustomerId(value);

        assertEquals(value, resource.getCustomerId());
    }

    @Test
    void getIsEligible()
    {
        ProductUpgradesEligibility resource = new ProductUpgradesEligibility();

        resource.setIsEligible(true);

        assertEquals(true, resource.getIsEligible());
    }

    @Test
    void getProductFamily()
    {
        ProductUpgradesEligibility resource = new ProductUpgradesEligibility();
        String value = "Azure";

        resource.setProductFamily(value);

        assertEquals(value, resource.getProductFamily());
    }

    @Test
    void getReason()
    {
        ProductUpgradesEligibility resource = new ProductUpgradesEligibility();
        String value = "reason";

        resource.setReason(value);

        assertEquals(value, resource.getReason());
    }

    @Test
    void getUpgradeId()
    {
        ProductUpgradesEligibility resource = new ProductUpgradesEligibility();
        String value = "439aa165-3ead-4056-a941-f46ccc76bbd0";

        resource.setUpgradeId(value);

        assertEquals(value, resource.getUpgradeId());
    }
}