// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models;

/**
 * Refers to the common object attributes
 */
public class ResourceAttributes
{
    /**
     * Initializes a new instance of the ResourceAttributes class.
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
     * Initializes a new instance of the ResourceAttributes class without any values set.
     */
    public ResourceAttributes()
    {
    }

    /**
     * Gets or sets the etag. the object version in providers
     */
    private String etag;

    public String getEtag()
    {
        return etag;
    }

    public void setEtag( String value )
    {
        etag = value;
    }

    /**
     * Gets or sets the object type.
     */
    private String objectType;

    public String getObjectType()
    {
        return objectType;
    }

    public void setObjectType( String value )
    {
        objectType = value;
    }

}
