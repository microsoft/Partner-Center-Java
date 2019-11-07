// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.offers.Product;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Represents the operations that can be performed on a single product.
 */
public interface ICustomerProduct   
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntityGetOperations<Product>
{
    /**
     * Gets the operations that can be applied on a customer's product identifiers filtered by a specific reservation scope.
     * 
     * @param reservationScope The reservation scope filter.
     * @return The individual product operations sorted by reservation scope.
     */
    ICustomerProductByReservationScope ByCustomerReservationScope(String reservationScope);
}