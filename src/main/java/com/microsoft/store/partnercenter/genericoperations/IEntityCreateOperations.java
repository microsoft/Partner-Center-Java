// -----------------------------------------------------------------------
// <copyright file="IEntityCreateOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Groups operations for creating a single entity. The entity type request.The entity type response.
 */
public interface IEntityCreateOperations<T, T1>
{
    /**
     * Creates a new entity.
     * 
     * @param newEntity The new entity information.
     * @return The entity information that was just created.
     */
    T1 create( T newEntity );
}