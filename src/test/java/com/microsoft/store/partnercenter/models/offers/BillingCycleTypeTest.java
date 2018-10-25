// -----------------------------------------------------------------------
// <copyright file="BillingCycleTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillingCycleTypeTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String MONTHLY_VALUE = "monthly";
    private static final String ANNUAL_VALUE = "annual";
    private static final String NONE_VALUE = "none";
    private static final String ONE_TIME_VALUE = "one_time";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String MONTHLY_JSON = '"' + MONTHLY_VALUE + '"';
    private static final String ANNUAL_JSON = '"' + ANNUAL_VALUE + '"';
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
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
        assertEquals(BillingCycleType.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, BillingCycleType.class));
        assertEquals(BillingCycleType.MONTHLY, jsonConverter.readValue(MONTHLY_JSON, BillingCycleType.class));
        assertEquals(BillingCycleType.ANNUAL, jsonConverter.readValue(ANNUAL_JSON, BillingCycleType.class));
        assertEquals(BillingCycleType.NONE, jsonConverter.readValue(NONE_JSON, BillingCycleType.class));
        assertEquals(BillingCycleType.ONE_TIME, jsonConverter.readValue(ONE_TIME_JSON, BillingCycleType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(BillingCycleType.UNKNOWN));
        assertEquals(MONTHLY_JSON, jsonConverter.writeValueAsString(BillingCycleType.MONTHLY));
        assertEquals(ANNUAL_JSON, jsonConverter.writeValueAsString(BillingCycleType.ANNUAL));
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(BillingCycleType.NONE));
        assertEquals(ONE_TIME_JSON, jsonConverter.writeValueAsString(BillingCycleType.ONE_TIME));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, BillingCycleType.UNKNOWN.toString());
        assertEquals(MONTHLY_VALUE, BillingCycleType.MONTHLY.toString());
        assertEquals(ANNUAL_VALUE, BillingCycleType.ANNUAL.toString());
        assertEquals(NONE_VALUE, BillingCycleType.NONE.toString());
        assertEquals(ONE_TIME_VALUE, BillingCycleType.ONE_TIME.toString());
    }
}