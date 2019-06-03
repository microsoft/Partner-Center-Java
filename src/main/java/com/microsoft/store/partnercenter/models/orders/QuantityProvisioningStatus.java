// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.orders;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 *  Quantity Provisioning Status.
 */
public class QuantityProvisioningStatus
    extends ResourceBase
{
    /**
     * The product quantity.
     */
    private int quantity;

    /**
     * The provisioning status.
     */
    private String status;

    /**
     * Gets the product quantity.
     * 
     * @return The product quantity.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the product quantity.
     * 
     * @param value The product quantity.
     */
    public void setQuantity(int value)
    {
        quantity = value;
    }

    /**
     * Gets the provisioning status.
     * 
     * @return The provisioning status.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Sets the provisioning status.
     * 
     * @param value The provisioning status.
     */
    public void setStatus(String value)
    {
        status = value;
    }
}