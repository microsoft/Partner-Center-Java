// -----------------------------------------------------------------------
// <copyright file="IEntitySelector.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

public interface IEntitySelector<TType, TEntity>
{
    /**
     * Retrieves the behavior for an entity using the entity's identifier.
     * @param id The entity's identifier.
     * @return The entity's behavior.
     */
    TEntity byId( TType id );
}