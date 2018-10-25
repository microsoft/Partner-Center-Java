// -----------------------------------------------------------------------
// <copyright file="ResourceTypeTest.java" company="Microsoft">
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

class ResourceTypeTest
{
    private static final String UNDEFINED_VALUE = "undefined";
    private static final String CUSTOMER_VALUE = "customer";
    private static final String CUSTOMER_USER_VALUE = "customer_user";
    private static final String ORDER_VALUE = "order";
    private static final String SUBSCRIPTION_VALUE = "subscription";
    private static final String LICENSE_VALUE = "license";
    private static final String THIRD_PARTY_ADD_ON_VALUE = "third_party_add_on";
    private static final String MPN_ASSOCIATION_VALUE = "mpn_association";
    private static final String TRANSFER_VALUE = "transfer";
    private static final String APPLICATION_VALUE = "application";
    private static final String APPLICATION_CREDENTIAL_VALUE = "application_credential";
    private static final String PARTNER_USER_VALUE = "partner_user";
    private static final String PARTNER_RELATIONSHIP_VALUE = "partner_relationship";
    private static final String UNDEFINED_JSON = '"' + UNDEFINED_VALUE + '"';
    private static final String CUSTOMER_JSON = '"' + CUSTOMER_VALUE + '"';
    private static final String CUSTOMER_USER_JSON = '"' + CUSTOMER_USER_VALUE + '"';
    private static final String ORDER_JSON = '"' + ORDER_VALUE + '"';
    private static final String SUBSCRIPTION_JSON = '"' + SUBSCRIPTION_VALUE + '"';
    private static final String LICENSE_JSON = '"' + LICENSE_VALUE + '"';
    private static final String THIRD_PARTY_ADD_ON_JSON = '"' + THIRD_PARTY_ADD_ON_VALUE + '"';
    private static final String MPN_ASSOCIATION_JSON = '"' + MPN_ASSOCIATION_VALUE + '"';
    private static final String TRANSFER_JSON = '"' + TRANSFER_VALUE + '"';
    private static final String APPLICATION_JSON = '"' + APPLICATION_VALUE + '"';
    private static final String APPLICATION_CREDENTIAL_JSON = '"' + APPLICATION_CREDENTIAL_VALUE + '"';
    private static final String PARTNER_USER_JSON = '"' + PARTNER_USER_VALUE + '"';
    private static final String PARTNER_RELATIONSHIP_JSON = '"' + PARTNER_RELATIONSHIP_VALUE + '"';

    private ObjectMapper jsonConverter;

    @BeforeEach
    void setUp()
    {
        jsonConverter = TestJsonConverter.create();
    }

    @Test
    void createFromJson() throws IOException
    {
        assertEquals(ResourceType.UNDEFINED, jsonConverter.readValue(UNDEFINED_JSON, ResourceType.class));
        assertEquals(ResourceType.CUSTOMER, jsonConverter.readValue(CUSTOMER_JSON, ResourceType.class));
        assertEquals(ResourceType.CUSTOMER_USER, jsonConverter.readValue(CUSTOMER_USER_JSON, ResourceType.class));
        assertEquals(ResourceType.ORDER, jsonConverter.readValue(ORDER_JSON, ResourceType.class));
        assertEquals(ResourceType.SUBSCRIPTION, jsonConverter.readValue(SUBSCRIPTION_JSON, ResourceType.class));
        assertEquals(ResourceType.LICENSE, jsonConverter.readValue(LICENSE_JSON, ResourceType.class));
        assertEquals(ResourceType.THIRD_PARTY_ADD_ON, jsonConverter.readValue(THIRD_PARTY_ADD_ON_JSON, ResourceType.class));
        assertEquals(ResourceType.MPN_ASSOCIATION, jsonConverter.readValue(MPN_ASSOCIATION_JSON, ResourceType.class));
        assertEquals(ResourceType.TRANSFER, jsonConverter.readValue(TRANSFER_JSON, ResourceType.class));
        assertEquals(ResourceType.APPLICATION, jsonConverter.readValue(APPLICATION_JSON, ResourceType.class));
        assertEquals(ResourceType.APPLICATION_CREDENTIAL, jsonConverter.readValue(APPLICATION_CREDENTIAL_JSON, ResourceType.class));
        assertEquals(ResourceType.PARTNER_USER, jsonConverter.readValue(PARTNER_USER_JSON, ResourceType.class));
        assertEquals(ResourceType.PARTNER_RELATIONSHIP, jsonConverter.readValue(PARTNER_RELATIONSHIP_JSON, ResourceType.class));
    }

