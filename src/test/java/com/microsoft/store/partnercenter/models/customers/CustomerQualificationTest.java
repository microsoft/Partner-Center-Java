// -----------------------------------------------------------------------
// <copyright file="CustomerQualificationTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerQualificationTest
{
    private static final String NONE_VALUE = "none";
    private static final String EDUCATION_VALUE = "education";
    private static final String NONPROFIT_VALUE = "nonprofit";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String EDUCATION_JSON = '"' + EDUCATION_VALUE + '"';
    private static final String NONPROFIT_JSON = '"' + NONPROFIT_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(CustomerQualification.NONE, jsonConverter.readValue(NONE_JSON, CustomerQualification.class));
        assertEquals(CustomerQualification.EDUCATION, jsonConverter.readValue(EDUCATION_JSON, CustomerQualification.class));
        assertEquals(CustomerQualification.NONPROFIT, jsonConverter.readValue(NONPROFIT_JSON, CustomerQualification.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(CustomerQualification.NONE));
        assertEquals(EDUCATION_JSON, jsonConverter.writeValueAsString(CustomerQualification.EDUCATION));
        assertEquals(NONPROFIT_JSON, jsonConverter.writeValueAsString(CustomerQualification.NONPROFIT));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, CustomerQualification.NONE.toString());
        assertEquals(EDUCATION_VALUE, CustomerQualification.EDUCATION.toString());
        assertEquals(NONPROFIT_VALUE, CustomerQualification.NONPROFIT.toString());
    }
}