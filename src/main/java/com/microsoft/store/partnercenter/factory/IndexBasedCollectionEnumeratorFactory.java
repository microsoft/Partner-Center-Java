// -----------------------------------------------------------------------
// <copyright file="IndexBasedCollectionEnumeratorFactory.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.factory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.enumerators.IResourceCollectionEnumerator;
import com.microsoft.store.partnercenter.enumerators.IndexBasedCollectionEnumerator;
import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.ResourceCollection;

/**
 * Factory method for creating a new instance of index based collection enumerator. 
 */
public class IndexBasedCollectionEnumeratorFactory<T extends ResourceBase, TResourceCollection extends ResourceCollection<T>>
    extends BasePartnerComponentString
    implements IResourceCollectionEnumeratorFactory<TResourceCollection>
{
    private TypeReference<TResourceCollection> responseType;

    /**
     * Initializes a new instance of the IndexBasedCollectionEnumeratorFactory class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param responseType The type of resource.
     */
    public IndexBasedCollectionEnumeratorFactory( IPartner rootPartnerOperations, TypeReference<TResourceCollection> responseType )
    {
        super( rootPartnerOperations );
        this.responseType = responseType;
    }

    /**
     * Creates a index based collection enumerator capable of traversing resources that uses offset and page size for
     * pagination.
     * 
     * @param resourceCollection The initial resource collection to start from.
     * @return A customer collection enumerator capable of traversing customers.
     */
    @Override
    public IResourceCollectionEnumerator<TResourceCollection> create( TResourceCollection resourceCollection )
    {
        return new IndexBasedCollectionEnumerator<T, TResourceCollection>(
            this.getPartner(),
            resourceCollection, 
            null,
            responseType );
    }
}