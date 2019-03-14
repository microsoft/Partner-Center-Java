// -----------------------------------------------------------------------
// <copyright file="ISku.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Holds operations that can be performed on a single SKU.
 */
public interface ISku
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntityGetOperations<Sku>
{
    /**
     * Retrieves the operations for the current SKU's availabilities.
     * 
     * @return The operations for the current SKU's availabilities.
     */    
    IAvailabilityCollection getAvailabilities();

    /**
     * Retrieves the SKU information.
     * 
     * @return The SKUs information.
     */
    Sku get();
}