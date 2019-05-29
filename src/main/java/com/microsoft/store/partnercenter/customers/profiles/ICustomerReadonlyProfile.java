// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.profiles;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * 
 * Encapsulates a single customer read-only profile behavior.
 */
public interface ICustomerReadonlyProfile<T extends ResourceBase> 
	extends IPartnerComponentString, IEntityGetOperations<T> 
{
    /** 
     * Retrieves the customer profile.
     * @return The customer profile.
     */
    T get();
}