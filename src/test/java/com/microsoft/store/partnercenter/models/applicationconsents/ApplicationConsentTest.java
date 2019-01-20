// -----------------------------------------------------------------------
// <copyright file="ApplicationConsentTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.applicationconsents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationConsentTest
{
    private ApplicationConsent applicationConsent;

    @BeforeEach
    void setUp()
    {
        applicationConsent = new ApplicationConsent();
    }

    @Test
    void getDisplayName()
    {
        String displayName = "CPV Marketplace";

        applicationConsent.setDisplayName(displayName);

        assertEquals(displayName, applicationConsent.getDisplayName());
    }

    @Test
    void getApplicationId()
    {
        String applicationId = "32b0bd81-2cae-8ff8-4f3e-30b0fd40aeb1";

        applicationConsent.setApplicationId(applicationId);

        assertEquals(applicationId, applicationConsent.getApplicationId());
    }

    @Test
    void getApplicationGrants()
    {
        ApplicationGrant forGraphApiAccess = new ApplicationGrant();
        forGraphApiAccess.setEnterpriseApplicationId("00000002-0000-0000-c000-000000000000");
        forGraphApiAccess.setScope("Domain.ReadWrite.All,User.ReadWrite.All,Directory.Read.All");
        ApplicationGrant forArmApiAccess = new ApplicationGrant();
        forArmApiAccess.setEnterpriseApplicationId("797f4846-ba00-4fd7-ba43-dac1f8f63013");
        forArmApiAccess.setScope("user_impersonation");
        ApplicationGrant[] applicationGrants = new ApplicationGrant[] {forGraphApiAccess, forArmApiAccess};

        applicationConsent.setApplicationGrants(applicationGrants);

        assertArrayEquals(applicationGrants, applicationConsent.getApplicationGrants());
    }
}