// -----------------------------------------------------------------------
// <copyright file="ArtifactTypeTest.java" company="Microsoft">
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

class ArtifactTypeTest
{
    private static final String UNKNOWN_VALUE = "unknown";
    private static final String VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE = "virtual_machine_reserved_instance";
    private static final String PRODUCT_KEY_VALUE = "product_key";
    private static final String UNKNOWN_JSON = '"' + UNKNOWN_VALUE + '"';
    private static final String VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON = '"' + VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE + '"';
    private static final String PRODUCT_KEY_JSON = '"' + PRODUCT_KEY_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ArtifactType.UNKNOWN, jsonConverter.readValue(UNKNOWN_JSON, ArtifactType.class));
        assertEquals(ArtifactType.VIRTUAL_MACHINE_RESERVED_INSTANCE, jsonConverter.readValue(VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON, ArtifactType.class));
        assertEquals(ArtifactType.PRODUCT_KEY, jsonConverter.readValue(PRODUCT_KEY_JSON, ArtifactType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNKNOWN_JSON, jsonConverter.writeValueAsString(ArtifactType.UNKNOWN));
        assertEquals(VIRTUAL_MACHINE_RESERVED_INSTANCE_JSON, jsonConverter.writeValueAsString(ArtifactType.VIRTUAL_MACHINE_RESERVED_INSTANCE));
        assertEquals(PRODUCT_KEY_JSON, jsonConverter.writeValueAsString(ArtifactType.PRODUCT_KEY));
    }

    @Test
    void convertToString()
    {
        assertEquals(UNKNOWN_VALUE, ArtifactType.UNKNOWN.toString());
        assertEquals(VIRTUAL_MACHINE_RESERVED_INSTANCE_VALUE, ArtifactType.VIRTUAL_MACHINE_RESERVED_INSTANCE.toString());
        assertEquals(PRODUCT_KEY_VALUE, ArtifactType.PRODUCT_KEY.toString());
    }
}