// -----------------------------------------------------------------------
// <copyright file="ApplicationPartnerCredentialsTest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import com.microsoft.store.partnercenter.AuthenticationToken;

/**
 * Unit tests for the {@link #ApplicationPartnerCredentials} class.
 */
public class ApplicationPartnerCredentialsTest 
{
    /**
     * Unit test to validate the get and set functions for the client identifier value.
     */
    @Test
    public void testAadApplicationId() 
    {
        ApplicationPartnerCredentials credentials; 

        try
        {
            credentials = new ApplicationPartnerCredentials("aadApplicationId", "aadApplicationSecret", "aadApplicationDomain");
            assertEquals("aadApplicationId", credentials.getClientId(), "The value for the client identifier should be aadApplicationId");            
        }
        finally
        {
            credentials = null; 
        }
    }

    /**
     * Unit test to validate the get and set functions for the Azure AD authority value.
     */
    @Test
    public void testAadAuthority() 
    {
        ApplicationPartnerCredentials credentials; 

        try
        {
            credentials = new ApplicationPartnerCredentials("aadApplicationId", "aadApplicationSecret", "aadApplicationDomain");
            assertEquals("https://login.microsoftonline.com", credentials.getActiveDirectoryAuthority(), "The value for the Active Directory authority should be https://login.microsoftonline.com");            
        }
        finally
        {
            credentials = null; 
        }
    }

    /**
     * Unit test to validate the get and set functions for the Graph endpoint value.
     */
    @Test
    public void testGraphEndpoint() 
    {
        ApplicationPartnerCredentials credentials; 

        try
        {
            credentials = new ApplicationPartnerCredentials("aadApplicationId", "aadApplicationSecret", "aadApplicationDomain");
            assertEquals("https://graph.windows.net", credentials.getGraphApiEndpoint(), "The value for the Graph API endpoint should be https://graph.windows.net");            
        }
        finally
        {
            credentials = null; 
        }
    }

    /**
     * Unit test to validate the functionality of the getExpiresAt function.
     */
    @Test
    public void testGetExpiresAt() 
    {
        ApplicationPartnerCredentials credentials; 
        DateTime expiryTime; 

        try
        {
            credentials = new ApplicationPartnerCredentials("aadApplicationId", "aadApplicationSecret", "aadApplicationDomain");
            expiryTime = DateTime.now(); 

            credentials.setAADToken(new AuthenticationToken("STUB_TOKEN", expiryTime));

            assertEquals(expiryTime, credentials.getAADToken().getExpiryTime(), "The expiration time for the token is supposed to match.");
        }
        finally 
        {
            credentials = null; 
            expiryTime = null; 
        }
    }
}