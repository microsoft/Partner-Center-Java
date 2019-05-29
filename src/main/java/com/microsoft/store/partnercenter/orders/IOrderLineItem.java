// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Represents the available order line item operations.
 */
public interface IOrderLineItem
    extends IPartnerComponent<TripletTuple<String, String, Integer>>
{
    /**
     * Gets the available customer order line item activation link operations.
     * 
     * @return The available customer order line item activation link operations.
     */
    IOrderLineItemActivationLink getActivationLink();
}