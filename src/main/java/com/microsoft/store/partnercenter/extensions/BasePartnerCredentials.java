// -----------------------------------------------------------------------
// <copyright file="BasePartnerCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
     * Initializes a new instance of the BasePartnerCredentials class.
     * 
     * @param clientId The Azure Active Directory client Id.
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
     * 
     * @return The partner service token.
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

    private AuthenticationToken __AADToken;

    /**
     * Gets the Azure Active Directory token.
     * 
     * @return The Azure Active Directory token.
     */
    protected AuthenticationToken getAADToken()
    {
        return __AADToken;
    }

    /**
     * Sets the Azure Active Directory token.
     * 
     * @param value The Azure Active Directory token.
     */
    protected void setAADToken( AuthenticationToken value )
    {
        __AADToken = value;
    }

    private String __ClientId;
    
    /**
     * Gets the Azure Active Directory client identifier.
     *
     * @return The Azure Active Directory client identifier.
     */
    protected String getClientId()
    {
        return __ClientId;
    }

    /**
     * Sets the Azure Active Directory client identifier.
     * 
     * @param value The Azure Active Directory client identifier.
     */
    protected void setClientId( String value )
    {
        __ClientId = value;
    }

    /**
     * Indicates whether the partner credentials have expired or not.
     * 
     * @return true if credentials have expired; othwerise, false.
     */
    @Override
    public boolean isExpired()
    {
        return this.getAADToken().isExpired();
    }

    /**
     * Authenticates with the partner service.
     */
    public void authenticate()
    {
        authenticate( null );
    }

    /**
     * Authenticates with the partner service.
     * 
     * @param requestContext The request context.
     */
    public void authenticate( IRequestContext requestContext )
    {
        // Do nothing, leave it to sub classes
        return;
    }
}