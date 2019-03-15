// -----------------------------------------------------------------------
// <copyright file="IOrderProvisioningStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemProvisioningStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the available order provisioning status operations.
 */
public interface IOrderProvisioningStatus
    extends IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<OrderLineItemProvisioningStatus, ResourceCollection<OrderLineItemProvisioningStatus>>
{
}