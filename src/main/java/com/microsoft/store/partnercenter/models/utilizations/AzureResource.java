// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.utilizations;

/**
 * Represents an Azure resource being metered.
 */
public class AzureResource
{
	/**
	 * Gets or sets the unique identifier of the Azure resource that was consumed. Also known as resourceID or resourceGUID.
	 */
	private String __Id;
	
	public String getId() {
		return __Id;
	}

	public void setId(String value) {
		this.__Id = value;
	}

	/**
	 * Gets or sets the friendly name of the Azure resource being consumed.
	 */
	private String __Name;
	
	public String getName() {
		return __Name;
	}

	public void setName(String value) {
		this.__Name = value;
	}

	/**
	 * Gets or sets the category of the consumed Azure resource.
	 */
	private String __Category;
	
	public String getCategory() {
		return __Category;
	}

	public void setCategory(String value) {
		this.__Category = value;
	}

	/**
	 * Gets or sets the sub-category of the consumed Azure resource.
	 */
	private String __Subcategory;

	public String getSubcategory() {
		return __Subcategory;
	}

	public void setSubcategory(String value) {
		this.__Subcategory = value;
	}

	/**
	 * Gets or sets the region of the consumed Azure resource.
	 */
	private String __Region;

	public String getRegion() {
		return __Region;
	}

	public void setRegion(String value) {
		this.__Region = value;
	}
}
