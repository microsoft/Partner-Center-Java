// -----------------------------------------------------------------------
// <copyright file="QuantityProvisioningStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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