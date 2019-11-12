// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

/**
 * Defines the estimated monetary cost of a subscription's resource level usage in the current billing cycle.
 */
public class ResourceUsageRecord
    extends UsageRecordBase
{
    /**
     * The identifier for the entitlement.
     */
    private String entitlementId ;

    /**
     * The name for the entitlement.
     */
    private String entitlementName ;

    /**
     * The name for the resource.
     */
    private String name;

    /**
     * The name for the resource group.
     */
    private String resourceGroupName;

    /**
     * The type of resource.
     */
    private String resourceType;

    /**
     * The URI for the resource.
     */
    private String resourceUri;

    /**
     * The identifier for the subscription.
     */
    private String subscriptionId;

    /**
     * Gets the identifier for the entitlement.
     * 
     * @return The identifier for the entitlement.
     */
    public String getEntitlementId()
    {
        return entitlementId;
    }

    /**
     * Sets the identifier for the entitlement.
     * 
     * @param value The identifier for the entitlement.
     */
    public void setEntitlementId(String value)
    {
        entitlementId = value; 
    }

    /**
     * Gets the name for the entitlement.
     * 
     * @return The name for the entitlement.
     */
    public String getEntitlementName()
    {
        return entitlementName;
    }

    /**
     * Sets the name for the entitlement.
     * 
     * @param value The name for the entitlement.
     */
    public void setEntitlementName(String value)
    {
        entitlementName = value; 
    }

    /**
     * Gets the name for the resource.
     * 
     * @return The name for the resource.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name for the resource.
     * 
     * @param value The name for the resource.
     */
    public void setName(String value)
    {
        name = value; 
    }

    /**
     * Gets the name for the resource group.
     * 
     * @return The name for the resource group.
     */
    public String getResourceGroupName()
    {
        return resourceGroupName;
    }

    /**
     * Sets the name for the resource group.
     * 
     * @param value The name for the resource group.
     */
    public void setResourceGroupName(String value)
    {
        resourceGroupName = value; 
    }

    /**
     * Gets the type of resource.
     * 
     * @return The type of resource.
     */
    public String getResourceType()
    {
        return resourceType;
    }

    /**
     * Sets the type of resource.
     * 
     * @param value The type of resource.
     */
    public void setResourceType(String value)
    {
        resourceType = value; 
    }

    /**
     * Gets the URI for the resource.
     * 
     * @return The URI for the resource.
     */
    public String getResourceUri()
    {
        return resourceUri;
    }

    /**
     * Sets the URI for the resource.
     * 
     * @param value The URI for the resource.
     */
    public void setResourceUri(String value)
    {
        resourceUri = value; 
    }

    /**
     * Gets the identifier for the subscription.
     * 
     * @return The identifier for the subscription.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the identifier for the subscription.
     * 
     * @param value The identifier for the subscription.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value; 
    }
}