// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LicenseGroupIdTest
{
    private static final String NONE_VALUE = "none";
    private static final String GROUP1_VALUE = "group1";
    private static final String GROUP2_VALUE = "group2";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String GROUP1_JSON = '"' + GROUP1_VALUE + '"';
    private static final String GROUP2_JSON = '"' + GROUP2_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(LicenseGroupId.NONE, jsonConverter.readValue(NONE_JSON, LicenseGroupId.class));
        assertEquals(LicenseGroupId.GROUP1, jsonConverter.readValue(GROUP1_JSON, LicenseGroupId.class));
        assertEquals(LicenseGroupId.GROUP2, jsonConverter.readValue(GROUP2_JSON, LicenseGroupId.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(LicenseGroupId.NONE));
        assertEquals(GROUP1_JSON, jsonConverter.writeValueAsString(LicenseGroupId.GROUP1));
        assertEquals(GROUP2_JSON, jsonConverter.writeValueAsString(LicenseGroupId.GROUP2));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, LicenseGroupId.NONE.toString());
        assertEquals(GROUP1_VALUE, LicenseGroupId.GROUP1.toString());
        assertEquals(GROUP2_VALUE, LicenseGroupId.GROUP2.toString());
    }
}