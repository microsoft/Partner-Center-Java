// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerSearchFieldTest
{
    private static final String COMPANY_NAME_VALUE = "CompanyName";
    private static final String DOMAIN_NAME_VALUE = "Domain";
    private static final String INDIRECT_RESELLER_VALUE = "IndirectReseller";
    private static final String INDIRECT_CLOUD_SOLUTION_PROVIDER_VALUE = "IndirectCloudSolutionProvider";
    private static final String COMPANY_NAME_JSON = '"' + COMPANY_NAME_VALUE + '"';
    private static final String DOMAIN_NAME_JSON = '"' + DOMAIN_NAME_VALUE + '"';
    private static final String INDIRECT_RESELLER_JSON = '"' + INDIRECT_RESELLER_VALUE + '"';
    private static final String INDIRECT_CLOUD_SOLUTION_PROVIDER_JSON = '"' + INDIRECT_CLOUD_SOLUTION_PROVIDER_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(CustomerSearchField.COMPANY_NAME, jsonConverter.readValue(COMPANY_NAME_JSON, CustomerSearchField.class));
        assertEquals(CustomerSearchField.DOMAIN_NAME, jsonConverter.readValue(DOMAIN_NAME_JSON, CustomerSearchField.class));
        assertEquals(CustomerSearchField.INDIRECT_RESELLER, jsonConverter.readValue(INDIRECT_RESELLER_JSON, CustomerSearchField.class));
        assertEquals(CustomerSearchField.INDIRECT_CLOUD_SOLUTION_PROVIDER, jsonConverter.readValue(INDIRECT_CLOUD_SOLUTION_PROVIDER_JSON, CustomerSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(COMPANY_NAME_JSON, jsonConverter.writeValueAsString(CustomerSearchField.COMPANY_NAME));
        assertEquals(DOMAIN_NAME_JSON, jsonConverter.writeValueAsString(CustomerSearchField.DOMAIN_NAME));
        assertEquals(INDIRECT_RESELLER_JSON, jsonConverter.writeValueAsString(CustomerSearchField.INDIRECT_RESELLER));
        assertEquals(INDIRECT_CLOUD_SOLUTION_PROVIDER_JSON, jsonConverter.writeValueAsString(CustomerSearchField.INDIRECT_CLOUD_SOLUTION_PROVIDER));
    }

    @Test
    void convertToString()
    {
        assertEquals(COMPANY_NAME_VALUE, CustomerSearchField.COMPANY_NAME.toString());
        assertEquals(DOMAIN_NAME_VALUE, CustomerSearchField.DOMAIN_NAME.toString());
        assertEquals(INDIRECT_RESELLER_VALUE, CustomerSearchField.INDIRECT_RESELLER.toString());
        assertEquals(INDIRECT_CLOUD_SOLUTION_PROVIDER_VALUE, CustomerSearchField.INDIRECT_CLOUD_SOLUTION_PROVIDER.toString());
    }
}