// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

/**
 * Groups operations for updating a single entity.
 */
public interface IEntityPutOperations<T>
{
    /**
     * Updates an entity.
     * 
     * @param entity The modified entity object. 
     * @return The updated entity.
     */
    T put(T entity);
}