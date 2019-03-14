// -----------------------------------------------------------------------
// <copyright file="TestConstants.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

public class TestConstants
{
    /**
     * Private constructor prevents from being inadvertently instantiated.
     */
    private TestConstants() 
    {
    }

    /**
     * The Active Directory authority endpoint address.
     */
    public static final String AAD_AUTHORITY_ENDPOINT = "https://login.microsoftonline.com";

    /**
     * The unique identifier of an agreement template.
     */
    public static final String AGREEMENT_TEMPLATE_ID = "998b88de-aa99-4388-a42c-1b3517d49490";

    /**
     * URL to the agreement template.
     */
    public static final String AGREEMENT_TEMPLATE_URL = "https://docs.microsoft.com/partner-center/agreements";

    /**
     * The Azure Active Graph API endpoint.
     */
    public static final String GRAPH_API_ENDPOINT = "https://graph.windows.net";

    /**
     * The test Azure Active Directory application identifier value.
     */
    public static final String TEST_AAD_APPLICATION_ID = "ca7898d0-f62c-4dab-9024-3ede37a49edc";

    /**
     * The test Azure Active Directory application domain value.
     */
    public static final String TEST_AAD_APPLICATION_DOMAIN = "testpartner.onmicrosoft.com";

    /**
     * The test Azure Active Directory application secret value.
     */
    public static final String TEST_AAD_APPLICATION_SECRET = "SomeSecretValue";

    /**
     * The test Azure Active Directory token value.
     */
    public static final String TEST_AAD_TOKEN_VALUE = "STUB_TOKEN";
}