// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubscriptionStatusTest
{
    private static final String NONE_VALUE = "none";
    private static final String ACTIVE_VALUE = "active";
    private static final String SUSPENDED_VALUE = "suspended";
    private static final String DELETED_VALUE = "deleted";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String ACTIVE_JSON = '"' + ACTIVE_VALUE + '"';
    private static final String SUSPENDED_JSON = '"' + SUSPENDED_VALUE + '"';
    private static final String DELETED_JSON = '"' + DELETED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(SubscriptionStatus.NONE, jsonConverter.readValue(NONE_JSON, SubscriptionStatus.class));
        assertEquals(SubscriptionStatus.ACTIVE, jsonConverter.readValue(ACTIVE_JSON, SubscriptionStatus.class));
        assertEquals(SubscriptionStatus.SUSPENDED, jsonConverter.readValue(SUSPENDED_JSON, SubscriptionStatus.class));
        assertEquals(SubscriptionStatus.DELETED, jsonConverter.readValue(DELETED_JSON, SubscriptionStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(SubscriptionStatus.NONE));
        assertEquals(ACTIVE_JSON, jsonConverter.writeValueAsString(SubscriptionStatus.ACTIVE));
        assertEquals(SUSPENDED_JSON, jsonConverter.writeValueAsString(SubscriptionStatus.SUSPENDED));
        assertEquals(DELETED_JSON, jsonConverter.writeValueAsString(SubscriptionStatus.DELETED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, SubscriptionStatus.NONE.toString());
        assertEquals(ACTIVE_VALUE, SubscriptionStatus.ACTIVE.toString());
        assertEquals(SUSPENDED_VALUE, SubscriptionStatus.SUSPENDED.toString());
        assertEquals(DELETED_VALUE, SubscriptionStatus.DELETED.toString());
    }
}