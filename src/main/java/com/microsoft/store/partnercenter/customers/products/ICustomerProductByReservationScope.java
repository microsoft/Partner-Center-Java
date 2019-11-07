// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.offers.Product;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Represents operations that can be performed on a single product filtered by reservation scope.
 */
public interface ICustomerProductByReservationScope  
    extends IPartnerComponent<TripletTuple<String, String, String>>,
    IEntityGetOperations<Product>
{
}