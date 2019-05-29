// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.serviceincidents;

import org.joda.time.DateTime;

/**
 * Represents an office service health incident message.
 */
public class ServiceIncidentDetail
{
    /**
     * Gets or sets the Incident ID.
     */
    private String __Id;

    /**
     * Gets or sets the message type.
     */
    private MessageType __MessageType;

    /**
     * Gets or sets the Incident start time.
     */
    private DateTime __StartTime;

    /**
     * Gets or sets the Incident End time.
     */
    private DateTime __EndTime;

    /**
     * Gets or sets the status.
     */
    private ServiceIncidentStatus __Status;

    /**
     * Gets or sets the Service Health messages.
     */
    private Iterable<ServiceIncidentHistory> __Messages;

    /**
     * Gets or sets the workload name.
     */
    private String __Workload;

    /**
     * Gets or sets the affected workload names.
     */
    private Iterable<String> __AffectedWorkloadNames;

    /**
     * Gets or sets the impacted area.
     */
    private String __ImpactedArea;

    /**
     * Gets or sets a value indicating whether an incident is resolved or not.
     */
    private boolean __Resolved;

    /**
     * Gets or sets the affected tenant count.
     */
    private int __ImpactedCustomers;

    /**
     * Gets or sets the date by which partner is expected to complete an action - set only for message center type messages.
     */
    private DateTime __RequiredBy;

    /**
     * Gets or sets the category of message center - set only for message center type messages.
     */
    private String __Category;

    /**
     * Gets or sets the type of action to be followed up with - set only for message center type messages.
     */
    private String __ActionType;

    /**
     * Gets or sets the severity of the message - set only for message center type messages.
     */
    private ServiceIncidentStatus __Severity;

	/**
	 * @return the __Id
	 */
	public String getId() {
		return __Id;
	}

	/**
	 * @param __Id the __Id to set
	 */
	public void setId(String __Id) {
		this.__Id = __Id;
	}

	/**
	 * @return the __MessageType
	 */
	public MessageType getMessageType() {
		return __MessageType;
	}

	/**
	 * @param __MessageType the __MessageType to set
	 */
	public void setMessageType(MessageType __MessageType) {
		this.__MessageType = __MessageType;
	}

	/**
	 * @return the __StartTime
	 */
	public DateTime getStartTime() {
		return __StartTime;
	}

	/**
	 * @param __StartTime the __StartTime to set
	 */
	public void setStartTime(DateTime __StartTime) {
		this.__StartTime = __StartTime;
	}

	/**
	 * @return the __EndTime
	 */
	public DateTime getEndTime() {
		return __EndTime;
	}

	/**
	 * @param __EndTime the __EndTime to set
	 */
	public void setEndTime(DateTime __EndTime) {
		this.__EndTime = __EndTime;
	}

	/**
	 * @return the __Status
	 */
	public ServiceIncidentStatus getStatus() {
		return __Status;
	}

	/**
	 * @param __Status the __Status to set
	 */
	public void setStatus(ServiceIncidentStatus __Status) {
		this.__Status = __Status;
	}

	/**
	 * @return the __Messages
	 */
	public Iterable<ServiceIncidentHistory> getMessages() {
		return __Messages;
	}

	/**
	 * @param __Messages the __Messages to set
	 */
	public void setMessages(Iterable<ServiceIncidentHistory> __Messages) {
		this.__Messages = __Messages;
	}

	/**
	 * @return the __Workload
	 */
	public String getWorkload() {
		return __Workload;
	}

	/**
	 * @param __Workload the __Workload to set
	 */
	public void setWorkload(String __Workload) {
		this.__Workload = __Workload;
	}

	/**
	 * @return the __AffectedWorkloadNames
	 */
	public Iterable<String> getAffectedWorkloadNames() {
		return __AffectedWorkloadNames;
	}

	/**
	 * @param __AffectedWorkloadNames the __AffectedWorkloadNames to set
	 */
	public void setAffectedWorkloadNames(Iterable<String> __AffectedWorkloadNames) {
		this.__AffectedWorkloadNames = __AffectedWorkloadNames;
	}

	/**
	 * @return the __ImpactedArea
	 */
	public String getImpactedArea() {
		return __ImpactedArea;
	}

	/**
	 * @param __ImpactedArea the __ImpactedArea to set
	 */
	public void setImpactedArea(String __ImpactedArea) {
		this.__ImpactedArea = __ImpactedArea;
	}

	/**
	 * @return the __Resolved
	 */
	public boolean is__Resolved() {
		return __Resolved;
	}

	/**
	 * @param __Resolved the __Resolved to set
	 */
	public void setResolved(boolean __Resolved) {
		this.__Resolved = __Resolved;
	}

	/**
	 * @return the __ImpactedCustomers
	 */
	public int getImpactedCustomers() {
		return __ImpactedCustomers;
	}

	/**
	 * @param __ImpactedCustomers the __ImpactedCustomers to set
	 */
	public void setImpactedCustomers(int __ImpactedCustomers) {
		this.__ImpactedCustomers = __ImpactedCustomers;
	}

	/**
	 * @return the __RequiredBy
	 */
	public DateTime getRequiredBy() {
		return __RequiredBy;
	}

	/**
	 * @param __RequiredBy the __RequiredBy to set
	 */
	public void setRequiredBy(DateTime __RequiredBy) {
		this.__RequiredBy = __RequiredBy;
	}

	/**
	 * @return the __Category
	 */
	public String getCategory() {
		return __Category;
	}

	/**
	 * @param __Category the __Category to set
	 */
	public void setCategory(String __Category) {
		this.__Category = __Category;
	}

	/**
	 * @return the __ActionType
	 */
	public String getActionType() {
		return __ActionType;
	}

	/**
	 * @param __ActionType the __ActionType to set
	 */
	public void setActionType(String __ActionType) {
		this.__ActionType = __ActionType;
	}

	/**
	 * @return the __Severity
	 */
	public ServiceIncidentStatus getSeverity() {
		return __Severity;
	}

	/**
	 * @param __Severity the __Severity to set
	 */
	public void setSeverity(ServiceIncidentStatus __Severity) {
		this.__Severity = __Severity;
	}

}
