// -----------------------------------------------------------------------
// <copyright file="ServiceIncidents.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.serviceincidents;

/**
 * Represents a service incident.
 */
public class ServiceIncidents
{
    /**
     * Gets or sets the workload display name.
     */
    private String __Workload;

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
     * Gets or sets the Incident list.
     */
    private Iterable<ServiceIncidentDetail> __Incidents;

	/**
	 * @return the __Incidents
	 */
	public Iterable<ServiceIncidentDetail> getIncidents() {
		return __Incidents;
	}

	/**
	 * @param __Incidents the __Incidents to set
	 */
	public void setIncidents(Iterable<ServiceIncidentDetail> __Incidents) {
		this.__Incidents = __Incidents;
	}

    /**
     * Gets or sets the cumulative status of the service.
     */
    private ServiceIncidentStatus __Status;

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
     * Gets or sets the message center messages.
     */
    private Iterable<ServiceIncidentDetail> __MessageCenterMessages;

	/**
	 * @return the __MessageCenterMessages
	 */
	public Iterable<ServiceIncidentDetail> getMessageCenterMessages() {
		return __MessageCenterMessages;
	}

	/**
	 * @param __MessageCenterMessages the __MessageCenterMessages to set
	 */
	public void setMessageCenterMessages(Iterable<ServiceIncidentDetail> __MessageCenterMessages) {
		this.__MessageCenterMessages = __MessageCenterMessages;
	}
}