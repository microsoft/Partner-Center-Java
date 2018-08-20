// -----------------------------------------------------------------------
// <copyright file="ReferenceOrder.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/***
 * Class that represents an order linked to the entitlement.
 */
public class ReferenceOrder
     extends ResourceBaseWithLinks<StandardResourceLinks> {
	/***
	 * Gets or sets order id.
	 */
	@JsonProperty( "id" )
	private String __Id;

	public String getId()
	{
		return __Id;
	}

	public void setId( String value )
	{
		__Id = value;
	}

	/***
	 * Gets or sets order line item id.
	 */
	@JsonProperty( "lineItemId" )
	private String __LineItemId;

	public String getLineItemId()
	{
		return __LineItemId;
	}

	public void setLineItemId( String value )
	{
		__LineItemId = value;
	}
}