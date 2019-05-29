// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microsoft.store.partnercenter.models.subscriptions.SubscriptionStatus;

/**
 * The class defines the monthly usage record of a subscription.
 */
@JsonIgnoreProperties( { "offerId", "lastModifiedDate" } )
public class SubscriptionMonthlyUsageRecord
    extends UsageRecordBase
{
    private String __ResourceId;

    /**
     * Gets the resource unique identifier. In this context of a customer monthly usage record this identifier is the customer identifier.
     * 
     * @return The resource unique identifier.
     */
    public String getResourceId()
    {
        return __ResourceId;
    }

    /**
     * Sets the resource unique identifier. In this context of a customer monthly usage record this identifier is the customer identifier.
     * 
     * @param value The resource identifier.
     */
    public void setResourceId( String value )
    {
        __ResourceId = value;
    }

    private String __ResourceName;

    /**
     * Gets the name of the resource. In this context of a customer monthly usage record this name is the customer name.
     * 
     * @return The name of the resource.
     */
    public String getResourceName()
    {
        return __ResourceName;
    }

    /**
     * Sets name of the resource. In this context of a customer monthly usage record this name is the customer name.
     * 
     * @param value The name of the resource.
     */
    public void setResourceName( String value )
    {
        __ResourceName = value;
    }

    private SubscriptionStatus __Status = SubscriptionStatus.NONE;

    /**
     * Gets the status of the subscription.
     * 
     * @return The status of the subscription.
     */
    public SubscriptionStatus getStatus()
    {
        return __Status;
    }

    /**
     * Sets the status of the subscription.
     * 
     * @param value The status of the subscription.
     */
    public void setStatus( SubscriptionStatus value )
    {
        __Status = value;
    }

    private String __PartnerOnRecord;

    /**
     * Gets the partner on record.
     * 
     * @return The partner on record.
     */
    public String getPartnerOnRecord()
    {
        return __PartnerOnRecord;
    }

    /**
     * Sets the partner on record.
     * 
     * @param value The partner on record.
     */
    public void setPartnerOnRecord( String value )
    {
        __PartnerOnRecord = value;
    }
    
    private String __OfferId;
    
    /**
     * Gets the partner on record.
     * 
     * @return The offer identifier associated to this subscription.
     */
    public String getOfferId()
    {
        return __OfferId;
    }

    /**
     * Sets the offer identifier associated to this subscription.
     * 
     * @param value The offer identifier associated to this subscription.
     */
    public void setOfferId( String value )
    {
    	__OfferId = value;
    }
}