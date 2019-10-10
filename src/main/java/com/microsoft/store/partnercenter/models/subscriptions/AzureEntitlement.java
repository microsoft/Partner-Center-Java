// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

/**
 * Represents an Azure entitlement.
 */
public class AzureEntitlement
{
    /**
     * The friendly name of the entitlement.
     */
    private String friendlyName;

    /**
     * The identifier of the entitlement.
     */
    private String id;

    /**
     * The subscription identifier for the entitlement.
     */
    private String subscriptionId;

    /**
     * The status of the entitlement.
     */
    private String status;

    /**
     * Gets the friendly name of the entitlement.
     * 
     * @return The friendly name of the entitlement.
     */
    public String getFriendlyName()
    {
        return friendlyName;
    }

    /**
     * Sets the friendly name of the entitlement.
     * 
     * @param value The friendly name of the entitlement.
     */
    public void setFriendlyName(String value)
    {
        friendlyName = value;
    }

    /**
     * Gets the identifier of the entitlement.
     * 
     * @return The identifier of the entitlement.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the identifier of the entitlement.
     * 
     * @param value The identifier of the entitlement.
     */
    public void setId(String value)
    {
        id = value;
    }

    /**
     * Gets the status of the entitlement.
     * 
     * @return The status of the entitlement.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the status of the entitlement.
     * 
     * @param value The status of the entitlement.
     */
    public void setStatus(String value)
    {
        status = value;
    }

    /**
     * Gets the subscription identifier for the entitlement.
     * 
     * @return The subscription identifier for the entitlement.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the subscription identifier for the entitlement.
     * 
     * @param value The subscription identifier for the entitlement.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value;
    }
}