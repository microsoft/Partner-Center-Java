// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.devicesdeployment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolicyCategoryTest
{
    private static final String NONE_VALUE = "none";
    private static final String OOBE_VALUE = "o_o_b_e";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String OOBE_JSON = '"' + OOBE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(PolicyCategory.NONE, jsonConverter.readValue(NONE_JSON, PolicyCategory.class));
        assertEquals(PolicyCategory.OOBE, jsonConverter.readValue(OOBE_JSON, PolicyCategory.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(PolicyCategory.NONE));
        assertEquals(OOBE_JSON, jsonConverter.writeValueAsString(PolicyCategory.OOBE));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, PolicyCategory.NONE.toString());
        assertEquals(OOBE_VALUE, PolicyCategory.OOBE.toString());
    }
}