// -----------------------------------------------------------------------
// <copyright file="Conversion.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents an error for the trial subscription conversion result.
 */
public class ConversionError
    extends ResourceBase
{
    /**
     * Gets or sets the error code associated with the issue.
     */
    private ConversionErrorCode __Code;

    public ConversionErrorCode getCode()
    {
        return __Code;
    }

    public void setCode( ConversionErrorCode value )
    {
        __Code = value;
    }

    /**
     * Gets or sets the friendly text describing the error.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
        __Description = value;
    }
}