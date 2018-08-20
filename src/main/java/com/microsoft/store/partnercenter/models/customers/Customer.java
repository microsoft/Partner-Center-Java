// -----------------------------------------------------------------------
// <copyright file="Customer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.customers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;
import com.microsoft.store.partnercenter.models.UserCredentials;

/**
 * Base customer profile for both Company, Billing profiles
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    public Customer()
    {
    }

    /**
     * Gets or sets the identifier.
     */

    @JsonProperty( "id" )
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

    /**
     * Gets or sets the commerce identifier.
     */

    @JsonProperty( "commerceId" )
    private String __CommerceId;

    public String getCommerceId()
    {
        return __CommerceId;
    }

    public void setCommerceId( String value )
    {
        __CommerceId = value;
    }

    /**
     * Gets or sets the company profile.
     */
    @JsonProperty( "companyProfile" )
    private CustomerCompanyProfile __CompanyProfile;

    public CustomerCompanyProfile getCompanyProfile()
    {
        return __CompanyProfile;
    }

    public void setCompanyProfile( CustomerCompanyProfile value )
    {
        __CompanyProfile = value;
    }

    /**
     * Gets or sets the billing profile.
     */
    @JsonProperty( "billingProfile" )
    private CustomerBillingProfile __BillingProfile;

    public CustomerBillingProfile getBillingProfile()
    {
        return __BillingProfile;
    }

    public void setBillingProfile( CustomerBillingProfile value )
    {
        __BillingProfile = value;
    }

    /**
     * Gets or sets the relationship to partner.
     */
    @JsonProperty( "relationshipToPartner" )
    private CustomerPartnerRelationship __RelationshipToPartner;

    public CustomerPartnerRelationship getRelationshipToPartner()
    {
        return __RelationshipToPartner;
    }

    public void setRelationshipToPartner( CustomerPartnerRelationship value )
    {
        __RelationshipToPartner = value;
    }

    @JsonProperty( "allowDelegatedAccess" )
    private Boolean __AllowDelegatedAccess;

    /**
     * Gets or sets the allow delegated access.
     */
    public Boolean getAllowDelegatedAccess()
    {
        return __AllowDelegatedAccess;
    }

    public void setAllowDelegatedAccess( Boolean value )
    {
        __AllowDelegatedAccess = value;
    }

    /**
     * Gets or sets the user credentials.
     */
    @JsonProperty( "userCredentials" )
    private UserCredentials __UserCredentials;

    public UserCredentials getUserCredentials()
    {
        return __UserCredentials;
    }

    public void setUserCredentials( UserCredentials value )
    {
        __UserCredentials = value;
    }

    /**
     * Gets the custom domains.
     */
    @JsonProperty( "customDomains" )
    private List<String> __CustomDomains;

    public List<String> getCustomDomains()
    {
        return __CustomDomains;
    }

    public void setCustomDomains( List<String> value )
    {
        __CustomDomains = value;
    }

    /**
     * Gets or sets the indirect reseller associated to this customer account. 
     * This value can be set only by indirect CSP partners.
     */
    @JsonProperty( "associatedPartnerId" )
    private String __AssociatedPartnerId;

    public String getAssociatedPartnerId()
    {
        return __AssociatedPartnerId;
    }

    public void setAssociatedPartnerId( String value )
    {
        __AssociatedPartnerId = value;
    }
}