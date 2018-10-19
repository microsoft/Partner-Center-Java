// -----------------------------------------------------------------------
// <copyright file="LicensesInsightsBase.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.analytics;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Encapsulation of common properties of all licenses' insights.
 */
public abstract class LicensesInsightsBase
    extends ResourceBase
{
    /**
     * Gets or sets the Last Processed date for data.
     */
    private DateTime __ProcessedDateTime;

    public DateTime getProcessedDateTime()
    {
        return __ProcessedDateTime;
    }

    public void setProcessedDateTime( DateTime value )
    {
        __ProcessedDateTime = value;
    }

    /**
     * Gets or sets the Service name (Example : Office, CRM).
     */
    private String __ServiceName;

    public String getServiceName()
    {
        return __ServiceName;
    }

    public void setServiceName( String value )
    {
        __ServiceName = value;
    }

    /**
     * Gets or sets the Channel name of service (Example: Reseller, Direct).
     */
    private String __Channel;

    public String getChannel()
    {
        return __Channel;
    }

    public void setChannel( String value )
    {
        __Channel = value;
    }
}