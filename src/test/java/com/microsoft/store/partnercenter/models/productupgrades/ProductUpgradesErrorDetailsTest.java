// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductUpgradesErrorDetailsTest
{
    @Test
    void getCode()
    {
        ProductUpgradesErrorDetails resource = new ProductUpgradesErrorDetails();
        String value = "code";

        resource.setCode(value);

        assertEquals(value, resource.getCode());
    }

    @Test
    void getDescription()
    {
        ProductUpgradesErrorDetails resource = new ProductUpgradesErrorDetails();
        String value = "description";

        resource.setDescription(value);

        assertEquals(value, resource.getDescription());
    }
}