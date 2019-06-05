// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private static final String OTHER_JSON = '"' + OTHER_VALUE + '"';
    private static final String CONVERSIONS_NOT_FOUND_JSON = '"' + CONVERSIONS_NOT_FOUND_VALUE + '"';

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
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(OTHER_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.OTHER));
        assertEquals(CONVERSIONS_NOT_FOUND_JSON, jsonConverter.writeValueAsString(ConversionErrorCode.CONVERSIONS_NOT_FOUND));
    }

    @Test
    void convertToString()
    {
        assertEquals(OTHER_VALUE, ConversionErrorCode.OTHER.toString());
        assertEquals(CONVERSIONS_NOT_FOUND_VALUE, ConversionErrorCode.CONVERSIONS_NOT_FOUND.toString());
    }
}