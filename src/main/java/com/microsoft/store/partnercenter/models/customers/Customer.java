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

    @JsonProperty( "id" )
    private String __Id;

    /**
     * Gets the identifier.
     * 
     * @return The customer identifier.
     */
    public String getId()
    {
        return __Id;
    }

    /**
     * Sets the identifier.
     * 
     * @param value The customer identifier.
     */
    public void setId( String value )
    {
        __Id = value;
    }

    @JsonProperty( "commerceId" )
    private String __CommerceId;

    /**
     * Gets the commerce identifier.
     * 
     * @return The commerce identifier.
     */
    public String getCommerceId()
    {
        return __CommerceId;
    }

    /**
     * Sets the commerce identifier
     * 
     * @param value The commerce identifier.
     */
    public void setCommerceId( String value )
    {
        __CommerceId = value;
    }

    @JsonProperty( "companyProfile" )
    private CustomerCompanyProfile __CompanyProfile;

    /**
     * Gets the company profile.
     * 
     * @return The compnay profile.
     */
    public CustomerCompanyProfile getCompanyProfile()
    {
        return __CompanyProfile;
    }

    /**
     * Sets the company profile.
     * 
     * @param value The company profile.
     */
    public void setCompanyProfile( CustomerCompanyProfile value )
    {
        __CompanyProfile = value;
    }

    @JsonProperty( "billingProfile" )
    private CustomerBillingProfile __BillingProfile;

    /**
     * Gets the billing profile.
     * 
     * @return The billing profile.
     */
    public CustomerBillingProfile getBillingProfile()
    {
        return __BillingProfile;
    }

    /**
     * Sets the billing profile.
     * 
     * @param value The billing profile.
     */
    public void setBillingProfile( CustomerBillingProfile value )
    {
        __BillingProfile = value;
    }

    @JsonProperty( "relationshipToPartner" )
    private CustomerPartnerRelationship __RelationshipToPartner;

    /**
     * Gets the relationship to the partner.
     * 
     * @return The relationship to the partner.
     */
    public CustomerPartnerRelationship getRelationshipToPartner()
    {
        return __RelationshipToPartner;
    }

    /**
     * Sets the relationship to the partner.
     * 
     * @param value The relationship to the partner.
     */
    public void setRelationshipToPartner( CustomerPartnerRelationship value )
    {
        __RelationshipToPartner = value;
    }

    @JsonProperty( "allowDelegatedAccess" )
    private Boolean __AllowDelegatedAccess;

    /**
     * Gets a flag indicating whether allow delegated access is enabled or not.
     * 
     * @return A flag indicating whether allow delegated access is enabled or not.
     */
    public Boolean getAllowDelegatedAccess()
    {
        return __AllowDelegatedAccess;
    }

    /**
     * Sets a flag indicating whether allow delegated access is enabled or not.
     * 
     * @param value A flag indicating whether allow delegated access is enabled or not.
     */
    public void setAllowDelegatedAccess( Boolean value )
    {
        __AllowDelegatedAccess = value;
    }


    @JsonProperty( "userCredentials" )
    private UserCredentials __UserCredentials;

    /**
     * Gets the user credentials.
     * 
     * @return The user credentials.
     */
    public UserCredentials getUserCredentials()
    {
        return __UserCredentials;
    }

    /**
     * Sets the user credentials.
     * 
     * @param value The user credentials.
     */
    public void setUserCredentials( UserCredentials value )
    {
        __UserCredentials = value;
    }

    @JsonProperty( "customDomains" )
    private List<String> __CustomDomains;
   
    /**
     * Gets the custom domains.
     * 
     * @return The custom domains.
     */
    public List<String> getCustomDomains()
    {
        return __CustomDomains;
    }

    /**
     * Sets the custom domains.
     * 
     * @param value The custom domains.
     */
    public void setCustomDomains( List<String> value )
    {
        __CustomDomains = value;
    }

    @JsonProperty( "associatedPartnerId" )
    private String __AssociatedPartnerId;

    /**
     * Gets the indirect reseller associated to this customer account. 
     * 
     * @return The indirect reseller associated to this customer account.
     */
    public String getAssociatedPartnerId()
    {
        return __AssociatedPartnerId;
    }

    /**
     * Sets the indirect reseller associated to this customer account.
     * This value can be set only by indirect CSP partners.
     * 
     * @param value The indirect reseller associated to this customer account.
     */
    public void setAssociatedPartnerId( String value )
    {
        __AssociatedPartnerId = value;
    }
}