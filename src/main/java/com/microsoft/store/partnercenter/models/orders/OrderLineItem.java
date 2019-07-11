// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * The friendly name for the result contract (subscription)
     */
    private String friendlyName;

    /**
     * The line item number.
     */
    private int lineItemNumber;

    /**
     * The offer identifier for the line item.
     */
    private String offerId;

    /**
     * The partner identifier on record.
     */
    private String partnerIdOnRecord;

    /**
     * The parent subscription identifier. This parameter should only be set for add-on offer purchase applies to order updates only.
     */
    private String parentSubscriptionId;

    /**
     * The pricing for the order line item.
     */
    private Pricing pricing;

    /**
     * The provisioning context for the offer.
     */
    private Map<String, String> provisioningContext;

    /**
     * The product quantity.
     */
    private int quantity;

    /**
     * The renews to value.
     */
    private RenewsTo renewsTo;

    /**
     * The resulting subscription identifier.
     */
    private String subscriptionId;

    /**
     * The term duration for the order line item.
     */
    private String termDuration;

    /**
     * The transaction type for the order line item.
     */
    private String transactionType;

    /**
     * Gets the friendly name of the subscription.
     * 
     * @return The friendly name of the subscription.
     */
    public String getFriendlyName()
    {
        return friendlyName;
    }

    /**
     * Sets the friendly name of the subscription.
     * 
     * @param value The friendly name of the subscription.
     */
    public void setFriendlyName(String value)
    {
        friendlyName = value;
    }

    /**
     * Gets the line item number.
     * 
     * @return The line item number.
     */
    public int getLineItemNumber()
    {
        return lineItemNumber;
    }

    /**
     * Sets the line item number.
     * 
     * @param value The line item number.
     */
    public void setLineItemNumber(int value)
    {
        lineItemNumber = value;
    }

    /**
     * Gets the offer identifier. 
     * 
     * @return The offer identifier for the line item.
     */
    public String getOfferId()
    {
        return offerId;
    }

    /**
     * Sets the offer identifier.
     * 
     * @param value The offer identifier for the line item.
     */
    public void setOfferId(String value)
    {
        offerId = value;
    }

    /**
     * Gets the partner identifier on record.
     * 
     * @return The partner identifier on record.
     */
    public String getPartnerIdOnRecord()
    {
        return partnerIdOnRecord;
    }

    /**
     * Sets the partner identifier on record.
     * 
     * @param value The partner identifier on record.
     */
    public void setPartnerIdOnRecord(String value)
    {
        partnerIdOnRecord = value;
    }

    /**
     * Gets the parent subscription identifier. This parameter should only be set for add-on offer purchase applies to order updates only.
     * 
     * @return The parent subscription identifier.
     */
    public String getParentSubscriptionId()
    {
        return parentSubscriptionId;
    }

    /**
     * Sets the parent subscription identifier. This parameter should only be set for add-on offer purchase applies to order updates only.
     * 
     * @param value The parent subscription identifier.
     */
    public void setParentSubscriptionId(String value)
    {
        parentSubscriptionId = value;
    }

	/**
     * Gets the pricing for the order line item.
     * 
     * @return The pricing for the order line item.
     */
    public Pricing getPricing()
    {
        return pricing;
    }

    /**
     * Sets the pricing for the order line item.
     * 
     * @param value The pricing for the order line item.
     */
    public void setPricing(Pricing value)
    {
        pricing = value;
    }

    /**
     * Gets the provisioning context for the offer.
     * 
     * @return The provisioning context for the offer.
     */
    public Map<String, String> getProvisioningContext()
    {
        return provisioningContext;
    }

    /**
     * Sets the provisioning context for the offer.
     * 
     * @param value The provisioning context for the offer.
     */
    public void setProvisioningContext(Map<String, String> value)
    {
        provisioningContext = value;
    }

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
     * Gets the renews to value.
     * 
     * @return The renews to value.
     */
    public RenewsTo getRenewsTo()
    {
        return renewsTo;
    }

    /**
     * Sets the renews to value.
     * 
     * @param value The renews to value.
     */
    public void setRenewsTo(RenewsTo value)
    {
        renewsTo = value;
    }

    /**
     * Gets the resulting subscription identifier.
     * 
     * @return The resulting subscription identifier.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the resulting subscription identifier.
     * 
     * @param value The resulting subscription identifier.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value;
    }

    /**
     * Gets the term duration for the order line item.
     * 
     * @return The term duration for the order line item.
     */
    public String getTermDuration()
    {
        return termDuration;
    }

    /**
     * Sets the term duration for the order line item.
     * 
     * @param value The term duration for the order line item.
     */
    public void setTermDuration(String value)
    {
        termDuration = value;
    }

    /**
     * Gets the transaction type for the order line item.
     * 
     * @return The transaction type for the order line item.
     */
    public String getTransactionType()
    {
        return transactionType;
    }

    /**
     * Sets the transaction type for the order line item.
     * 
     * @param value The transaction type for the order line item.
     */
    public void setTransactionType(String value)
    {
        transactionType = value;
    }
}