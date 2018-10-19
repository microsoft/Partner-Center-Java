// -----------------------------------------------------------------------
// <copyright file="ResourceBase.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Base class for resources
 */
public abstract class ResourceBase
{
    /**
     * The resource attributes.
     */
    private final ResourceAttributes attributes;

    /**
     * Initializes a new instance of the ResourceBase class.
     */
    protected ResourceBase()
    {
        this.attributes = new ResourceAttributes( this.getClass() );
    }

    /**
     * Initializes a new instance of the ResourceBase class.
     * 
     * @param objectType Type of the object.
     */
    protected ResourceBase( String objectType )
    {
        this();
        this.attributes.setObjectType( objectType );
    }

    /**
     * Gets the attributes.
     * 
     * @return The resource attributes.
     */
    public ResourceAttributes getAttributes()
    {
        return this.attributes;
    }
}
