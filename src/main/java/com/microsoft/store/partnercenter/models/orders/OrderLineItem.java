// -----------------------------------------------------------------------
// <copyright file="OrderLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.orders;

import java.util.Map;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;

/**
 * Order line item associates order information to a specific offer of a product
 */
public class OrderLineItem
    extends ResourceBaseWithLinks<OrderLineItemLinks>    
{
    /**
     * Initializes a new instance of the {@link #OrderLineItem} class.
     */
    public OrderLineItem()
    {
    }

    /**
     * Gets or sets the line item number.
     */
    private int __LineItemNumber;

    public int getLineItemNumber()
    {
        return __LineItemNumber;
    }

    public void setLineItemNumber( int value )
    {
        __LineItemNumber = value;
    }

    /**
     * Gets or sets the offer identifier.
     */
    private String __OfferId;

    public String getOfferId()
    {
        return __OfferId;
    }

    public void setOfferId( String value )
    {
        __OfferId = value;
    }

    /**
     * Gets or sets the resulting subscription identifier.
     */
    private String __SubscriptionId;

    public String getSubscriptionId()
    {
        return __SubscriptionId;
    }

    public void setSubscriptionId( String value )
    {
        __SubscriptionId = value;
    }

    /**
     * Gets or sets the parent subscription identifier. This parameter should only be set for add-on offer purchase
     * Applies to Order updates only.
     */
    private String __ParentSubscriptionId;

    public String getParentSubscriptionId()
    {
        return __ParentSubscriptionId;
    }

    public void setParentSubscriptionId( String value )
    {
        __ParentSubscriptionId = value;
    }

    /**
     * Gets or sets the friendly name for the result contract (subscription)
     */
    private String __FriendlyName;

    public String getFriendlyName()
    {
        return __FriendlyName;
    }

    public void setFriendlyName( String value )
    {
        __FriendlyName = value;
    }

    /**
     * Gets or sets the product quantity.
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
     * Gets or sets the partner identifier on record.
     */
    private String __PartnerIdOnRecord;

    public String getPartnerIdOnRecord()
    {
        return __PartnerIdOnRecord;
    }

    public void setPartnerIdOnRecord( String value )
    {
        __PartnerIdOnRecord = value;
    }

    /**
     * Gets or sets the provisioning context for the offer.
     */
    private Map<String, String> __ProvisioningContext;

    public Map<String, String> getProvisioningContext()
    {
        return __ProvisioningContext;
    }

    public void setProvisioningContext( Map<String, String> value )
    {
        __ProvisioningContext = value;
    }
}