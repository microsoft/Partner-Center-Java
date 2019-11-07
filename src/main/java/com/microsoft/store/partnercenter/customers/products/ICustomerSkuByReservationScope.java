// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;

/**
 * Represents the operations that can be performed on a customer's single sku filtered by reservation scope.
 */
public interface ICustomerSkuByReservationScope 
    extends IPartnerComponent<QuadrupleTuple<String, String, String, String>>,
    IEntityGetOperations<Sku>
{
}