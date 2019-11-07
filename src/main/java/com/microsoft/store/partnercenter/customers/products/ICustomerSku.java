// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.products.ISku;

/**
 * Represents the operations that can be performed on a single SKU.
 */
public interface ICustomerSku 
    extends ISku
{
    /**
     * Gets the operations that can be applied on a customer's SKU identifiers filtered by a specific reservation scope.
     * 
     * @param reservationScope The reservation scope filter.
     * @return The individual SKU operations sorted by reservation scope.
     */
    ICustomerSkuByReservationScope byCustomerReservationScope(String reservationScope);
}