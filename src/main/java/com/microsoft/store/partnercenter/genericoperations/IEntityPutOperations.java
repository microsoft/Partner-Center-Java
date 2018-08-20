// -----------------------------------------------------------------------
// <copyright file="IEntityPutOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Groups operations for updating a single entity.
 */
public interface IEntityPutOperations<T>
{
    /**
     * Updates an entity.
     * 
     * @return The updated entity.
     */
    T put(T entity);
}