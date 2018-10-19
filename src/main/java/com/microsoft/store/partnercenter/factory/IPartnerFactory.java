// -----------------------------------------------------------------------
// <copyright file="IPartnerFactory.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.factory;

import com.microsoft.store.partnercenter.IAggregatePartner;
import com.microsoft.store.partnercenter.IPartnerCredentials;

/**
 * Creates instances of {@link com.microsoft.store.partnercenter.IPartner}.
 */
public interface IPartnerFactory
{
    /**
     * Builds a {@link IAggregatePartner} instance and configures it using the provided partner credentials.
     * 
     * @param credentials The partner credentials. Use the extensions to obtain these.
     * @return A configured partner object.
     */
    IAggregatePartner build( IPartnerCredentials credentials );
}