// -----------------------------------------------------------------------
// <copyright file="VettingVersionTest.java" company="Microsoft">
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

class VettingVersionTest
{
    private static final String NONE_VALUE = "none";
    private static final String CURRENT_VALUE = "current";
    private static final String LAST_FINALIZED_VALUE = "last_finalized";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String CURRENT_JSON = '"' + CURRENT_VALUE + '"';
    private static final String LAST_FINALIZED_JSON = '"' + LAST_FINALIZED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(VettingVersion.NONE, jsonConverter.readValue(NONE_JSON, VettingVersion.class));
        assertEquals(VettingVersion.CURRENT, jsonConverter.readValue(CURRENT_JSON, VettingVersion.class));
        assertEquals(VettingVersion.LAST_FINALIZED, jsonConverter.readValue(LAST_FINALIZED_JSON, VettingVersion.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(VettingVersion.NONE));
        assertEquals(CURRENT_JSON, jsonConverter.writeValueAsString(VettingVersion.CURRENT));
        assertEquals(LAST_FINALIZED_JSON, jsonConverter.writeValueAsString(VettingVersion.LAST_FINALIZED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, VettingVersion.NONE.toString());
        assertEquals(CURRENT_VALUE, VettingVersion.CURRENT.toString());
        assertEquals(LAST_FINALIZED_VALUE, VettingVersion.LAST_FINALIZED.toString());
    }
}