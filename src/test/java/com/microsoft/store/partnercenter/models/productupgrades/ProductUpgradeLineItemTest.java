// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class ProductUpgradeLineItemTest
{
    @Test
    void getErrorDetails()
    {
        ProductUpgradeLineItem resource = new ProductUpgradeLineItem();
        ProductUpgradeErrorDetail value = new ProductUpgradeErrorDetail();

        value.setCode("code");
        value.setDescription("description");

        resource.setErrorDetails(value);

        assertEquals("code", resource.getErrorDetails().getCode());
        assertEquals("description", resource.getErrorDetails().getDescription());
    }

    @Test
    void getSourceProduct()
    {
        ProductUpgradeLineItem resource = new ProductUpgradeLineItem();
        ProductUpgradeDetail value = new ProductUpgradeDetail();

        value.setId("identifier");
        value.setName("name");

        resource.setSourceProduct(value);

        assertEquals("identifier", resource.getSourceProduct().getId());
        assertEquals("name", resource.getSourceProduct().getName());
    }

    @Test
    void getStatus()
    {
        ProductUpgradeLineItem resource = new ProductUpgradeLineItem();
        String value = "status";

        resource.setStatus(value);

        assertEquals(value, resource.getStatus());
    }

    @Test
    void getTargetProduct()
    {
        ProductUpgradeLineItem resource = new ProductUpgradeLineItem();
        ProductUpgradeDetail value = new ProductUpgradeDetail();

        value.setId("identifier");
        value.setName("name");

        resource.setTargetProduct(value);

        assertEquals("identifier", resource.getTargetProduct().getId());
        assertEquals("name", resource.getTargetProduct().getName());
    }

    @Test
    void getUpgradedDate()
    {
        ProductUpgradeLineItem resource = new ProductUpgradeLineItem();
        DateTime value = DateTime.now();

        resource.setUpgradedDate(value);

        assertEquals(value, resource.getUpgradedDate());
    }
}