// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that represents an Quantity Detail.
 */
public class QuantityDetail {	
    /**
	 * Gets or sets quantity.
	 */
	@JsonProperty("quantity")
	private String __Quantity;

	public String getQuantity()
	{
		return __Quantity;
	}

	public void setQuantity(String value)
	{
		__Quantity = value;
	}

	/**
	 *Gets or sets Status.
	 */
	@JsonProperty("status")
	private String __Status;

	public String getStatus()
	{
		return __Status;
	}

	public void setStatus(String value)
	{
		__Status = value;
	}
}