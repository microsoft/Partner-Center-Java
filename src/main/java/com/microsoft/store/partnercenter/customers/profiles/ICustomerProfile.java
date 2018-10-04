// -----------------------------------------------------------------------
// <copyright file="ICustomerProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.profiles;

import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Encapsulates a single customer profile behavior. The type of the customer profile.
 */
public interface ICustomerProfile<T extends ResourceBase>
    extends ICustomerReadonlyProfile<T>, IEntityUpdateOperations<T>
{
    /***
     *  Updates the customer profile.
     * @param customerProfile The customer profile information.
     * @return The updated customer profile.
     */
    T update( T customerProfile );
}