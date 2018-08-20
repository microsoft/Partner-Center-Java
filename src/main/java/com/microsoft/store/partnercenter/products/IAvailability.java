// -----------------------------------------------------------------------
// <copyright file="IAvailability" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;

/**
 * Holds operations that can be performed on availabilities.
 */
public interface IAvailability
    extends IPartnerComponent<QuadrupleTuple<String, String, String, String>>,
    IEntityGetOperations<Availability>
{
    /***
     * Retrieves the availability information.
     * 
     * @return: The availability information.
     */
    Availability get();
}