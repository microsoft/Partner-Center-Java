// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models;

/**
 * Represents the links associated with a resource.
 */
public class StandardResourceLinks
{
    /**
     * Gets or sets the self uri.
     */
    private Link self;

    public Link getSelf()
    {
        return self;
    }

    public void setSelf(Link value)
    {
        self = value;
    }
}