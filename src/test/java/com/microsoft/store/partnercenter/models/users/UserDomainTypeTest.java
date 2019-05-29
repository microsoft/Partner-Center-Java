// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDomainTypeTest
{
    private static final String NONE_VALUE = "none";
    private static final String MANAGED_VALUE = "managed";
    private static final String FEDERATED_VALUE = "federated";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String MANAGED_JSON = '"' + MANAGED_VALUE + '"';
    private static final String FEDERATED_JSON = '"' + FEDERATED_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(UserDomainType.NONE, jsonConverter.readValue(NONE_JSON, UserDomainType.class));
        assertEquals(UserDomainType.MANAGED, jsonConverter.readValue(MANAGED_JSON, UserDomainType.class));
        assertEquals(UserDomainType.FEDERATED, jsonConverter.readValue(FEDERATED_JSON, UserDomainType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(UserDomainType.NONE));
        assertEquals(MANAGED_JSON, jsonConverter.writeValueAsString(UserDomainType.MANAGED));
        assertEquals(FEDERATED_JSON, jsonConverter.writeValueAsString(UserDomainType.FEDERATED));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, UserDomainType.NONE.toString());
        assertEquals(MANAGED_VALUE, UserDomainType.MANAGED.toString());
        assertEquals(FEDERATED_VALUE, UserDomainType.FEDERATED.toString());
    }
}