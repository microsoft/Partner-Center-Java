// -----------------------------------------------------------------------
// <copyright file="Agreement.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Contact;
import com.microsoft.store.partnercenter.models.ResourceBase;
import org.joda.time.DateTime;

/**
 * The Agreement resource. Represents the details of certification provided by the partner.
 */
public class Agreement
        extends ResourceBase
{
    /**
     * Gets or sets the Object identifier of the logged in user in the partner tenant
     * who is providing confirmation on behalf of the partner organization.
     */
    @JsonProperty( "userId" )
    private String __UserId;

    public String getUserId()
    {
        return __UserId;
    }

    public void setUserId( String value )
    {
        __UserId = value;
    }

    /**
     * Gets or sets the information about the user from the customer organization
     * who accepted the Microsoft Cloud Agreement.
     */
    @JsonProperty( "primaryContact" )
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
     * Gets or sets the unique identifier of the agreement that the customer accepted.
     */
    @JsonProperty( "templateId" )
    private String __TemplateId;

    public String getTemplateId()
    {
        return __TemplateId;
    }

    public void setTemplateId( String value )
    {
        __TemplateId = value;
    }

    /**
     * Gets or sets the date when the customer accepted the agreement.
     */
    @JsonProperty( "dateAgreed" )
    private DateTime __DateAgreed;

    public DateTime getDateAgreed()
    {
        return __DateAgreed;
    }

    public void setDateAgreed( DateTime value )
    {
        __DateAgreed = value;
    }

    /**
     * Gets or sets agreement type.
     */
    @JsonProperty( "type" )
    private AgreementType __Type;

    public AgreementType getType()
    {
        return __Type;
    }

    public void setType( AgreementType value )
    {
        __Type = value;
    }

    /**
     * Gets or sets URL to the agreement template.
     */
    @JsonProperty( "agreementLink" )
    private String __AgreementLink;

    public String getAgreementLink()
    {
        return __AgreementLink;
    }

    public void setAgreementLink( String value )
    {
        __AgreementLink = value;
    }
}