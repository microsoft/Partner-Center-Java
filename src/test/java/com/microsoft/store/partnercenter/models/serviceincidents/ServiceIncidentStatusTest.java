// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentStatusTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceIncidentStatusTest
{
    private static final String NORMAL_VALUE = "normal";
    private static final String INFORMATION_VALUE = "information";
    private static final String WARNING_VALUE = "warning";
    private static final String CRITICAL_VALUE = "critical";
    private static final String NORMAL_JSON = '"' + NORMAL_VALUE + '"';
    private static final String INFORMATION_JSON = '"' + INFORMATION_VALUE + '"';
    private static final String WARNING_JSON = '"' + WARNING_VALUE + '"';
    private static final String CRITICAL_JSON = '"' + CRITICAL_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceIncidentStatus.NORMAL, jsonConverter.readValue(NORMAL_JSON, ServiceIncidentStatus.class));
        assertEquals(ServiceIncidentStatus.INFORMATION, jsonConverter.readValue(INFORMATION_JSON, ServiceIncidentStatus.class));
        assertEquals(ServiceIncidentStatus.WARNING, jsonConverter.readValue(WARNING_JSON, ServiceIncidentStatus.class));
        assertEquals(ServiceIncidentStatus.CRITICAL, jsonConverter.readValue(CRITICAL_JSON, ServiceIncidentStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NORMAL_JSON, jsonConverter.writeValueAsString(ServiceIncidentStatus.NORMAL));
        assertEquals(INFORMATION_JSON, jsonConverter.writeValueAsString(ServiceIncidentStatus.INFORMATION));
        assertEquals(WARNING_JSON, jsonConverter.writeValueAsString(ServiceIncidentStatus.WARNING));
        assertEquals(CRITICAL_JSON, jsonConverter.writeValueAsString(ServiceIncidentStatus.CRITICAL));
    }

    @Test
    void convertToString()
    {
        assertEquals(NORMAL_VALUE, ServiceIncidentStatus.NORMAL.toString());
        assertEquals(INFORMATION_VALUE, ServiceIncidentStatus.INFORMATION.toString());
        assertEquals(WARNING_VALUE, ServiceIncidentStatus.WARNING.toString());
        assertEquals(CRITICAL_VALUE, ServiceIncidentStatus.CRITICAL.toString());
    }
}