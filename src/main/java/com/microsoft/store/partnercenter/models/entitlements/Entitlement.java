// -----------------------------------------------------------------------
// <copyright file="Entitlement.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Class that represents an entitlement.
 */
public class Entitlement
	 extends ResourceBaseWithLinks<StandardResourceLinks> 
{
	@JsonProperty("entitledArtifacts")
	private Iterable<Artifact> entitledArtifacts;

	@JsonProperty("entitlementType")
	private String entitlementType;

	@JsonProperty("includedEntitlements")
	private Iterable<Entitlement> includedEntitlements;

	@JsonProperty("productId")
	private String productId;

	@JsonProperty("quantity")
	private Integer quantity;

	@JsonProperty("quantityDetails")
	private Iterable<QuantityDetail> quantityDetails;

	@JsonProperty("referenceOrder")
	private ReferenceOrder referenceOrder;

	@JsonProperty("skuId")
	private String skuId;

	/**
	 * Gets the collection of entitled artifacts.
	 * 
	 * @return The collection of entitled artifacts.
	 */
	public Iterable<Artifact> getEntitledArtifacts()
	{
		return entitledArtifacts;
	}

	/**
	 * Sets the collection of entitled artifacts.
	 * 
	 * @param value The collection of entitled artifacts.
	 */
	public void setEntitledArtifacts(Iterable<Artifact> value)
	{
		entitledArtifacts = value;
	}

	/**
	 * Gets the entitlement type.
	 * 
	 * @return The entitlement type.
	 */
	public String getEntitlementType()
	{
		return entitlementType;
	}

	/**
	 * Sets the entitlement type.
	 * 
	 * @param value The entitlement type.
	 */
	public void setEntitlementType(String value)
	{
		entitlementType = value;
	}

	/**
	 * Gets the included entitlements.
	 * 
	 * @return The included entitlements.
	 */
	public Iterable<Entitlement> getIncludedEntitlements()
	{
		return includedEntitlements;
	}

	/**
	 * Sets the included entitlements.
	 * 
	 * @param value The included entitlements.
	 */
	public void setIncludedEntitlements(Iterable<Entitlement> value)
	{
		includedEntitlements = value;
	}

	/**
	 * Gets the product identifier.
	 * 
	 * @return The product identifier.
	 */
	public String getProductId()
	{
		return productId;
	}

	/**
	 * Sets the product identifier.
	 * 
	 * @param value The product identifier.
	 */
	public void setProductId(String value)
	{
		productId = value;
	}

	/**
	 * Gets the quantity.
	 * 
	 * @return The quantity.
	 */
	public Integer getQuantity()
	{
		return quantity;
	}

	/**
	 * Sets the quantity.
	 * 
	 * @param value The quantity.
	 */
	public void setQuantity(Integer value)
	{
		quantity = value;
	}

	/**
	 * Gets the quantity details (quantity - state).
	 * 
	 * @return The quantity details (quantity - state).
	 */
	public Iterable<QuantityDetail> getQuantityDetails()
	{
		return quantityDetails;
	}

	/**
	 * Sets the quantity details (quantity - state).
	 * 
	 * @param value The quantity details (quantity - state).
	 */
	public void setQuantityDetails(Iterable<QuantityDetail> value)
	{
		quantityDetails = value;
	}

	/**
	 * Gets the reference order related to the entitlement.
	 * 
	 * @return The reference order related to the entitlement.
	 */
	public ReferenceOrder getReferenceOrder()
	{
		return referenceOrder;
	}

	/**
	 * Sets the reference order related to the entitlement.
	 * 
	 * @param value The reference order related to the entitlement.
	 */
	public void setReferenceOrder(ReferenceOrder value)
	{
		referenceOrder = value;
	}

	/**
	 * Gets the SKU identifier.
	 * 
	 * @return The SKU identifier.
	 */
	public String getSkuId()
	{
		return skuId;
	}

	/**
	 * Sets the SKU identifier.
	 * 
	 * @param value The SKU identifier.
	 */
	public void setSkuId(String value)
	{
		skuId = value;
	}
}