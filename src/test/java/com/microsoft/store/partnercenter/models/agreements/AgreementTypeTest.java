// -----------------------------------------------------------------------
// <copyright file="AgreementTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgreementTypeTest
{
    private static final String MICROSOFT_CLOUD_AGREEMENT_VALUE = "MicrosoftCloudAgreement";
    private static final String MICROSOFT_CLOUD_AGREEMENT_JSON = '"' + MICROSOFT_CLOUD_AGREEMENT_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(AgreementType.MICROSOFT_CLOUD_AGREEMENT, jsonConverter.readValue(MICROSOFT_CLOUD_AGREEMENT_JSON, AgreementType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(MICROSOFT_CLOUD_AGREEMENT_JSON, jsonConverter.writeValueAsString(AgreementType.MICROSOFT_CLOUD_AGREEMENT));
    }

    @Test
    void convertToString()
    {
        assertEquals(MICROSOFT_CLOUD_AGREEMENT_VALUE, AgreementType.MICROSOFT_CLOUD_AGREEMENT.toString());
    }
}