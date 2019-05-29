// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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