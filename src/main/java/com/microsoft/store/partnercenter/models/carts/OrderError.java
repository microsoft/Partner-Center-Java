// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.carts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents an error with an order.
 */
public class OrderError 
    extends ResourceBase
{
    /**
     * Gets or sets the order group identifier with failure.
     */
	@JsonProperty("orderGroupId")
    private String orderGroupId;

    public String getOrderGroupId()
    {
        return orderGroupId;
    }

    public void setOrderGroupId(String value)
    {
    	orderGroupId = value;
    }

    /**
     * Gets or sets the error code associated with the issue.
     */
	@JsonProperty("code")
    private int code;

    public int getCode()
    {
        return code;
    }

    public void setCode(int value)
    {
    	code = value;
    }

    /**
     * Gets or sets the description of the issue.
     */
	@JsonProperty("description")
    private String description;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String value)
    {
    	description = value;
    }
 }