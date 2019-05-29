// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.genericoperations;

public interface IEntitySelector<TTYpe, TEntity>
{
    /**
     * Retrieves the behavior for an entity using the entity's identifier.
     * @param id The entity's identifier.
     * @return The entity's behavior.
     */
    TEntity byId(TTYpe id);
}