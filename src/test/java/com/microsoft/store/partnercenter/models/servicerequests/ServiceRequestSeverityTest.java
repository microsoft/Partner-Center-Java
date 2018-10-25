// -----------------------------------------------------------------------
// <copyright file="ServiceRequestSeverityTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceRequestSeverityTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String CRITICAL_VALUE = "critical";
    private static final String MODERATE_VALUE = "moderate";
    private static final String MINIMAL_VALUE = "minimal";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String CRITICAL_JSON = '"' + CRITICAL_VALUE + '"';
    private static final String MODERATE_JSON = '"' + MODERATE_VALUE + '"';
    private static final String MINIMAL_JSON = '"' + MINIMAL_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceRequestSeverity.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, ServiceRequestSeverity.class));
        assertEquals(ServiceRequestSeverity.CRITICAL, jsonConverter.readValue(CRITICAL_JSON, ServiceRequestSeverity.class));
        assertEquals(ServiceRequestSeverity.MODERATE, jsonConverter.readValue(MODERATE_JSON, ServiceRequestSeverity.class));
        assertEquals(ServiceRequestSeverity.MINIMAL, jsonConverter.readValue(MINIMAL_JSON, ServiceRequestSeverity.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(ServiceRequestSeverity.UNKNOWN));
        assertEquals(CRITICAL_JSON, jsonConverter.writeValueAsString(ServiceRequestSeverity.CRITICAL));
        assertEquals(MODERATE_JSON, jsonConverter.writeValueAsString(ServiceRequestSeverity.MODERATE));
        assertEquals(MINIMAL_JSON, jsonConverter.writeValueAsString(ServiceRequestSeverity.MINIMAL));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, ServiceRequestSeverity.UNKNOWN.toString());
        assertEquals(CRITICAL_VALUE, ServiceRequestSeverity.CRITICAL.toString());
        assertEquals(MODERATE_VALUE, ServiceRequestSeverity.MODERATE.toString());
        assertEquals(MINIMAL_VALUE, ServiceRequestSeverity.MINIMAL.toString());
    }
}