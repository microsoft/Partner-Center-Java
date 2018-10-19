// -----------------------------------------------------------------------
// <copyright file="IDomain.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.domains;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityExistsOperations;

public interface IDomain extends IPartnerComponentString, IEntityExistsOperations
{
    /**
     * Checks if the domain is available or not.
     * 
     * @return true if the domain exists, false otherwise.
     */
    boolean exists();
}