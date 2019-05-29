// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import org.joda.time.DateTime;

/**
 * Represents the refund option for a subscription.
 */
public class RefundOption
{
    /**
     *  The timestamp when this policy expires if applicable.
     */
    private DateTime expiresAt;

    /**
     * The type of refund ("Full, Partial").
     */
    private String type;

    /**
     * Gets the timestamp when this policy expires if applicable.
     * 
     * @return The timestamp when this policy expires if applicable.
     */
    public DateTime getExpiresAt()
    {
        return expiresAt;
    }

    /**
     * Sets the timestamp when this policy expires if applicable.
     * 
     * @param value The timestamp when this policy expires if applicable.
     */
    public void setExpiresAt(DateTime value)
    {
        expiresAt = value;
    }

    /**
     * Gets the type of refund ("Full, Partial").
     * 
     * @return The type of refund ("Full, Partial").
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the type of refund ("Full, Partial").
     * 
     * @param value The type of refund ("Full, Partial").
     */
    public void setType(String value)
    {
        type = value;
    }
}