// -----------------------------------------------------------------------
// <copyright file="AgreementMetaData.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgreementMetaData
{
    /**
     * Gets or sets the agreement metadata identifier.
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