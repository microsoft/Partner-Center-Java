// -----------------------------------------------------------------------
// <copyright file="OfferLinks.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Bundles offer links.
 */
public class OrderLinks
    extends StandardResourceLinks
{
    /**
     * The link to the patch operation.
     */
    private Link patchOperation;

    /**
     * The link to the provisioning status of an order.
     */
    private Link provisioningStatus;

    /**
     * Gets the link to the patch operation of an order.
     * 
     * @return The link to the patch operation of an oder.
     */
    public Link getPatchOperation()
    {
        return patchOperation;
    }

    /**
     * Sets the link to the patch operation of an order.
     * 
     * @param value The link to the patch operation of an order.
     * @return The link to the patch operation of an order.
     */
    public void setPatchOperation(Link value)
    {
        patchOperation = value;
    }

    /**
     * Gets the link to the provisioning status of an order.
     * 
     * @return The link to the provisioning status of an oder.
     */
    public Link getProvisioningStatus()
    {
        return provisioningStatus;
    }

    /**
     * Sets the link to the provisioning status of an order.
     * 
     * @param value The link to the provisioning status of an order.
     * @return The link to the provisioning status of an order.
     */
    public void setProvisioningStatus(Link value)
    {
        provisioningStatus = value;
    }
}