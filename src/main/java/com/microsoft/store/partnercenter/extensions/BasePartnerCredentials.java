// -----------------------------------------------------------------------
// <copyright file="BasePartnerCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.extensions;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.AuthenticationToken;
import com.microsoft.store.partnercenter.IPartnerCredentials;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * A base implementation for partner credentials.
 */
public abstract class BasePartnerCredentials
    implements IPartnerCredentials
{
    /**
     * Initializes a new instance of the {@link #BasePartnerCredentials} class.
     * 
     * @param clientId The azure active directory client Id.
     */
    public BasePartnerCredentials( String clientId )
    {
        if ( StringHelper.isNullOrWhiteSpace( clientId ) )
        {
            throw new IllegalArgumentException( "clientId has to be set" );
        }

        this.setClientId( clientId );
    }

    /**
     * Gets the partner service token.
     */
    @Override
    public String getPartnerServiceToken()
    {
        return this.getAADToken().getToken();
    }

    /**
     * Gets the expiry time in UTC for the token.
     */
    @Override
    public DateTime getExpiresAt()
    {
        return this.getAADToken().getExpiryTime();
    }

    /**
     * Gets or sets the azure active directory token.
     */
    private AuthenticationToken __AADToken;

    protected AuthenticationToken getAADToken()
    {
        return __AADToken;
    }

    protected void setAADToken( AuthenticationToken value )
    {
        __AADToken = value;
    }

    /**
     * Gets the Azure Active Directory client identifier.
     */
    private String __ClientId = new String();

    protected String getClientId()
    {
        return __ClientId;
    }

    protected void setClientId( String value )
    {
        __ClientId = value;
    }

    /**
     * Indicates whether the partner credentials have expired or not.
     * 
     * @return True if credentials have expired. False if not.
     */
    @Override
    public boolean isExpired()
    {
        return this.getAADToken().isExpired();
    }

    /**
     * Authenticates with the partner service.
     * 
     * @return A task that is complete when authentication is finished.
     */
    public void authenticate()
    {
        authenticate( null );
    }

    public void authenticate( IRequestContext requestContext )
    {
        // Do nothing, leave it to sub classes
        return;
    }
}