// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class DailyRatedUsageLineItemTest
{
    @Test
    void getAvailabilityId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "availabilityId";

        lineItem.setAvailabilityId(value);

        assertEquals(value, lineItem.getAvailabilityId());
    }

    @Test
    void getBillingCurrency()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "USD";

        lineItem.setBillingCurrency(value);

        assertEquals(value, lineItem.getBillingCurrency());
    }

    @Test
    void getBillingPreTaxTotal()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 12.54;

        lineItem.setBillingPreTaxTotal(value);

        assertEquals(value, lineItem.getBillingPreTaxTotal());
    }

    @Test
    void getBillingProvider()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();

        assertEquals(BillingProvider.MARKETPLACE, lineItem.getBillingProvider());
    }

    @Test
    void getChargeEndDate()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        DateTime value = DateTime.now();

        lineItem.setChargeEndDate(value);

        assertEquals(value, lineItem.getChargeEndDate());
    }

    @Test
    void getChargeStartDate()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        DateTime value = DateTime.now();

        lineItem.setChargeStartDate(value);

        assertEquals(value, lineItem.getChargeStartDate());
    }

    @Test
    void getChargeType()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "New";

        lineItem.setChargeType(value);

        assertEquals(value, lineItem.getChargeType());
    }

    @Test
    void getConsumedService()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Microsoft.Compute";

        lineItem.setConsumedService(value);

        assertEquals(value, lineItem.getConsumedService());
    }

    @Test
    void getCustomerCountry()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "US";

        lineItem.setCustomerCountry(value);

        assertEquals(value, lineItem.getCustomerCountry());
    }

    @Test
    void getCustomerDomainName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "consoto.onmicrosoft.com";

        lineItem.setCustomerDomainName(value);

        assertEquals(value, lineItem.getCustomerDomainName());
    }

    @Test
    void getCustomerId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "93934d7d-6a71-4faa-8370-4529dd2ee15c";

        lineItem.setCustomerId(value);

        assertEquals(value, lineItem.getCustomerId());
    }

    @Test
    void getCustomerName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Contoso";

        lineItem.setCustomerName(value);

        assertEquals(value, lineItem.getCustomerName());
    }

    @Test
    void getEffectiveUnitPrice()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 8.50;

        lineItem.setEffectiveUnitPrice(value);

        assertEquals(value, lineItem.getEffectiveUnitPrice());
    }

    @Test
    void getEntitlementDescription()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Partner subscription";

        lineItem.setEntitlementDescription(value);

        assertEquals(value, lineItem.getEntitlementDescription());
    }

    @Test
    void getEntitlementId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "66bada28-271e-4b7a-aaf5-c0ead63923d7";

        lineItem.setEntitlementId(value);

        assertEquals(value, lineItem.getEntitlementId());
    }

    @Test
    void getInvoiceNumber()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "T000029070";

        lineItem.setInvoiceNumber(value);

        assertEquals(value, lineItem.getInvoiceNumber());
    }

    @Test
    void getMeterCategory()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Virtual Machines";

        lineItem.setMeterCategory(value);

        assertEquals(value, lineItem.getMeterCategory());
    }    

    @Test
    void getMeterId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "61c56ff5-c910-461d-9cf5-941c9749927c";

        lineItem.setMeterId(value);

        assertEquals(value, lineItem.getMeterId());
    }    

    @Test
    void getMeterName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "B4ms";

        lineItem.setMeterName(value);

        assertEquals(value, lineItem.getMeterName());
    }   

    @Test
    void getMeterRegion()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "US Central";

        lineItem.setMeterRegion(value);

        assertEquals(value, lineItem.getMeterRegion());
    }

    @Test
    void getMeterSubCategory()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Virtual Machines BS Series Windows";

        lineItem.setMeterSubCategory(value);

        assertEquals(value, lineItem.getMeterSubCategory());
    }

    @Test
    void getMeterType()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "1 Compute Hour";

        lineItem.setMeterType(value);

        assertEquals(value, lineItem.getMeterType());
    }

    @Test
    void getMpnId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "9999999";

        lineItem.setMpnId(value);

        assertEquals(value, lineItem.getMpnId());
    }

    @Test
    void getPCToBCExchangeRate()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 1;

        lineItem.setPCToBCExchangeRate(value);

        assertEquals(value, lineItem.getPCToBCExchangeRate());
    }

    @Test
    void getPCToBCExchangeRateDate()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        DateTime value = DateTime.now();

        lineItem.setPCToBCExchangeRateDate(value);

        assertEquals(value, lineItem.getPCToBCExchangeRateDate());
    }

    @Test
    void getPartnerId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "a2af8935-6aac-46c0-92e6-0fa241ab877e";

        lineItem.setPartnerId(value);

        assertEquals(value, lineItem.getPartnerId());
    }

    @Test
    void getPartnerName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Partner Name";

        lineItem.setPartnerName(value);

        assertEquals(value, lineItem.getPartnerName());
    }

    @Test
    void getPricingCurrency()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "USD";

        lineItem.setPricingCurrency(value);

        assertEquals(value, lineItem.getPricingCurrency());
    }

    @Test
    void getPricingPreTaxTotal()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 4.0379491462;

        lineItem.setPricingPreTaxTotal(value);

        assertEquals(value, lineItem.getPricingPreTaxTotal());
    }

    @Test
    void getProductId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "DZH318Z0BNVX";

        lineItem.setProductId(value);

        assertEquals(value, lineItem.getProductId());
    }

    @Test
    void getProductName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Bandwidth";

        lineItem.setProductName(value);

        assertEquals(value, lineItem.getProductName());
    }

    @Test
    void getPublisherId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "PublisherId";

        lineItem.setPublisherId(value);

        assertEquals(value, lineItem.getPublisherId());
    }

    @Test
    void getPublisherName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Publisher";

        lineItem.setPublisherName(value);

        assertEquals(value, lineItem.getPublisherName());
    }

    @Test
    void getRateOfPartnerEarnedCredit()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 15;

        lineItem.setRateOfPartnerEarnedCredit(value);

        assertEquals(value, lineItem.getRateOfPartnerEarnedCredit());
    }

    @Test
    void getResellerMpnId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "9999999";

        lineItem.setResellerMpnId(value);

        assertEquals(value, lineItem.getResellerMpnId());
    }

    @Test
    void getResourceGroup()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "MyResourceGroup";

        lineItem.setResourceGroup(value);

        assertEquals(value, lineItem.getResourceGroup());
    }

    @Test
    void getResourceLocation()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "EASTUS";

        lineItem.setResourceLocation(value);

        assertEquals(value, lineItem.getResourceLocation());
    }

    @Test
    void getResourceUri()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "/subscriptions/31cdf47f-b249-4edd-9319-637862d8c0b4/resourceGroups/DAILYRATEDUSAGESRG/providers/Microsoft.Compute/virtualMachines/testvm1";

        lineItem.setResourceUri(value);

        assertEquals(value, lineItem.getResourceUri());
    }

    @Test
    void getServiceInfo1()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "service info 1";

        lineItem.setServiceInfo1(value);

        assertEquals(value, lineItem.getServiceInfo1());
    }

    @Test
    void getServiceInfo2()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "service info 2";
        
        lineItem.setServiceInfo2(value);

        assertEquals(value, lineItem.getServiceInfo2());
    }

    @Test
    void getSkuId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "006F";
        
        lineItem.setSkuId(value);

        assertEquals(value, lineItem.getSkuId());
    }

    @Test
    void getSkuName()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "General Block Blob - 10K All Other Operations";
        
        lineItem.setSkuName(value);

        assertEquals(value, lineItem.getSkuName());
    }

    @Test
    void getSubscriptionDescription()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "Microsoft Azure Plan";
        
        lineItem.setSubscriptionDescription(value);

        assertEquals(value, lineItem.getSubscriptionDescription());
    }

    @Test
    void getSubscriptionId()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "4e11e335-454b-4925-b95a-e2a77f222f73";
        
        lineItem.setSubscriptionId(value);

        assertEquals(value, lineItem.getSubscriptionId());
    }

    @Test
    void getUnitOfMeasure()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "1 Hour";
        
        lineItem.setUnitOfMeasure(value);

        assertEquals(value, lineItem.getUnitOfMeasure());
    }

    @Test
    void getUnitPrice()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        double value = 0.2;
        
        lineItem.setUnitPrice(value);

        assertEquals(value, lineItem.getUnitPrice());
    }

    @Test
    void getUnitType()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        String value = "1 Hour";
        
        lineItem.setUnitType(value);

        assertEquals(value, lineItem.getUnitType());
    }

    @Test
    void getUsageDate()
    {
        DailyRatedUsageLineItem lineItem = new DailyRatedUsageLineItem();
        DateTime value = DateTime.now();
        
        lineItem.setUsageDate(value);

        assertEquals(value, lineItem.getUsageDate());
    }
}