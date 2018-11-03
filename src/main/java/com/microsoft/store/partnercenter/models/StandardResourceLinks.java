// -----------------------------------------------------------------------
// <copyright file="StandardResourceLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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

    public void setSelf( Link value )
    {
        self = value;
    }
}