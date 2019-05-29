// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

import org.joda.time.DateTime;

/**
 * Represents a record of operation performed by a partner user or application
 */
public class AuditRecord extends ResourceBase 
{
	/**
	 *  Gets or sets the id of the app invoking the operation
	 */
	@JsonProperty( "applicationid" )
	private String applicationId;

	/**
     * Gets the identifier of the application invoking the operation.
     * 
     * @return The identifier of the application invoking the operation.
     */
	public String getApplicationId()
	{
		return applicationId;
	}

	/**
     * Sets the identifier of the application invoking the operation.
     * 
     * @param value The identifier of the application invoking the operation.
     */
	public void setApplicationId( String value )
	{
		applicationId = value;
	}

	@JsonProperty( "customizedData" )
	private Iterable<KeyValuePair<String, String>> customizedData;

	/**
     * Gets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @return The dictionary which holds additional data that is customized to the operation performed.
     */
	public Iterable<KeyValuePair<String, String>> getCustomizedData()
	{
		return customizedData;
	}

	/**
     * Sets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @param value The dictionary which holds additional data that is customized to the operation performed.
     */
	public void setCustomizedData( Iterable<KeyValuePair<String, String>> value )
	{
		customizedData = value;
	}

	@JsonProperty( "customerId" )
	private String customerId;

	/**
     * Gets the identifier of customer in whose context operation was performed.
     * 
     * @return The identifier of customer in whose context operation was performed.
     */
	public String getCustomerId()
	{
		return customerId;
	}

	/**
     * Sets the identifier of customer in whose context operation was performed.
     * 
     * @param value The identifier of customer in whose context operation was performed.
     */
	public void setCustomerId( String value )
	{
		customerId = value;
	}

	@JsonProperty( "customerName" )
	private String customerName;

	/**
     * Gets the name of customer in whose context operation was performed.
     * 
     * @return The name of customer in whose context operation was performed.
     */
	public String getCustomerName()
	{
		return customerName;
	}

	/**
     * Sets the name of customer in whose context operation was performed.
     * 
     * @param value The name of customer in whose context operation was performed.
     */
	public void setCustomerName( String value )
	{
		customerName = value;
	}

	@JsonProperty( "id" )
	public String id; 

	/**
     * Gets the unique identifier for the audit record.
     * 
     * @return The unique identifier for the audit record.
     */
	public String Id()
	{
		return id;
	}

    /**
     * Sets the unique identifier for the audit record.
     * 
     * @param value The unique identifier for the audit record.
     */
	public void setId(String value)
	{
		id = value;
	}

	/**
	 * Gets or sets the date time when the operation was performed
	 */
	@JsonProperty( "operationDate" )
	private DateTime operationDate;

	/**
     * Gets the date and time when the operation was performed.
     * 
     * @return The date and time when the operation was performed.
     */
	public DateTime getOperationDate()
	{
		return operationDate;
	}

    /**
     * Sets the date and time when the operation was performed.
     * 
     * @param value The date and time when the operation was performed.
     */
	public void setOperationDate( DateTime value )
	{
		operationDate = value;
	}

	@JsonProperty( "operationStatus" )
	private OperationStatus operationStatus;

	/**
     * Gets the status of the operation that is audited.
     * 
     * @return The status of the operation that is audited.
     */
	public OperationStatus getOperationStatus()
	{
		return operationStatus;
	}

	/**
     * Sets the status of the operation that is audited.
     * 
     * @param value The status of the operation that is audited.
     */
	public void setOperationStatus( OperationStatus value )
	{
		operationStatus = value;
	}

	@JsonProperty( "operationType" )
	private OperationType operationType;

	/**
     * Gets the type of the operation being performed.
     * 
     * @return The type of the operation being performed.
     */
	public OperationType getOperationType()
	{
		return operationType;
	}

	/**
     * Sets the type of the operation being performed.
     * 
     * @param value The type of the operation being performed.
     */
	public void setOperationType( OperationType value )
	{
		operationType = value;
	}

	@JsonProperty( "partnerId" )
	private String partnerId;

	/**
     * Gets the identifier of the partner that performed the operation.
     * 
     * @return The identifier of the partner that performed the operation.
     */
	public String getPartnerId()
	{
		return partnerId;
	}

	/**
     * Sets the identifier of the partner that performed the operation.
     * 
     * @param value The identifier of the partner that performed the operation.
     */
	public void setPartnerId( String value )
	{
		partnerId = value;
	}

	@JsonProperty( "resourceNewValue" )
	private String resourceNewValue;

	/**
     * Gets the new value of the resource.
     * 
     * @return The new value of the resource.
     */
	public String getResourceNewValue()
	{
		return resourceNewValue;
	}

	/**
     * Sets the new value of the resource.
     * 
     * @param value The new value of the resource.
     */
	public void setResourceNewValue( String value )
	{
		resourceNewValue = value;
	}

	@JsonProperty( "resourceOldValue" )
	private String resourceOldValue;

	/**
     * Gets the old value of the resource.
     * 
     * @return The old value of the resource.
     */
	public String getResourceOldValue()
	{
		return resourceOldValue;
	}

	/**
     * Sets the old value of the resource.
     * 
     * @param value The old value of the resource.
     */
	public void setResourceOldValue( String value )
	{
		resourceOldValue = value;
	}

	@JsonProperty( "resourceType" )
	private ResourceType resourceType;

	/**
     * Gets the type of the resource acted upon by the operation.
     * 
     * @return The type of the resource acted upon by the operation.
     */
	public ResourceType getResourceType()
	{
		return resourceType;
	}

	/**
     * Sets the type of the resource acted upon by the operation.
     * 
     * @param value The type of the resource acted upon by the operation.
     */
	public void setResourceType( ResourceType value )
	{
		resourceType = value;
	}

	@JsonProperty( "userPrincipalName" )
	private String userPrincipalName;

	/**
     * Gets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @return The identifier of the user who performed the operation.
     */
	public String getUserPrincipalName()
	{
		return userPrincipalName;
	}

	/**
     * Sets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @param value The identifier of the user who performed the operation.
     */
	public void setUserPrincipalName( String value )
	{
		userPrincipalName = value;
	}
}