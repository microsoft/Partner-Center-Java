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
    private String userId;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId( String value )
    {
        userId = value;
    }

    /**
     * Gets or sets the information about the user from the customer organization
     * who accepted the Microsoft Cloud Agreement.
     */
    @JsonProperty( "primaryContact" )
    private Contact primaryContact;

    public Contact getPrimaryContact()
    {
        return primaryContact;
    }

    public void setPrimaryContact( Contact value )
    {
        primaryContact = value;
    }

    /**
     * Gets or sets the unique identifier of the agreement that the customer accepted.
     */
    @JsonProperty( "templateId" )
    private String templateId;

    public String getTemplateId()
    {
        return templateId;
    }

    public void setTemplateId( String value )
    {
        templateId = value;
    }

    /**
     * Gets or sets the date when the customer accepted the agreement.
     */
    @JsonProperty( "dateAgreed" )
    private DateTime dateAgreed;

    public DateTime getDateAgreed()
    {
        return dateAgreed;
    }

    public void setDateAgreed( DateTime value )
    {
        dateAgreed = value;
    }

    /**
     * Gets or sets agreement type.
     */
    @JsonProperty( "type" )
    private AgreementType type;

    public AgreementType getType()
    {
        return type;
    }

    public void setType( AgreementType value )
    {
        type = value;
    }

    /**
     * Gets or sets URL to the agreement template.
     */
    @JsonProperty( "agreementLink" )
    private String agreementLink;

    public String getAgreementLink()
    {
        return agreementLink;
    }

    public void setAgreementLink( String value )
    {
        agreementLink = value;
    }
}