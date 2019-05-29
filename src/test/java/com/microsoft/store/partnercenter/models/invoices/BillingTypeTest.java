// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillingTypeTest
{
    private static final String NONE_VALUE = "none";
    private static final String USAGE_VALUE = "usage";
    private static final String LICENSE_VALUE = "license";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String USAGE_JSON = '"' + USAGE_VALUE + '"';
    private static final String LICENSE_JSON = '"' + LICENSE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(BillingType.NONE, jsonConverter.readValue(NONE_JSON, BillingType.class));
        assertEquals(BillingType.USAGE, jsonConverter.readValue(USAGE_JSON, BillingType.class));
        assertEquals(BillingType.LICENSE, jsonConverter.readValue(LICENSE_JSON, BillingType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(BillingType.NONE));
        assertEquals(USAGE_JSON, jsonConverter.writeValueAsString(BillingType.USAGE));
        assertEquals(LICENSE_JSON, jsonConverter.writeValueAsString(BillingType.LICENSE));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, BillingType.NONE.toString());
        assertEquals(USAGE_VALUE, BillingType.USAGE.toString());
        assertEquals(LICENSE_VALUE, BillingType.LICENSE.toString());
    }
}