    @Test
    void writeToJson() throws IOException
    {
        assertEquals(UNDEFINED_JSON, jsonConverter.writeValueAsString(ResourceType.UNDEFINED));
        assertEquals(CUSTOMER_JSON, jsonConverter.writeValueAsString(ResourceType.CUSTOMER));
        assertEquals(CUSTOMER_USER_JSON, jsonConverter.writeValueAsString(ResourceType.CUSTOMER_USER));
        assertEquals(ORDER_JSON, jsonConverter.writeValueAsString(ResourceType.ORDER));
        assertEquals(SUBSCRIPTION_JSON, jsonConverter.writeValueAsString(ResourceType.SUBSCRIPTION));
        assertEquals(LICENSE_JSON, jsonConverter.writeValueAsString(ResourceType.LICENSE));
        assertEquals(THIRD_PARTY_ADD_ON_JSON, jsonConverter.writeValueAsString(ResourceType.THIRD_PARTY_ADD_ON));
        assertEquals(MPN_ASSOCIATION_JSON, jsonConverter.writeValueAsString(ResourceType.MPN_ASSOCIATION));
        assertEquals(TRANSFER_JSON, jsonConverter.writeValueAsString(ResourceType.TRANSFER));
        assertEquals(APPLICATION_JSON, jsonConverter.writeValueAsString(ResourceType.APPLICATION));
        assertEquals(APPLICATION_CREDENTIAL_JSON, jsonConverter.writeValueAsString(ResourceType.APPLICATION_CREDENTIAL));
        assertEquals(PARTNER_USER_JSON, jsonConverter.writeValueAsString(ResourceType.PARTNER_USER));
        assertEquals(PARTNER_RELATIONSHIP_JSON, jsonConverter.writeValueAsString(ResourceType.PARTNER_RELATIONSHIP));
    }
    @Test
    void convertToString()
    {
        assertEquals(UNDEFINED_VALUE, ResourceType.UNDEFINED.toString());
        assertEquals(CUSTOMER_VALUE, ResourceType.CUSTOMER.toString());
        assertEquals(CUSTOMER_USER_VALUE, ResourceType.CUSTOMER_USER.toString());
        assertEquals(ORDER_VALUE, ResourceType.ORDER.toString());
        assertEquals(SUBSCRIPTION_VALUE, ResourceType.SUBSCRIPTION.toString());
        assertEquals(LICENSE_VALUE, ResourceType.LICENSE.toString());
        assertEquals(THIRD_PARTY_ADD_ON_VALUE, ResourceType.THIRD_PARTY_ADD_ON.toString());
        assertEquals(MPN_ASSOCIATION_VALUE, ResourceType.MPN_ASSOCIATION.toString());
        assertEquals(TRANSFER_VALUE, ResourceType.TRANSFER.toString());
        assertEquals(APPLICATION_VALUE, ResourceType.APPLICATION.toString());
        assertEquals(APPLICATION_CREDENTIAL_VALUE, ResourceType.APPLICATION_CREDENTIAL.toString());
        assertEquals(PARTNER_USER_VALUE, ResourceType.PARTNER_USER.toString());
        assertEquals(PARTNER_RELATIONSHIP_VALUE, ResourceType.PARTNER_RELATIONSHIP.toString());
    }
}