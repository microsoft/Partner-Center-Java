// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Represents common properties for Usage based invoice line items
 */
@JsonInclude(Include.NON_EMPTY)
public abstract class BaseUsageBasedLineItem
    extends InvoiceLineItem
{
    /**
     * Gets or sets the partner's commerce account Id.
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
     * Gets or sets the partner's Name.
     */
    private String __PartnerName;

    public String getPartnerName()
    {
        return __PartnerName;
    }

    public void setPartnerName(String value)
    {
        __PartnerName = value;
    }

    /**
     * Gets or sets the partner billable account Id.
     */
    private String __PartnerBillableAccountId;

    public String getPartnerBillableAccountId()
    {
        return __PartnerBillableAccountId;
    }

    public void setPartnerBillableAccountId(String value)
    {
        __PartnerBillableAccountId = value;
    }

    /**
     * Gets or sets the customer company name.
     */
    private String __CustomerCompanyName;

    public String getCustomerCompanyName()
    {
        return __CustomerCompanyName;
    }

    public void setCustomerCompanyName(String value)
    {
        __CustomerCompanyName = value;
    }

    /**
     * Gets or sets the partner's Microsoft Partner Network Id.
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
     * Gets or sets the Tier 2 Partner's Microsoft Partner Network Id.
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
     * Gets or sets the invoice number.
     */
    private String __InvoiceNumber;

    public String getInvoiceNumber()
    {
        return __InvoiceNumber;
    }

    public void setInvoiceNumber(String value)
    {
        __InvoiceNumber = value;
    }

    /**
     * Gets or sets the subscription Id.
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
     * Gets or sets the subscription name.
     */
    private String __SubscriptionName;

    public String getSubscriptionName()
    {
        return __SubscriptionName;
    }

    public void setSubscriptionName(String value)
    {
        __SubscriptionName = value;
    }

    /**
     * Gets or sets the description of the subscription.
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

    /**
     * Gets or sets the order Id.
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
     * Gets or sets the service name. Example: Azure Data Service
     */
    private String __ServiceName;

    public String getServiceName()
    {
        return __ServiceName;
    }

    public void setServiceName(String value)
    {
        __ServiceName = value;
    }

    /**
     * Gets or sets the service type. Example: Azure SQL Azure DB.
     */
    private String __ServiceType;

    public String getServiceType()
    {
        return __ServiceType;
    }

    public void setServiceType(String value)
    {
        __ServiceType = value;
    }

    /**
     * Gets or sets the resource identifier.
     */
    private String __ResourceGuid;

    public String getResourceGuid()
    {
        return __ResourceGuid;
    }

    public void setResourceGuid(String value)
    {
        __ResourceGuid = value;
    }

    /**
     * Gets or sets the resource name. Example: Database (GB/month)
     */
    private String __ResourceName;

    public String getResourceName()
    {
        return __ResourceName;
    }

    public void setResourceName(String value)
    {
        __ResourceName = value;
    }

    /**
     * Gets or sets the region associated with the resource instance.
     */
    private String __Region;

    public String getRegion()
    {
        return __Region;
    }

    public void setRegion(String value)
    {
        __Region = value;
    }

    /**
     * Gets or sets the total units consumed.
     */
    private double __ConsumedQuantity;

    public double getConsumedQuantity()
    {
        return __ConsumedQuantity;
    }

    public void setConsumedQuantity(double value)
    {
        __ConsumedQuantity = value;
    }

    /**
     * Gets or sets the date charge begins.
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
     * Gets or sets the date charge ends.
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
     * Gets or sets the unit of measure for azure usage.
     */
    private String __Unit;

    public String getUnit()
    {
        return __Unit;
    }

    public void setUnit(String value)
    {
        __Unit = value;
    }

    /**
     * Gets or sets the billing cycle type.
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
     *  Gets or sets The customer identifier.
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
     * Gets or sets the domain name.
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
     * Returns the billing provider
     * 
     * @return The billing provider.
     */
    public BillingProvider getBillingProvider()
    {
        return BillingProvider.AZURE;
    }
}
