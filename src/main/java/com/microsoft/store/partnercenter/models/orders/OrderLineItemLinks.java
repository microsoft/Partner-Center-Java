// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.Link;

/**
 * Bundles the links for an order line item.
 */
public class OrderLineItemLinks
{
    /**
     * The activation links for the order line item.
     */
    private Link activationLinks;

    /**
     * The availability link for the order line item.
     */
    private Link availability;

    /**
     * The product link for the order line item.
     */
    private Link product;

    /**
     * The provisioning status link for the order line item.
     */
    private Link provisioningStatus;

    /**
     * The SKU link for the order line item.
     */
    private Link sku;

    /**
     * The subscription link for the order line item.
     */
    private Link subscription;

    /**
     * Gets the activation links for the order line item.
     * 
     * @return The activation links for the order line item.
     */
    public Link getActivationLinks()
    {
        return activationLinks;
    }

    /**
     * Sets the activation links for the order line item.
     * 
     * @param value The activation lLinks for the order line item.
     */
    public void setActivationLinks(Link value)
    {
        activationLinks = value;
    }

    /**
     * Gets the availability link for the order line item.
     * 
     * @return The availability link for the order line item.
     */
    public Link getAvailability()
    {
        return availability;
    }

    /**
     * Sets the availability link for the order line item.
     * 
     * @param value The availability link for the order line item.
     */
    public void setAvailability(Link value)
    {
        availability = value;
    }

    /**
     * Gets the product link for the order line item.
     * 
     * @return The product link for the order line item.
     */
    public Link getProduct()
    {
        return product;
    }

    /**
     * Sets the product link for the order line item.
     * 
     * @param value The product link for the order line item.
     */
    public void setProduct(Link value)
    {
        product = value;
    }

    /**
     * Gets the provisioning status link for the order line item.
     * 
     * @return The provisioning status link for the order line item.
     */
    public Link getProvisioningStatus()
    {
        return provisioningStatus;
    }

    /**
     * Sets the provisioning status link for the order line item.
     * 
     * @param value The provisioning status link for the order line item.
     */
    public void setProvisioningStatus(Link value)
    {
        provisioningStatus = value;
    }

        /**
     * Gets the SKU link for the order line item.
     * 
     * @return The SKU link for the order line item.
     */
    public Link getSku()
    {
        return sku;
    }

    /**
     * Sets the SKU link for the order line item.
     * 
     * @param value The SKU link for the order line item.
     */
    public void setSku(Link value)
    {
        sku = value;
    }

    /**
     * Gets the subscription link for the order line item.
     * 
     * @return The subscription link for the order line item.
     */
    public Link getSubscription()
    {
        return subscription;
    }

    /**
     * Sets the subscription link for the order line item.
     * 
     * @param value The subscription link for the order line item.
     */
    public void setSubscription(Link value)
    {
        subscription = value;
    }
}