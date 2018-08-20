// -----------------------------------------------------------------------
// <copyright file="IEntitySelector.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.genericoperations;

public interface IEntitySelector<TEntity>
{
    /***
     * Retrieves the behavior for an entity using the entity's ID.
     * @param id: The entity's ID.
     * @return: The entity's behavior.
     */
    TEntity byId( String id );
}
