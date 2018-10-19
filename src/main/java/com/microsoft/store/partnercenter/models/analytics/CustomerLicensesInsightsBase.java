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
     * Gets or sets the Customer Name.
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
     * Gets or sets the product/plan name of the given service. (Example: OFFICE 365 BUSINESS ESSENTIALS).
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
     * Gets or sets the Service Code of the License. Example (Office 365 : O365).
     */
    private String __ServiceCode;

    public String getServiceCode()
    {
        return __ServiceCode;
    }

    public void setServiceCode( String value )
    {
        __ServiceCode = value;
    }
}