// -----------------------------------------------------------------------
// <copyright file="ResourceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains a collection of resources with JSON properties to represent the output Type of objects in collection
 */
public class ResourceCollection<TResource>
    extends ResourceCollectionWithLinks<TResource, StandardResourceCollectionLinks>
{
    /**
     * Initializes a new instance of the ResourceCollection class.
     * 
     * @param items The items.
     */
    @JsonCreator
    public ResourceCollection(@JsonProperty("items") List<TResource> items )
    {
        super( items );
    }

    /**
     * Initializes a new instance of the ResourceCollection class.
     * 
     * @param resourceCollection The resource collection.
     */
    protected ResourceCollection( ResourceCollection<TResource> resourceCollection )
    {
    	super(resourceCollection);
    }
}