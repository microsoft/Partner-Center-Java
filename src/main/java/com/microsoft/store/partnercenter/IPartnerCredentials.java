// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * The credentials needed to access the partner service.
 */
public interface IPartnerCredentials
{
    /**
     * Gets the token needed to authenticate with the partner service.
     * 
     * @return The token needed to authenticate with the partner service. 
     */
    String getPartnerServiceToken();

    /**
     * Gets the expiry time in UTC for the token.
     * 
     * @return The expiry time in UTC for the token.
     */
    DateTime getExpiresAt();

    /**
     * Indicates whether the partner credentials have expired or not.
     * 
     * @return true if credentials have expired; otherwise false. 
     */
    boolean isExpired();

    /**
     * Called when a partner credentials needs to be refreshed.
     * 
     * @param credentials The outdated partner credentials.
     * @param context The request context.
     */
    void onCredentialsRefreshNeeded(IPartnerCredentials credentials, IRequestContext context);
}