// -----------------------------------------------------------------------
// <copyright file="BillingProfile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.Contact;
import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Represents a partner's billing profile.
 */
@JsonInclude(Include.NON_EMPTY)
public class BillingProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Initializes a new instance of the BillingProfile class.
     */
    public BillingProfile()
    {
        this.setAddress( new Address() );
        this.setPrimaryContact( new Contact() );
    }

    /**
     * Gets or sets the billing company name.
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
     * Gets or sets the billing address.
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
     * Gets or sets the billing primary contact.
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
     * Gets or sets the purchase order number.
     */
    private String __PurchaseOrderNumber;

    public String getPurchaseOrderNumber()
    {
        return __PurchaseOrderNumber;
    }

    public void setPurchaseOrderNumber( String value )
    {
        __PurchaseOrderNumber = value;
    }

    /**
     * Gets or sets the tax Id.
     */
    private String __TaxId;

    public String getTaxId()
    {
        return __TaxId;
    }

    public void setTaxId( String value )
    {
        __TaxId = value;
    }

    /**
     * Gets or sets the billing day.
     */
    private int __BillingDay;

    public int getBillingDay()
    {
        return __BillingDay;
    }

    public void setBillingDay( int value )
    {
        __BillingDay = value;
    }

    /**
     * Gets or sets the billing currency.
     */
    private String __BillingCurrency;

    public String getBillingCurrency()
    {
        return __BillingCurrency;
    }

    public void setBillingCurrency( String value )
    {
        __BillingCurrency = value;
    }
}