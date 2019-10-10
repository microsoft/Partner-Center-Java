// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AzureEntitlementTest
{
    @Test
    void getFriendlyName()
    {
        AzureEntitlement entitlement = new AzureEntitlement();
        String value = "friendly name";

        entitlement.setFriendlyName(value);

        assertEquals(value, entitlement.getFriendlyName());
    }

    @Test
    void getId()
    {
        AzureEntitlement entitlement = new AzureEntitlement();
        String value = "d0064aa7-6de8-4106-ade8-30c56765db9a";

        entitlement.setId(value);

        assertEquals(value, entitlement.getId());
    }

    @Test
    void getStatus()
    {
        AzureEntitlement entitlement = new AzureEntitlement();
        String value = "status";

        entitlement.setStatus(value);

        assertEquals(value, entitlement.getStatus());
    }

    @Test
    void getSubscriptionId()
    {
        AzureEntitlement entitlement = new AzureEntitlement();
        String value = "6418f685-194d-44a5-b061-7e1aedecfe98";

        entitlement.setSubscriptionId(value);

        assertEquals(value, entitlement.getSubscriptionId());
    }
}