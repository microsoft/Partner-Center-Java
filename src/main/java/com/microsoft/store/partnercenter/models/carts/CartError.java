// -----------------------------------------------------------------------
// <copyright file="CartError.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents an error associated to a cart line item.
 */
public class CartError extends ResourceBase {
    /**
     * Gets or sets a cart error code.
     */
	@JsonProperty( "errorCode" )
    private CartErrorCode __ErrorCode;

    public CartErrorCode getErrorCode()
    {
        return __ErrorCode;
    }

    public void setErrorCode( CartErrorCode value )
    {
    	__ErrorCode = value;
    }

    /**
     * Gets or sets an error description.
     */
	@JsonProperty( "errorDescription" )
    private String __ErrorDescription;

    public String getErrorDescription()
    {
        return __ErrorDescription;
    }

    public void setErrorDescription( String value )
    {
    	__ErrorDescription = value;
    }
}