// -----------------------------------------------------------------------
// <copyright file="ConversionErrorCodeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionErrorCodeTest
{
    private static final String OTHER_VALUE = "other";
    private static final String CONVERSIONS_NOT_FOUND_VALUE = "conversions_not_found";
    private static final String PENDING_VALUE = "pending";
    private static final String FAILED_VALUE = "failed";
    private static final String OTHER_JSON = '"' + OTHER_VALUE + '"';
    private static final String CONVERSIONS_NOT_FOUND_JSON = '"' + CONVERSIONS_NOT_FOUND_VALUE + '"';
    private static final String PENDING_JSON = '"' + PENDING_VALUE + '"';
    private static final String FAILED_JSON = '"' + FAILED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ConversionErrorCode.OTHER, jsonConverter.readValue(OTHER_JSON, ConversionErrorCode.class));
        assertEquals(ConversionErrorCode.CONVERSIONS_NOT_FOUND, jsonConverter.readValue(CONVERSIONS_NOT_FOUND_JSON, ConversionErrorCode.class));
        assertEquals(ConversionErrorCode.PENDING, jsonConverter.readValue(PENDING_JSON, ConversionErrorCode.class));
        assertEquals(ConversionErrorCode.FAILED, jsonConverter.readValue(FAILED_JSON, ConversionErrorCode.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(OTHER_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.OTHER));
        assertEquals(CONVERSIONS_NOT_FOUND_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.CONVERSIONS_NOT_FOUND));
        assertEquals(PENDING_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.PENDING));
        assertEquals(FAILED_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.FAILED));
    }

    @Test
    void convertToString()
    {
        assertEquals(OTHER_VALUE, ConversionErrorCode.OTHER.toString());
        assertEquals(CONVERSIONS_NOT_FOUND_VALUE, ConversionErrorCode.CONVERSIONS_NOT_FOUND.toString());
        assertEquals(PENDING_VALUE, ConversionErrorCode.PENDING.toString());
        assertEquals(FAILED_VALUE, ConversionErrorCode.FAILED.toString());
    }
}