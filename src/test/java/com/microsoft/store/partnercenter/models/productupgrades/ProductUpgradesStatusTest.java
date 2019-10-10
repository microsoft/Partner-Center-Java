// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.productupgrades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ProductUpgradesStatusTest
{
    @Test
    void getErrorDetails()
    {
        ProductUpgradesStatus resource = new ProductUpgradesStatus();
        ProductUpgradesErrorDetails value = new ProductUpgradesErrorDetails();

        value.setCode("code");
        value.setDescription("description");

        resource.setErrorDetails(value);

        assertEquals("code", resource.getErrorDetails().getCode());
        assertEquals("description", resource.getErrorDetails().getDescription());
    }

    @Test
    void getId()
    {
        ProductUpgradesStatus resource = new ProductUpgradesStatus();
        String value = "591c57f3-d53a-420c-bb04-d4197b844a12";

        resource.setId(value);

        assertEquals(value, resource.getId());
    }

    @Test
    void getLineItems()
    {
        ProductUpgradesStatus resource = new ProductUpgradesStatus();
        List<ProductUpgradesLineItem> value = new ArrayList<ProductUpgradesLineItem>();

        ProductUpgradesLineItem lineItem = new ProductUpgradesLineItem();
        lineItem.setStatus("status");

        value.add(lineItem);

        resource.setLineItems(value);

        assertEquals(1, resource.getLineItems().size());
        assertEquals("status", resource.getLineItems().get(0).getStatus());
    }

    @Test
    void setProductFamily()
    {
        ProductUpgradesStatus resource = new ProductUpgradesStatus();
        String value = "family";

        resource.setProductFamily(value);

        assertEquals(value, resource.getProductFamily());
    }

    @Test
    void setStatus()
    {
        ProductUpgradesStatus resource = new ProductUpgradesStatus();
        String value = "status";

        resource.setStatus(value);

        assertEquals(value, resource.getStatus());
    }
}