// -----------------------------------------------------------------------
// <copyright file="Device.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import java.util.Collection;
import java.util.Iterator;
import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

/**
 * Represents a device associated with a customer.
 */
public class Device extends ResourceBase {
	/**
	 * Gets or sets the device unique identifier.
	 */
	@JsonProperty( "Id" )
	private String __Id;

	public String getId()
	{
		return __Id;
	}

	public void setId( String value )
	{
		__Id = value;
	}

	/**
	 * Gets or sets the serial number associated with a device.
	 */
	@JsonProperty( "serialNumber" )
	private String __SerialNumber;

	public String getSerialNumber()
	{
		return __SerialNumber;
	}

	public void setSerialNumber( String value )
	{
		__SerialNumber = value;
	}

	/**
	 * Gets or sets the product key uniquely associated with a device.
	 */
	@JsonProperty( "productKey" )
	private String __ProductKey;

	public String getProductKey()
	{
		return __ProductKey;
	}

	public void setProductKey( String value )
	{
		__ProductKey = value;
	}

	/**
	 * Gets or sets the hardware hash associated with a device.
	 */
	@JsonProperty( "hardwareHash" )
	private String __HardwareHash;

	public String getHardwareHash()
	{
		return __HardwareHash;
	}

	public void setHardwareHash( String value )
	{
		__HardwareHash = value;
	}

	/**
	 *  Gets or sets the device model name associated with the device.
	 */
	@JsonProperty( "modelName" )
	private String __ModelName;

	public String getModelName()
	{
		return __ModelName;
	}

	public void setModelName( String value )
	{
		__ModelName = value;
	}

	/**
	 * Gets or sets the OEM manufacturer name.
	 */
	@JsonProperty( "oemManufacturerName" )
	private String __OemManufacturerName;

	public String getOemManufacturerName()
	{
		return __OemManufacturerName;
	}

	public void setOemManufacturerName( String value )
	{
		__OemManufacturerName = value;
	}

	/**
	 *  Gets or sets the list of policies assigned to a device.
	 */
	@JsonProperty( "policies" )
	private Collection<KeyValuePair<PolicyCategory, String>> __Policies;

	public Collection<KeyValuePair<PolicyCategory, String>> getPolicies()
	{
		return __Policies;
	}

	public void setPolicies( Collection<KeyValuePair<PolicyCategory, String>> value )
	{
		__Policies = value;
	}

	/**
	 *  Gets or sets the UTC date the device was uploaded.
	 */
	@JsonProperty( "uploadedDate" )
	private DateTime __UploadedDate;

	public DateTime getUploadedDate()
	{
		return __UploadedDate;
	}

	public void setUploadedDate( DateTime value )
	{
		__UploadedDate = value;
	}

	/**
	 * Gets or sets the list of HTTP methods allowed on a device as GET, PATCH, DELETE.
	 */
	@JsonProperty( "allowedOperations" )
	private Iterator<String> __AllowedOperations;

	public Iterator<String> getAllowedOperations()
	{
		return __AllowedOperations;
	}

	public void setAllowedOperations( Iterator<String> value )
	{
		__AllowedOperations = value;
	}
}