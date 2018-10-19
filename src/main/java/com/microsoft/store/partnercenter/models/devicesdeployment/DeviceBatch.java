// -----------------------------------------------------------------------
// <copyright file="Device.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Link;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 *  Represents a devices batch associated with a customer.
 */
public class DeviceBatch extends StandardResourceLinks {
	/**
	 * Gets or sets the devices batch unique identifier.
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
	 * Gets or sets the name of the tenant who created the batch.
	 */
	@JsonProperty( "createdBy" )
	private String __CreatedBy;

	public String getCreatedBy()
	{
		return __CreatedBy;
	}

	public void setCreatedBy( String value )
	{
		__CreatedBy = value;
	}

	/**
	 * Gets or sets the date the batch was created.
	 */
	@JsonProperty( "creationDate" )
	private DateTime __CreationDate;

	public DateTime getCreationDate()
	{
		return __CreationDate;
	}

	public void setCreationDate( DateTime value )
	{
		__CreationDate = value;
	}

	/**
	 * Gets or sets the count of devices in the batch.
	 */
	@JsonProperty( "devicesCount" )
	private Integer __DevicesCount;

	public Integer getDevicesCount()
	{
		return __DevicesCount;
	}

	public void setDevicesCount( Integer value )
	{
		__DevicesCount = value;
	}

	/**
	 *  Gets or sets the link to the devices under the batch.
	 */
	@JsonProperty( "devicesLink" )
	private Link __DevicesLink;

	public Link getDevicesLink()
	{
		return __DevicesLink;
	}

	public void setDevicesLink( Link value )
	{
		__DevicesLink = value;
	}
}