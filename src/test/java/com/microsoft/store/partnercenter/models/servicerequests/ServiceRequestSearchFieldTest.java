// -----------------------------------------------------------------------
// <copyright file="ServiceRequestSearchFieldTest.java" company="Microsoft">
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

class ServiceRequestSearchFieldTest
{
    private static final String STATUS_VALUE = "Status";
    private static final String STATUS_JSON = '"' + STATUS_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceRequestSearchField.STATUS, jsonConverter.readValue(STATUS_JSON, ServiceRequestSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(STATUS_JSON, jsonConverter.writeValueAsString(ServiceRequestSearchField.STATUS));
    }

    @Test
    void convertToString()
    {
        assertEquals(STATUS_VALUE, ServiceRequestSearchField.STATUS.toString());
    }
}