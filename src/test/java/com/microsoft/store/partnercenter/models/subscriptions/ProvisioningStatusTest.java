// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProvisioningStatusTest
{
    private static final String NONE_VALUE = "none";
    private static final String SUCCESS_VALUE = "success";
    private static final String PENDING_VALUE = "pending";
    private static final String FAILED_VALUE = "failed";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String SUCCESS_JSON = '"' + SUCCESS_VALUE + '"';
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
        assertEquals(ProvisioningStatus.NONE, jsonConverter.readValue(NONE_JSON, ProvisioningStatus.class));
        assertEquals(ProvisioningStatus.SUCCESS, jsonConverter.readValue(SUCCESS_JSON, ProvisioningStatus.class));
        assertEquals(ProvisioningStatus.PENDING, jsonConverter.readValue(PENDING_JSON, ProvisioningStatus.class));
        assertEquals(ProvisioningStatus.FAILED, jsonConverter.readValue(FAILED_JSON, ProvisioningStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(ProvisioningStatus.NONE));
        assertEquals(SUCCESS_JSON, jsonConverter.writeValueAsString(ProvisioningStatus.SUCCESS));
        assertEquals(PENDING_JSON, jsonConverter.writeValueAsString(ProvisioningStatus.PENDING));
        assertEquals(FAILED_JSON, jsonConverter.writeValueAsString(ProvisioningStatus.FAILED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, ProvisioningStatus.NONE.toString());
        assertEquals(SUCCESS_VALUE, ProvisioningStatus.SUCCESS.toString());
        assertEquals(PENDING_VALUE, ProvisioningStatus.PENDING.toString());
        assertEquals(FAILED_VALUE, ProvisioningStatus.FAILED.toString());
    }
}