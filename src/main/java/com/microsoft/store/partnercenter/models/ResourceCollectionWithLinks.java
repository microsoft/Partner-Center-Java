// -----------------------------------------------------------------------
// <copyright file="ResourceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains a collection of resources with JSON properties to represent the output Type of objects in collection
 */
public class ResourceCollectionWithLinks<TResource, TLinks>
    extends ResourceBaseWithLinks<TLinks>
{
    public ResourceCollectionWithLinks()
    {
        super( "Collection" );
        this.items = new ArrayList<TResource>();
    }

    /**
     * The collection items
     */
    private List<TResource> items;

    /**
     * Initializes a new instance of the ResourceCollection class.
     * 
     * @param items The items.
     */
    public ResourceCollectionWithLinks( List<TResource> items )
    {
        super( "Collection" );
        this.items = items;
    }

    /**
     * Initializes a new instance of the ResourceCollection class.
     * 
     * @param resourceCollection The resource collection.
     */
    protected ResourceCollectionWithLinks( ResourceCollectionWithLinks<TResource, TLinks> resourceCollection )
    {
        super( "Collection" );
        if ( resourceCollection == null )
        {
            throw new IllegalArgumentException( "resourceCollection" );
        }

        this.items = resourceCollection.items;
    }

    private int totalCount;

    /**
     * Gets the total count.
     * 
     * @return The total count.
     */
    public int getTotalCount()
    {
        return this.totalCount;
    }

    public void setTotalCount( int value )
    {
        this.totalCount = value;
    }

    /**
     * Gets the collection items.
     * 
     * @return The items in the collection.
     */
    public Iterable<TResource> getItems()
    {
        return this.items;
    }

    /**
     * Sets the collection items.
     * 
     * @param value The items in the collection.
     */
    public void setItems( List<TResource> value )
    {
        this.items = value;
    }

    /**
     * Converts this object to a string.
     * 
     * @return A string that represents this object.
     */
    @Override
    public String toString()
    {
        StringBuilder collectionDescription = new StringBuilder();
        collectionDescription.append( "Count: " + this.getTotalCount() + "\n" );
        if ( this.getItems() != null )
        {
            collectionDescription.append( "Items:\n" );
            for ( TResource item : this.getItems() )
            {
                collectionDescription.append( item.toString() + "\n" );
            }
        }

        return collectionDescription.toString();
    }
}