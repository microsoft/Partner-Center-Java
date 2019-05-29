// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationStatusTest
{
    private static final String SUCCEEDED_VALUE = "succeeded";
    private static final String FAILED_VALUE = "failed";
    private static final String PROGRESS_VALUE = "progress";
    private static final String DECLINE_VALUE = "decline";
    private static final String SUCCEEDED_JSON = '"' + SUCCEEDED_VALUE + '"';
    private static final String FAILED_JSON = '"' + FAILED_VALUE + '"';
    private static final String PROGRESS_JSON = '"' + PROGRESS_VALUE + '"';
    private static final String DECLINE_JSON = '"' + DECLINE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(OperationStatus.SUCCEEDED, jsonConverter.readValue(SUCCEEDED_JSON, OperationStatus.class));
        assertEquals(OperationStatus.FAILED, jsonConverter.readValue(FAILED_JSON, OperationStatus.class));
        assertEquals(OperationStatus.PROGRESS, jsonConverter.readValue(PROGRESS_JSON, OperationStatus.class));
        assertEquals(OperationStatus.DECLINE, jsonConverter.readValue(DECLINE_JSON, OperationStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(SUCCEEDED_JSON, jsonConverter.writeValueAsString(OperationStatus.SUCCEEDED));
        assertEquals(FAILED_JSON, jsonConverter.writeValueAsString(OperationStatus.FAILED));
        assertEquals(PROGRESS_JSON, jsonConverter.writeValueAsString(OperationStatus.PROGRESS));
        assertEquals(DECLINE_JSON, jsonConverter.writeValueAsString(OperationStatus.DECLINE));
    }

    @Test
    void convertToString()
    {
        assertEquals(SUCCEEDED_VALUE, OperationStatus.SUCCEEDED.toString());
        assertEquals(FAILED_VALUE, OperationStatus.FAILED.toString());
        assertEquals(PROGRESS_VALUE, OperationStatus.PROGRESS.toString());
        assertEquals(DECLINE_VALUE, OperationStatus.DECLINE.toString());
    }
}