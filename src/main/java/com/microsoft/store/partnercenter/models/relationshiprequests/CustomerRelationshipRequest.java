// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.relationshiprequests;

import java.net.URI;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a customer relationship request with a partner.
 */
public class CustomerRelationshipRequest
    extends ResourceBase
{
    private URI __Url;

    /**
     * Gets the URL to be used by the customer to establish a relationship with a partner.
     * 
     * @return The URL to be used by the customer to establish a relationship with a partner.
     */
    public URI getUrl()
    {
        return __Url;
    }

    /**
     * Sets the URL to be used by the customer to establish a relationship with a partner.
     * 
     * @param value The URL to be used by the customer to establish a relationship with a partner.
     */
    public void setUrl(URI value)
    {
        __Url = value;
    }
}