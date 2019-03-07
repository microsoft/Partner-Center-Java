// -----------------------------------------------------------------------
// <copyright file="ReferenceOrder.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents an order linked to the entitlement.
 */
public class ReferenceOrder
	 extends ResourceBaseWithLinks<StandardResourceLinks> 
{
	@JsonProperty("alternateId")
	private String alternateId; 

	@JsonProperty("id")
	private String id;

	@JsonProperty("lineItemId")
	private String lineItemId;
	
	/**
	 * Gets the alternate identifier value.
	 * 
	 * @return The value of the alternate identifier.
	 */
	public String getAlternateId()
	{
		return alternateId;
	}

	/**
	 * Sets the alternate identifier value.
	 * 
	 * @param value The value of the alternate identifier.
	 */
	public void setAlternateId(String value)
	{
		alternateId = value;
	}

	/**
	 * Gets the identifier value.
	 * 
	 * @return The value of the identifier.
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the identifier value.
	 * 
	 * @param value The value of the identifier.
	 */
	public void setId( String value )
	{
		id = value;
	}

	/**
	 * Gets the line item identifier value.
	 * 
	 * @return The value of the line item identifier.
	 */
	public String getLineItemId()
	{
		return lineItemId;
	}

	/**
	 * Sets the line item identifier value.
	 * 
	 * @param value The value of the line item identifier.
	 */
	public void setLineItemId( String value )
	{
		lineItemId = value;
	}
}