// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.store.partnercenter.utils.NestedResourceDeserializer;

import org.joda.time.DateTime;

/**
 * Represents un-billed, billed recon line items for daily rated usage.
 */
public class DailyRatedUsageLineItem
    extends InvoiceLineItem
{
    /**
     * The service-specific metadata. For example, an image type for a virtual machine.
     */
    @JsonDeserialize(using = NestedResourceDeserializer.class)
    private Map<String, Object> additionalInfo;

    /**
     * The availability identifier associated with the invoice line item.
     */
    private String availabilityId;

    /** 
     * The ISO currency in which the meter is charged in local currency of the customer or billing currency.
     */
    private String billingCurrency;

    /**
     * The extended cost or total cost before tax in local currency of the customer or billing currency.
     */
    private double billingPreTaxTotal;

    /**
     * The name of the customer domain associated with the invoice line item.
     */
    private String customerDomainName;

    /** 
     * The charge end date associated with the invoice line item.
     */
    private DateTime chargeEndDate;

    /**
     * The charge start date associated with the invoice line item.
     */
    private DateTime chargeStartDate;

    /**
     * The type of charge.
     */
    private String chargeType;

    /**
     * The service that was consumed.
     */
    private String consumedService;

    /** 
     * The country of the customer.
     */
    private String customerCountry;

    /**
     * The customer identifier associated with the invoice line item.
     */
    private String customerId; 

    /**
     * The customer name associated with the invoice line item.
     */
    private String customerName; 

    /**
     * The effective unit price.
     */
    private double effectiveUnitPrice;

    /**
     * The description for the entitlement.
     */
    private String entitlementDescription;

    /**
     * The identifier for the entitlement.
     */
    private String entitlementId;

    /**
     * The invoice number associated with the invoice line item.
     */
    private String invoiceNumber;

    /**
     * The meter category associated with the invoice line item.
     */
    private String meterCategory;

    /**
     * The meter identifier associated with the invoice line item.
     */
    private String meterId;

    /**
     * The name of the meter associated with the invoice line item.
     */
    private String meterName;

    /** 
     * The region of the meter associated with the invoice line item.
     */
    private String meterRegion;

    /**
     * The meter subcategory associated with the invoice line item.
     */
    private String meterSubCategory;

    /**
     * The type of meter associated with the invoice line item.
     */
    private String meterType;

    /**
     * The MPN Id associated to this line item.
     */
    private String mpnId;

    /**
     * The partner identifier associated with the invoice line item.
     */
    private String partnerId; 

    /**
     * The partner name associated with the invoice line item.
     */
    private String partnerName; 

    /**
     * The pricing currency to billing currency exchange rate.
     */
    private double pcToBCExchangeRate;

    /**
     * The pricing currency to billing currency exchange rate date.
     */
    private DateTime pcToBCExchangeRateDate;

    /**
     * The ISO currency in which the meter is charged in USD or catalog currency used for rating.
     */
    private String pricingCurrency;

    /**
     * The extended cost or total cost before tax in USD or catalog currency used for rating.
     */
    private double pricingPreTaxTotal;

    /** 
     * The product identifier associated with the invoice line item.
     */
    private String productId; 

    /**
     * The product name associated with the invoice line item type.
     */
    private String productName;

    /**
     * The publisher identifier associated with the invoice line item type.
     */
    private String publisherId;

    /**
     * The name of the publisher associated with the invoice line item type.
     */
    private String publisherName;

    /**
     * The quantity of usage
     */
    private double quantity;

    /**
     * The Reseller MPN identifier of the indirect reseller.
     */
    private String resellerMpnId;

    /**
     * The rate of partner earned credit.
     */
    private double rateOfPartnerEarnedCredit;

    /**
     * A flag indicating whether or not the item has rate of partner earned credit.
     */
    private boolean hasPartnerEarnedCredit;

    /**
     * The name of the resource group.
     */
    private String resourceGroup;

    /**
     * The location of the resources associated with the invoice line item type.
     */
    private String resourceLocation;

    /**
     * The URI of the resource.
     */
    private String resourceUri; 

    /**
     * The internal Azure Service Metadata.
     */
    private String serviceInfo1;

    /**
     * The service information for example, an image type for a virtual machine and ISP name for ExpressRoute.
     */
    private String serviceInfo2;

    /**
     * The SKU identifier associated with the invoice line item.
     */
    private String skuId;

    /**
     * The name of the SKU associated with the invoice line item.
     */
    private String skuName;
    
    /** 
     * The description of the subscription associated with the invoice line item type.
     */
    private String subscriptionDescription;

    /** 
     * The identifier of the subscription associated with the invoice line item.
     */
    private String subscriptionId;

    /**
     * The tags added by the customer.
     */
    @JsonDeserialize(using = NestedResourceDeserializer.class)
    private Map<String, Object> tags;

    /**
     * The unit of measure associated with the invoice line item.
     */
    private String unitOfMeasure;

    /**
     * The price of the unit.
     */
    private double unitPrice;

    /**
     * The type of the unit.
     */
    private String unitType;

    /**
     * The usage data associated with the invoice line item.
     */
    private DateTime usageDate;

    /**
     * Gets the service-specific metadata. For example, an image type for a virtual machine.
     * 
     * @return The service-specific metadata. For example, an image type for a virtual machine.
     */
    public Map<String, Object> getAdditionalInfo()
    {
        return additionalInfo;
    }

    /** 
     * Sets the service-specific metadata. For example, an image type for a virtual machine.
     * 
     * @param value The service-specific metadata. For example, an image type for a virtual machine.
    */
    public void setAdditionalInfo(Map<String, Object> value)
    {
        additionalInfo = value;
    }

    /**
     * Gets the availability identifier associated with the invoice line item.
     * 
     * @return The availability identifier associated with the invoice line item.
     */
    public String getAvailabilityId()
    {
        return availabilityId;
    }

    /** 
     * Sets the availability identifier associated with the invoice line item.
     * 
     * @param value The availability identifier associated with the invoice line item.
    */
    public void setAvailabilityId(String value)
    {
        availabilityId = value;
    }

    /**
     * Gets the ISO currency in which the meter is charged in local currency of the customer or billing currency.
     * 
     * @return The ISO currency in which the meter is charged in local currency of the customer or billing currency.
     */
    public String getBillingCurrency()
    {
        return billingCurrency;
    }

    /** 
     * Sets the ISO currency in which the meter is charged in local currency of the customer or billing currency.
     * 
     * @param value The ISO currency in which the meter is charged in local currency of the customer or billing currency.
    */
    public void setBillingCurrency(String value)
    {
        billingCurrency = value;
    }

    /**
     * Gets the extended cost or total cost before tax in local currency of the customer or billing currency.
     * 
     * @return The extended cost or total cost before tax in local currency of the customer or billing currency.
     */
    public double getBillingPreTaxTotal()
    {
        return billingPreTaxTotal;
    }

    /** 
     * Sets the extended cost or total cost before tax in local currency of the customer or billing currency.
     * 
     * @param value The extended cost or total cost before tax in local currency of the customer or billing currency.
    */
    public void setBillingPreTaxTotal(double value)
    {
        billingPreTaxTotal = value;
    }

    /**
     * Gets the type of billing provider.
     * 
     * @return The type of billing provider.
     */
    @Override
    public BillingProvider getBillingProvider() 
    {
        return BillingProvider.MARKETPLACE;
    }

    /**
     * Gets the charge start date associated with the invoice line item.
     * 
     * @return The charge start date associated with the invoice line item.
     */
    public DateTime getChargeEndDate()
    {
        return chargeEndDate;
    }

    /** 
     * Set the charge start date associated with the invoice line item.
     * 
     * @param value The charge start date associated with the invoice line item.
    */
    public void setChargeEndDate(DateTime value)
    {
        chargeEndDate = value;
    }

    /**
     * Gets the charge start date associated with the invoice line item.
     * 
     * @return The charge start date associated with the invoice line item.
     */
    public DateTime getChargeStartDate()
    {
        return chargeStartDate;
    }

    /** 
     * Set the charge start date associated with the invoice line item.
     * 
     * @param value The charge start date associated with the invoice line item.
    */
    public void setChargeStartDate(DateTime value)
    {
        chargeStartDate = value;
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
     * Set the type of charge.
     * 
     * @param value The type of charge.
    */
    public void setChargeType(String value)
    {
        chargeType = value;
    }

    /**
     * Gets the service that was consumed.
     * 
     * @return The service that was consumed.
     */
    public String getConsumedService()
    {
        return consumedService;
    }

    /** 
     * Set the service that was consumed.
     * 
     * @param value The service that was consumed.
    */
    public void setConsumedService(String value)
    {
        consumedService = value;
    }

    /**
     * Gets the name of the customer domain associated with the invoice line item.
     * 
     * @return The name of the customer domain associated with the invoice line item.
     */
    public String getCustomerDomainName()
    {
        return customerDomainName;
    }

    /** 
     * Sets the name of the customer domain associated with the invoice line item.
     * 
     * @param value The name of the customer domain associated with the invoice line item.
    */
    public void setCustomerDomainName(String value)
    {
        customerDomainName = value;
    }

    /**
     * Gets the country of the customer.
     * 
     * @return The country of the customer.
     */
    public String getCustomerCountry()
    {
        return customerCountry;
    }

    /** 
     * Sets the country of the customer.
     * 
     * @param value The country of the customer.
    */
    public void setCustomerCountry(String value)
    {
        customerCountry = value;
    }

    /**
     * Gets the customer identifier associated with the invoice line item.
     * 
     * @return The customer identifier associated with the invoice line item.
     */
    public String getCustomerId()
    {
        return customerId;
    }

    /** 
     * Sets the customer identifier associated with the invoice line item.
     * 
     * @param value The customer identifier associated with the invoice line item.
    */
    public void setCustomerId(String value)
    {
        customerId = value;
    }

    /**
     * Gets the customer name associated with the invoice line item.
     * 
     * @return The customer name associated with the invoice line item.
     */
    public String getCustomerName()
    {
        return customerName;
    }

    /** 
     * Sets the customer name associated with the invoice line item.
     * 
     * @param value The customer name associated with the invoice line item.
    */
    public void setCustomerName(String value)
    {
        customerName = value;
    }

    /**
     * Gets the effective unit price.
     * 
     * @return The effective unit price.
     */
    public double getEffectiveUnitPrice()
    {
        return effectiveUnitPrice;
    }

    /**
     * Sets the effective unit price.
     * 
     * @param value The effective unit price.
     */
    public void setEffectiveUnitPrice(double value)
    {
        effectiveUnitPrice = value;
    }

    /**
     * Gets the description for the entitlement.
     * 
     * @return The description for the entitlement.
     */
    public String getEntitlementDescription()
    {
        return entitlementDescription;
    }

    /**
     * Sets the description for the entitlement.
     * 
     * @param value The description for the entitlement.
     */
    public void setEntitlementDescription(String value)
    {
        entitlementDescription = value;
    }

    /**
     * Gets the identifier for the entitlement.
     * 
     * @return The identifier for the entitlement.
     */
    public String getEntitlementId()
    {
        return entitlementId;
    }

    /**
     * Sets the identifier for the entitlement.
     * 
     * @param value The identifier for the entitlement.
     */
    public void setEntitlementId(String value)
    {
        entitlementId = value;
    }

    /**
     * Gets the type of the invoice line item.
     * 
     * @return The type of invoice line item.
     */
    @Override
    public InvoiceLineItemType getInvoiceLineItemType() 
    {
        return InvoiceLineItemType.USAGELINEITEMS;
    }

    /**
     * Gets the invoice number associated with the invoice line item.
     * 
     * @return The invoice number associated with the invoice line item.
     */
    public String getInvoiceNumber()
    {
        return invoiceNumber;
    }

    /** 
     * Sets the invoice number associated with the invoice line item.
     * 
     * @param value The invoice number associated with the invoice line item.
    */
    public void setInvoiceNumber(String value)
    {
        invoiceNumber = value;
    }

    /**
     * Gets the meter category associated with the invoice line item.
     * 
     * @return The meter category associated with the invoice line item.
     */
    public String getMeterCategory()
    {
        return meterCategory;
    }

    /** 
     * Sets the meter category associated with the invoice line item.
     * 
     * @param value The meter category associated with the invoice line item.
    */
    public void setMeterCategory(String value)
    {
        meterCategory = value;
    }

    /**
     * Gets the meter identifier associated with the invoice line item.
     * 
     * @return The meter identifier associated with the invoice line item.
     */
    public String getMeterId()
    {
        return meterId;
    }

    /** 
     * Sets the meter identifier associated with the invoice line item.
     * 
     * @param value The meter identifier associated with the invoice line item.
    */
    public void setMeterId(String value)
    {
        meterId = value;
    }

    /**
     * Gets the name of the meter associated with the invoice line item.
     * 
     * @return The name of the meter associated with the invoice line item.
     */
    public String getMeterName()
    {
        return meterName;
    }

    /** 
     * Sets the name of the meter associated with the invoice line item.
     * 
     * @param value The name of the meter associated with the invoice line item.
    */
    public void setMeterName(String value)
    {
        meterName = value;
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
     * Gets the region of the meter associated with the invoice line item.
     * 
     * @return The region of the meter associated with the invoice line item.
     */
    public String getMeterRegion()
    {
        return meterRegion;
    }

    /** 
     * Sets the region of the meter associated with the invoice line item.
     * 
     * @param value The region of the meter associated with the invoice line item.
    */
    public void setMeterRegion(String value)
    {
        meterRegion = value;
    }

    /**
     * Gets the meter subcategory associated with the invoice line item.
     * 
     * @return The meter subcategory associated with the invoice line item.
     */
    public String getMeterSubCategory()
    {
        return meterSubCategory;
    }

    /** 
     * Sets the meter subcategory associated with the invoice line item.
     * 
     * @param value The meter subcategory associated with the invoice line item.
    */
    public void setMeterSubCategory(String value)
    {
        meterSubCategory = value;
    }

    /**
     * Gets the type of meter associated with the invoice line item.
     * 
     * @return The type of meter associated with the invoice line item.
     */
    public String getMeterType()
    {
        return meterType;
    }

    /** 
     * Sets the type of meter associated with the invoice line item.
     * 
     * @param value The type of meter associated with the invoice line item.
    */
    public void setMeterType(String value)
    {
        meterType = value;
    }

    /**
     * Gets the partner identifier associated with the invoice line item.
     * 
     * @return The partner identifier associated with the invoice line item.
     */
    public String getPartnerId()
    {
        return partnerId;
    }

    /** 
     * Sets the partner identifier associated with the invoice line item.
     * 
     * @param value The partner identifier associated with the invoice line item.
    */
    public void setPartnerId(String value)
    {
        partnerId = value;
    }

    /**
     * Gets the partner name associated with the invoice line item.
     * 
     * @return The partner name associated with the invoice line item.
     */
    public String getPartnerName()
    {
        return partnerName;
    }

    /** 
     * Sets the partner name associated with the invoice line item.
     * 
     * @param value The partner name associated with the invoice line item.
    */
    public void setPartnerName(String value)
    {
        partnerName = value;
    }

    /**
     * Gets the pricing currency to billing currency exchange rate.
     *  
     * @return The pricing currency to billing currency exchange rate.
     */
    @JsonProperty("pcToBCExchangeRate")
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
     * Gets the pricing currency to billing currency exchange rate date.
     * 
     * @return The pricing currency to billing currency exchange rate date.
     */
    @JsonProperty("pcToBCExchangeRateDate")
     public DateTime getPCToBCExchangeRateDate()
    {
        return pcToBCExchangeRateDate;
    }

    /**
     * Sets the pricing currency to billing currency exchange rate date.
     * 
     * @param value The pricing currency to billing currency exchange rate date.
     */
    public void setPCToBCExchangeRateDate(DateTime value)
    {
        pcToBCExchangeRateDate = value;
    }

    /**
     * Gets the ISO currency in which the meter is charged in USD or catalog currency used for rating.
     * 
     * @return The ISO currency in which the meter is charged in USD or catalog currency used for rating.
     */
    public String getPricingCurrency()
    {
        return pricingCurrency;
    }

    /** 
     * Sets the ISO currency in which the meter is charged in USD or catalog currency used for rating.
     * 
     * @param value The ISO currency in which the meter is charged in USD or catalog currency used for rating.
    */
    public void setPricingCurrency(String value)
    {
        pricingCurrency = value;
    }

    /**
     * Gets the extended cost or total cost before tax in USD or catalog currency used for rating.
     * 
     * @return The extended cost or total cost before tax in USD or catalog currency used for rating.
     */
    public double getPricingPreTaxTotal()
    {
        return pricingPreTaxTotal;
    }

    /** 
     * Sets the extended cost or total cost before tax in USD or catalog currency used for rating.
     * 
     * @param value The extended cost or total cost before tax in USD or catalog currency used for rating.
    */
    public void setPricingPreTaxTotal(double value)
    {
        pricingPreTaxTotal = value;
    }

    /**
     * Gets the product identifier associated with the invoice line item.
     * 
     * @return The product identifier associated with the invoice line item.
     */
    public String getProductId()
    {
        return productId;
    }

    /** 
     * Sets the product identifier associated with the invoice line item.
     * 
     * @param value The product identifier associated with the invoice line item.
    */
    public void setProductId(String value)
    {
        productId = value;
    }  

    /**
     * Gets the name of the product associated with the invoice line item.
     * 
     * @return The name of the product associated with the invoice line item.
     */
    public String getProductName()
    {
        return productName;
    }

    /** 
     * Sets the name of the product associated with the invoice line item.
     * 
     * @param value The name of the product associated with the invoice line item.
    */
    public void setProductName(String value)
    {
        productName = value;
    }  

    /**
     * Gets publisher identifier associated with the invoice line item type.
     * 
     * @return The publisher identifier associated with the invoice line item type.
     */
    public String getPublisherId()
    {
        return publisherId;
    }

    /** 
     * Sets the publisher identifier associated with the invoice line item type..
     * 
     * @param value The publisher identifier associated with the invoice line item type.
    */
    public void setPublisherId(String value)
    {
        publisherId = value;
    } 

    /**
     * Gets the name of the publisher associated with the invoice line item type.
     * 
     * @return The name of the publisher associated with the invoice line item type.
     */
    public String getPublisherName()
    {
        return publisherName;
    }

    /** 
     * Sets the name of the publisher associated with the invoice line item type.
     * 
     * @param value The name of the publisher associated with the invoice line item type.
    */
    public void setPublisherName(String value)
    {
        publisherName = value;
    }  

    /**
     * Gets the quantity of the usage. 
     * 
     * @return The quantity of the usage
     */
    public double getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity of the usage.
     * 
     * @param value The quantity of the usage.
     */
    public void setQuantity(double value)
    {
        quantity = value;
    }

    /**
     * Gets the rate of partner earned credit.
     * 
     * @return The rate of partner earned credit.
     */
    public double getRateOfPartnerEarnedCredit()
    {
        return rateOfPartnerEarnedCredit;
    }

    /**
     * Sets the rate of partner earned credit.
     * 
     * @param value The rate of partner earned credit.
     */
    public void setRateOfPartnerEarnedCredit(double value)
    {
        rateOfPartnerEarnedCredit = value;
    }

    /**
     * Gets flag indicating whether or not the item has rate of partner earned credit.
     *
     * @return The rate of partner earned credit.
     */
    public boolean getHasPartnerEarnedCredit()
    {
        return hasPartnerEarnedCredit;
    }

    /**
     * Sets flag indicating whether or not the item has rate of partner earned credit.
     *
     * @param value The rate of partner earned credit.
     */
    public void setHasPartnerEarnedCredit(boolean value)
    {
        hasPartnerEarnedCredit = value;
    }

    /**
     * Gets the MPN identifier of the indirect reseller.
     * 
     * @return The MPN identifier of the indirect reseller.
     */
    public String getResellerMpnId()
    {
        return resellerMpnId;
    }

    /** 
     * Sets the MPN identifier of the indirect reseller.
     * 
     * @param value The MPN identifier of the indirect reseller.
    */
    public void setResellerMpnId(String value)
    {
        resellerMpnId = value;
    } 

    /**
     * Gets the name of the resource group.
     * 
     * @return The name of the resource group.
     */
    public String getResourceGroup()
    {
        return resourceGroup;
    }

    /** 
     * Sets the name of the resource group.
     * 
     * @param value The name of the resource group.
    */
    public void setResourceGroup(String value)
    {
        resourceGroup = value;
    } 

    /**
     * Gets the location of the resource associated with the invoice line item type.
     * 
     * @return The location of the resource associated with the invoice line item type.
     */
    public String getResourceLocation()
    {
        return resourceLocation;
    }

    /** 
     * Sets the name of the publisher associated with the invoice line item type.
     * 
     * @param value The name of the publisher associated with the invoice line item type.
    */
    public void setResourceLocation(String value)
    {
        resourceLocation = value;
    } 

    /**
     * Gets the URI of the resource.
     * 
     * @return The URI of the resource.
     */
    public String getResourceUri()
    {
        return resourceUri;
    }

    /** 
     * Sets the URI of the resource.
     * 
     * @param value The URI of the resource.
    */
    public void setResourceUri(String value)
    {
        resourceUri = value;
    } 

    /**
     * Gets the internal Azure Service Metadata.
     * 
     * @return The internal Azure Service Metadata.
     */
    public String getServiceInfo1()
    {
        return serviceInfo1;
    }

    /** 
     * Sets the internal Azure Service Metadata.
     * 
     * @param value The the internal Azure Service Metadata.
    */
    public void setServiceInfo1(String value)
    {
        serviceInfo1 = value;
    }

    /**
     * Gets the service information for example, an image type for a virtual machine and ISP name for ExpressRoute.
     * 
     * @return The the service information for example, an image type for a virtual machine and ISP name for ExpressRoute.
     */
    public String getServiceInfo2()
    {
        return serviceInfo2;
    }

    /** 
     * Sets the service information for example, an image type for a virtual machine and ISP name for ExpressRoute.
     * 
     * @param value The service information for example, an image type for a virtual machine and ISP name for ExpressRoute.
    */
    public void setServiceInfo2(String value)
    {
        serviceInfo2 = value;
    }

    /**
     * Gets the SKU identifier associated with the invoice line item.
     * 
     * @return The SKU identifier associated with the invoice line item.
     */
    public String getSkuId()
    {
        return skuId;
    }

    /** 
     * Sets the SKU identifier associated with the invoice line item.
     * 
     * @param value The SKU identifier associated with the invoice line item.
    */
    public void setSkuId(String value)
    {
        skuId = value;
    }

    /**
     * Gets the SKU name associated with the invoice line item.
     * 
     * @return The SKU name associated with the invoice line item.
     */
    public String getSkuName()
    {
        return skuName;
    }

    /** 
     * Set the SKU name associated with the invoice line item.
     * 
     * @param value The SKU name associated with the invoice line item.
    */
    public void setSkuName(String value)
    {
        skuName = value;
    }

    /**
     * Gets the description of the subscription associated with the invoice line item.
     * 
     * @return The description of the subscription associated with the invoice line item.
     */
    public String getSubscriptionDescription()
    {
        return subscriptionDescription;
    }

    /** 
     * Sets the description of the subscription associated with the invoice line item.
     * 
     * @param value The description of the subscription associated with the invoice line item.
    */
    public void setSubscriptionDescription(String value)
    {
        subscriptionDescription = value;
    }

    /**
     * Gets the subscription identifier associated with the invoice line item.
     * 
     * @return The subscription identifier associated with the invoice line item.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /** 
     * Sets the subscription identifier associated with the invoice line item.
     * 
     * @param value The subscription identifier associated with the invoice line item.
    */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value;
    }

    /**
     * Gets the tags added by the customer.
     * 
     * @return The tags added by the customer.
     */
    public Map<String, Object> getTags()
    {
        return tags;
    }

    /**
     * Sets the tags added by the customer.
     * 
     * @param value The tags added by the customer.
     */
    public void setTags(Map<String, Object> value)
    {
        tags = value;
    }

    /**
     * Gets the unit of measure associated with the invoice line item.
     * 
     * @return The unit of measure associated with the invoice line item.
     */
    public String getUnitOfMeasure()
    {
        return unitOfMeasure;
    }

    /** 
     * Sets the unit of measure associated with the invoice line item.
     * 
     * @param value The unit of measure associated with the invoice line item.
    */
    public void setUnitOfMeasure(String value)
    {
        unitOfMeasure = value;
    }

    /**
     * Gets the price of the unit.
     * 
     * @return The price of the unit.
     */
    public double getUnitPrice()
    {
        return unitPrice;
    }

    /** 
     * Sets the price of the unit.
     * 
     * @param value The price of the unit.
    */
    public void setUnitPrice(double value)
    {
        unitPrice = value;
    }

    /**
     * Gets the type of the unit.
     * 
     * @return The type of the unit.
     */
    public String getUnitType()
    {
        return unitType;
    }

    /** 
     * Sets the type of the unit.
     * 
     * @param value The type of the unit.
    */
    public void setUnitType(String value)
    {
        unitType = value;
    }

    /**
     * Gets the usage data associated with the invoice line item.
     * 
     * @return The usage data associated with the invoice line item.
     */
    public DateTime getUsageDate()
    {
        return usageDate;
    }

    /** 
     * Sets the usage data associated with the invoice line item.
     * 
     * @param value The usage data associated with the invoice line item.
    */
    public void setUsageDate(DateTime value)
    {
        usageDate = value;
    }
}