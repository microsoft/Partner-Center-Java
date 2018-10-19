// -----------------------------------------------------------------------
// <copyright file="UserPartnerCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions;

import com.microsoft.store.partnercenter.AuthenticationToken;
import com.microsoft.store.partnercenter.IAadLoginHandler;
import com.microsoft.store.partnercenter.IPartnerCredentials;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.logging.PartnerLog;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * Partner service credentials based on Azure Active Directory user credentials.
 */
public class UserPartnerCredentials
    extends BasePartnerCredentials
{
    /**
     * The delegate used to refresh the Azure Active Directory token.
     */
    private final IAadLoginHandler tokenRefresher;

    /**
     * Initializes a new instance of the UserPartnerCredentials class.
     * 
     * @param clientId The client id of the application in Azure Active Directory.
     * @param aadAuthenticationToken The Azure Active Directory token.
     */
    public UserPartnerCredentials( String clientId, AuthenticationToken aadAuthenticationToken )
    {
        this( clientId, aadAuthenticationToken, null );
    }

    /**
     * Initializes a new instance of the UserPartnerCredentials class.
     * 
     * @param clientId The client id of the application in Azure Active Directory.
     * @param aadAuthenticationToken The Azure Active Directory token.
     * @param loginHandler Delegate used to refresh the Azure Active Directory token.
     */
    public UserPartnerCredentials( String clientId, AuthenticationToken aadAuthenticationToken,
                                   IAadLoginHandler loginHandler )
    {
        super( clientId );
        if ( aadAuthenticationToken == null )
        {
            throw new IllegalArgumentException( "aadAuthenticationToken" );
        }
        else
        {
            if ( aadAuthenticationToken.isExpired() )
            {
                throw new IllegalArgumentException( "aadAuthenticationToken is expired." );
            }
        }
        this.setAADToken( aadAuthenticationToken );
        this.tokenRefresher = loginHandler;
        PartnerService.getInstance().setRefreshCredentialsHandler( this );
    }

    /**
     * Called when a partner credentials instance needs to be refreshed.
     *
     * @param credentials The outdated partner credentials.
     * @param context The partner context.
     */
    @Override
    public void onCredentialsRefreshNeeded( IPartnerCredentials credentials, IRequestContext context )
    {
        UserPartnerCredentials partnerCredentials = (UserPartnerCredentials) credentials;
        if ( partnerCredentials != null )
        {
            // we can deal with the partner credentials object, refresh it
            partnerCredentials.refresh( context );
        }
        else
        {
            PartnerLog.getInstance().logWarning( UserPartnerCredentials.class
                + ": The given credentials are not supported." );
        }
    }

    /**
     * Refreshes the partner credentials.
     *
     * @param context The partner context.
     * @return A task which is complete when the refresh is done.
     */
    private void refresh( IRequestContext context )
    {
        // async
        if ( this.getAADToken().isExpired() )
        {
            // we need to refresh the AAD before attempting to re-authenticate with the partner service
            if ( this.tokenRefresher != null )
            {
                // invoke the callback and let it provide us with the new aad token
                AuthenticationToken newAadToken = tokenRefresher.authenticate();

                if ( newAadToken == null )
                {
                    String errorMessage = "Token refresher returned null token.";
                    PartnerLog.getInstance().logError( errorMessage );
                    throw new PartnerException( errorMessage, context, PartnerErrorCategory.UNAUTHORIZED );
                }

                if ( newAadToken.isExpired() )
                {
                    String errorMessage = "Token refresher returned an expired token.";
                    PartnerLog.getInstance().logError( errorMessage );
                    throw new PartnerException( errorMessage, context, PartnerErrorCategory.UNAUTHORIZED );
                }

                setAADToken( newAadToken );

            }
            else
            {
                String errorMessage = "AAD Token needs refreshing but no handler was registered.";
                PartnerLog.getInstance().logWarning( errorMessage );
                throw new PartnerException( errorMessage, context, PartnerErrorCategory.UNAUTHORIZED );
            }
        }
        // get a new partner service token using the AAD token we have
        this.authenticate();
    }

}