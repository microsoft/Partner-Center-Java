// -----------------------------------------------------------------------
// <copyright file="OneTimeInvoiceLineItem.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
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
     * Gets or sets the partner commerce account Id.
     */
    private String __PartnerId;

    public String getPartnerId()
    {
        return __PartnerId;
    }

    public void setPartnerId( String value )
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

    public void setCustomerId( String value )
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

    public void setCustomerName( String value )
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

    public void setMpnId( int value )
    {
        __MpnId = value;
    }

    /**
     * Gets or sets the order unique identifier.
     */
    private String __OrderId;

    public String getOrderId()
    {
        return __OrderId;
    }

    public void setOrderId( String value )
    {
        __OrderId = value;
    }

    /**
     * Gets or sets the type of charge
     */
    private String __ChargeType;

    public String getChargeType()
    {
        return __ChargeType;
    }

    public void setChargeType( String value )
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

    public void setUnitPrice( double value )
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

    public void setQuantity( int value )
    {
        __Quantity = value;
    }

    /**
     * Gets or sets the amount after discount
     */
    private double __Subtotal;

    public double getSubtotal()
    {
        return __Subtotal;
    }

    public void setSubtotal( double value )
    {
        __Subtotal = value;
    }

    /**
     * Gets or sets the total amount after discount and tax
     */
    private double __TotalForCustomer;

    public double getTotalForCustomer()
    {
        return __TotalForCustomer;
    }

    public void setTotalForCustomer( double value )
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

    public void setCurrency( String value )
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
        return BillingProvider.OneTime;
    }

    /**
     *  Gets or sets the discount details associated with this purchase.
     */
    private String __DiscountDetails;

    public String getDiscountDetails()
    {
        return __DiscountDetails;
    }

    public void setDiscountDetails( String value )
    {
        __DiscountDetails = value;
    }

    /**
     *  Gets or sets the taxes charged.
     */
    private double __TaxTotal;

    public double getTaxTotal()
    {
        return __TaxTotal;
    }

    public void setTaxTotal( double value )
    {
        __TaxTotal = value;
    }

    /**
     *  Gets or sets the SKU name.
     */
    private double __SkuName;

    public double getSkuName()
    {
        return __SkuName;
    }

    public void setSkuName( double value )
    {
        __SkuName = value;
    }

    /**
     *  Gets or sets the product name.
     */
    private String __ProductName;

    public String getProductName()
    {
        return __ProductName;
    }

    public void setProductName( String value )
    {
        __ProductName = value;
    }

    /**
     *  Gets or sets the availability unique identifier.
     */
    private String __AvailabilityId;

    public String getAvailabilityId()
    {
        return __AvailabilityId;
    }

    public void setAvailabilityId( String value )
    {
        __AvailabilityId = value;
    }

    /**
     *  Gets or sets the sku unique identifier.
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
     * Gets or sets the product unique identifier.
     */
    private String __ProductId;

    public String getProductId()
    {
        return __ProductId;
    }

    public void setProductId( String value )
    {
        __ProductId = value;
    }

    /**
     * Gets or sets the date when order created.
     */
    private DateTime __OrderDate;

    public DateTime getOrderDate()
    {
        return __OrderDate;
    }

    public void setOrderDate( DateTime value )
    {
        __OrderDate = value;
    }

    /**
     * Gets or sets the Reseller MPN Id of the Tier 2 partner associated to this line item.
     */
    private String __ResellerMpnId;

    public String getResellerMpnId()
    {
        return __ResellerMpnId;
    }

    public void setResellerMpnId( String value )
    {
        __ResellerMpnId = value;
    }

    /**
     * Gets or sets the invoice number.
     */
    private String __InvoiceNumber;

    public String getInvoiceNumber()
    {
        return __InvoiceNumber;
    }

    public void setInvoiceNumber( String value )
    {
        __InvoiceNumber = value;
    }

    /**
     * Gets or sets the customer country.
     */
    private String __CustomerCountry;

    public String getCustomerCountry()
    {
        return __CustomerCountry;
    }

    public void setCustomerCountry( String value )
    {
        __CustomerCountry = value;
    }

    /**
     *  Gets or sets the customer domain name.
     */
    private String __CustomerDomainName;

    public String getCustomerDomainName()
    {
        return __CustomerDomainName;
    }

    public void setCustomerDomainName( String value )
    {
        __CustomerCountry = value;
    }
}