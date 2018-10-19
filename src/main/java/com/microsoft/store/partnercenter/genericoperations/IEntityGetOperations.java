// -----------------------------------------------------------------------
// <copyright file="IEntityGetOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Groups operations for getting a single entity. The entity type.
 */
public interface IEntityGetOperations<T>
{
    /**
     * Retrieves an entity.
     * 
     * @return The entity.
     */
    T get();
}