// -----------------------------------------------------------------------
// <copyright file="ContractTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContractTypeTest
{
    private static final String SUBSCRIPTION_VALUE = "subscription";
    private static final String PRODUCTKEY_VALUE = "productkey";
    private static final String REDEMPTIONCODE_VALUE = "redemptioncode";
    private static final String SUBSCRIPTION_JSON = '"' + SUBSCRIPTION_VALUE + '"';
    private static final String PRODUCTKEY_JSON = '"' + PRODUCTKEY_VALUE + '"';
    private static final String REDEMPTIONCODE_JSON = '"' + REDEMPTIONCODE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ContractType.SUBSCRIPTION, jsonConverter.readValue(SUBSCRIPTION_JSON, ContractType.class));
        assertEquals(ContractType.PRODUCTKEY, jsonConverter.readValue(PRODUCTKEY_JSON, ContractType.class));
        assertEquals(ContractType.REDEMPTIONCODE, jsonConverter.readValue(REDEMPTIONCODE_JSON, ContractType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(SUBSCRIPTION_JSON, jsonConverter.writeValueAsString(ContractType.SUBSCRIPTION));
        assertEquals(PRODUCTKEY_JSON, jsonConverter.writeValueAsString(ContractType.PRODUCTKEY));
        assertEquals(REDEMPTIONCODE_JSON, jsonConverter.writeValueAsString(ContractType.REDEMPTIONCODE));
    }

    @Test
    void convertToString()
    {
        assertEquals(SUBSCRIPTION_VALUE, ContractType.SUBSCRIPTION.toString());
        assertEquals(PRODUCTKEY_VALUE, ContractType.PRODUCTKEY.toString());
        assertEquals(REDEMPTIONCODE_VALUE, ContractType.REDEMPTIONCODE.toString());
    }
}