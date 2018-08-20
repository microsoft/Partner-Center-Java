// -----------------------------------------------------------------------
// <copyright file="ApplicationPartnerCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions;

import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.joda.time.DateTime;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;
import com.microsoft.store.partnercenter.AuthenticationToken;
import com.microsoft.store.partnercenter.IPartnerCredentials;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Partner service credentials based on azure active directory application credentials.
 */
public class ApplicationPartnerCredentials
    extends BasePartnerCredentials
{
    /**
     * The default AAD authority endpoint.
     */
    private final String defaultAadAuthority = "https://login.windows.net";

    /**
     * The default graph endpoint.
     */
    private final String defaultGraphEndpoint = "https://graph.windows.net";

    /**
     * The azure active directory application secret.
     */
    private final String applicationSecret;

    /**
     * The application domain in azure active directory.
     */
    private final String aadApplicationDomain;

    /**
     * Initializes a new instance of the {@link #ApplicationPartnerCredentials} class.
     * 
     * @param aadApplicationId The application Id in Azure Active Directory.
     * @param aadApplicationSecret The application secret in Azure Active Directory.
     * @param aadApplicationDomain The application domain in Azure Active Directory.
     */
    public ApplicationPartnerCredentials( String aadApplicationId, String aadApplicationSecret,
                                          String aadApplicationDomain )
    {
        this( aadApplicationId, aadApplicationSecret, aadApplicationDomain, null, null );
    }

    /**
     * Initializes a new instance of the {@link #ApplicationPartnerCredentials} class.
     * 
     * @param aadApplicationId The application Id in Azure Active Directory.
     * @param aadApplicationSecret The application secret in Azure Active Directory.
     * @param aadApplicationDomain The application domain in Azure Active Directory.
     * @param aadAuthorityEndpoint The active directory authority endpoint.
     * @param graphApiEndpoint The AAD graph API endpoint.
     */
    public ApplicationPartnerCredentials( String aadApplicationId, String aadApplicationSecret,
                                          String aadApplicationDomain, String aadAuthorityEndpoint,
                                          String graphApiEndpoint )
    {
        super( aadApplicationId );
        if ( StringHelper.isNullOrWhiteSpace( aadApplicationSecret ) )
        {
            throw new IllegalArgumentException( "aadApplicationSecret has to be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( aadApplicationDomain ) )
        {
            throw new IllegalArgumentException( "aadApplicationDomain has to be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( aadAuthorityEndpoint ) )
        {
            throw new IllegalArgumentException( "aadAuthorityEndpoint has to be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( graphApiEndpoint ) )
        {
            throw new IllegalArgumentException( "graphApiEndpoint has to be set" );
        }

        this.applicationSecret = aadApplicationSecret;
        this.aadApplicationDomain = aadApplicationDomain;
        if ( aadAuthorityEndpoint == null )
        {
            aadAuthorityEndpoint = this.defaultAadAuthority;
        }
        this.setActiveDirectoryAuthority( aadAuthorityEndpoint );
        if ( graphApiEndpoint == null )
        {
            graphApiEndpoint = this.defaultGraphEndpoint;
        }
        this.setGraphApiEndpoint( graphApiEndpoint );
        PartnerService.getInstance().setRefreshCredentialsHandler( this );
    }

    /**
     * Gets the active directory authentication endpoint.
     */
    private String __ActiveDirectoryAuthority;

    public String getActiveDirectoryAuthority()
    {
        return __ActiveDirectoryAuthority;
    }

    public void setActiveDirectoryAuthority( String value )
    {
        __ActiveDirectoryAuthority = value;
    }

    /**
     * Gets the graph API endpoint.
     */
    private String __GraphApiEndpoint;

    public String getGraphApiEndpoint()
    {
        return __GraphApiEndpoint;
    }

    public void setGraphApiEndpoint( String value )
    {
        __GraphApiEndpoint = value;
    }

    /**
     * Authenticates with the partner service.
     * 
     * @param requestContext An optional request context.
     * @return A task that is complete when the authentication is complete.
     */
    @Override
    public void authenticate( IRequestContext requestContext )
    {
        // get the application AAD token
        AuthenticationResult authResult = null;
        ExecutorService service = null;
        try
        {
            URI activeDirectoryEndpoint = new URI( this.getActiveDirectoryAuthority() + this.aadApplicationDomain );
            service = Executors.newFixedThreadPool( 1 );
            AuthenticationContext authenticationContext =
                new AuthenticationContext( activeDirectoryEndpoint.toString(), false, service );
            if ( null != requestContext )
            {
                authenticationContext.setCorrelationId( requestContext.getCorrelationId().toString() );
            }

            ClientCredential clientCred = new ClientCredential( this.getClientId(), this.applicationSecret );
            Future<AuthenticationResult> future =
                authenticationContext.acquireToken( this.getGraphApiEndpoint(), clientCred, null );
            authResult = future.get();
        }
        catch ( Exception e )
        {
            throw new PartnerException( "Failed to do the application AAD login", e );
        }
        finally
        {
            service.shutdown();
        }
        this.setAADToken( new AuthenticationToken( authResult.getAccessToken(),
                                                   new DateTime( authResult.getExpiresOnDate() ) ) );
    }

    /**
     * Called when a partner credentials instance needs to be refreshed.
     * 
     * @param credentials The outdated partner credentials.
     * @param context The partner context.
     * @return A task that is complete when the credential refresh is complete.
     */
    @Override
    public void onCredentialsRefreshNeeded( IPartnerCredentials credentials, IRequestContext context )
    {
        ApplicationPartnerCredentials partnerCredentials = (ApplicationPartnerCredentials) credentials;
        if ( partnerCredentials != null )
        {
            // we can deal with the partner credentials object, refresh it
            partnerCredentials.authenticate( context );
        }
        else
        {
            PartnerLog.getInstance().logWarning( ApplicationPartnerCredentials.class
                + ": The given credentials are not supported." );
        }
    }

}
