// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private DateTime processedDateTime;

    public DateTime getProcessedDateTime()
    {
        return processedDateTime;
    }

    public void setProcessedDateTime(DateTime value)
    {
        processedDateTime = value;
    }

    /**
     * Gets or sets the Service name (Example : Office, CRM).
     */
    private String serviceName;

    public String getServiceName()
    {
        return serviceName;
    }

    public void setServiceName(String value)
    {
        serviceName = value;
    }

    /**
     * Gets or sets the Channel name of service (Example: Reseller, Direct).
     */
    private String channel;

    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String value)
    {
        channel = value;
    }
}