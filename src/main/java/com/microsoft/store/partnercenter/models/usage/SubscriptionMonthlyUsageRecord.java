// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.microsoft.store.partnercenter.models.subscriptions.SubscriptionStatus;

/**
 * Defines the monthly usage record of a subscription.
 */
public class SubscriptionMonthlyUsageRecord
    extends UsageRecordBase
{
    /**
     * The offer identifier associated to this subscription.
     */
    private String offerId;

    /**
     * The partner on record.
     */
    private String partnerOnRecord;

    /**
     * The status of the subscription.
     */
    private SubscriptionStatus status = SubscriptionStatus.NONE;

    /**
     * Gets the offer identifier associated to this subscription.
     * 
     * @return The offer identifier associated to this subscription.
     */
    public String getOfferId()
    {
        return offerId;
    }

    /**
     * Sets the offer identifier associated to this subscription.
     * 
     * @param value The offer identifier associated to this subscription.
     */
    public void setOfferId(String value)
    {
    	offerId = value;
    }

    /**
     * Gets the partner on record.
     * 
     * @return The partner on record.
     */
    public String getPartnerOnRecord()
    {
        return partnerOnRecord;
    }

    /**
     * Sets the partner on record.
     * 
     * @param value The partner on record.
     */
    public void setPartnerOnRecord(String value)
    {
        partnerOnRecord = value;
    }

    /**
     * Gets the status of the subscription.
     * 
     * @return The status of the subscription.
     */
    public SubscriptionStatus getStatus()
    {
        return status;
    }

    /**
     * Sets the status of the subscription.
     * 
     * @param value The status of the subscription.
     */
    public void setStatus(SubscriptionStatus value)
    {
        status = value;
    }  
}