// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.subscriptions.SubscriptionProvisioningStatus;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the operations available on a customer's subscription registrations.
 */
public interface ISubscriptionProvisioningStatus
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<SubscriptionProvisioningStatus>
{
    /**
     * Retrieves all subscription provisioning status details.
     * 
     * @return The subscription provisioning status details.
     */
    SubscriptionProvisioningStatus get();
}