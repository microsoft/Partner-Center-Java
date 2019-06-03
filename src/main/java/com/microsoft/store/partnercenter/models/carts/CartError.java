// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
	@JsonProperty("errorCode")
    private CartErrorCode errorCode;

    public CartErrorCode getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(CartErrorCode value)
    {
    	errorCode = value;
    }

    /**
     * Gets or sets an error description.
     */
	@JsonProperty("errorDescription")
    private String errorDescription;

    public String getErrorDescription()
    {
        return errorDescription;
    }

    public void setErrorDescription(String value)
    {
    	errorDescription = value;
    }
}