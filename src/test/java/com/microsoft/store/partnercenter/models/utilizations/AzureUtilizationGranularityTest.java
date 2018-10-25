// -----------------------------------------------------------------------
// <copyright file="AzureUtilizationGranularityTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.utilizations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AzureUtilizationGranularityTest
{
    private static final String DAILY_VALUE = "daily";
    private static final String HOURLY_VALUE = "hourly";
    private static final String DAILY_JSON = '"' + DAILY_VALUE + '"';
    private static final String HOURLY_JSON = '"' + HOURLY_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(AzureUtilizationGranularity.DAILY, jsonConverter.readValue(DAILY_JSON, AzureUtilizationGranularity.class));
        assertEquals(AzureUtilizationGranularity.HOURLY, jsonConverter.readValue(HOURLY_JSON, AzureUtilizationGranularity.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(DAILY_JSON, jsonConverter.writeValueAsString(AzureUtilizationGranularity.DAILY));
        assertEquals(HOURLY_JSON, jsonConverter.writeValueAsString(AzureUtilizationGranularity.HOURLY));
    }

    @Test
    void convertToString()
    {
        assertEquals(DAILY_VALUE, AzureUtilizationGranularity.DAILY.toString());
        assertEquals(HOURLY_VALUE, AzureUtilizationGranularity.HOURLY.toString());
    }
}