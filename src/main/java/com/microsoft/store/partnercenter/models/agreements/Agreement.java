// -----------------------------------------------------------------------
// <copyright file="Agreement.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.Contact;
import com.microsoft.store.partnercenter.models.ResourceBase;
import org.joda.time.DateTime;

public class Agreement
        extends ResourceBase
{
    /**
     * Gets or sets the agreement identifier.
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