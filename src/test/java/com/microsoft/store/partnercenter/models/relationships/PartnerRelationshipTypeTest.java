// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.relationships;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartnerRelationshipTypeTest
{
    private static final String IS_INDIRECT_RESELLER_OF_VALUE = "is_indirect_reseller_of";
    private static final String IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_VALUE = "is_indirect_cloud_solution_provider_of";
    private static final String IS_INDIRECT_RESELLER_OF_JSON = '"' + IS_INDIRECT_RESELLER_OF_VALUE + '"';
    private static final String IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_JSON = '"' + IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(PartnerRelationshipType.IS_INDIRECT_RESELLER_OF, jsonConverter.readValue(IS_INDIRECT_RESELLER_OF_JSON, PartnerRelationshipType.class));
        assertEquals(PartnerRelationshipType.IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF, jsonConverter.readValue(IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_JSON, PartnerRelationshipType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(IS_INDIRECT_RESELLER_OF_JSON, jsonConverter.writeValueAsString(PartnerRelationshipType.IS_INDIRECT_RESELLER_OF));
        assertEquals(IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_JSON, jsonConverter.writeValueAsString(PartnerRelationshipType.IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF));
    }

    @Test
    void convertToString()
    {
        assertEquals(IS_INDIRECT_RESELLER_OF_VALUE, PartnerRelationshipType.IS_INDIRECT_RESELLER_OF.toString());
        assertEquals(IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF_VALUE, PartnerRelationshipType.IS_INDIRECT_CLOUD_SOLUTION_PROVIDER_OF.toString());
    }
}