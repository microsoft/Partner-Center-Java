// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AgreementTypeTest
{
    private static final String MICROSOFT_CLOUD_AGREEMENT_VALUE = "MicrosoftCloudAgreement";
    private static final String MICROSOFT_CLOUD_AGREEMENT_JSON = '"' + MICROSOFT_CLOUD_AGREEMENT_VALUE + '"';
    private static final String MICROSOFT_CUSTOMER_AGREEMENT_VALUE = "MicrosoftCustomerAgreement";
    private static final String MICROSOFT_CUSTOMER_AGREEMENT_JSON = '"' + MICROSOFT_CUSTOMER_AGREEMENT_VALUE + '"';
    private static final String MICROSOFT_UNKNOWN_AGREEMENT_VALUE = "Unknown";
    private static final String MICROSOFT_UNKNOWN_AGREEMENT_JSON = '"' + MICROSOFT_UNKNOWN_AGREEMENT_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson_CloudAgreement() throws IOException
    {
        assertEquals(AgreementType.MICROSOFT_CLOUD_AGREEMENT, jsonConverter.readValue(MICROSOFT_CLOUD_AGREEMENT_JSON, AgreementType.class));
    }

    @Test
    void writeToJson_CloudAgreement() throws IOException
    {
        assertEquals(MICROSOFT_CLOUD_AGREEMENT_JSON, jsonConverter.writeValueAsString(AgreementType.MICROSOFT_CLOUD_AGREEMENT));
    }

    @Test
    void convertToString_CloudAgreement()
    {
        assertEquals(MICROSOFT_CLOUD_AGREEMENT_VALUE, AgreementType.MICROSOFT_CLOUD_AGREEMENT.toString());
    }

    @Test
    void createFromJson_CustomerAgreement() throws IOException
    {
        assertEquals(AgreementType.MICROSOFT_CUSTOMER_AGREEMENT, jsonConverter.readValue(MICROSOFT_CUSTOMER_AGREEMENT_JSON, AgreementType.class));
    }

    @Test
    void writeToJson_CustomerAgreement() throws IOException
    {
        assertEquals(MICROSOFT_CUSTOMER_AGREEMENT_JSON, jsonConverter.writeValueAsString(AgreementType.MICROSOFT_CUSTOMER_AGREEMENT));
    }

    @Test
    void convertToString_CustomerAgreement()
    {
        assertEquals(MICROSOFT_CUSTOMER_AGREEMENT_VALUE, AgreementType.MICROSOFT_CUSTOMER_AGREEMENT.toString());
    }

    @Test
    void createFromJson_UnknownAgreement() throws IOException
    {
        assertNull(jsonConverter.readValue(MICROSOFT_UNKNOWN_AGREEMENT_JSON, AgreementType.class));
    }
}