// -----------------------------------------------------------------------
// <copyright file="IPartnerCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * The credentials needed to access the partner API service.
 */
public interface IPartnerCredentials
{
    /**
     * Gets the token needed to authenticate with the partner API service.
     */
    String getPartnerServiceToken();

    /**
     * Gets the expiry time in UTC for the token.
     */
    DateTime getExpiresAt();

    /**
     * Indicates whether the partner credentials have expired or not.
     * 
     * @return True if credentials have expired. False if not.
     */
    boolean isExpired();

    void onCredentialsRefreshNeeded( IPartnerCredentials credentials, IRequestContext context );
}