// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents the result of performing a subscription conversion.
 */
public class ConversionResult
    extends ResourceBase
{
    /**
     * Gets or sets the original offer id.
     */
    private String __OfferId;

    public String getOfferId()
    {
        return __OfferId;
    }

    public void setOfferId(String value)
    {
        __OfferId = value;
    }

    /**
     * Gets or sets the target offer id.
     */
    private String __TargetOfferId;

    public String getTargetOfferId()
    {
        return __TargetOfferId;
    }

    public void setTargetOfferId(String value)
    {
        __TargetOfferId = value;
    }

    /**
     * Gets or sets the subscription id.
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
     * Gets or sets the error encountered while attempting to perform the conversion, if applicable.
     */
    private ConversionError __Error;

    public ConversionError getError()
    {
        return __Error;
    }

    public void setError(ConversionError value)
    {
        __Error = value;
    }
}