// -----------------------------------------------------------------------
// <copyright file="Customer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
    private String id;

    /**
     * Gets the identifier.
     * 
     * @return The customer identifier.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the identifier.
     * 
     * @param value The customer identifier.
     */
    public void setId( String value )
    {
        id = value;
    }

    @JsonProperty( "commerceId" )
    private String commerceId;

    /**
     * Gets the commerce identifier.
     * 
     * @return The commerce identifier.
     */
    public String getCommerceId()
    {
        return commerceId;
    }

    /**
     * Sets the commerce identifier
     * 
     * @param value The commerce identifier.
     */
    public void setCommerceId( String value )
    {
        commerceId = value;
    }

    @JsonProperty( "companyProfile" )
    private CustomerCompanyProfile companyProfile;

    /**
     * Gets the company profile.
     * 
     * @return The compnay profile.
     */
    public CustomerCompanyProfile getCompanyProfile()
    {
        return companyProfile;
    }

    /**
     * Sets the company profile.
     * 
     * @param value The company profile.
     */
    public void setCompanyProfile( CustomerCompanyProfile value )
    {
        companyProfile = value;
    }

    @JsonProperty( "billingProfile" )
    private CustomerBillingProfile billingProfile;

    /**
     * Gets the billing profile.
     * 
     * @return The billing profile.
     */
    public CustomerBillingProfile getBillingProfile()
    {
        return billingProfile;
    }

    /**
     * Sets the billing profile.
     * 
     * @param value The billing profile.
     */
    public void setBillingProfile( CustomerBillingProfile value )
    {
        billingProfile = value;
    }

    @JsonProperty( "relationshipToPartner" )
    private CustomerPartnerRelationship relationshipToPartner;

    /**
     * Gets the relationship to the partner.
     * 
     * @return The relationship to the partner.
     */
    public CustomerPartnerRelationship getRelationshipToPartner()
    {
        return relationshipToPartner;
    }

    /**
     * Sets the relationship to the partner.
     * 
     * @param value The relationship to the partner.
     */
    public void setRelationshipToPartner( CustomerPartnerRelationship value )
    {
        relationshipToPartner = value;
    }

    @JsonProperty( "allowDelegatedAccess" )
    private Boolean allowDelegatedAccess;

    /**
     * Gets a flag indicating whether allow delegated access is enabled or not.
     * 
     * @return A flag indicating whether allow delegated access is enabled or not.
     */
    public Boolean getAllowDelegatedAccess()
    {
        return allowDelegatedAccess;
    }

    /**
     * Sets a flag indicating whether allow delegated access is enabled or not.
     * 
     * @param value A flag indicating whether allow delegated access is enabled or not.
     */
    public void setAllowDelegatedAccess( Boolean value )
    {
        allowDelegatedAccess = value;
    }


    @JsonProperty( "userCredentials" )
    private UserCredentials userCredentials;

    /**
     * Gets the user credentials.
     * 
     * @return The user credentials.
     */
    public UserCredentials getUserCredentials()
    {
        return userCredentials;
    }

    /**
     * Sets the user credentials.
     * 
     * @param value The user credentials.
     */
    public void setUserCredentials( UserCredentials value )
    {
        userCredentials = value;
    }

    @JsonProperty( "customDomains" )
    private List<String> customDomains;
   
    /**
     * Gets the custom domains.
     * 
     * @return The custom domains.
     */
    public List<String> getCustomDomains()
    {
        return customDomains;
    }

    /**
     * Sets the custom domains.
     * 
     * @param value The custom domains.
     */
    public void setCustomDomains( List<String> value )
    {
        customDomains = value;
    }

    @JsonProperty( "associatedPartnerId" )
    private String associatedPartnerId;

    /**
     * Gets the indirect reseller associated to this customer account. 
     * 
     * @return The indirect reseller associated to this customer account.
     */
    public String getAssociatedPartnerId()
    {
        return associatedPartnerId;
    }

    /**
     * Sets the indirect reseller associated to this customer account.
     * This value can be set only by indirect CSP partners.
     * 
     * @param value The indirect reseller associated to this customer account.
     */
    public void setAssociatedPartnerId( String value )
    {
        associatedPartnerId = value;
    }
}