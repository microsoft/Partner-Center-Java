// -----------------------------------------------------------------------
// <copyright file="IPartnerServiceRequestCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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
