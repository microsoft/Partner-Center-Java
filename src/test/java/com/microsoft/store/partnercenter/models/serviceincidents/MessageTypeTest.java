// -----------------------------------------------------------------------
// <copyright file="MessageTypeTest.java" company="Microsoft">
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

class MessageTypeTest
{
    private static final String NONE_VALUE = "none";
    private static final String INCIDENT_VALUE = "incident";
    private static final String MESSAGE_CENTER_VALUE = "message_center";
    private static final String ALL_VALUE = "all";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String INCIDENT_JSON = '"' + INCIDENT_VALUE + '"';
    private static final String MESSAGE_CENTER_JSON = '"' + MESSAGE_CENTER_VALUE + '"';
    private static final String ALL_JSON = '"' + ALL_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(MessageType.NONE, jsonConverter.readValue(NONE_JSON, MessageType.class));
        assertEquals(MessageType.INCIDENT, jsonConverter.readValue(INCIDENT_JSON, MessageType.class));
        assertEquals(MessageType.MESSAGE_CENTER, jsonConverter.readValue(MESSAGE_CENTER_JSON, MessageType.class));
        assertEquals(MessageType.ALL, jsonConverter.readValue(ALL_JSON, MessageType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(MessageType.NONE));
        assertEquals(INCIDENT_JSON, jsonConverter.writeValueAsString(MessageType.INCIDENT));
        assertEquals(MESSAGE_CENTER_JSON, jsonConverter.writeValueAsString(MessageType.MESSAGE_CENTER));
        assertEquals(ALL_JSON, jsonConverter.writeValueAsString(MessageType.ALL));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, MessageType.NONE.toString());
        assertEquals(INCIDENT_VALUE, MessageType.INCIDENT.toString());
        assertEquals(MESSAGE_CENTER_VALUE, MessageType.MESSAGE_CENTER.toString());
        assertEquals(ALL_VALUE, MessageType.ALL.toString());
    }
}