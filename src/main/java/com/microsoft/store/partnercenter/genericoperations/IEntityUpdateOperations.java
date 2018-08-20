// -----------------------------------------------------------------------
// <copyright file="IEntityUpdateOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Groups operations for updating a single entity. The entity type.
 */
public interface IEntityUpdateOperations<T>
{
    /**
     * Updates an entity.
     * 
     * @param entity The entity information.
     * @return The updated entity.
     */
    T update( T entity );
}
