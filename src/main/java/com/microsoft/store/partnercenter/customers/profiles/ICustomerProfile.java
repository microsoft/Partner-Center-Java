// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.profiles;

import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Encapsulates a single customer profile behavior. The type of the customer profile.
 */
public interface ICustomerProfile<T extends ResourceBase>
    extends ICustomerReadonlyProfile<T>, IEntityUpdateOperations<T>
{
    /**
     *  Updates the customer profile.
     * 
     * @param customerProfile The customer profile information.
     * @return The updated customer profile.
     */
    T update( T customerProfile );
}