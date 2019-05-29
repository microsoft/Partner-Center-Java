// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.utilizations;

import java.net.URI;
import java.util.Map;

public class AzureInstanceData
{
    /**
     * Gets or sets the fully qualified Azure resource ID, which includes the resource groups and the instance name.
     */
    private URI __ResourceUri;

	public URI getResourceUri() {
		return __ResourceUri;
	}

	public void setResourceUri(URI value) {
		this.__ResourceUri = value;
	}

    /**
     * Gets or sets the region in which the this service was run.
     */
    private String __Location;

	public String getLocation() {
		return __Location;
	}

	public void setLocation(String value) {
		this.__Location = value;
	}

    /**
     * Gets or sets the unique namespace used to identify the resource for Azure Marketplace 3rd party usage.
     */
    private String __PartNumber;

	public String getPartNumber() {
		return __PartNumber;
	}

	public void setPartNumber(String value) {
		this.__PartNumber = value;
	}

    /**
     * Gets or sets the unique namespace used to identify the 3rd party order for Azure Marketplace.
     */
    private String __OrderNumber;


	public String getOrderNumber() {
		return __OrderNumber;
	}

	public void setOrderNumber(String value) {
		this.__OrderNumber = value;
	}

	/**
     * Gets or sets the resource tags specified by the user.
     */
    private Map<String, String> __Tags;

	public Map<String, String> getTags() {
		return __Tags;
	}

	public void setTags(Map<String, String> value) {
		this.__Tags = value;
	}

	/**
     * Gets or sets the additional info fields.
     */
    private Map<String, String> __AdditionalInfo;

	public Map<String, String> getAdditionalInfo() {
		return __AdditionalInfo;
	}

	public void setAdditionalInfo(Map<String, String> value) {
		this.__AdditionalInfo = value;
	}
}