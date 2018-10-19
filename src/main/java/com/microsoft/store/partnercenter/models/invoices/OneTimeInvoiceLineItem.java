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
     * Gets or sets the partner commerce account Id.
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
    private double skuName;

    public double getSkuName()
    {
        return skuName;
    }

    public void setSkuName( double value )
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