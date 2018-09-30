// -----------------------------------------------------------------------
// <copyright file="AgreementMetaDataTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.microsoft.store.partnercenter.TestConstants.AGREEMENT_TEMPLATE_ID;
import static com.microsoft.store.partnercenter.TestConstants.AGREEMENT_TEMPLATE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the {@link #AgreementMetaData} class.
 */
class AgreementMetaDataTest
{
    private AgreementMetaData agreementMetaData;

    /**
     * Create the AgreementMetaData instance before each test.
     */
    @BeforeEach
    void setUp()
    {
        agreementMetaData = new AgreementMetaData();
    }

    /**
     * Unit test to validate the get and set functions for the template identifier value.
     */
    @Test
    void getTemplateId()
    {
        agreementMetaData.setTemplateId(AGREEMENT_TEMPLATE_ID);

        assertEquals(AGREEMENT_TEMPLATE_ID, agreementMetaData.getTemplateId());
    }

    /**
     * Unit test to validate the get and set functions for the agreement type value.
     */
    @Test
    void getAgreementType()
    {
        AgreementType agreementType = AgreementType.MICROSOFT_CLOUD_AGREEMENT;

        agreementMetaData.setAgreementType(agreementType);

        assertEquals(agreementType, agreementMetaData.getAgreementType());
    }

    /**
     * Unit test to validate the get and set functions for the agreement link value.
     */
    @Test
    void getAgreementLink()
    {
        agreementMetaData.setAgreementLink(AGREEMENT_TEMPLATE_URL);

        assertEquals(AGREEMENT_TEMPLATE_URL, agreementMetaData.getAgreementLink());
    }

    /**
     * Unit test to validate the get and set functions for the version rank value.
     */
    @Test
    void getVersionRank()
    {
        int versionRank = 0;

        agreementMetaData.setVersionRank(versionRank);

        assertEquals(versionRank, agreementMetaData.getVersionRank());
    }
}