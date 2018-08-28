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
import com.microsoft.store.partnercenter.TestConstants;

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
            credentials = new ApplicationPartnerCredentials(TestConstants.TestAadApplicationId, TestConstants.TestAadApplicationSecret, TestConstants.TestAadApplicationDomain);
            assertEquals(TestConstants.TestAadApplicationId, credentials.getClientId(), "The value for the client identifier should be aadApplicationId");            
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
            credentials = new ApplicationPartnerCredentials(TestConstants.TestAadApplicationId, TestConstants.TestAadApplicationSecret, TestConstants.TestAadApplicationDomain);
            assertEquals(TestConstants.AadAuthorityEndpoint, credentials.getActiveDirectoryAuthority(), "The value for the Active Directory authority should be https://login.microsoftonline.com");            
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
            credentials = new ApplicationPartnerCredentials(TestConstants.TestAadApplicationId, TestConstants.TestAadApplicationSecret, TestConstants.TestAadApplicationDomain);
            assertEquals(TestConstants.GraphApiEndpoint, credentials.getGraphApiEndpoint(), "The value for the Graph API endpoint should be https://graph.windows.net");            
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
            credentials = new ApplicationPartnerCredentials(TestConstants.TestAadApplicationId, TestConstants.TestAadApplicationSecret, TestConstants.TestAadApplicationDomain);
            expiryTime = DateTime.now(); 

            credentials.setAADToken(new AuthenticationToken(TestConstants.TestAadTokenValue, expiryTime));

            assertEquals(expiryTime, credentials.getAADToken().getExpiryTime(), "The expiration time for the token is supposed to match.");
        }
        finally 
        {
            credentials = null; 
            expiryTime = null; 
        }
    }
}