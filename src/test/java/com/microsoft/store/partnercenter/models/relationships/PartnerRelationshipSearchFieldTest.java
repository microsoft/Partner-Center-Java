// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.relationships;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartnerRelationshipSearchFieldTest
{
    private static final String NAME_VALUE = "name";
    private static final String NAME_JSON = '"' + NAME_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(PartnerRelationshipSearchField.NAME, jsonConverter.readValue(NAME_JSON, PartnerRelationshipSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NAME_JSON, jsonConverter.writeValueAsString(PartnerRelationshipSearchField.NAME));
    }

    @Test
    void convertToString()
    {
        assertEquals(NAME_VALUE, PartnerRelationshipSearchField.NAME.toString());
    }
}