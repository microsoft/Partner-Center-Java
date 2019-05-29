// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter;

import com.microsoft.store.partnercenter.utils.StringHelper;

import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 * Represents an authentication token for a resource.
 */
public final class AuthenticationToken
{
    /**
     * Initializes a new instance of the AuthenticationToken class.
     * 
     * @param token The authentication token.
     * @param expiryTime The token expiry time.
     */
    public AuthenticationToken(String token, DateTime expiryTime)
    {
        if (StringHelper.isNullOrWhiteSpace(token))
        {
            throw new IllegalArgumentException("token cannot be empty");
        }

        this.setToken(token);
        this.setExpiryTime(expiryTime);
        this.setExpiryBuffer(Duration.standardSeconds(PartnerService.getInstance().getConfiguration().getDefaultAuthenticationTokenExpiryBufferInSeconds()));
    }

    /**
     * Gets the token.
     */
    private String token;

    public String getToken()
    {
        return token;
    }

    private void setToken(String value)
    {
        token = value;
    }

    /**
     * Gets the token expiry time.
     */
    private DateTime expiryTime;

    public DateTime getExpiryTime()
    {
        return expiryTime;
    }

    private void setExpiryTime(DateTime value)
    {
        expiryTime = value;
    }

    /**
     * Gets or sets the amount of time to deduct from the actual expiry time in order to give time for processing
     * without letting the token expire while processing is still in progress.
     */
    private Duration expiryBuffer;

    public Duration getExpiryBuffer()
    {
        return expiryBuffer;
    }

    public void setExpiryBuffer(Duration value)
    {
        expiryBuffer = value;
    }

    /**
     * Indicates whether the token has expired or not.
     * 
     * @return true if token has expired; otherwise false.
     */
    public boolean isExpired()
    {
        return DateTime.now().isAfter(this.getExpiryTime().minus(getExpiryBuffer()));
    }
}