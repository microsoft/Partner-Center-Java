// -----------------------------------------------------------------------
// <copyright file="Entitlement.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.entitlements;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

import org.joda.time.DateTime;

/**
 * Class that represents an entitlement.
 */
public class Entitlement
	 extends ResourceBaseWithLinks<StandardResourceLinks> 
{
	private Iterable<Artifact> entitledArtifacts;

	private String entitlementType;

	/**
	 * The entitlement expiry date for the entitlement.
	 */
	private DateTime expiryDate;

	/**
	 * The fulfillment state for the entitlement.
	 */
	private String fulfillmentState;

	private Iterable<Entitlement> includedEntitlements;

	private String productId;

	private Integer quantity;

	private Iterable<QuantityDetail> quantityDetails;

	private ReferenceOrder referenceOrder;

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
	 * Gets the expiry date for the entitlement.
	 * 
	 * @return The expiry date for the entitlement.
	 */
	public DateTime getExpiryDate()
	{
		return expiryDate;
	}

	/**
	 * Sets the expiry date for the entitlement.
	 * 
	 * @param value The expiry date for the entitlement.
	 */
	public void setExpiryDate(DateTime value)
	{
		expiryDate = value;
	}

	/**
	 * Gets the fulfillment state for the entitlement.
	 */
	public String getFulfillmentState()
	{
		return fulfillmentState;
	}

	/**
	 * Sets the fulfillment state for the entitlement.
	 * 
	 * @param value THe the fulfillment state for the entitlement.
	 */
	public void setFulfillmentState(String value)
	{
		fulfillmentState = value;
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