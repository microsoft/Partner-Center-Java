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
     * The error encountered while attempting to perform the conversion, if applicable.
     */
    private ConversionError error;

    /**
     * The original offer identifier.
     */
    private String offerId;

    /**
     * The subscription identifier
     */
    private String subscriptionId;

    /**
     * The target offer identifier.
     */
    private String targetOfferId;

    /**
     * Gets the error encountered while attempting to perform the conversion, if applicable.
     * 
     * @return The error encountered while attempting to perform the conversion, if applicable.
     */
    public ConversionError getError()
    {
        return error;
    }

    /**
     * Sets the error encountered while attempting to perform the conversion, if applicable.
     * 
     * @param value The  error encountered while attempting to perform the conversion, if applicable.
     */
    public void setError(ConversionError value)
    {
        error = value;
    }

    /**
     * The original offer identifier.
     *
     * @return The original offer identifier.
     */
   public String getOfferId()
    {
        return offerId;
    }

    /**
     * Sets the original offer identifier.
     * 
     * @param value The original offer identifier.
     */
    public void setOfferId(String value)
    {
        offerId = value;
    }

    /**
     * Gets the subscription identifier.
     * 
     * @return The subscription identifier.
     */
    public String getSubscriptionId()
    {
        return subscriptionId;
    }

    /**
     * Sets the subscription identifier.
     * 
     * @param value The subscription identifier.
     */
    public void setSubscriptionId(String value)
    {
        subscriptionId = value;
    }

    /**
     * Gets the target offer identifier.
     * 
     * @return The target offer identifier.
     */
    public String getTargetOfferId()
    {
        return targetOfferId;
    }

    /**
     * Sets the target offer identifier.
     * 
     * @param value The target offer identifier.
     */
    public void setTargetOfferId(String value)
    {
        targetOfferId = value;
    }
}