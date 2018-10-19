// -----------------------------------------------------------------------
// <copyright file="AuditRecord.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

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
	private String __ApplicationId;

	/**
     * Gets the identifier of the application invoking the operation.
     * 
     * @return The identifier of the application invoking the operation.
     */
	public String getApplicationId()
	{
		return __ApplicationId;
	}

	/**
     * Sets the identifier of the application invoking the operation.
     * 
     * @param value The identifier of the application invoking the operation.
     */
	public void setApplicationId( String value )
	{
		__ApplicationId = value;
	}

	@JsonProperty( "customizedData" )
	private Iterable<KeyValuePair<String, String>> __CustomizedData;

	/**
     * Gets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @return The dictionary which holds additional data that is customized to the operation performed.
     */
	public Iterable<KeyValuePair<String, String>> getCustomizedData()
	{
		return __CustomizedData;
	}

	/**
     * Sets the dictionary which holds additional data that is customized to the operation performed.
     * 
     * @param value The dictionary which holds additional data that is customized to the operation performed.
     */
	public void setCustomizedData( Iterable<KeyValuePair<String, String>> value )
	{
		__CustomizedData = value;
	}

	@JsonProperty( "customerId" )
	private String __CustomerId;

	/**
     * Gets the identifier of customer in whose context operation was performed.
     * 
     * @return The identifier of customer in whose context operation was performed.
     */
	public String getCustomerId()
	{
		return __CustomerId;
	}

	/**
     * Sets the identifier of customer in whose context operation was performed.
     * 
     * @param value The identifier of customer in whose context operation was performed.
     */
	public void setCustomerId( String value )
	{
		__CustomerId = value;
	}

	@JsonProperty( "customerName" )
	private String __CustomerName;

	/**
     * Gets the name of customer in whose context operation was performed.
     * 
     * @return The name of customer in whose context operation was performed.
     */
	public String getCustomerName()
	{
		return __CustomerName;
	}

	/**
     * Sets the name of customer in whose context operation was performed.
     * 
     * @param value The name of customer in whose context operation was performed.
     */
	public void setCustomerName( String value )
	{
		__CustomerName = value;
	}

	@JsonProperty( "id" )
	public String __Id; 

	/**
     * Gets the unique identifier for the audit record.
     * 
     * @return The unique identifier for the audit record.
     */
	public String Id()
	{
		return __Id;
	}

    /**
     * Sets the unique identifier for the audit record.
     * 
     * @param value The unique identifier for the audit record.
     */
	public void setId(String value)
	{
		__Id = value;
	}

	/**
	 * Gets or sets the date time when the operation was performed
	 */
	@JsonProperty( "operationDate" )
	private DateTime __OperationDate;

	/**
     * Gets the date and time when the operation was performed.
     * 
     * @return The date and time when the operation was performed.
     */
	public DateTime getOperationDate()
	{
		return __OperationDate;
	}

    /**
     * Sets the date and time when the operation was performed.
     * 
     * @param value The date and time when the operation was performed.
     */
	public void setOperationDate( DateTime value )
	{
		__OperationDate = value;
	}

	@JsonProperty( "operationStatus" )
	private OperationStatus __OperationStatus;

	/**
     * Gets the status of the operation that is audited.
     * 
     * @return The status of the operation that is audited.
     */
	public OperationStatus getOperationStatus()
	{
		return __OperationStatus;
	}

	/**
     * Sets the status of the operation that is audited.
     * 
     * @param value The status of the operation that is audited.
     */
	public void setOperationStatus( OperationStatus value )
	{
		__OperationStatus = value;
	}

	@JsonProperty( "operationType" )
	private OperationType __OperationType;

	/**
     * Gets the type of the operation being performed.
     * 
     * @return The type of the operation being performed.
     */
	public OperationType getOperationType()
	{
		return __OperationType;
	}

	/**
     * Sets the type of the operation being performed.
     * 
     * @param value The type of the operation being performed.
     */
	public void setOperationType( OperationType value )
	{
		__OperationType = value;
	}

	@JsonProperty( "partnerId" )
	private String __PartnerId;

	/**
     * Gets the identifier of the parnter that performed the operation.
     * 
     * @return The identifier of the parnter that performed the operation.
     */
	public String getPartnerId()
	{
		return __PartnerId;
	}

	/**
     * Sets the identifier of the parnter that performed the operation.
     * 
     * @param value The identifier of the parnter that performed the operation.
     */
	public void setPartnerId( String value )
	{
		__PartnerId = value;
	}

	@JsonProperty( "resourceNewValue" )
	private String __ResourceNewValue;

	/**
     * Gets the new value of the resource.
     * 
     * @return The new value of the resource.
     */
	public String getResourceNewValue()
	{
		return __ResourceNewValue;
	}

	/**
     * Sets the new value of the resource.
     * 
     * @param value The new value of the resource.
     */
	public void setResourceNewValue( String value )
	{
		__ResourceNewValue = value;
	}

	@JsonProperty( "resourceOldValue" )
	private String __ResourceOldValue;

	/**
     * Gets the old value of the resource.
     * 
     * @return The old value of the resource.
     */
	public String getResourceOldValue()
	{
		return __ResourceOldValue;
	}

	/**
     * Sets the old value of the resource.
     * 
     * @param value The old value of the resource.
     */
	public void setResourceOldValue( String value )
	{
		__ResourceOldValue = value;
	}

	@JsonProperty( "resourceType" )
	private ResourceType __ResourceType;

	/**
     * Gets the type of the resource acted upon by the operation.
     * 
     * @return The type of the resource acted upon by the operation.
     */
	public ResourceType getResourceType()
	{
		return __ResourceType;
	}

	/**
     * Sets the type of the resource acted upon by the operation.
     * 
     * @param value The type of the resource acted upon by the operation.
     */
	public void setResourceType( ResourceType value )
	{
		__ResourceType = value;
	}

	@JsonProperty( "userPrincipalName" )
	private String __UserPrincipalName;

	/**
     * Gets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @return The identifier of the user who performed the operation.
     */
	public String getUserPrincipalName()
	{
		return __UserPrincipalName;
	}

	/**
     * Sets the identifier of the user who performed the operation. This could be in the context of application.
     * 
     * @param value The identifier of the user who performed the operation.
     */
	public void setUserPrincipalName( String value )
	{
		__UserPrincipalName = value;
	}
}