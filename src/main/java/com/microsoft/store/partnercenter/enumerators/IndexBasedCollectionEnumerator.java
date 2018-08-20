// -----------------------------------------------------------------------
// <copyright file="IndexBasedCollectionEnumerator.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.enumerators;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.ResourceCollection;

/**
 * Enumerator for index based pagination Index based - Paged query where index and page size is used. The type of
 * resource /// The type of resource collection.
 */
public class IndexBasedCollectionEnumerator<T extends ResourceBase, TResourceCollection extends ResourceCollection<T>>
    extends BaseResourceCollectionEnumerator<TResourceCollection>
{
    /**
     * Initializes a new instance of the {@link #IndexBasedCollectionEnumerator{T, TResourceCollection}} class.
     * 
     * @param partnerOperations A partner operations instance.
     * @param pagedResourceCollection The paged resource collection to enumerate from.
     * @param resourceCollectionConverter Optional: The resource collection converter.
     */
    public IndexBasedCollectionEnumerator( IPartner partnerOperations,
                                           TResourceCollection pagedResourceCollection,
                                           ObjectMapper resourceCollectionConverter,
                                           TypeReference<TResourceCollection> responseType )
    {
        super( partnerOperations, pagedResourceCollection, resourceCollectionConverter, responseType );
    }

}
