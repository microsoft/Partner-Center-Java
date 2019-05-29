// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.ResourceCollection;

/**
 * A generic interface which represents paged entity retrieval operations. The entity type.The entity collection type.
 */
public interface IPagedEntityCollectionRetrievalOperations<T extends ResourceBase, TResourceCollection extends ResourceCollection<T>>
{
    /**
     * Retrieves a subset of entities.
     *
     * @param offset The starting index.
     * @param size The maximum number of entities to return.
     * @return The requested entities subset.
     */
    TResourceCollection get( int offset, int size );

}
