// -----------------------------------------------------------------------
// <copyright file="OneTimeInvoiceLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

/**
 * Represents an invoice billing line item for OneTime purchases.
 */
public class OneTimeInvoiceLineItem
    extends InvoiceLineItem
{
    /**
     * The alternate identifier (quote identifier).
     */
    private String alternateId;

    /**
     * The charge end date associated with this purchase.
     */
    private DateTime chargeEndDate;

    /**
     * The charge start date associated with this purchase.
     */
    private DateTime chargeStarDate;

    /**
     * The publisher identifier associated with this purchase.
     */
    private String publisherId;

    /**
     * The publisher name associated with this purchase.
     */
    private String publisherName;

    /**
     * The subscription description associated with this purchase.
     */
    private String subscriptionDescription;

    /**
     * The subscription id associated with this purchase.
     */
    private String subscriptionId;

    /**
     * The term and billing cycle associated with this purchase. 
     */
    private String termAndBillingCycle;
    
    /**
     * The type of unit.
     */
    private String unitType;

    /**
     * Gets the alternate identifier (quote identifier).
     * 
     * @return The alternate identifier (quote identifier).
     */
    public String getAlternateId()
    {
        return alternateId;
    }

    /**
     * Sets the alternate identifier (quote identifier).
     * 
     * @param value The alternate identifier (quote identifier).
     */
    public void setAlternateId(String value)
    {
        alternateId = value;
    }

    /**
     * Gets the charge end date associated with this purchase.
     * 
     * @return The charge end date associated with this purchase.
     */
    public DateTime getChargeEndDate()
    {
        return chargeEndDate;
    }

    /**
     * Sets the charge end date associated with this purchase.
     * 
     * @param value The charge end date associated with this purchase.
     */
    public void setChargeEndDate(DateTime value)    
    {
        chargeEndDate = value;
    }

    /**
     * Gets the charge start date associated with this purchase.
     * 
     * @return The charge start date associated with this purchase.
     */
    public DateTime getChargeStartDate()
    {
        return chargeStarDate;
    }

    /**
     * Sets the charge start date associated with this purchase.
     * 
     * @param value The charge start date associated with this purchase.
     */
    public void setChargeStartDate(DateTime value)    
    {
        chargeStarDate = value;
    }

    /**
     * Gets the publisher identifier associated with this purchase.
     * 
     * @return The publisher identifier associated with this purchase.
     */
    public String getPublisherId()
    {
        return publisherId;
    }

    /**
     * Sets the publisher identifier associated with this purchase.
     * 
     * @param value The publisher identifier associated with this purchase.
     */
    public void setPublisherId(String value)    
    {
        publisherId = value;
    }

    /**
     * Gets the publisher name associated with this purchase.
     * 
     * @return The publisher name associated with this purchase.
     */
    public String getPublisherName()
    {
        return publisherName;
    }

    /**
     * Sets the publisher name associated with this purchase.
     * 
     * @param value The publisher name associated with this purchase.
     */
    public void setPublisherName(String value)    
    {
        publisherName = value;
    }

    /**
     * Gets the subscription description associated with this purchase.
     * 
     * @return The subscription description associated with this purchase.
     */
    public String getSubscriptionDescription()
    {
        return subscriptionDescription;
    }

    /**
     * Sets the subscription description associated with this purchase.
     * 
     * @param value The subscription description associated with this purchase.
     */
    public void setSubscriptionDescription(String value)    
    {
        subscriptionDescription = value;
    }

    /**
     * Gets the subscription identifier associated with this purchase.
     * 
     * @return The subscription identifier associated with this purchase.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the subscription identifier associated with this purchase.
     * 
     * @param value The subscription identifier associated with this purchase.
     */
    public void setSubscriptionId(String value)    
    {
        subscriptionId = value;
    }

    /**
     * Gets the term and billing cycle associated with this purchase. 
     * 
     * @return The term and billing cycle associated with this purchase. 
     */
    public String getTermAndBillingCycle()
    {
        return termAndBillingCycle;
    }

    /**
     * Sets term and billing cycle associated with this purchase. 
     * 
     * @param value The term and billing cycle associated with this purchase. 
     */
    public void setTermAndBillingCycle(String value)    
    {
        termAndBillingCycle = value;
    }

    /**
     * Gets the type of unit. 
     * 
     * @return The type of unit.
     */
    public String getUnitType()
    {
        return unitType;
    }

    /**
     * Sets type of unit.
     * 
     * @param value The type of unit.
     */
    public void setUnitType(String value)    
    {
        unitType = value;
    }

    /**
     * Gets or sets the partner commerce account identifier.
     */
    private String partnerId;

    public String getPartnerId()
    {
        return partnerId;
    }

    public void setPartnerId( String value )
    {
        partnerId = value;
    }

    /**
     * Gets or sets the customer commerce account Id.
     */
    private String customerId;

    public String getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId( String value )
    {
        customerId = value;
    }

    /**
     * Gets or sets the customer name.
     */
    private String customerName;

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName( String value )
    {
        customerName = value;
    }

    /**
     * Gets or sets the MPN Id associated to this line item.
     */
    private int mpnId;

    public int getMpnId()
    {
        return mpnId;
    }

    public void setMpnId( int value )
    {
        mpnId = value;
    }

    /**
     * Gets or sets the order unique identifier.
     */
    private String orderId;

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId( String value )
    {
        orderId = value;
    }

    /**
     * Gets or sets the type of charge
     */
    private String chargeType;

    public String getChargeType()
    {
        return chargeType;
    }

    public void setChargeType( String value )
    {
        chargeType = value;
    }

    /**
     * Gets or sets the unit price
     */
    private double unitPrice;

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice( double value )
    {
        unitPrice = value;
    }

    /**
     * Gets or sets the number of units associated with this line item
     */
    private int quantity;

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity( int value )
    {
        quantity = value;
    }

    /**
     * Gets or sets the amount after discount
     */
    private double subtotal;

    public double getSubtotal()
    {
        return subtotal;
    }

    public void setSubtotal( double value )
    {
        subtotal = value;
    }

    /**
     * Gets or sets the total amount after discount and tax
     */
    private double totalForCustomer;

    public double getTotalForCustomer()
    {
        return totalForCustomer;
    }

    public void setTotalForCustomer( double value )
    {
        totalForCustomer = value;
    }

    /**
     * Gets or sets the currency used for this line item.
     */
    private String currency;

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency( String value )
    {
        currency = value;
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
        return BillingProvider.ONE_TIME;
    }

    /**
     *  Gets or sets the discount details associated with this purchase.
     */
    private String discountDetails;

    public String getDiscountDetails()
    {
        return discountDetails;
    }

    public void setDiscountDetails( String value )
    {
        discountDetails = value;
    }

    /**
     *  Gets or sets the taxes charged.
     */
    private double taxTotal;

    public double getTaxTotal()
    {
        return taxTotal;
    }

    public void setTaxTotal( double value )
    {
        taxTotal = value;
    }

    /**
     *  Gets or sets the SKU name.
     */
    private String skuName;

    public String getSkuName()
    {
        return skuName;
    }

    public void setSkuName(String value)
    {
        skuName = value;
    }

    /**
     *  Gets or sets the product name.
     */
    private String productName;

    public String getProductName()
    {
        return productName;
    }

    public void setProductName( String value )
    {
        productName = value;
    }

    /**
     *  Gets or sets the availability unique identifier.
     */
    private String availabilityId;

    public String getAvailabilityId()
    {
        return availabilityId;
    }

    public void setAvailabilityId( String value )
    {
        availabilityId = value;
    }

    /**
     *  Gets or sets the sku unique identifier.
     */
    private String skuId;

    public String getSkuId()
    {
        return skuId;
    }

    public void setSkuId( String value )
    {
        skuId = value;
    }

    /**
     * Gets or sets the product unique identifier.
     */
    private String productId;

    public String getProductId()
    {
        return productId;
    }

    public void setProductId( String value )
    {
        productId = value;
    }

    /**
     * Gets or sets the date when order created.
     */
    private DateTime orderDate;

    public DateTime getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate( DateTime value )
    {
        orderDate = value;
    }

    /**
     * Gets or sets the Reseller MPN Id of the Tier 2 partner associated to this line item.
     */
    private String resellerMpnId;

    public String getResellerMpnId()
    {
        return resellerMpnId;
    }

    public void setResellerMpnId( String value )
    {
        resellerMpnId = value;
    }

    /**
     * Gets or sets the invoice number.
     */
    private String invoiceNumber;

    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    public void setInvoiceNumber( String value )
    {
        invoiceNumber = value;
    }

    /**
     * Gets or sets the customer country.
     */
    private String customerCountry;

    public String getCustomerCountry()
    {
        return customerCountry;
    }

    public void setCustomerCountry( String value )
    {
        customerCountry = value;
    }

    /**
     *  Gets or sets the customer domain name.
     */
    private String customerDomainName;

    public String getCustomerDomainName()
    {
        return customerDomainName;
    }

    public void setCustomerDomainName( String value )
    {
        customerDomainName = value;
    }
}