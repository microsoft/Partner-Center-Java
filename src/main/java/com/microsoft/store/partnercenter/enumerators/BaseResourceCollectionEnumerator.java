// -----------------------------------------------------------------------
// <copyright file="BaseResourceCollectionEnumerator.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.enumerators;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceCollectionLinks;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;

/**
 * Base implementation for resource collection enumerators.
 */
public abstract class BaseResourceCollectionEnumerator<T extends ResourceBaseWithLinks<StandardResourceCollectionLinks>>
    extends BasePartnerComponentString
    implements IResourceCollectionEnumerator<T>
{
    private TypeReference<T> responseType;

    /**
     * The current resource collection.
     */
    private T resourceCollection = null;

    /**
     * Initializes a new instance of the BaseResourceCollectionEnumerator class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param resourceCollection The initial resource collection.
     * @param resourceCollectionConverter An optional converter.
     * @param responseType The type of the resource collection.
     */
    protected BaseResourceCollectionEnumerator( IPartner rootPartnerOperations, T resourceCollection,
                                                ObjectMapper resourceCollectionConverter,
                                                TypeReference<T> responseType )
    {
        super( rootPartnerOperations );
        if ( resourceCollection == null )
        {
            throw new IllegalArgumentException( "resourceCollection null" );
        }

        this.resourceCollection = resourceCollection;
        this.responseType = responseType;
    }

    /**
     * Gets whether the current collection is the first page of results or not.
     * 
     * @return A flag indicating whether the current collection is the first page of results or not.
     */
    @Override
    public boolean isFirstPage()
    {
        if ( !this.hasValue() )
        {
            throw new UnsupportedOperationException( "The enumerator does not have a current value" );
        }

        return this.getCurrent().getLinks() == null || this.getCurrent().getLinks().getPrevious() == null;
    }

    /**
     * Gets whether the current collection is the last page of results or not.
     * 
     * @return A flag indicating whether the current collection is the last page of results or not.
     */
    @Override
    public boolean isLastPage()
    {
        if ( !this.hasValue() )
        {
            throw new UnsupportedOperationException( "The enumerator does not have a current value" );
        }

        return this.getCurrent().getLinks() == null || this.getCurrent().getLinks().getNext() == null;
    }

    /**
     * Gets whether the current result collection has a value or not. This indicates if the collection has been fully
     * enumerated or not.
     * 
     * @return A flag indicating whether the current result collection has a value or not.
     */
    @Override
    public boolean hasValue()
    {
        return this.resourceCollection != null;
    }

    /**
     * The current resource collection.
     * 
     * @return The current resource collection.
     */
    @Override
    public T getCurrent()
    {
        return this.resourceCollection;
    }

    /**
     * Retrieves the next result set.
     */
    @Override
    public void next()
    {
        this.next( null );
    }

    /**
     * Retrieves the next result set.
     * 
     * @param context The request context.
     */
    @Override
    public void next( IRequestContext context )
    {
        if (!this.hasValue())
        {
            throw new UnsupportedOperationException( "The enumerator does not have a current value" );
        }

        if (this.isLastPage())
        {
            // we are done
            this.resourceCollection = null;
        }
        else
        {
            this.resourceCollection = this.getPartner().getServiceClient().get(
                this.getPartner(),
                responseType,
                this.resourceCollection.getLinks().getNext());
        }
    }

    /**
     * Retrieves the previous result set.
     */
    @Override
    public void previous()
    {
        this.previous(null);
    }

    /**
     * Retrieves the previous result set.
     * 
     * @param context The request context.
     */
    @Override
    public void previous( IRequestContext context )
    {
        if ( !this.hasValue() )
        {
            throw new UnsupportedOperationException( "The enumerator does not have a current value" );
        }

        if ( this.isFirstPage() )
        {
            // we are done
            this.resourceCollection = null;
        }
        else
        {
           this.resourceCollection = this.getPartner().getServiceClient().get(
                this.getPartner(),
                responseType,
                this.resourceCollection.getLinks().getPrevious());
        }
    }
}