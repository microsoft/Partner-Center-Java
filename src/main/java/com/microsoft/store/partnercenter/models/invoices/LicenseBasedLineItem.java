// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

/**
 * Represents an invoice billing line item for licensed based subscriptions
 */
public class LicenseBasedLineItem
    extends InvoiceLineItem
{
    /**
     * Gets or sets the partner commerce account Id.
     */
    private String __PartnerId;

    public String getPartnerId()
    {
        return __PartnerId;
    }

    public void setPartnerId(String value)
    {
        __PartnerId = value;
    }

    /**
     * Gets or sets the customer commerce account Id.
     */
    private String __CustomerId;

    public String getCustomerId()
    {
        return __CustomerId;
    }

    public void setCustomerId(String value)
    {
        __CustomerId = value;
    }

    /**
     * Gets or sets the customer name.
     */
    private String __CustomerName;

    public String getCustomerName()
    {
        return __CustomerName;
    }

    public void setCustomerName(String value)
    {
        __CustomerName = value;
    }

    /**
     * Gets or sets the MPN Id associated to this line item.
     */
    private int __MpnId;

    public int getMpnId()
    {
        return __MpnId;
    }

    public void setMpnId(int value)
    {
        __MpnId = value;
    }

    /**
     * Gets or sets the MPN Id of the Tier 2 partner associated to this line item.
     */
    private int __Tier2MpnId;

    public int getTier2MpnId()
    {
        return __Tier2MpnId;
    }

    public void setTier2MpnId(int value)
    {
        __Tier2MpnId = value;
    }

    /**
     * Gets or sets the order unique identifier.
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
     * Gets or sets the subscription unique identifier.
     */
    private String __SubscriptionId;

    public String getSubscriptionId()
    {
        return __SubscriptionId;
    }

    public void setSubscriptionId(String value)
    {
        __SubscriptionId = value;
    }

    /**
     * Gets or sets the syndication partner subscription number.
     */
    private String __SyndicationPartnerSubscriptionNumber;

    public String getSyndicationPartnerSubscriptionNumber()
    {
        return __SyndicationPartnerSubscriptionNumber;
    }

    public void setSyndicationPartnerSubscriptionNumber(String value)
    {
        __SyndicationPartnerSubscriptionNumber = value;
    }

    /**
     * Gets or sets the offer unique identifier
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
     * Gets or sets the durable offer unique identifier
     */
    private String __DurableOfferId;

    public String getDurableOfferId()
    {
        return __DurableOfferId;
    }

    public void setDurableOfferId(String value)
    {
        __DurableOfferId = value;
    }

    /**
     * Gets or sets the offer name
     */
    private String __OfferName;

    public String getOfferName()
    {
        return __OfferName;
    }

    public void setOfferName(String value)
    {
        __OfferName = value;
    }

    /**
     * Gets or sets the date when subscription starts
     */
    private DateTime __SubscriptionStartDate;

    public DateTime getSubscriptionStartDate()
    {
        return __SubscriptionStartDate;
    }

    public void setSubscriptionStartDate(DateTime value)
    {
        __SubscriptionStartDate = value;
    }

    /**
     * Gets or sets the date when subscription expires
     */
    private DateTime __SubscriptionEndDate;

    public DateTime getSubscriptionEndDate()
    {
        return __SubscriptionEndDate;
    }

    public void setSubscriptionEndDate(DateTime value)
    {
        __SubscriptionEndDate = value;
    }

    /**
     * Gets or sets the start date for the charge
     */
    private DateTime __ChargeStartDate;

    public DateTime getChargeStartDate()
    {
        return __ChargeStartDate;
    }

    public void setChargeStartDate(DateTime value)
    {
        __ChargeStartDate = value;
    }

    /**
     * Gets or sets the end date for the charge
     */
    private DateTime __ChargeEndDate;

    public DateTime getChargeEndDate()
    {
        return __ChargeEndDate;
    }

    public void setChargeEndDate(DateTime value)
    {
        __ChargeEndDate = value;
    }

    /**
     * Gets or sets the type of charge
     */
    private String __ChargeType;

    public String getChargeType()
    {
        return __ChargeType;
    }

    public void setChargeType(String value)
    {
        __ChargeType = value;
    }

    /**
     * Gets or sets the unit price
     */
    private double __UnitPrice;

    public double getUnitPrice()
    {
        return __UnitPrice;
    }

    public void setUnitPrice(double value)
    {
        __UnitPrice = value;
    }

    /**
     * Gets or sets the number of units associated with this line item
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
     * Gets or sets the total amount = unit price * quantity
     */
    private double __Amount;

    public double getAmount()
    {
        return __Amount;
    }

    public void setAmount(double value)
    {
        __Amount = value;
    }

    /**
     * Gets or sets the discount associated with this purchase
     */
    private double __TotalOtherDiscount;

    public double getTotalOtherDiscount()
    {
        return __TotalOtherDiscount;
    }

    public void setTotalOtherDiscount(double value)
    {
        __TotalOtherDiscount = value;
    }

    /**
     * Gets or sets the amount after discount
     */
    private double __Subtotal;

    public double getSubtotal()
    {
        return __Subtotal;
    }

    public void setSubtotal(double value)
    {
        __Subtotal = value;
    }

    /**
     * Gets or sets the taxes charged.
     */
    private double __Tax;

    public double getTax()
    {
        return __Tax;
    }

    public void setTax(double value)
    {
        __Tax = value;
    }

    /**
     * Gets or sets the total amount after discount and tax
     */
    private double __TotalForCustomer;

    public double getTotalForCustomer()
    {
        return __TotalForCustomer;
    }

    public void setTotalForCustomer(double value)
    {
        __TotalForCustomer = value;
    }

    /**
     * Gets or sets the currency used for this line item.
     */
    private String __Currency;

    public String getCurrency()
    {
        return __Currency;
    }

    public void setCurrency(String value)
    {
        __Currency = value;
    }

    /**
     * Returns the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
    public InvoiceLineItemType getInvoiceLineItemType()
    {
        return InvoiceLineItemType.BILLINGLINEITEMS;
    }

    /**
     * Returns the billing provider
     * 
     * @return The billing provider.
     */
    public BillingProvider getBillingProvider()
    {
        return BillingProvider.OFFICE;
    }

     /**
     *  Gets or sets domain name.
     */
    private String __DomainName;

    public String getDomainName()
    {
        return __DomainName;
    }

    public void setDomainName(String value)
    {
        __DomainName = value;
    }

     /**
     *  Gets or sets the billing cycle type.
     */
    private String __BillingCycleType;

    public String getBillingCycleType()
    {
        return __BillingCycleType;
    }

    public void setBillingCycleType(String value)
    {
        __BillingCycleType = value;
    }

     /**
     *  Gets or sets the billing cycle type.
     */
    private String __SubscriptionDescription;

    public String getSubscriptionDescription()
    {
        return __SubscriptionDescription;
    }

    public void setSubscriptionDescription(String value)
    {
        __SubscriptionDescription = value;
    }
}