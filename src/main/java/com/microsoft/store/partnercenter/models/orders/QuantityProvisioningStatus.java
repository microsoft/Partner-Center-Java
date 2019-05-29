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
     * Gets or sets Quantity.
     */
    private int __Quantity;

    public int getQuantity()
    {
        return __Quantity;
    }

    public void setQuantity( int value )
    {
        __Quantity = value;
    }

    /**
     * Gets or sets provisioning status.
     */
    private String __Status;

    public String getStatus()
    {
        return __Status;
    }

    public void setStatus( String value )
    {
        __Status = value;
    }
}