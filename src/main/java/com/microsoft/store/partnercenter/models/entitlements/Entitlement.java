// -----------------------------------------------------------------------
// <copyright file="Entitlement.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import java.util.Iterator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/***
 * Class that represents an entitlement.
 */
public class Entitlement
     extends ResourceBaseWithLinks<StandardResourceLinks> {
	/***
	 * Gets or sets included entitlements.
	 */
	@JsonProperty( "IncludedEntitlements" )
	private Iterator<Entitlement> __IncludedEntitlements;

	public Iterator<Entitlement> getIncludedEntitlements()
	{
		return __IncludedEntitlements;
	}

	public void setIncludedEntitlements( Iterator<Entitlement> value )
	{
		__IncludedEntitlements = value;
	}

	/***
	 * Gets or sets reference order related to the entitlement.
	 */
	@JsonProperty( "ReferenceOrder" )
	private ReferenceOrder __ReferenceOrder;

	public ReferenceOrder getReferenceOrder()
	{
		return __ReferenceOrder;
	}

	public void setReferenceOrder( ReferenceOrder value )
	{
		__ReferenceOrder = value;
	}

	/***
	 *  Gets or sets product id.
	 */
	@JsonProperty( "productId" )
	private String __ProductId;

	public String getProductId()
	{
		return __ProductId;
	}

	public void setProductId( String value )
	{
		__ProductId = value;
	}

	/***
	 * Gets or sets quantity.
	 */
	@JsonProperty( "Quantity" )
	private Integer __Quantity;

	public Integer getQuantity()
	{
		return __Quantity;
	}

	public void setQuantity( Integer value )
	{
		__Quantity = value;
	}

	/***
	 *  Gets or sets the quantity details (quantity - state).
	 */
	@JsonProperty( "quantityDetails" )
	private Iterator<QuantityDetail> __QuantityDetails;

	public Iterator<QuantityDetail> getQuantityDetails()
	{
		return __QuantityDetails;
	}

	public void setQuantityDetails( Iterator<QuantityDetail> value )
	{
		__QuantityDetails = value;
	}

	/***
	 *  Gets or sets collection of entitled artifacts.
	 */
	@JsonProperty( "entitledArtifacts" )
	private Iterator<Artifact> __EntitledArtifacts;

	public Iterator<Artifact> getEntitledArtifacts()
	{
		return __EntitledArtifacts;
	}

	public void setEntitledArtifacts( Iterator<Artifact> value )
	{
		__EntitledArtifacts = value;
	}

	/***
	 *   Gets or sets skuId.
	 */
	@JsonProperty( "skuId" )
	private String __SkuId;

	public String getSkuId()
	{
		return __SkuId;
	}

	public void setSkuId( String value )
	{
		__SkuId = value;
	}

	/***
	 *  Gets or sets entitlement type.
	 */
	@JsonProperty( "entitlementType" )
	private EntitlementType __EntitlementType;

	public EntitlementType getEntitlementType()
	{
		return __EntitlementType;
	}

	public void setEntitlementType( EntitlementType value )
	{
		__EntitlementType = value;
	}
}