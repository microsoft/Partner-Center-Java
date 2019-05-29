// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Groups operations for getting a single entity. The entity type.
 */
public interface IEntityDeleteOperations<T extends ResourceBase>
{
    /**
     * Deletes an entity.
     */
    void delete();
}