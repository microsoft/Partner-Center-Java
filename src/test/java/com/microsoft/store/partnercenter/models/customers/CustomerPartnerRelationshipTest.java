// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerPartnerRelationshipTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String NONE_VALUE = "none";
    private static final String RESELLER_VALUE = "reseller";
    private static final String ADVISOR_VALUE = "advisor";
    private static final String SYNDICATION_VALUE = "syndication";
    private static final String MICROSOFT_SUPPORT_VALUE = "microsoftSupport";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String RESELLER_JSON = '"' + RESELLER_VALUE + '"';
    private static final String ADVISOR_JSON = '"' + ADVISOR_VALUE + '"';
    private static final String SYNDICATION_JSON = '"' + SYNDICATION_VALUE + '"';
    private static final String MICROSOFT_SUPPORT_JSON = '"' + MICROSOFT_SUPPORT_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(CustomerPartnerRelationship.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, CustomerPartnerRelationship.class));
        assertEquals(CustomerPartnerRelationship.NONE, jsonConverter.readValue(NONE_JSON, CustomerPartnerRelationship.class));
        assertEquals(CustomerPartnerRelationship.RESELLER, jsonConverter.readValue(RESELLER_JSON, CustomerPartnerRelationship.class));
        assertEquals(CustomerPartnerRelationship.ADVISOR, jsonConverter.readValue(ADVISOR_JSON, CustomerPartnerRelationship.class));
        assertEquals(CustomerPartnerRelationship.SYNDICATION, jsonConverter.readValue(SYNDICATION_JSON, CustomerPartnerRelationship.class));
        assertEquals(CustomerPartnerRelationship.MICROSOFT_SUPPORT, jsonConverter.readValue(MICROSOFT_SUPPORT_JSON, CustomerPartnerRelationship.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.UNKNOWN));
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.NONE));
        assertEquals(RESELLER_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.RESELLER));
        assertEquals(ADVISOR_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.ADVISOR));
        assertEquals(SYNDICATION_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.SYNDICATION));
        assertEquals(MICROSOFT_SUPPORT_JSON, jsonConverter.writeValueAsString(CustomerPartnerRelationship.MICROSOFT_SUPPORT));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, CustomerPartnerRelationship.UNKNOWN.toString());
        assertEquals(NONE_VALUE, CustomerPartnerRelationship.NONE.toString());
        assertEquals(RESELLER_VALUE, CustomerPartnerRelationship.RESELLER.toString());
        assertEquals(ADVISOR_VALUE, CustomerPartnerRelationship.ADVISOR.toString());
        assertEquals(SYNDICATION_VALUE, CustomerPartnerRelationship.SYNDICATION.toString());
        assertEquals(MICROSOFT_SUPPORT_VALUE, CustomerPartnerRelationship.MICROSOFT_SUPPORT.toString());
    }
}