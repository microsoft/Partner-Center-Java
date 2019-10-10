// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class ProductUpgradesLineItemTest
{
    @Test
    void getErrorDetails()
    {
        ProductUpgradesLineItem resource = new ProductUpgradesLineItem();
        ProductUpgradesErrorDetails value = new ProductUpgradesErrorDetails();

        value.setCode("code");
        value.setDescription("description");

        resource.setErrorDetails(value);

        assertEquals("code", resource.getErrorDetails().getCode());
        assertEquals("description", resource.getErrorDetails().getDescription());
    }

    @Test
    void getSourceProduct()
    {
        ProductUpgradesLineItem resource = new ProductUpgradesLineItem();
        UpgradedProductDetails value = new UpgradedProductDetails();

        value.setId("identifier");
        value.setName("name");

        resource.setSourceProduct(value);

        assertEquals("identifier", resource.getSourceProduct().getId());
        assertEquals("name", resource.getSourceProduct().getName());
    }

    @Test
    void getStatus()
    {
        ProductUpgradesLineItem resource = new ProductUpgradesLineItem();
        String value = "status";

        resource.setStatus(value);

        assertEquals(value, resource.getStatus());
    }

    @Test
    void getTargetProduct()
    {
        ProductUpgradesLineItem resource = new ProductUpgradesLineItem();
        UpgradedProductDetails value = new UpgradedProductDetails();

        value.setId("identifier");
        value.setName("name");

        resource.setTargetProduct(value);

        assertEquals("identifier", resource.getTargetProduct().getId());
        assertEquals("name", resource.getTargetProduct().getName());
    }

    @Test
    void getUpgradedDate()
    {
        ProductUpgradesLineItem resource = new ProductUpgradesLineItem();
        DateTime value = DateTime.now();

        resource.setUpgradedDate(value);

        assertEquals(value, resource.getUpgradedDate());
    }
}