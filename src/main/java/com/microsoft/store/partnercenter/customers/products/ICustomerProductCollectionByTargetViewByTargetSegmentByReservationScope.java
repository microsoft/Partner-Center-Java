// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Product;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;

/**
 * Represents the operations that can be performed on products in a given product collection and that apply to a given customer, filtered by reservation scope.
 */
public interface ICustomerProductCollectionByTargetViewByTargetSegmentByReservationScope 
    extends IPartnerComponent<QuadrupleTuple<String, String, String, String>>,
    IEntireEntityCollectionRetrievalOperations<Product, ResourceCollection<Product>>
{
}