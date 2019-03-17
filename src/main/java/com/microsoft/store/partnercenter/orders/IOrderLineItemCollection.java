// -----------------------------------------------------------------------
// <copyright file="IOrderLineItemCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the available order line item collection operations.
 */
public interface IOrderLineItemCollection
    extends IPartnerComponent<Tuple<String, String>>, IEntitySelector<Integer, IOrderLineItem>
{
}