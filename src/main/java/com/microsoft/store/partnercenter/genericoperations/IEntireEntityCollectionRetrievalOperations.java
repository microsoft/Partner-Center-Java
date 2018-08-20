// -----------------------------------------------------------------------
// <copyright file="IEntireEntityCollectionRetrievalOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

import com.microsoft.store.partnercenter.models.ResourceCollection;

/**
 * A generic interface which represents operations for getting an entire collection of entities. The entity type.The
 * entity collection type.
 */
public interface IEntireEntityCollectionRetrievalOperations<T, TResourceCollection extends ResourceCollection<T>>
{
    /**
     * Retrieves all entities.
     * 
     * @return The entities.
     */
    TResourceCollection get();

}
