// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductUpgradeErrorDetailTest
{
    @Test
    void getCode()
    {
        ProductUpgradeErrorDetail resource = new ProductUpgradeErrorDetail();
        String value = "code";

        resource.setCode(value);

        assertEquals(value, resource.getCode());
    }

    @Test
    void getDescription()
    {
        ProductUpgradeErrorDetail resource = new ProductUpgradeErrorDetail();
        String value = "description";

        resource.setDescription(value);

        assertEquals(value, resource.getDescription());
    }
}