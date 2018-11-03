// -----------------------------------------------------------------------
// <copyright file="StandardResourceCollectionLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Represents the links associated with a resource.
 */
public class StandardResourceCollectionLinks extends StandardResourceLinks
{
    /**
     * Gets or sets the next page of items.
     */
    private Link next;

    public Link getNext()
    {
        return next;
    }

    public void setNext( Link value )
    {
        next = value;
    }

    /**
     * Gets or sets the previous page of items.
     */
    private Link previous;

    public Link getPrevious()
    {
        return previous;
    }

    public void setPrevious( Link value )
    {
        previous = value;
    }

}
