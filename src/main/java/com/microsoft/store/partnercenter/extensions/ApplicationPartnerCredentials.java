// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.extensions;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ClientCredentialParameters;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.ConfidentialClientApplication.Builder;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCredential;
import com.microsoft.aad.msal4j.IConfidentialClientApplication;
import com.microsoft.store.partnercenter.AuthenticationToken;
import com.microsoft.store.partnercenter.IPartnerCredentials;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.utils.StringHelper;

import org.joda.time.DateTime;

/**
 * Partner service credentials based on Azure Active Directory application
 * credentials.
 */
public class ApplicationPartnerCredentials extends BasePartnerCredentials {
    /**
     * The Azure Active Directory application secret.
     */
    private final String applicationSecret;

    /**
     * The application domain in Azure Active Directory.
     */
    private final String aadApplicationDomain;

    /**
     * Initializes a new instance of the ApplicationPartnerCredentials class.
     * 
     * @param aadApplicationId     The application identifier in Azure Active Directory.
     * @param aadApplicationSecret The application secret in Azure Active Directory.
     * @param aadApplicationDomain The application domain in Azure Active Directory.
     */
    public ApplicationPartnerCredentials(String aadApplicationId, String aadApplicationSecret, String aadApplicationDomain) 
    {
        this(aadApplicationId, aadApplicationSecret, aadApplicationDomain, "https://login.microsoftonline.com/", "https://graph.windows.net");
    }

    /**
     * Initializes a new instance of the ApplicationPartnerCredentials class.
     * 
     * @param aadApplicationId     The application identifier in Azure Active Directory.
     * @param aadApplicationSecret The application secret in Azure Active Directory.
     * @param aadApplicationDomain The application domain in Azure Active Directory.
     * @param aadAuthorityEndpoint The Active Directory authority endpoint address.
     * @param graphApiEndpoint     The Azure Active Directory Graph API endpoint address.
     */
    public ApplicationPartnerCredentials(String aadApplicationId, String aadApplicationSecret, String aadApplicationDomain, String aadAuthorityEndpoint, String graphApiEndpoint) 
    {
        super(aadApplicationId);

        if (StringHelper.isNullOrWhiteSpace(aadApplicationSecret)) {
            throw new IllegalArgumentException("aadApplicationSecret has to be set");
        }

        if (StringHelper.isNullOrWhiteSpace(aadApplicationDomain)) {
            throw new IllegalArgumentException("aadApplicationDomain has to be set");
        }

        if (StringHelper.isNullOrWhiteSpace(aadAuthorityEndpoint)) {
            throw new IllegalArgumentException("aadAuthorityEndpoint has to be set");
        }

        if (StringHelper.isNullOrWhiteSpace(graphApiEndpoint)) {
            throw new IllegalArgumentException("graphApiEndpoint has to be set");
        }

        this.applicationSecret = aadApplicationSecret;
        this.aadApplicationDomain = aadApplicationDomain;

        this.setActiveDirectoryAuthority(aadAuthorityEndpoint);
        this.setGraphApiEndpoint(graphApiEndpoint);

        PartnerService.getInstance().setRefreshCredentialsHandler(this);
    }

    private String activeDirectoryAuthority;

    /**
     * Gets the Active Directory authentication endpoint.
     * 
     * @return The Active Directory authentication endpoint
     */
    public String getActiveDirectoryAuthority() 
    {
        return activeDirectoryAuthority;
    }

    /**
     * Sets the Active Directory authentication endpoint.
     * 
     * @param value The Active Directory authentication endpoint.
     */
    public void setActiveDirectoryAuthority(String value) 
    {
        activeDirectoryAuthority = value;
    }

    private String graphApiEndpoint;

    /**
     * Gets the Graph API endpoint.
     * 
     * @return The Graph API endpoint.
     */
    public String getGraphApiEndpoint() 
    {
        return graphApiEndpoint;
    }

    /**
     * Set the Graph API end point.
     * 
     * @param value The Graph API endpoint
     */
    public void setGraphApiEndpoint(String value) 
    {
        graphApiEndpoint = value;
    }

    /**
     * Authenticates with the partner service.
     * 
     * @param requestContext The request context.
     */
    @Override
    public void authenticate(IRequestContext requestContext) 
    {
        Builder builder;
        ClientCredentialParameters parameters;
        CompletableFuture<IAuthenticationResult> future;
        IAuthenticationResult authResult = null;
        IClientCredential credential;
        IConfidentialClientApplication app;

        try
        {
            credential = ClientCredentialFactory.createFromSecret(applicationSecret);

            builder = ConfidentialClientApplication
                .builder(getClientId(), credential)
                .authority(getActiveDirectoryAuthority() + "/" + aadApplicationDomain);

            if(requestContext != null)
            {
                builder = builder.correlationId(requestContext.getCorrelationId().toString());
            }

            app = builder.build();

            parameters = ClientCredentialParameters
                .builder(Collections.singleton(getGraphApiEndpoint() + "/.default"))
                .build();

            future = app.acquireToken(parameters);
            authResult = future.get();
        }
        catch (Exception e)
        {
            throw new PartnerException("Failed to do the application AAD login", e);
        }
        
        this.setAADToken(new AuthenticationToken(authResult.accessToken(), new DateTime(authResult.expiresOnDate())));
    }

    /**
     * Called when a partner credentials instance needs to be refreshed.
     * 
     * @param credentials The outdated partner credentials.
     * @param context The request context.
     */
    @Override
    public void onCredentialsRefreshNeeded(IPartnerCredentials credentials, IRequestContext context)
    {
        ApplicationPartnerCredentials partnerCredentials = (ApplicationPartnerCredentials) credentials;

        if (partnerCredentials != null)
        {
            // we can deal with the partner credentials object, refresh it
            partnerCredentials.authenticate(context);
        }
        else
        {
            PartnerLog.getInstance().logWarning(ApplicationPartnerCredentials.class + ": The given credentials are not supported.");
        }
    }
}