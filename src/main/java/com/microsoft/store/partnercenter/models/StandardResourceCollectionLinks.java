// -----------------------------------------------------------------------
// <copyright file="StandardResourceCollectionLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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
    private Link __Next;

    public Link getNext()
    {
        return __Next;
    }

    public void setNext( Link value )
    {
        __Next = value;
    }

    /**
     * Gets or sets the previous page of items.
     */
    private Link __Previous;

    public Link getPrevious()
    {
        return __Previous;
    }

    public void setPrevious( Link value )
    {
        __Previous = value;
    }

}
