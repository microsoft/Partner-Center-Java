// -----------------------------------------------------------------------
// <copyright file="AuditRecordSearchFieldTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuditRecordSearchFieldTest
{
    private static final String COMPANY_NAME_VALUE = "CompanyName";
    private static final String CUSTOMER_ID_VALUE = "CustomerId";
    private static final String RESOURCE_TYPE_VALUE = "ResourceType";
    private static final String COMPANY_NAME_JSON = '"' + COMPANY_NAME_VALUE + '"';
    private static final String CUSTOMER_ID_JSON = '"' + CUSTOMER_ID_VALUE + '"';
    private static final String RESOURCE_TYPE_JSON = '"' + RESOURCE_TYPE_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(AuditRecordSearchField.COMPANY_NAME, jsonConverter.readValue(COMPANY_NAME_JSON, AuditRecordSearchField.class));
        assertEquals(AuditRecordSearchField.CUSTOMER_ID, jsonConverter.readValue(CUSTOMER_ID_JSON, AuditRecordSearchField.class));
        assertEquals(AuditRecordSearchField.RESOURCE_TYPE, jsonConverter.readValue(RESOURCE_TYPE_JSON, AuditRecordSearchField.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(COMPANY_NAME_JSON, jsonConverter.writeValueAsString(AuditRecordSearchField.COMPANY_NAME));
        assertEquals(CUSTOMER_ID_JSON, jsonConverter.writeValueAsString(AuditRecordSearchField.CUSTOMER_ID));
        assertEquals(RESOURCE_TYPE_JSON, jsonConverter.writeValueAsString(AuditRecordSearchField.RESOURCE_TYPE));
    }

    @Test
    void convertToString()
    {
        assertEquals(COMPANY_NAME_VALUE, AuditRecordSearchField.COMPANY_NAME.toString());
        assertEquals(CUSTOMER_ID_VALUE, AuditRecordSearchField.CUSTOMER_ID.toString());
        assertEquals(RESOURCE_TYPE_VALUE, AuditRecordSearchField.RESOURCE_TYPE.toString());
    }
}