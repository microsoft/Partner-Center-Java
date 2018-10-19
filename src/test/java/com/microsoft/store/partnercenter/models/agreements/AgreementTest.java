// -----------------------------------------------------------------------
// <copyright file="AgreementTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.microsoft.store.partnercenter.models.Contact;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.microsoft.store.partnercenter.TestConstants.AGREEMENT_TEMPLATE_ID;
import static com.microsoft.store.partnercenter.TestConstants.AGREEMENT_TEMPLATE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the Agreement class.
 */
class AgreementTest
{
    private Agreement agreement;

    /**
     * Create the Agreement instance before each test.
     */
    @BeforeEach
    void setUp()
    {
        agreement = new Agreement();
    }

    /**
     * Unit test to validate the get and set functions for the user identifier value.
     */
    @Test
    void getUserId()
    {
        String userId = "3d6f2c09-eb40-48ca-a4b3-d24c9c007531";

        agreement.setUserId(userId);

        assertEquals(userId, agreement.getUserId());
    }

    /**
     * Unit test to validate the get and set functions for the primary contact value.
     */
    @Test
    void getPrimaryContact()
    {
        String firstName = "Tania";
        String lastName = "Carr";
        String email = "SomeEmail@Outlook.com";
        String phoneNumber = "1234567890";

        Contact primaryContact = new Contact();
        primaryContact.setFirstName(firstName);
        primaryContact.setLastName(lastName);
        primaryContact.setEmail(email);
        primaryContact.setPhoneNumber(phoneNumber);

        agreement.setPrimaryContact(primaryContact);

        assertEquals(primaryContact, agreement.getPrimaryContact());
        assertEquals(firstName, agreement.getPrimaryContact().getFirstName());
        assertEquals(lastName, agreement.getPrimaryContact().getLastName());
        assertEquals(email, agreement.getPrimaryContact().getEmail());
        assertEquals(phoneNumber, agreement.getPrimaryContact().getPhoneNumber());
    }

    /**
     * Unit test to validate the get and set functions for the template identifier value.
     */
    @Test
    void getTemplateId()
    {
        agreement.setTemplateId(AGREEMENT_TEMPLATE_ID);

        assertEquals(AGREEMENT_TEMPLATE_ID, agreement.getTemplateId());
    }

    /**
     * Unit test to validate the get and set functions for the date agreed value.
     */
    @Test
    void getDateAgreed()
    {
        DateTime dateAgreed = DateTime.parse("2018-09-01T00:00:00Z");

        agreement.setDateAgreed(dateAgreed);

        assertEquals(dateAgreed, agreement.getDateAgreed());
    }

    /**
     * Unit test to validate the get and set functions for the type value.
     */
    @Test
    void getType()
    {
        AgreementType type = AgreementType.MICROSOFT_CLOUD_AGREEMENT;

        agreement.setType(type);

        assertEquals(type, agreement.getType());
    }

    /**
     * Unit test to validate the get and set functions for the agreement link value.
     */
    @Test
    void getAgreementLink()
    {
        agreement.setAgreementLink(AGREEMENT_TEMPLATE_URL);

        assertEquals(AGREEMENT_TEMPLATE_URL, agreement.getAgreementLink());
    }
}