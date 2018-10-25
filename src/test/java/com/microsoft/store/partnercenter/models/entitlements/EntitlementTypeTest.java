// -----------------------------------------------------------------------
// <copyright file="EntitlementTypeTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntitlementTypeTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE = "virtual_machine_reserved_instance";
    private static final String SOFTWARE_VALUE = "software";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON = '"' + VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE + '"';
    private static final String SOFTWARE_JSON = '"' + SOFTWARE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(EntitlementType.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, EntitlementType.class));
        assertEquals(EntitlementType.VIRTUAL_MACHINE_RESERVED_INSTANCE, jsonConverter.readValue(VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON, EntitlementType.class));
        assertEquals(EntitlementType.SOFTWARE, jsonConverter.readValue(SOFTWARE_JSON, EntitlementType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(EntitlementType.UNKNOWN));
        assertEquals(VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON, jsonConverter.writeValueAsString(EntitlementType.VIRTUAL_MACHINE_RESERVED_INSTANCE));
        assertEquals(SOFTWARE_JSON, jsonConverter.writeValueAsString(EntitlementType.SOFTWARE));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, EntitlementType.UNKNOWN.toString());
        assertEquals(VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE, EntitlementType.VIRTUAL_MACHINE_RESERVED_INSTANCE.toString());
        assertEquals(SOFTWARE_VALUE, EntitlementType.SOFTWARE.toString());
    }
}