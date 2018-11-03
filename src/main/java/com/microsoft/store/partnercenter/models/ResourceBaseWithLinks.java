// -----------------------------------------------------------------------
// <copyright file="ResourceBaseWithLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Base class for resources
 */
public abstract class ResourceBaseWithLinks<TLinks>
    extends ResourceBase
{
    /**
     * Initializes a new instance of the ResourceBaseWithLinks class.
     * 
     * @param objectType Type of the object.
     */
    protected ResourceBaseWithLinks( String objectType )
    {
        super( objectType );
    }

    /**
     * Initializes a new instance of the ResourceBaseWithLinks class.
     */
    protected ResourceBaseWithLinks()
    {
        super();
    }

    private TLinks links;

    /**
     * Gets the links.
     * 
     * @return The links.
     */
    public TLinks getLinks()
    {
        return links;
    }

    /**
     * Sets the links.
     * 
     * @param value The links.
     */
    public void setLinks( TLinks value )
    {
        links = value;
    }
}