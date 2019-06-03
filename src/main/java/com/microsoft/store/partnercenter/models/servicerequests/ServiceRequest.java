// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicerequests;

import java.util.Collection;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a Service Request
 */
public class ServiceRequest
    extends ResourceBase
{
    /**
     * Gets or sets the service request Id.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId(String value)
    {
        __Id = value;
    }

    /**
     * Gets or sets the Title.
     */
    private String __Title;

    public String getTitle()
    {
        return __Title;
    }

    public void setTitle(String value)
    {
        __Title = value;
    }

    /**
     * Gets or sets the Description.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription(String value)
    {
        __Description = value;
    }

    /**
     * Gets or sets the Severity.
     */
    private ServiceRequestSeverity __Severity = ServiceRequestSeverity.UNKNOWN;

    public ServiceRequestSeverity getSeverity()
    {
        return __Severity;
    }

    public void setSeverity(ServiceRequestSeverity value)
    {
        __Severity = value;
    }

    /**
     * Gets or sets the SupportTopicId.
     */
    private String __SupportTopicId;

    public String getSupportTopicId()
    {
        return __SupportTopicId;
    }

    public void setSupportTopicId(String value)
    {
        __SupportTopicId = value;
    }

    /**
     * Gets or sets the SupportTopicName.
     */
    private String __SupportTopicName;

    public String getSupportTopicName()
    {
        return __SupportTopicName;
    }

    public void setSupportTopicName(String value)
    {
        __SupportTopicName = value;
    }

    /**
     * Gets or sets the service request status.
     */
    private ServiceRequestStatus __Status = ServiceRequestStatus.NONE;

    public ServiceRequestStatus getStatus()
    {
        return __Status;
    }

    public void setStatus(ServiceRequestStatus value)
    {
        __Status = value;
    }

    /**
     * Gets or sets the organization for whom the service request is being created.
     */
    private ServiceRequestOrganization __Organization;

    public ServiceRequestOrganization getOrganization()
    {
        return __Organization;
    }

    public void setOrganization(ServiceRequestOrganization value)
    {
        __Organization = value;
    }

    /**
     * Gets or sets the primary contact on the service request.
     */
    private ServiceRequestContact __PrimaryContact;

    public ServiceRequestContact getPrimaryContact()
    {
        return __PrimaryContact;
    }

    public void setPrimaryContact(ServiceRequestContact value)
    {
        __PrimaryContact = value;
    }

    /**
     * Gets or sets the last updated By contact for changes to the service request.
     */
    private ServiceRequestContact __LastUpdatedBy;

    public ServiceRequestContact getLastUpdatedBy()
    {
        return __LastUpdatedBy;
    }

    public void setLastUpdatedBy(ServiceRequestContact value)
    {
        __LastUpdatedBy = value;
    }

    /**
     * Gets or sets the product name.
     */
    private String __ProductName;

    public String getProductName()
    {
        return __ProductName;
    }

    public void setProductName(String value)
    {
        __ProductName = value;
    }

    /**
     * Gets or sets the product id.
     */
    private String __ProductId;

    public String getProductId()
    {
        return __ProductId;
    }

    public void setProductId(String value)
    {
        __ProductId = value;
    }

    /**
     * Gets or sets the created date.
     */
    private DateTime __CreatedDate;

    public DateTime getCreatedDate()
    {
        return __CreatedDate;
    }

    public void setCreatedDate(DateTime value)
    {
        __CreatedDate = value;
    }

    /**
     * Gets or sets the ticket last modified date.
     */
    private DateTime __LastModifiedDate;

    public DateTime getLastModifiedDate()
    {
        return __LastModifiedDate;
    }

    public void setLastModifiedDate(DateTime value)
    {
        __LastModifiedDate = value;
    }

    /**
     * Gets or sets the ticket last closed date.
     */
    private DateTime __LastClosedDate;

    public DateTime getLastClosedDate()
    {
        return __LastClosedDate;
    }

    public void setLastClosedDate(DateTime value)
    {
        __LastClosedDate = value;
    }

    /**
     * Gets or sets a new Note that can be added to an existing service Request.
     */
    private ServiceRequestNote __NewNote;

    public ServiceRequestNote getNewNote()
    {
        return __NewNote;
    }

    public void setNewNote(ServiceRequestNote value)
    {
        __NewNote = value;
    }

    /**
     * Gets or sets a collection of notes associated with the service request.
     */
    private Collection<ServiceRequestNote> __Notes;

    public Collection<ServiceRequestNote> getNotes()
    {
        return __Notes;
    }

    public void setNotes(Collection<ServiceRequestNote> value)
    {
        __Notes = value;
    }

    /**
     * Gets or sets the country code. The CountryCode in ISO 2 Alpha Format.
     */
    private String __CountryCode;

    public String getCountryCode()
    {
        return __CountryCode;
    }

    public void setCountryCode(String value)
    {
        __CountryCode = value;
    }

}
