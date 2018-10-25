// -----------------------------------------------------------------------
// <copyright file="VettingStatusTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VettingStatusTest
{
    private static final String NONE_VALUE = "none";
    private static final String PENDING_VALUE = "pending";
    private static final String AUTHORIZED_VALUE = "authorized";
    private static final String REJECTED_VALUE = "rejected";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String PENDING_JSON = '"' + PENDING_VALUE + '"';
    private static final String AUTHORIZED_JSON = '"' + AUTHORIZED_VALUE + '"';
    private static final String REJECTED_JSON = '"' + REJECTED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(VettingStatus.NONE, jsonConverter.readValue(NONE_JSON, VettingStatus.class));
        assertEquals(VettingStatus.PENDING, jsonConverter.readValue(PENDING_JSON, VettingStatus.class));
        assertEquals(VettingStatus.AUTHORIZED, jsonConverter.readValue(AUTHORIZED_JSON, VettingStatus.class));
        assertEquals(VettingStatus.REJECTED, jsonConverter.readValue(REJECTED_JSON, VettingStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(VettingStatus.NONE));
        assertEquals(PENDING_JSON, jsonConverter.writeValueAsString(VettingStatus.PENDING));
        assertEquals(AUTHORIZED_JSON, jsonConverter.writeValueAsString(VettingStatus.AUTHORIZED));
        assertEquals(REJECTED_JSON, jsonConverter.writeValueAsString(VettingStatus.REJECTED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, VettingStatus.NONE.toString());
        assertEquals(PENDING_VALUE, VettingStatus.PENDING.toString());
        assertEquals(AUTHORIZED_VALUE, VettingStatus.AUTHORIZED.toString());
        assertEquals(REJECTED_VALUE, VettingStatus.REJECTED.toString());
    }
}