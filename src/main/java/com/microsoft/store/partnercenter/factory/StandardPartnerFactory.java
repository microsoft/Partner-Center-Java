// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.factory;

import com.microsoft.store.partnercenter.AggregatePartnerOperations;
import com.microsoft.store.partnercenter.IAggregatePartner;
import com.microsoft.store.partnercenter.IPartnerCredentials;

/**
 * Standard implementation of the partner factory.
 */
public class StandardPartnerFactory
    implements IPartnerFactory
{
    /**
     * Builds an IAggregatePartner instance and configures it using the provided partner credentials.
     * 
     * @param credentials The partner credentials. Use the extensions to obtain these.
     * @return A configured partner object.
     */
    @Override
    public IAggregatePartner build(IPartnerCredentials credentials)
    {
        return new AggregatePartnerOperations(credentials);
    }
}