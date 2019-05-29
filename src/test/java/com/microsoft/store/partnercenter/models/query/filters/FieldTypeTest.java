// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldTypeTest
{
    private static final String STRING_VALUE = "String";
    private static final String INTEGER_VALUE = "Integer";
    private static final String ENUM_VALUE = "Enum";
    private static final String DATE_TIME_OFFSET_VALUE = "DateTimeOffset";
    private static final String STRING_JSON = '"' + STRING_VALUE + '"';
    private static final String INTEGER_JSON = '"' + INTEGER_VALUE + '"';
    private static final String ENUM_JSON = '"' + ENUM_VALUE + '"';
    private static final String DATE_TIME_OFFSET_JSON = '"' + DATE_TIME_OFFSET_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(FieldType.STRING, jsonConverter.readValue(STRING_JSON, FieldType.class));
        assertEquals(FieldType.INTEGER, jsonConverter.readValue(INTEGER_JSON, FieldType.class));
        assertEquals(FieldType.ENUM, jsonConverter.readValue(ENUM_JSON, FieldType.class));
        assertEquals(FieldType.DATE_TIME_OFFSET, jsonConverter.readValue(DATE_TIME_OFFSET_JSON, FieldType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(STRING_JSON, jsonConverter.writeValueAsString(FieldType.STRING));
        assertEquals(INTEGER_JSON, jsonConverter.writeValueAsString(FieldType.INTEGER));
        assertEquals(ENUM_JSON, jsonConverter.writeValueAsString(FieldType.ENUM));
        assertEquals(DATE_TIME_OFFSET_JSON, jsonConverter.writeValueAsString(FieldType.DATE_TIME_OFFSET));
    }

    @Test
    void convertToString()
    {
        assertEquals(STRING_VALUE, FieldType.STRING.toString());
        assertEquals(INTEGER_VALUE, FieldType.INTEGER.toString());
        assertEquals(ENUM_VALUE, FieldType.ENUM.toString());
        assertEquals(DATE_TIME_OFFSET_VALUE, FieldType.DATE_TIME_OFFSET.toString());
    }
}