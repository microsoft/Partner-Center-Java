// -----------------------------------------------------------------------
// <copyright file="UserStateTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserStateTest
{
    private static final String ACTIVE_VALUE = "active";
    private static final String INACTIVE_VALUE = "inactive";
    private static final String ACTIVE_JSON = '"' + ACTIVE_VALUE + '"';
    private static final String INACTIVE_JSON = '"' + INACTIVE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(UserState.ACTIVE, jsonConverter.readValue(ACTIVE_JSON, UserState.class));
        assertEquals(UserState.INACTIVE, jsonConverter.readValue(INACTIVE_JSON, UserState.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(ACTIVE_JSON, jsonConverter.writeValueAsString(UserState.ACTIVE));
        assertEquals(INACTIVE_JSON, jsonConverter.writeValueAsString(UserState.INACTIVE));
    }

    @Test
    void convertToString()
    {
        assertEquals(ACTIVE_VALUE, UserState.ACTIVE.toString());
        assertEquals(INACTIVE_VALUE, UserState.INACTIVE.toString());
    }
}