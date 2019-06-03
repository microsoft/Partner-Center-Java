// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.offers.BillingCycleType;

/**
 * Represents the conversion for a subscription from a trial offer to a paid offer.
 */
public class Conversion
    extends ResourceBase
{
    /**
     * Gets or sets the original offer id.
     */
    private String __OfferId;

    public String getOfferId()
    {
        return __OfferId;
    }

    public void setOfferId(String value)
    {
        __OfferId = value;
    }

    /**
     * Gets or sets the target offer id.
     */
    private String __TargetOfferId;

    public String getTargetOfferId()
    {
        return __TargetOfferId;
    }

    public void setTargetOfferId(String value)
    {
        __TargetOfferId = value;
    }

    /**
     * Gets or sets the order id.
     */
    private String __OrderId;

    public String getOrderId()
    {
        return __OrderId;
    }

    public void setOrderId(String value)
    {
        __OrderId = value;
    }

    /**
     * Gets or sets the quantity to be purchased. Defaults to the source subscription quantity.
     */
    private int __Quantity;

    public int getQuantity()
    {
        return __Quantity;
    }

    public void setQuantity(int value)
    {
        __Quantity = value;
    }

    /**
     * Gets or sets the billing cycle. Defines how often the partner is billed for this subscription.
     */
    private BillingCycleType __BillingCycle;

    public BillingCycleType getBillingCycleType()
    {
        return __BillingCycle;
    }

    public void setBillingCycleType(BillingCycleType value)
    {
        __BillingCycle = value;
    }
}