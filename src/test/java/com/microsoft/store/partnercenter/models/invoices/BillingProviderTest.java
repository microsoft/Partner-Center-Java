// -----------------------------------------------------------------------
// <copyright file="BillingProviderTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BillingProviderTest
{
    private static final String NONE_VALUE = "none";
    private static final String OFFICE_VALUE = "office";
    private static final String AZURE_VALUE = "azure";
    private static final String ONE_TIME_VALUE = "one_time";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String OFFICE_JSON = '"' + OFFICE_VALUE + '"';
    private static final String AZURE_JSON = '"' + AZURE_VALUE + '"';
    private static final String ONE_TIME_JSON = '"' + ONE_TIME_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(BillingProvider.NONE, jsonConverter.readValue(NONE_JSON, BillingProvider.class));
        assertEquals(BillingProvider.OFFICE, jsonConverter.readValue(OFFICE_JSON, BillingProvider.class));
        assertEquals(BillingProvider.AZURE, jsonConverter.readValue(AZURE_JSON, BillingProvider.class));
        assertEquals(BillingProvider.ONE_TIME, jsonConverter.readValue(ONE_TIME_JSON, BillingProvider.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(BillingProvider.NONE));
        assertEquals(OFFICE_JSON, jsonConverter.writeValueAsString(BillingProvider.OFFICE));
        assertEquals(AZURE_JSON, jsonConverter.writeValueAsString(BillingProvider.AZURE));
        assertEquals(ONE_TIME_JSON, jsonConverter.writeValueAsString(BillingProvider.ONE_TIME));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, BillingProvider.NONE.toString());
        assertEquals(OFFICE_VALUE, BillingProvider.OFFICE.toString());
        assertEquals(AZURE_VALUE, BillingProvider.AZURE.toString());
        assertEquals(ONE_TIME_VALUE, BillingProvider.ONE_TIME.toString());
    }
}