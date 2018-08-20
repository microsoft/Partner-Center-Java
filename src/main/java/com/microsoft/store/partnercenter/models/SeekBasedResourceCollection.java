// -----------------------------------------------------------------------
// <copyright file="SeekBasedResourceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Paged Resource Collection Type of objects in collection
 */
public class SeekBasedResourceCollection<T>
    extends ResourceCollection<T>
{
    /**
     * Initializes a new instance of the {@link #SeekBasedResourceCollection{T}} class.
     * 
     * @param items The items collection.
     */
    @JsonCreator
    public SeekBasedResourceCollection(@JsonProperty("items")  List<T> items )

    {
        super( items );
    }

    /**
     * Initializes a new instance of the {@link #SeekBasedResourceCollection{T}} class.
     * 
     * @param resourceCollection The resource collection.
     */
    public SeekBasedResourceCollection( ResourceCollection<T> resourceCollection )

    {
        super( resourceCollection );
    }

    /**
     * Initializes a new instance of the {@link #SeekBasedResourceCollection{T}} class.
     * 
     * @param items The items.
     * @param continuationToken The continuation token.
     */
    public SeekBasedResourceCollection( List<T> items, String continuationToken )

    {
        this( items );
        this.setContinuationToken( continuationToken );
    }

    /**
     * Gets or sets the continuation token.
     */
    private String __ContinuationToken = new String();

    public String getContinuationToken()
    {
        return __ContinuationToken;
    }

    public void setContinuationToken( String value )
    {
        __ContinuationToken = value;
    }

}
