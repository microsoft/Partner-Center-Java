// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductUpgradeDetailTest
{
    @Test
    void getId()
    {
        ProductUpgradeDetail resource = new ProductUpgradeDetail();
        String value = "d0064aa7-6de8-4106-ade8-30c56765db9a";

        resource.setId(value);

        assertEquals(value, resource.getId());
    }

    @Test
    void getName()
    {
        ProductUpgradeDetail resource = new ProductUpgradeDetail();
        String value = "name";

        resource.setName(value);

        assertEquals(value, resource.getName());
    }
}