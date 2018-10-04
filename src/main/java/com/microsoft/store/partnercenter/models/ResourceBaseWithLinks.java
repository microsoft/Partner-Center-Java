// -----------------------------------------------------------------------
// <copyright file="ResourceBaseWithLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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
        //this.__Links = new TLinks();
    }

    /**
     * Initializes a new instance of the ResourceBaseWithLinks class.
     */
    protected ResourceBaseWithLinks()
    {
        super();
    }

    /**
     * Gets or sets the links.
     */
    public TLinks __Links;

    public TLinks getLinks()
    {
        return __Links;
    }

    public void setLinks( TLinks value )
    {
        __Links = value;
    }

}
