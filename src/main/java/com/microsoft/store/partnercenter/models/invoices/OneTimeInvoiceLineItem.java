// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * The availability unique identifier.
     */
    private String availabilityId;

    /**
     * The number of units purchased.
     */
    private double billableQuantity;
    
    /**
     * The charge end date associated with this purchase.
     */
    private DateTime chargeEndDate;

    /**
     * The charge start date associated with this purchase.
     */
    private DateTime chargeStarDate;

    /**
     * The type of charge.
     */
    private String chargeType;

    /**
     * The currency used for this line item.
     */
    private String currency;

    /**
     * The country for the customer.
     */
    private String customerCountry;

    /**
     * The customer domain name.
     */
    private String customerDomainName;

    /**
     * The customer identifier.
     */
    private String customerId;

    /**
     * The name for the customer.
     */
    private String customerName;

    /**
     * The discount details associated with this purchase.
     */
    private String discountDetails;

    /**
     * The invoice number.
     */
    private String invoiceNumber;

    /**
     * The MPN identifier associated to this line item.
     */
    private String mpnId;

    /**
     * The date when the order was created.
     */
    private DateTime orderDate;

    /**
     * The order unique identifier.
     */
    private String orderId;

    /**
     * The partner commerce account identifier.
     */
    private String partnerId;

    /**
     * The pricing currency to billing currency exchange rate.
     */
    private double pcToBCExchangeRate;

    /**
     * The exchange rate date at which the pricing currency to billing currency exchange rate was determined.
     */
    private DateTime pcToBCExchangeRateDate;

    /**
     * The description for the price adjustment.
     */
    private String priceAdjustmentDescription;

    /**
     * The pricing currency code
     */
    private String pricingCurrency;

    /**
     * The product unique identifier.
     */
    private String productId;

    /**
     * The name for the product.
     */
    private String productName;

    /**
     * The publisher identifier associated with this purchase.
     */
    private String publisherId;

    /**
     * The publisher name associated with this purchase.
     */
    private String publisherName;

    /**
     * The number of units associated with this line item.
     */
    private int quantity;

    /**
     * The reseller MPN identifier of the indirect reseller associated with this line item.
     */
    private String resellerMpnId;

    /**
     * The sku unique identifier.
     */
    private String skuId;

    /**
     * The name for the SKU.
     */
    private String skuName;

    /**
     * The subscription description associated with this purchase.
     */
    private String subscriptionDescription;

    /**
     * The subscription identifier associated with this purchase.
     */
    private String subscriptionId;

    /**
     * The amount after discount.
     */
    private double subtotal;

    /**
     *  The taxes charged.
     */
    private double taxTotal;

    /**
     * The term and billing cycle associated with this purchase. 
     */
    private String termAndBillingCycle;

    /**
     * The total amount after discount and tax.
     */
    private double totalForCustomer;
    
    /**
     * The unit price for the line item.
     */
    private double unitPrice;

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
     * Gets the availability unique identifier.
     * 
     * @return The availability unique identifier.
     */
    public String getAvailabilityId()
    {
        return availabilityId;
    }

    /**
     * Sets the availability unique identifier.
     * 
     * @param value The availability unique identifier.
     */
    public void setAvailabilityId(String value)
    {
        availabilityId = value;
    }

    /**
     * Gets the billing provider
     * 
     * @return The billing provider.
     */
    @Override
    public BillingProvider getBillingProvider()
    {
        return BillingProvider.ONE_TIME;
    }

    /**
     * Gets the number of units purchased.
     * 
     * @return The number of units purchased.
     */
    public double getBillableQuantity()
    {
        return billableQuantity;
    }

    /**
     * Sets the number of units purchased.
     * 
     * @param value The number of units purchased.
     */
    public void setBillableQuantity(double value)
    {
        billableQuantity = value;
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
     * Gets the type of charge.
     * 
     * @return The type of charge.
     */
    public String getChargeType()
    {
        return chargeType;
    }

    /**
     * Sets the type of charge.
     * 
     * @param value The type of charge.
     */
    public void setChargeType(String value)
    {
        chargeType = value;
    }

    /**
     * Gets the currency used for this line item.
     * 
     * @return The currency used for this line item.
     */
    public String getCurrency()
    {
        return currency;
    }

    /**
     * Sets the currency used for this line item.
     * 
     * @param value The currency used for this line item.
     */
    public void setCurrency(String value)
    {
        currency = value;
    }

    /**
     * Gets the country for the customer.
     * 
     * @return Sets the country for the customer.
     */
    public String getCustomerCountry()
    {
        return customerCountry;
    }

    /**
     * Sets the country for the customer.
     * 
     * @param value The country for the customer.
     */
    public void setCustomerCountry(String value)
    {
        customerCountry = value;
    }

    /**
     * Gets the customer domain name.
     * 
     * @return The customer domain name.
     */
    public String getCustomerDomainName()
    {
        return customerDomainName;
    }

    /**
     * Sets the customer domain name.
     * 
     * @param value The customer domain name.
     */
    public void setCustomerDomainName(String value)
    {
        customerDomainName = value;
    }

    /**
     * Gets the customer identifier.
     * 
     * @return The customer identifier.
     */
    public String getCustomerId()
    {
        return customerId;
    }

    /**
     * Gets the name for the customer.
     * 
     * @return The name for the customer.
     */
    public String getCustomerName()
    {
        return customerName;
    }

    /**
     * Sets the name for the customer.
     * 
     * @param value The name of the customer.
     */
    public void setCustomerName(String value)
    {
        customerName = value;
    }

    /**
     * Sets the customer identifier.
     * 
     * @param value The customer identifier.
     */
    public void setCustomerId(String value)
    {
        customerId = value;
    }

    /**
     * Gets the discount details associated with this purchase.
     * 
     * @return The discount details associated with this purchase.
     */
    @Deprecated
    public String getDiscountDetails()
    {
        return discountDetails;
    }

    /**
     * Sets the discount details associated with this purchase.
     * 
     * @param value The discount details associated with this purchase.
     */
    @Deprecated
    public void setDiscountDetails(String value)
    {
        discountDetails = value;
    }

    /**
     * Gets the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
    @Override
    public InvoiceLineItemType getInvoiceLineItemType()
    {
        return InvoiceLineItemType.BILLINGLINEITEMS;
    }

    /**
     * Gets the invoice number.
     * 
     * @return The invoice number.
     */
    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    /**
     * Sets the invoice number.
     * 
     * @param value The invoice number.
     */
    public void setInvoiceNumber(String value)
    {
        invoiceNumber = value;
    }

    /**
     * Gets the MPN identifier associated to this line item.
     * 
     * @return The MPN identifier associated to this line item.
     */
    public String getMpnId()
    {
        return mpnId;
    }

    /**
     * Sets the MPN identifier associated to this line item.
     * 
     * @param value The MPN identifier associated to this line item.
     */
    public void setMpnId(String value)
    {
        mpnId = value;
    }

    /**
     * Gets the date when the order was created.
     * 
     * @return The date when the order was created.
     */
    public DateTime getOrderDate()
    {
        return orderDate;
    }

    /**
     * Sets the date when the order was created.
     * 
     * @param value The date when the order was created.
     */
    public void setOrderDate(DateTime value)
    {
        orderDate = value;
    }

    /**
     * Gets the order unique identifier.
     * 
     * @return The order unique identifier.
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * Sets the order unique identifier.
     * 
     * @param value The order unique identifier.
     */
    public void setOrderId(String value)
    {
        orderId = value;
    }

    /**
     * Gets the partner commerce account identifier.
     * 
     * @return The partner commerce account identifier.
     */
    public String getPartnerId()
    {
        return partnerId;
    }

    /**
     * Sets the partner commerce account identifier.
     * 
     * @param value The partner commerce account identifier.
     */
    public void setPartnerId(String value)
    {
        partnerId = value;
    }

    /**
     * Gets the pricing currency to billing currency exchange rate.
     *  
     * @return The pricing currency to billing currency exchange rate.
     */
    public double getPCToBCExchangeRate()
    {
        return pcToBCExchangeRate;
    }

    /**
     * Sets the pricing currency to billing currency exchange rate.
     * 
     * @param value The pricing currency to billing currency exchange rate.
     */
    public void setPCToBCExchangeRate(double value)
    {
        pcToBCExchangeRate = value;
    }

    /**
     * Gets the exchange rate date at which the pricing currency to billing currency exchange rate was determined.
     * 
     * @return The exchange rate date at which the pricing currency to billing currency exchange rate was determined.
     */
    public DateTime getPCToBCExchangeRateDate()
    {
        return pcToBCExchangeRateDate;
    }

    /**
     * Sets the exchange rate date at which the pricing currency to billing currency exchange rate was determined.
     * 
     * @param value The exchange rate date at which the pricing currency to billing currency exchange rate was determined.
     */
    public void setPCToBCExchangeRateDate(DateTime value)
    {
        pcToBCExchangeRateDate = value;
    }

    /**
     * Gets the description for the pricing adjustment.
     * 
     * @return The description for the pricing adjustment.
     */
    public String getPriceAdjustmentDescription()
    {
        return priceAdjustmentDescription;
    }

    /**
     * Sets the description for the pricing adjustment.
     * 
     * @param value The description for the pricing adjustment.
     */
    public void setPriceAdjustmentDescription(String value)
    {
        priceAdjustmentDescription = value;
    }

    /**
     * Gets the pricing currency.
     * 
     * @return The pricing currency.
     */
    public String getPricingCurrency()
    {
        return pricingCurrency;
    }

    /**
     * Sets the pricing currency.
     * 
     * @param value The pricing currency.
     */
    public void setPricingCurrency(String value)
    {
        pricingCurrency = value;
    }

    /**
     * Gets the product unique identifier.
     * 
     * @return The product unique identifier.
     */
    public String getProductId()
    {
        return productId;
    }

    /**
     * Gets the product unique identifier.
     *  
     * @param value The product unique identifier.
     */
    public void setProductId(String value)
    {
        productId = value;
    }

    /**
     * Gets the name for the product.
     * 
     * @return The name for the product.
     */
    public String getProductName()
    {
        return productName;
    }

    /**
     * Sets the name for the product.
     * 
     * @param value The name for the product.
     */
    public void setProductName(String value)
    {
        productName = value;
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
     * Gets the number of units associated with this line item.
     * 
     * @return The number of units associated with this line item.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the number of units associated with this line item.
     * 
     * @param value The number of units associated with this line item.
     */
    public void setQuantity(int value)
    {
        quantity = value;
    }

    /**
     * Gets the reseller MPN identifier of the indirect reseller associated with this line item.
     * 
     * @return The reseller MPN identifier of the indirect reseller associated with this line item.
     */
    public String getResellerMpnId()
    {
        return resellerMpnId;
    }

    /**
     * Sets the reseller MPN identifier of the indirect reseller associated with this line item.
     * 
     * @param value The reseller MPN identifier of the indirect reseller associated with this line item.
     */
    public void setResellerMpnId(String value)
    {
        resellerMpnId = value;
    }

    /**
     * Gets the SKU unique identifier.
     * 
     * @return The SKU unique identifier.
     */
    public String getSkuId()
    {
        return skuId;
    }

    /**
     * Sets the SKU unique identifier.
     * 
     * @param value The SKU unique identifier.
     */
    public void setSkuId(String value)
    {
        skuId = value;
    }

    /**
     * Gets the name for the SKU.
     * 
     * @return The name for the SKU.
     */
    public String getSkuName()
    {
        return skuName;
    }

    /**
     * Sets the name for the SKU.
     * 
     * @param value
     */
    public void setSkuName(String value)
    {
        skuName = value;
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
     * Gets the amount after discount.
     * 
     * @return The amount after discount.
     */
    public double getSubtotal()
    {
        return subtotal;
    }

    /**
     * Sets the amount after discount.
     * 
     * @param value The amount after discount.
     */
    public void setSubtotal(double value)
    {
        subtotal = value;
    }

    /**
     * Gets the taxes charged.
     * 
     * @return The taxes charged.
     */
    public double getTaxTotal()
    {
        return taxTotal;
    }

    /**
     * Sets the taxes charged.
     * 
     * @param value The taxes charged.
     */
    public void setTaxTotal(double value)
    {
        taxTotal = value;
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
     * Gets the total amount after discount and tax.
     * 
     * @return The total amount after discount and tax.
     */
    public double getTotalForCustomer()
    {
        return totalForCustomer;
    }

    /**
     * Sets the total amount after discount and tax.
     * 
     * @param value The total amount after discount and tax.
     */
    public void setTotalForCustomer(double value)
    {
        totalForCustomer = value;
    }

    /**
     * Gets the unit price for the line item.
     * 
     * @return The unit price for the line item.
     */
    public double getUnitPrice()
    {
        return unitPrice;
    }

    /**
     * Sets the unit price for the line item.
     * 
     * @param value The unit price for the line item.
     */
    public void setUnitPrice(double value)
    {
        unitPrice = value;
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
}