// -----------------------------------------------------------------------
// <copyright file="ServiceIncidentSearchFieldTest.java" company="Microsoft">
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

class ServiceIncidentSearchFieldTest
{
    private static final String RESOLVED_VALUE = "Resolved";
    private static final String RESOLVED_JSON = '"' + RESOLVED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceIncidentSearchField.RESOLVED, jsonConverter.readValue(RESOLVED_JSON, ServiceIncidentSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(RESOLVED_JSON, jsonConverter.writeValueAsString(ServiceIncidentSearchField.RESOLVED));
    }

    @Test
    void convertToString()
    {
        assertEquals(RESOLVED_VALUE, ServiceIncidentSearchField.RESOLVED.toString());
    }
}