// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;

/**
 * Represents the behavior of partner service requests.
 */
public interface IPartnerServiceRequestCollection
    extends IServiceRequestCollection
{
    /**
     * Gets a set of operations that can be performed on Support Topics.
     * 
     * @return Collection of Support Topic Operations.
     */
    ISupportTopicsCollection getSupportTopics();

    /**
     * Creates a new ServiceRequest.
     * 
     * @param newEntity The new ServiceRequest information.
     * @param agentLocale The locale.
     * @return The ServiceRequest information that was just created.
     */
    ServiceRequest create( ServiceRequest newEntity, String agentLocale );
}
