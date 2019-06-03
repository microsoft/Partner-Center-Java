// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Groups operations for getting a single entity. The entity type.
 */
public interface IEntityPatchOperations<T extends ResourceBase>
{
    /**
     * Patches an entity.
     * 
     * @param entity The entity information.
     * @return The updated entity.
     */
    T patch(T entity);
}