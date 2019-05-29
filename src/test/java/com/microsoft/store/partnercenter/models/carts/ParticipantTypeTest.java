// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParticipantTypeTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String TRANSACTION_RESELLER_VALUE = "transaction_reseller";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String TRANSACTION_RESELLER_JSON = '"' + TRANSACTION_RESELLER_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ParticipantType.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, ParticipantType.class));
        assertEquals(ParticipantType.TRANSACTION_RESELLER, jsonConverter.readValue(TRANSACTION_RESELLER_JSON, ParticipantType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(ParticipantType.UNKNOWN));
        assertEquals(TRANSACTION_RESELLER_JSON, jsonConverter.writeValueAsString(ParticipantType.TRANSACTION_RESELLER));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, ParticipantType.UNKNOWN.toString());
        assertEquals(TRANSACTION_RESELLER_VALUE, ParticipantType.TRANSACTION_RESELLER.toString());
    }
}