// -----------------------------------------------------------------------
// <copyright file="CustomerLicensesInsightsBase.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

/**
 * Class that represents the currency related information.
 */
public abstract class CustomerLicensesInsightsBase
{
    /**
     * Gets or sets The customer identifier.
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
     * Gets or sets the Customer Name.
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
     * Gets or sets the product/plan name of the given service. (Example: OFFICE 365 BUSINESS ESSENTIALS).
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
     * Gets or sets the Service Code of the License. Example (Office 365 : O365).
     */
    private String serviceCode;

    public String getServiceCode()
    {
        return serviceCode;
    }

    public void setServiceCode( String value )
    {
        serviceCode = value;
    }
}