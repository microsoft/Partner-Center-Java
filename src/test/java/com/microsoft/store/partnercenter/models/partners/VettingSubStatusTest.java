// -----------------------------------------------------------------------
// <copyright file="VettingSubStatusTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.TestJsonConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VettingSubStatusTest
{
    private static final String NONE_VALUE = "none";
    private static final String ENTRY_VALUE = "entry";
    private static final String EMAIL_OWNERSHIP_VALUE = "email_ownership";
    private static final String EMAIL_DOMAIN_VALUE = "email_domain";
    private static final String EMPLOYMENT_VERIFICATION_VALUE = "employment_verification";
    private static final String DECISION_VALUE = "decision";
    private static final String OTHER_VALUE = "other";
    private static final String BUSINESS_VERIFICATION_VALUE = "business_verification";
    private static final String NONE_JSON = '"' + NONE_VALUE + '"';
    private static final String ENTRY_JSON = '"' + ENTRY_VALUE + '"';
    private static final String EMAIL_OWNERSHIP_JSON = '"' + EMAIL_OWNERSHIP_VALUE + '"';
    private static final String EMAIL_DOMAIN_JSON = '"' + EMAIL_DOMAIN_VALUE + '"';
    private static final String EMPLOYMENT_VERIFICATION_JSON = '"' + EMPLOYMENT_VERIFICATION_VALUE + '"';
    private static final String DECISION_JSON = '"' + DECISION_VALUE + '"';
    private static final String OTHER_JSON = '"' + OTHER_VALUE + '"';
    private static final String BUSINESS_VERIFICATION_JSON = '"' + BUSINESS_VERIFICATION_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(VettingSubStatus.NONE, jsonConverter.readValue(NONE_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.ENTRY, jsonConverter.readValue(ENTRY_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.EMAIL_OWNERSHIP, jsonConverter.readValue(EMAIL_OWNERSHIP_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.EMAIL_DOMAIN, jsonConverter.readValue(EMAIL_DOMAIN_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.EMPLOYMENT_VERIFICATION, jsonConverter.readValue(EMPLOYMENT_VERIFICATION_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.DECISION, jsonConverter.readValue(DECISION_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.OTHER, jsonConverter.readValue(OTHER_JSON, VettingSubStatus.class));
        assertEquals(VettingSubStatus.BUSINESS_VERIFICATION, jsonConverter.readValue(BUSINESS_VERIFICATION_JSON, VettingSubStatus.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(NONE_JSON, jsonConverter.writeValueAsString(VettingSubStatus.NONE));
        assertEquals(ENTRY_JSON, jsonConverter.writeValueAsString(VettingSubStatus.ENTRY));
        assertEquals(EMAIL_OWNERSHIP_JSON, jsonConverter.writeValueAsString(VettingSubStatus.EMAIL_OWNERSHIP));
        assertEquals(EMAIL_DOMAIN_JSON, jsonConverter.writeValueAsString(VettingSubStatus.EMAIL_DOMAIN));
        assertEquals(EMPLOYMENT_VERIFICATION_JSON, jsonConverter.writeValueAsString(VettingSubStatus.EMPLOYMENT_VERIFICATION));
        assertEquals(DECISION_JSON, jsonConverter.writeValueAsString(VettingSubStatus.DECISION));
        assertEquals(OTHER_JSON, jsonConverter.writeValueAsString(VettingSubStatus.OTHER));
        assertEquals(BUSINESS_VERIFICATION_JSON, jsonConverter.writeValueAsString(VettingSubStatus.BUSINESS_VERIFICATION));
    }

    @Test
    void convertToString()
    {
        assertEquals(NONE_VALUE, VettingSubStatus.NONE.toString());
        assertEquals(ENTRY_VALUE, VettingSubStatus.ENTRY.toString());
        assertEquals(EMAIL_OWNERSHIP_VALUE, VettingSubStatus.EMAIL_OWNERSHIP.toString());
        assertEquals(EMAIL_DOMAIN_VALUE, VettingSubStatus.EMAIL_DOMAIN.toString());
        assertEquals(EMPLOYMENT_VERIFICATION_VALUE, VettingSubStatus.EMPLOYMENT_VERIFICATION.toString());
        assertEquals(DECISION_VALUE, VettingSubStatus.DECISION.toString());
        assertEquals(OTHER_VALUE, VettingSubStatus.OTHER.toString());
        assertEquals(BUSINESS_VERIFICATION_VALUE, VettingSubStatus.BUSINESS_VERIFICATION.toString());
    }
}