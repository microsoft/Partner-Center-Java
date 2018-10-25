// -----------------------------------------------------------------------
// <copyright file="ServiceCostsBillingPeriodTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicecosts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceCostsBillingPeriodTest
{
    private static final String NONE_VALUE = "none";
    private static final String MOST_RECENT_VALUE = "most_recent";
    private static final String CURRENT_VALUE = "current";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String MOST_RECENT_JSON = '"' + MOST_RECENT_VALUE + '"';
    private static final String CURRENT_JSON = '"' + CURRENT_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceCostsBillingPeriod.NONE, jsonConverter.readValue(NONE_JSON, ServiceCostsBillingPeriod.class));
        assertEquals(ServiceCostsBillingPeriod.MOST_RECENT, jsonConverter.readValue(MOST_RECENT_JSON, ServiceCostsBillingPeriod.class));
        assertEquals(ServiceCostsBillingPeriod.CURRENT, jsonConverter.readValue(CURRENT_JSON, ServiceCostsBillingPeriod.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(ServiceCostsBillingPeriod.NONE));
        assertEquals(MOST_RECENT_JSON, jsonConverter.writeValueAsString(ServiceCostsBillingPeriod.MOST_RECENT));
        assertEquals(CURRENT_JSON, jsonConverter.writeValueAsString(ServiceCostsBillingPeriod.CURRENT));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, ServiceCostsBillingPeriod.NONE.toString());
        assertEquals(MOST_RECENT_VALUE, ServiceCostsBillingPeriod.MOST_RECENT.toString());
        assertEquals(CURRENT_VALUE, ServiceCostsBillingPeriod.CURRENT.toString());
    }
}