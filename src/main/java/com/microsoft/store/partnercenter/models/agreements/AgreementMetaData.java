// -----------------------------------------------------------------------
// <copyright file="AgreementMetaData.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AgreementMetaData provides metadata about the agreement type
 * that partner can provide confirmation of customer acceptance.
 */
public class AgreementMetaData
{
    /**
     * Gets or sets the unique identifier of an agreement template.
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
     * Gets or sets agreement type.
     */
    @JsonProperty( "agreementType" )
    private AgreementType __AgreementType;

    public AgreementType getAgreementType()
    {
        return __AgreementType;
    }

    public void setAgreementType( AgreementType value )
    {
        __AgreementType = value;
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

    /**
     * Gets or sets the version rank of an agreement template.
     */
    @JsonProperty( "versionRank" )
    private int __VersionRank;

    public int getVersionRank()
    {
        return __VersionRank;
    }

    public void setVersionRank( int value )
    {
        __VersionRank = value;
    }
}