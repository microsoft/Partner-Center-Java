// -----------------------------------------------------------------------
// <copyright file="ApplicationPartnerCredentialsTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.microsoft.store.partnercenter.AuthenticationToken;
import com.microsoft.store.partnercenter.TestConstants;

/**
 * Unit tests for the ApplicationPartnerCredentials class.
 */
public class ApplicationPartnerCredentialsTest 
{
    /**
     * 
     */
    private ApplicationPartnerCredentials credentials;

    /**
     * Create the Agreement instance before each test.
     */
    @BeforeEach
    void setup()
    {
        credentials = new ApplicationPartnerCredentials(TestConstants.TEST_AAD_APPLICATION_ID, TestConstants.TEST_AAD_APPLICATION_SECRET, TestConstants.TEST_AAD_APPLICATION_DOMAIN);
    }

    /**
     * Unit test to validate the get and set functions for the client identifier value.
     */
    @Test
    public void testAadApplicationId() 
    {
        assertEquals(TestConstants.TEST_AAD_APPLICATION_ID, credentials.getClientId(), "The value for the client identifier should be aadApplicationId");            
    }

    /**
     * Unit test to validate the get and set functions for the Azure AD authority value.
     */
    @Test
    public void testAadAuthority() 
    {
        assertEquals(TestConstants.AAD_AUTHORITY_ENDPOINT, credentials.getActiveDirectoryAuthority(), "The value for the Active Directory authority should be https://login.microsoftonline.com");            
    }

    /**
     * Unit test to validate the get and set functions for the Graph endpoint value.
     */
    @Test
    public void testGraphEndpoint() 
    {
        assertEquals(TestConstants.GRAPH_API_ENDPOINT, credentials.getGraphApiEndpoint(), "The value for the Graph API endpoint should be https://graph.windows.net");            
    }

    /**
     * Unit test to validate the functionality of the getExpiresAt function.
     */
    @Test
    public void testGetExpiresAt() 
    {
        DateTime expiryTime; 

        try
        {
            expiryTime = DateTime.now(); 

            credentials.setAADToken(new AuthenticationToken(TestConstants.TEST_AAD_TOKEN_VALUE, expiryTime));

            assertEquals(expiryTime, credentials.getAADToken().getExpiryTime(), "The expiration time for the token is supposed to match.");
        }
        finally 
        {
            expiryTime = null; 
        }
    }
}