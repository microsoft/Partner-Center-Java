// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemProvisioningStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Represents the operations that apply Order provisioning status.
 */
public interface IOrderProvisioningStatus
    extends  IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<OrderLineItemProvisioningStatus, ResourceCollection<OrderLineItemProvisioningStatus>>
{
}