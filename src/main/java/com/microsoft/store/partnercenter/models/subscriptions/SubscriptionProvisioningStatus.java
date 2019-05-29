// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

import org.joda.time.DateTime;

/**
 * The subscription provisioning status details.
 */
public class SubscriptionProvisioningStatus
    extends ResourceBase
{
    /**
     * Gets or SKU identifier.
     */
    private String __SkuId;

    public String getSkuId()
    {
        return __SkuId;
    }

    public void setSkuId( String value )
    {
        __SkuId = value;
    }

    /**
     * Gets or sets the subscription provisioning status.
     */
    private ProvisioningStatus __Status;

    public ProvisioningStatus getStatus()
    {
        return __Status;
    }

    public void setStatus( ProvisioningStatus value )
    {
        __Status = value;
    }

    /**
     * Gets or sets the quantity.
     * Latest Seat number or subscription quantity after provisioning.
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
     * Gets or sets the end  date.
     * Renewal or end date after provisioning.
     */
    private DateTime __EndDate;

    public DateTime getEndDate()
    {
        return __EndDate;
    }

    public void setEndDate( DateTime value )
    {
        __EndDate = value;
    }
}