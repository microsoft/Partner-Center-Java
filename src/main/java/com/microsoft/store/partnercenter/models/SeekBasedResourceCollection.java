// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * Initializes a new instance of the SeekBasedResourceCollection class.
     * 
     * @param items The items collection.
     */
    @JsonCreator
    public SeekBasedResourceCollection(@JsonProperty("items")  List<T> items )
    {
        super( items );
    }

    /**
     * Initializes a new instance of the SeekBasedResourceCollection class.
     * 
     * @param resourceCollection The resource collection.
     */
    public SeekBasedResourceCollection( ResourceCollection<T> resourceCollection )
    {
        super( resourceCollection );
    }

    /**
     * Initializes a new instance of the SeekBasedResourceCollection class.
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
    private String continuationToken;

    public String getContinuationToken()
    {
        return continuationToken;
    }

    public void setContinuationToken( String value )
    {
        continuationToken = value;
    }
}