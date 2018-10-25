// -----------------------------------------------------------------------
// <copyright file="ServiceRequestStatusTest.java" company="Microsoft">
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

class ServiceRequestStatusTest
{
    private static final String NONE_VALUE = "none";
    private static final String OPEN_VALUE = "open";
    private static final String CLOSED_VALUE = "closed";
    private static final String ATTENTION_NEEDED_VALUE = "attention_needed";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String OPEN_JSON = '"' + OPEN_VALUE + '"';
    private static final String CLOSED_JSON = '"' + CLOSED_VALUE + '"';
    private static final String ATTENTION_NEEDED_JSON = '"' + ATTENTION_NEEDED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ServiceRequestStatus.NONE, jsonConverter.readValue(NONE_JSON, ServiceRequestStatus.class));
        assertEquals(ServiceRequestStatus.OPEN, jsonConverter.readValue(OPEN_JSON, ServiceRequestStatus.class));
        assertEquals(ServiceRequestStatus.CLOSED, jsonConverter.readValue(CLOSED_JSON, ServiceRequestStatus.class));
        assertEquals(ServiceRequestStatus.ATTENTION_NEEDED, jsonConverter.readValue(ATTENTION_NEEDED_JSON, ServiceRequestStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(ServiceRequestStatus.NONE));
        assertEquals(OPEN_JSON, jsonConverter.writeValueAsString(ServiceRequestStatus.OPEN));
        assertEquals(CLOSED_JSON, jsonConverter.writeValueAsString(ServiceRequestStatus.CLOSED));
        assertEquals(ATTENTION_NEEDED_JSON, jsonConverter.writeValueAsString(ServiceRequestStatus.ATTENTION_NEEDED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, ServiceRequestStatus.NONE.toString());
        assertEquals(OPEN_VALUE, ServiceRequestStatus.OPEN.toString());
        assertEquals(CLOSED_VALUE, ServiceRequestStatus.CLOSED.toString());
        assertEquals(ATTENTION_NEEDED_VALUE, ServiceRequestStatus.ATTENTION_NEEDED.toString());
    }
}