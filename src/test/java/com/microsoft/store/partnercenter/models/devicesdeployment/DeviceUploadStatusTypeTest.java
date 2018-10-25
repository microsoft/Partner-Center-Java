// -----------------------------------------------------------------------
// <copyright file="DeviceUploadStatusTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeviceUploadStatusTypeTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String QUEUED_VALUE = "queued";
    private static final String PROCESSING_VALUE = "processing";
    private static final String FINISHED_VALUE = "finished";
    private static final String FINISHED_WITH_ERRORS_VALUE = "finished_with_errors";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String QUEUED_JSON = '"' + QUEUED_VALUE + '"';
    private static final String PROCESSING_JSON = '"' + PROCESSING_VALUE + '"';
    private static final String FINISHED_JSON = '"' + FINISHED_VALUE + '"';
    private static final String FINISHED_WITH_ERRORS_JSON = '"' + FINISHED_WITH_ERRORS_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(DeviceUploadStatusType.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, DeviceUploadStatusType.class));
        assertEquals(DeviceUploadStatusType.QUEUED, jsonConverter.readValue(QUEUED_JSON, DeviceUploadStatusType.class));
        assertEquals(DeviceUploadStatusType.PROCESSING, jsonConverter.readValue(PROCESSING_JSON, DeviceUploadStatusType.class));
        assertEquals(DeviceUploadStatusType.FINISHED, jsonConverter.readValue(FINISHED_JSON, DeviceUploadStatusType.class));
        assertEquals(DeviceUploadStatusType.FINISHED_WITH_ERRORS, jsonConverter.readValue(FINISHED_WITH_ERRORS_JSON, DeviceUploadStatusType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(DeviceUploadStatusType.UNKNOWN));
        assertEquals(QUEUED_JSON, jsonConverter.writeValueAsString(DeviceUploadStatusType.QUEUED));
        assertEquals(PROCESSING_JSON, jsonConverter.writeValueAsString(DeviceUploadStatusType.PROCESSING));
        assertEquals(FINISHED_JSON, jsonConverter.writeValueAsString(DeviceUploadStatusType.FINISHED));
        assertEquals(FINISHED_WITH_ERRORS_JSON, jsonConverter.writeValueAsString(DeviceUploadStatusType.FINISHED_WITH_ERRORS));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, DeviceUploadStatusType.UNKNOWN.toString());
        assertEquals(QUEUED_VALUE, DeviceUploadStatusType.QUEUED.toString());
        assertEquals(PROCESSING_VALUE, DeviceUploadStatusType.PROCESSING.toString());
        assertEquals(FINISHED_VALUE, DeviceUploadStatusType.FINISHED.toString());
        assertEquals(FINISHED_WITH_ERRORS_VALUE, DeviceUploadStatusType.FINISHED_WITH_ERRORS.toString());
    }
}