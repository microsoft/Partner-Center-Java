// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.query;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeekOperationTest
{
    private static final String NEXT_VALUE = "Next";
    private static final String PREVIOUS_VALUE = "Previous";
    private static final String FIRST_VALUE = "First";
    private static final String LAST_VALUE = "Last";
    private static final String PAGE_INDEX_VALUE = "PageIndex";
    private static final String NEXT_JSON = '"' + NEXT_VALUE + '"';
    private static final String PREVIOUS_JSON = '"' + PREVIOUS_VALUE + '"';
    private static final String FIRST_JSON = '"' + FIRST_VALUE + '"';
    private static final String LAST_JSON = '"' + LAST_VALUE + '"';
    private static final String PAGE_INDEX_JSON = '"' + PAGE_INDEX_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(SeekOperation.NEXT, jsonConverter.readValue(NEXT_JSON, SeekOperation.class));
        assertEquals(SeekOperation.PREVIOUS, jsonConverter.readValue(PREVIOUS_JSON, SeekOperation.class));
        assertEquals(SeekOperation.FIRST, jsonConverter.readValue(FIRST_JSON, SeekOperation.class));
        assertEquals(SeekOperation.LAST, jsonConverter.readValue(LAST_JSON, SeekOperation.class));
        assertEquals(SeekOperation.PAGE_INDEX, jsonConverter.readValue(PAGE_INDEX_JSON, SeekOperation.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NEXT_JSON, jsonConverter.writeValueAsString(SeekOperation.NEXT));
        assertEquals(PREVIOUS_JSON, jsonConverter.writeValueAsString(SeekOperation.PREVIOUS));
        assertEquals(FIRST_JSON, jsonConverter.writeValueAsString(SeekOperation.FIRST));
        assertEquals(LAST_JSON, jsonConverter.writeValueAsString(SeekOperation.LAST));
        assertEquals(PAGE_INDEX_JSON, jsonConverter.writeValueAsString(SeekOperation.PAGE_INDEX));
    }

    @Test
    void convertToString()
    {
        assertEquals(NEXT_VALUE, SeekOperation.NEXT.toString());
        assertEquals(PREVIOUS_VALUE, SeekOperation.PREVIOUS.toString());
        assertEquals(FIRST_VALUE, SeekOperation.FIRST.toString());
        assertEquals(LAST_VALUE, SeekOperation.LAST.toString());
        assertEquals(PAGE_INDEX_VALUE, SeekOperation.PAGE_INDEX.toString());
    }
}