// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.invoices;

import org.joda.time.DateTime;

/**
 * Invoice Usage Line item for usage based subscriptions
 */
public class DailyUsageLineItem
    extends BaseUsageBasedLineItem
{
    /**
     * Gets or sets the customer billable account.
     */
    private String __CustomerBillableAccount;

    public String getCustomerBillableAccount()
    {
        return __CustomerBillableAccount;
    }

    public void setCustomerBillableAccount(String value)
    {
        __CustomerBillableAccount = value;
    }

    /**
     * Gets or sets the usage date the resource.
     */
    private DateTime __UsageDate;

    public DateTime getUsageDate()
    {
        return __UsageDate;
    }

    public void setUsageDate(DateTime value)
    {
        __UsageDate = value;
    }

    /**
     * Gets or sets the metered service name. Example: Storage
     */
    private String __MeteredService;

    public String getMeteredService()
    {
        return __MeteredService;
    }

    public void setMeteredService(String value)
    {
        __MeteredService = value;
    }

    /**
     * Gets or sets the metered service type. Example: External
     */
    private String __MeteredServiceType;

    public String getMeteredServiceType()
    {
        return __MeteredServiceType;
    }

    public void setMeteredServiceType(String value)
    {
        __MeteredServiceType = value;
    }

    /**
     * Gets or sets the metered region. Example: West US
     */
    private String __MeteredRegion;

    public String getMeteredRegion()
    {
        return __MeteredRegion;
    }

    public void setMeteredRegion(String value)
    {
        __MeteredRegion = value;
    }

    /**
     * Gets or sets the project or instance name.
     */
    private String __Project;

    public String getProject()
    {
        return __Project;
    }

    public void setProject(String value)
    {
        __Project = value;
    }

    /**
     * Gets or sets the additional service information.
     */
    private String __ServiceInfo;

    public String getServiceInfo()
    {
        return __ServiceInfo;
    }

    public void setServiceInfo(String value)
    {
        __ServiceInfo = value;
    }

    /**
     * Returns the type of invoice line item
     * 
     * @return The type of invoice line item.
     */
    public InvoiceLineItemType getInvoiceLineItemType()
    {
        return InvoiceLineItemType.USAGELINEITEMS;
    }
}