// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class OneTimeInvoiceLineItemTest
{
    @Test
    void getAlternateId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "alternateId";

        lineItem.setAlternateId(value);

        assertEquals(value, lineItem.getAlternateId());
    }

    @Test
    void getAvailabilityId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "availabilityId";

        lineItem.setAvailabilityId(value);

        assertEquals(value, lineItem.getAvailabilityId());
    }

    @Test
    void getBillingFrequency()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "annual";

        lineItem.setBillingFrequency(value);

        assertEquals(value, lineItem.getBillingFrequency());  
    }

    @Test
    void getBillableQuantity()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 2.0;

        lineItem.setBillableQuantity(value);

        assertEquals(value, lineItem.getBillableQuantity());
    }

    @Test
    void getChargeEndDate()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        DateTime value = DateTime.now();

        lineItem.setChargeEndDate(value);

        assertEquals(value, lineItem.getChargeEndDate());
    }

    @Test
    void getChargeStartDate()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        DateTime value = DateTime.now();

        lineItem.setChargeStartDate(value);

        assertEquals(value, lineItem.getChargeStartDate());
    }

    @Test
    void getChargeType()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "new";

        lineItem.setChargeType(value);

        assertEquals(value, lineItem.getChargeType());
    }

    @Test
    void getCurrency()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "USD";

        lineItem.setCurrency(value);

        assertEquals(value, lineItem.getCurrency());
    }

    @Test
    void getCustomerCountry()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "US";

        lineItem.setCustomerCountry(value);

        assertEquals(value, lineItem.getCustomerCountry());
    }

    @Test
    void getCustomerDomainName()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "contoso.onmicrosoft.com";

        lineItem.setCustomerDomainName(value);

        assertEquals(value, lineItem.getCustomerDomainName());
    }

    @Test
    void getCustomerId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "153bac3f-9718-4d4c-8dd4-3fcbb2cb527a";

        lineItem.setCustomerId(value);

        assertEquals(value, lineItem.getCustomerId());
    }

    @Test
    void getCustomerName()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "Contoso";

        lineItem.setCustomerName(value);

        assertEquals(value, lineItem.getCustomerName());
    }

    @Test
    void getDiscountDetails()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "discount details";

        lineItem.setDiscountDetails(value);

        assertEquals(value, lineItem.getDiscountDetails());
    }

    @Test
    void getInvoiceNumber()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "T000029070";

        lineItem.setInvoiceNumber(value);

        assertEquals(value, lineItem.getInvoiceNumber());
    }

    @Test
    void getMeterDescription()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "description";

        lineItem.setMeterDescription(value);

        assertEquals(value, lineItem.getMeterDescription());
    }

    @Test
    void getMpnId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "9999999";

        lineItem.setMpnId(value);

        assertEquals(value, lineItem.getMpnId());
    }

    @Test
    void getOrderDate()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        DateTime value = DateTime.now();

        lineItem.setOrderDate(value);

        assertEquals(value, lineItem.getOrderDate());
    }

    @Test
    void getOrderId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "VpavdBbWSOR3FVgh88NzTrlN3cyXW2QO1";

        lineItem.setOrderId(value);

        assertEquals(value, lineItem.getOrderId());
    }

    @Test
    void getPartnerId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "ef344cb4-0f40-4f11-91bd-39c93d6baee3";

        lineItem.setPartnerId(value);

        assertEquals(value, lineItem.getPartnerId());
    }

    @Test
    void getPCToBCExchangeRate()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 1;

        lineItem.setPCToBCExchangeRate(value);

        assertEquals(value, lineItem.getPCToBCExchangeRate());
    }

    @Test
    void getPCToBCExchangeRateDate()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        DateTime value = DateTime.now();

        lineItem.setPCToBCExchangeRateDate(value);

        assertEquals(value, lineItem.getPCToBCExchangeRateDate());
    }

    @Test
    void getPriceAdjustmentDescription()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "description";

        lineItem.setPriceAdjustmentDescription(value);

        assertEquals(value, lineItem.getPriceAdjustmentDescription());
    }

    @Test
    void getPricingCurrency()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "USD";

        lineItem.setPricingCurrency(value);

        assertEquals(value, lineItem.getPricingCurrency());
    }

    @Test
    void getProductId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "DZH318Z0BNVX";

        lineItem.setProductId(value);

        assertEquals(value, lineItem.getProductId());
    }

    @Test
    void getProductName()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "Bandwidth";

        lineItem.setProductName(value);

        assertEquals(value, lineItem.getProductName());
    }

    @Test
    void getPublisherId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "Publisher";

        lineItem.setPublisherId(value);

        assertEquals(value, lineItem.getPublisherId());
    }

    @Test
    void getQuantity()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        int value = 10;

        lineItem.setQuantity(value);

        assertEquals(value, lineItem.getQuantity());
    }

    @Test
    void getResellerMpnId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "9999999";

        lineItem.setResellerMpnId(value);

        assertEquals(value, lineItem.getResellerMpnId());
    }

    @Test
    void getSkuId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "006F";

        lineItem.setSkuId(value);

        assertEquals(value, lineItem.getSkuId());
    }

    @Test
    void getSkuName()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "General Block Blob - 10K All Other Operations";

        lineItem.setSkuName(value);

        assertEquals(value, lineItem.getSkuName());
    }

    @Test
    void getSubscriptionDescription()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "Microsoft Azure Plan";

        lineItem.setSubscriptionDescription(value);

        assertEquals(value, lineItem.getSubscriptionDescription());
    }

    @Test
    void getSubscriptionId()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "985cc800-1b8d-4290-a787-f745c7db0461";

        lineItem.setSubscriptionId(value);

        assertEquals(value, lineItem.getSubscriptionId());
    }

    @Test
    void getSubtotal()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 10.00;

        lineItem.setSubtotal(value);

        assertEquals(value, lineItem.getSubtotal());
    }

    @Test
    void getTaxTotal()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 10.00;

        lineItem.setTaxTotal(value);

        assertEquals(value, lineItem.getTaxTotal());
    }

    @Test
    void getTermAndBillingCycle()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "Data Transfer Out (GB)";

        lineItem.setTermAndBillingCycle(value);

        assertEquals(value, lineItem.getTermAndBillingCycle());
    }

    @Test
    void getTotalForCustomer()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 100;

        lineItem.setTotalForCustomer(value);

        assertEquals(value, lineItem.getTotalForCustomer());
    }

    @Test
    void getUnitPrice()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        double value = 15;

        lineItem.setUnitPrice(value);

        assertEquals(value, lineItem.getUnitPrice());
    }

    @Test
    void getUnitType()
    {
        OneTimeInvoiceLineItem lineItem = new OneTimeInvoiceLineItem();
        String value = "1 Hour";

        lineItem.setUnitType(value);

        assertEquals(value, lineItem.getUnitType());
    }
}