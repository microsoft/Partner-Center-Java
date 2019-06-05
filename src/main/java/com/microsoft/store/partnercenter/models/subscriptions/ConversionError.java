// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents an error for the trial subscription conversion result.
 */
public class ConversionError
    extends ResourceBase
{
    /**
     * The error code associated with the issue.
     */
    private ConversionErrorCode code;

    /**
     * The friendly text describing the error.
     */
    private String description;

    /**
     * Gets the error code associated with the issue.
     * 
     * @return The error code associated with the issue.
     */
    public ConversionErrorCode getCode()
    {
        return code;
    }

    /**
     * Sets the error code associated with the issue.
     * 
     * @param value The error code associated with the issue.
     */
    public void setCode(ConversionErrorCode value)
    {
        code = value;
    }

    /**
     * Gets the friendly text describing the error.
     * 
     * @return The friendly text describing the error.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the friendly text describing the error.
     * 
     * @param value The friendly text describing the error.
     */
    public void setDescription(String value)
    {
        description = value;
    }
}