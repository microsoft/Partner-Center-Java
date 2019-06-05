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
     * The billing cycle that defines how often the partner is billed for this subscription.
     */
    private BillingCycleType billingCycle;

    /**
     * The original offer identifier.
     */
    private String offerId;

    /**
     * The order identifier.
     */
    private String orderId;

    /**
     * The quantity to be purchased. Defaults to the source subscription quantity.
     */
    private int quantity;

    /**
     * The target offer identifier.
     */
    private String targetOfferId;

    /**
     * Gets the billing cycle that defines how often the partner is billed for this subscription.
     * 
     * @return The billing cycle that defines how often the partner is billed for this subscription.
     */
    public BillingCycleType getBillingCycle()
    {
        return billingCycle;
    }

    /**
     * Sets the billing cycle that defines how often the partner is billed for this subscription.
     * 
     * @param value The billing cycle that defines how often the partner is billed for this subscription.
     */
    public void setBillingCycle(BillingCycleType value)
    {
        billingCycle = value;
    }

    /**
     * Gets the original offer identifier.
     * 
     * @return The original offer identifier.
     */
    public String getOfferId()
    {
        return offerId;
    }

    /**
     * Sets the original offer identifier.
     * 
     * @param value The original offer identifier.
     */
    public void setOfferId(String value)
    {
        offerId = value;
    }

    /**
     * Gets the order identifier.
     * 
     * @return The order identifier.
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * Sets the order identifier.
     * 
     * @param value The order identifier.
     */
    public void setOrderId(String value)
    {
        orderId = value;
    }

    /**
     * Gets the quantity to be purchased. Defaults to the source subscription quantity.
     * 
     * @return The quantity to be purchased. Defaults to the source subscription quantity.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity to be purchased. Defaults to the source subscription quantity. 
     * 
     * @param value The quantity to be purchased. Defaults to the source subscription quantity.
     */
    public void setQuantity(int value)
    {
        quantity = value;
    }

    /**
     * Gets the target offer identifier.
     * 
     * @return The target offer identifier.
     */
    public String getTargetOfferId()
    {
        return targetOfferId;
    }

    /**
     * Sets the target offer identifier.
     * 
     * @param value The target offer identifier.
     */
    public void setTargetOfferId(String value)
    {
        targetOfferId = value;
    }
}