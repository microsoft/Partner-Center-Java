// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.utilizations;

import java.util.Map;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * A utilization record for an Azure subscription resource.
 */
public class AzureUtilizationRecord extends ResourceBase
{
	/**
	 * Gets or sets the start of the usage aggregation time range.
	 * The response is grouped by the time of consumption (when the resource was actually used VS. when was it reported to the billing system).
	 */
	private DateTime __UsageStartTime;
	
	public DateTime getUsageStartTime() {
		return __UsageStartTime;
	}

	public void setUsageStartTime(DateTime usageStartTime) {
		this.__UsageStartTime = usageStartTime;
	}

    /**
     * Gets or sets the end of the usage aggregation time range.
     * The response is grouped by the time of consumption (when the resource was actually used VS. when was it reported to the billing system).
     */
	private DateTime __UsageEndTime;

	public DateTime getUsageEndTime() {
		return __UsageEndTime;
	}

	public void setUsageEndTime(DateTime usageEndTime) {
		this.__UsageEndTime = usageEndTime;
	}

    /**
     * Gets or sets the Azure resource which was used.
     */
	private AzureResource __Resource;

	public AzureResource getResource() {
		return __Resource;
	}

	public void setResource(AzureResource resource) {
		this.__Resource = resource;
	}

    /**
     * Gets or sets the quantity consumed of the Azure resource.
     */
	private double __Quantity;

	public double getQuantity() {
		return __Quantity;
	}

	public void setQuantity(double quantity) {
		this.__Quantity = quantity;
	}

    /**
     * Gets or sets the type of quantity (hours, bytes, etc...).
     */
	private String __Unit;

	public String getUnit() {
		return __Unit;
	}

	public void setUnit(String unit) {
		this.__Unit = unit;
	}

    /**
     * Gets or sets the key-value pairs of instance-level details.
     */
	private Map<String, String> __InfoFields;

	public Map<String, String> getInfoFields() {
		return __InfoFields;
	}

	public void setInfoFields(Map<String, String> infoFields) {
		this.__InfoFields = infoFields;
	}

	/**
     * Gets or sets the instance details.
     */
	private AzureInstanceData __InstanceData;

	public AzureInstanceData getInstanceData() {
		return __InstanceData;
	}

	public void setInstanceData(AzureInstanceData __InstanceData) {
		this.__InstanceData = __InstanceData;
	} 
}
