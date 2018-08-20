// -----------------------------------------------------------------------
// <copyright file="LegalBusinessProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.Contact;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * The legal business profile.
 */
public class LegalBusinessProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Initializes a new instance of the {@link #LegalBusinessProfile} class.
     */
    public LegalBusinessProfile()
    {
    }

    /**
     * Gets or sets the legal company name.
     */
    private String __CompanyName;

    public String getCompanyName()
    {
        return __CompanyName;
    }

    public void setCompanyName( String value )
    {
        __CompanyName = value;
    }

    /**
     * Gets or sets the address.
     */
    private Address __Address;

    public Address getAddress()
    {
        return __Address;
    }

    public void setAddress( Address value )
    {
        __Address = value;
    }

    /**
     * Gets or sets the primary contact.
     */
    private Contact __PrimaryContact;

    public Contact getPrimaryContact()
    {
        return __PrimaryContact;
    }

    public void setPrimaryContact( Contact value )
    {
        __PrimaryContact = value;
    }

    /**
     * Gets or sets the company approver address.
     */
    private Address __CompanyApproverAddress;

    public Address getCompanyApproverAddress()
    {
        return __CompanyApproverAddress;
    }

    public void setCompanyApproverAddress( Address value )
    {
        __CompanyApproverAddress = value;
    }

    /**
     * Gets or sets the company approver email.
     */
    private String __CompanyApproverEmail;

    public String getCompanyApproverEmail()
    {
        return __CompanyApproverEmail;
    }

    public void setCompanyApproverEmail( String value )
    {
        __CompanyApproverEmail = value;
    }

    /***
     * Gets or sets the vetting status.
     */
    private VettingStatus __VettingStatus;

    public VettingStatus getVettingStatus()
    {
        return __VettingStatus;
    }

    public void setVettingStatus( VettingStatus value )
    {
    	__VettingStatus = value;
    }

    /***
     *  Gets or sets the vetting sub status.
     */
    private VettingSubStatus __VettingSubStatus;

    public VettingSubStatus getVettingSubStatus()
    {
        return __VettingSubStatus;
    }

    public void setVettingSubStatus( VettingSubStatus value )
    {
    	__VettingSubStatus = value;
    }
}