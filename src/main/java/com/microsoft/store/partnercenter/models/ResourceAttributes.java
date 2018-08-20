// -----------------------------------------------------------------------
// <copyright file="ResourceAttributes.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Refers to the common object attributes
 */
public class ResourceAttributes
{
    /**
     * Initializes a new instance of the {@link #ResourceAttributes} class.
     * 
     * @param type The type.
     */
    public ResourceAttributes( Class<?> type )
    {
        if ( type != null )
        {
            this.setObjectType( type.getSimpleName() );
        }

    }

    /**
     * Initializes a new instance of the {@link #ResourceAttributes} class without any values set.
     */
    public ResourceAttributes()
    {
    }

    /**
     * Gets or sets the etag. the object version in providers
     */
    private String __Etag;

    public String getEtag()
    {
        return __Etag;
    }

    public void setEtag( String value )
    {
        __Etag = value;
    }

    /**
     * Gets or sets the object type.
     */
    private String __ObjectType;

    public String getObjectType()
    {
        return __ObjectType;
    }

    public void setObjectType( String value )
    {
        __ObjectType = value;
    }

}
