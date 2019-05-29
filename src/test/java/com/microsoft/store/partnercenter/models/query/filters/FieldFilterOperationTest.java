// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldFilterOperationTest
{
    private static final String EQUALS_VALUE = "Equals";
    private static final String NOT_EQUALS_VALUE = "NotEquals";
    private static final String GREATER_THAN_VALUE = "GreaterThan";
    private static final String GREATER_THAN_OR_EQUALS_VALUE = "GreaterThanOrEquals";
    private static final String LESS_THAN_VALUE = "LessThan";
    private static final String LESS_THAN_OR_EQUALS_VALUE = "LessThanOrEquals";
    private static final String SUBSTRING_VALUE = "Substring";
    private static final String AND_VALUE = "And";
    private static final String OR_VALUE = "Or";
    private static final String STARTS_WITH_VALUE = "StartsWith";
    private static final String NOT_STARTS_WITH_VALUE = "NotStartsWith";
    private static final String EQUALS_JSON = '"' + EQUALS_VALUE + '"';
    private static final String NOT_EQUALS_JSON = '"' + NOT_EQUALS_VALUE + '"';
    private static final String GREATER_THAN_JSON = '"' + GREATER_THAN_VALUE + '"';
    private static final String GREATER_THAN_OR_EQUALS_JSON = '"' + GREATER_THAN_OR_EQUALS_VALUE + '"';
    private static final String LESS_THAN_JSON = '"' + LESS_THAN_VALUE + '"';
    private static final String LESS_THAN_OR_EQUALS_JSON = '"' + LESS_THAN_OR_EQUALS_VALUE + '"';
    private static final String SUBSTRING_JSON = '"' + SUBSTRING_VALUE + '"';
    private static final String AND_JSON = '"' + AND_VALUE + '"';
    private static final String OR_JSON = '"' + OR_VALUE + '"';
    private static final String STARTS_WITH_JSON = '"' + STARTS_WITH_VALUE + '"';
    private static final String NOT_STARTS_WITH_JSON = '"' + NOT_STARTS_WITH_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(FieldFilterOperation.EQUALS, jsonConverter.readValue(EQUALS_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.NOT_EQUALS, jsonConverter.readValue(NOT_EQUALS_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.GREATER_THAN, jsonConverter.readValue(GREATER_THAN_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.GREATER_THAN_OR_EQUALS, jsonConverter.readValue(GREATER_THAN_OR_EQUALS_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.LESS_THAN, jsonConverter.readValue(LESS_THAN_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.LESS_THAN_OR_EQUALS, jsonConverter.readValue(LESS_THAN_OR_EQUALS_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.SUBSTRING, jsonConverter.readValue(SUBSTRING_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.AND, jsonConverter.readValue(AND_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.OR, jsonConverter.readValue(OR_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.STARTS_WITH, jsonConverter.readValue(STARTS_WITH_JSON, FieldFilterOperation.class));
        assertEquals(FieldFilterOperation.NOT_STARTS_WITH, jsonConverter.readValue(NOT_STARTS_WITH_JSON, FieldFilterOperation.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(EQUALS_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.EQUALS));
        assertEquals(NOT_EQUALS_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.NOT_EQUALS));
        assertEquals(GREATER_THAN_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.GREATER_THAN));
        assertEquals(GREATER_THAN_OR_EQUALS_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.GREATER_THAN_OR_EQUALS));
        assertEquals(LESS_THAN_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.LESS_THAN));
        assertEquals(LESS_THAN_OR_EQUALS_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.LESS_THAN_OR_EQUALS));
        assertEquals(SUBSTRING_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.SUBSTRING));
        assertEquals(AND_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.AND));
        assertEquals(OR_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.OR));
        assertEquals(STARTS_WITH_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.STARTS_WITH));
        assertEquals(NOT_STARTS_WITH_JSON, jsonConverter.writeValueAsString(FieldFilterOperation.NOT_STARTS_WITH));
    }

    @Test
    void convertToString()
    {
        assertEquals(EQUALS_VALUE, FieldFilterOperation.EQUALS.toString());
        assertEquals(NOT_EQUALS_VALUE, FieldFilterOperation.NOT_EQUALS.toString());
        assertEquals(GREATER_THAN_VALUE, FieldFilterOperation.GREATER_THAN.toString());
        assertEquals(GREATER_THAN_OR_EQUALS_VALUE, FieldFilterOperation.GREATER_THAN_OR_EQUALS.toString());
        assertEquals(LESS_THAN_VALUE, FieldFilterOperation.LESS_THAN.toString());
        assertEquals(LESS_THAN_OR_EQUALS_VALUE, FieldFilterOperation.LESS_THAN_OR_EQUALS.toString());
        assertEquals(SUBSTRING_VALUE, FieldFilterOperation.SUBSTRING.toString());
        assertEquals(AND_VALUE, FieldFilterOperation.AND.toString());
        assertEquals(OR_VALUE, FieldFilterOperation.OR.toString());
        assertEquals(STARTS_WITH_VALUE, FieldFilterOperation.STARTS_WITH.toString());
        assertEquals(NOT_STARTS_WITH_VALUE, FieldFilterOperation.NOT_STARTS_WITH.toString());
    }
}