// -----------------------------------------------------------------------
// <copyright file="ConfigurationPolicy.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.devicesdeployment;

import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/***
 * Represents a configuration policy associated with a customer.
 */
public class ConfigurationPolicy extends ResourceBase {
	/***
	 * Gets or sets the policy unique identifier.
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
	 * Gets or sets the name associated with the policy.
	 */
	@JsonProperty( "name" )
	private String __Name;

	public String getName()
	{
		return __Name;
	}

	public void setName( String value )
	{
		__Name = value;
	}

	/***
	 * Gets or sets the category of the policy.
	 */
	@JsonProperty( "category" )
	private PolicyCategory __Category;

	public PolicyCategory getCategory()
	{
		return __Category;
	}

	public void setCategory( PolicyCategory value )
	{
		__Category = value;
	}

	/***
	 * Gets or sets the description for a policy.
	 */
	@JsonProperty( "description" )
	private String __Description;

	public String getDescription()
	{
		return __Description;
	}

	public void setDescription( String value )
	{
		__Description = value;
	}

	/***
	 *  Gets or sets the number of devices assigned to a policy.
	 */
	@JsonProperty( "devicesAssignedCount" )
	private Integer __DevicesAssignedCount;

	public Integer getDevicesAssignedCount()
	{
		return __DevicesAssignedCount;
	}

	public void setDevicesAssignedCount( Integer value )
	{
		__DevicesAssignedCount = value;
	}

	/***
	 * Gets or sets the settings for a policy.
	 */
	@JsonProperty( "policySettings" )
	private List<PolicySettingsType> __PolicySettings;

	public List<PolicySettingsType> getPolicySettings()
	{
		return __PolicySettings;
	}

	public void setPolicySettings( List<PolicySettingsType> value )
	{
		__PolicySettings = value;
	}

	/***
	 * Gets or sets the date the policy was created.
	 */
	@JsonProperty( "createdDate" )
	private DateTime __CreatedDate;

	public DateTime getCreatedDate()
	{
		return __CreatedDate;
	}

	public void setCreatedDate( DateTime value )
	{
		__CreatedDate = value;
	}

	/***
	 * Gets or sets the date the policy was modified.
	 */
	@JsonProperty( "lastModifiedDate" )
	private DateTime __LastModifiedDate;

	public DateTime getLastModifiedDate()
	{
		return __LastModifiedDate;
	}

	public void setLastModifiedDate( DateTime value )
	{
		__LastModifiedDate = value;
	}
}