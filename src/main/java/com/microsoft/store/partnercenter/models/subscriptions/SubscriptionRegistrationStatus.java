// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * The subscription provisioning status details.
 */
public class SubscriptionRegistrationStatus
    extends ResourceBase
{
    /**
     * Gets or sets a GUID formatted string that identifies the subscription.
     */
    private String __SubscriptionId;

    public String getSubscriptionId()
    {
        return __SubscriptionId;
    }

    public void setSubscriptionId(String value)
    {
        __SubscriptionId = value;
    }

    /**
     * Gets or sets a value indicating whether this subscription is registered.
     */
    private String __Status;

    public String getStatus()
    {
        return __Status;
    }

    public void setStatus(String value)
    {
        __Status = value;
    }
}