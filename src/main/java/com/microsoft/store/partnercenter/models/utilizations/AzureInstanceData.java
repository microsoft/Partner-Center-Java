// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.utilizations;

import java.util.Map;

public class AzureInstanceData
{
	/**
	 * Additional data for an Azure resource.
	 */
	private Map<String, String> additionalInfo;
	
	/**
	 * The region in which the service was run.
	 */
	private String location;

	/**
	 * The unique namespace used to identify the third party order for Azure Marketplace.
	 */
	private String orderNumber;

	/**
	 * The unique namespace used to identify the resource for Azure Marketplace third party usage.
	 */
	private String partNumber;

	/**
	 * The fully qualified Azure resource ID, which includes the resource groups and the instance name.
	 */
	private String resourceUri;

	/**
	 * The resource tags specified by the user.
	 */
	private Map<String, String> tags;

	/**
	 * Gets additional data for an Azure resource.
	 * 
	 * @return Additional data for an Azure resource.
	 */
	public Map<String, String> getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Sets additional data for an Azure resource.
	 * 
	 * @param value The additional data for an Azure resource.
	 */
	public void setAdditionalInfo(Map<String, String> value) {
		additionalInfo = value;
	}

	/**
	 * Gets the region in which the service was run.
	 * 
	 * @return The region in which the service was run.
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the region in which the service was run.
	 * 
	 * @param value The region in which the service was run.
	 */
	public void setLocation(String value) {
		location = value;
	}

	/**
	 * Gets the unique namespace used to identify the third party order for Azure Marketplace.
	 * 
	 * @return The unique namespace used to identify the third party order for Azure Marketplace.
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the unique namespace used to identify the third party order for Azure Marketplace.
	 * 
	 * @param value The unique namespace used to identify the third party order for Azure Marketplace.
	 */
	public void setOrderNumber(String value) {
		orderNumber = value;
	}

	/**
	 * Gets the unique namespace used to identify the resource for Azure Marketplace third party usage.
	 * 
	 * @return The unique namespace used to identify the resource for Azure Marketplace third party usage.
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * Sets the unique namespace used to identify the resource for Azure Marketplace third party usage.
	 * 
	 * @param value The unique namespace used to identify the resource for Azure Marketplace third party usage.
	 */
	public void setPartNumber(String value) {
		partNumber = value;
	}

	/**
	 * Gets the fully qualified Azure resource ID, which includes the resource groups and the instance name.
	 * 
	 * @return The fully qualified Azure resource ID, which includes the resource groups and the instance name.
	 */
	public String getResourceUri() {
		return resourceUri;
	}

	/**
	 * Sets the fully qualified Azure resource ID, which includes the resource groups and the instance name.
	 * 
	 * @param value The fully qualified Azure resource ID, which includes the resource groups and the instance name.
	 */
	public void setResourceUri(String value) {
		resourceUri = value;
	}

	/**
	 * Gets the resource tags specified by the user.
	 * 
	 * @return The resource tags specified by the user.
	 */
	public Map<String, String> getTags() {
		return tags;
	}

	/**
	 * Sets the resource tags specified by the user.
	 * 
	 * @param value The resource tags specified by the user.
	 */
	public void setTags(Map<String, String> value) {
		tags = value;
	}
}