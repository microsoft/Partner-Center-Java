// -----------------------------------------------------------------------
// <copyright file="Offer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.offers;

import java.net.URI;
import java.util.List;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.invoices.BillingType;

/**
 * Represents a form of product availability to customer
 */
public class Offer
    extends ResourceBase
{
    /**
     * Initializes a new instance of the {@link #Offer} class.
     */
    public Offer()
    {
    }

    /**
     * Gets or sets the offer identifier.
     */
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
     * Gets or sets the offer name.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
        __Name = value;
    }

    /**
     * Gets or sets the description.
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription( String value )
    {
        __Description = value;
    }

    /**
     * Gets or sets the minimum quantity available.
     */
    private int __MinimumQuantity;

    public int getMinimumQuantity()
    {
        return __MinimumQuantity;
    }

    public void setMinimumQuantity( int value )
    {
        __MinimumQuantity = value;
    }

    /**
     * Gets or sets the maximum quantity available.
     */
    private int __MaximumQuantity;

    public int getMaximumQuantity()
    {
        return __MaximumQuantity;
    }

    public void setMaximumQuantity( int value )
    {
        __MaximumQuantity = value;
    }

    /**
     * Gets or sets the category rank in collection This property should be set only in case of offer category
     * collections
     */
    private int __Rank;

    public int getRank()
    {
        return __Rank;
    }

    public void setRank( int value )
    {
        __Rank = value;
    }

    /**
     * Gets or sets the offer URI.
     */
    private URI __Uri;

    public URI getUri()
    {
        return __Uri;
    }

    public void setUri( URI value )
    {
        __Uri = value;
    }

    /**
     * Gets or sets the locale to which the offer applies.
     */
    private String __Locale;

    public String getLocale()
    {
        return __Locale;
    }

    public void setLocale( String value )
    {
        __Locale = value;
    }

    /**
     * Gets or sets the country where the offer applies
     */
    private String __Country;

    public String getCountry()
    {
        return __Country;
    }

    public void setCountry( String value )
    {
        __Country = value;
    }

    /**
     * Gets or sets the category.
     */
    private OfferCategory __Category;

    public OfferCategory getCategory()
    {
        return __Category;
    }

    public void setCategory( OfferCategory value )
    {
        __Category = value;
    }

    /**
     * Gets or sets the prerequisite offers.
     */
    private List<String> __PrerequisiteOffers;

    public List<String> getPrerequisiteOffers()
    {
        return __PrerequisiteOffers;
    }

    public void setPrerequisiteOffers( List<String> value )
    {
        __PrerequisiteOffers = value;
    }

    /**
     * Gets or sets a value indicating whether this instance is add-ons.
     */
    private Boolean __IsAddOn;

    public Boolean getIsAddOn()
    {
        return __IsAddOn;
    }

    public void setIsAddOn( Boolean value )
    {
        __IsAddOn = value;
    }

    /**
     * Gets or sets a value indicating whether this instance is available for purchase.
     */
    private Boolean __IsAvailableForPurchase;

    public Boolean getIsAvailableForPurchase()
    {
        return __IsAvailableForPurchase;
    }

    public void setIsAvailableForPurchase( Boolean value )
    {
        __IsAvailableForPurchase = value;
    }

    /**
     * Gets or sets how billing is done for the line item purchase.
     */
    private BillingType __Billing;

    public BillingType getBilling()
    {
        return __Billing;
    }

    public void setBilling( BillingType value )
    {
        __Billing = value;
    }

    /**
     * Gets or sets a value indicating whether [automatic renewable].
     */
    private Boolean __IsAutoRenewable;

    public Boolean getIsAutoRenewable()
    {
        return __IsAutoRenewable;
    }

    public void setIsAutoRenewable( Boolean value )
    {
        __IsAutoRenewable = value;
    }

    /**
     * Gets or sets the list of offers that this offer can be upgraded to.
     */
    private List<String> __UpgradeTargetOffers;

    public List<String> getUpgradeTargetOffers()
    {
        return __UpgradeTargetOffers;
    }

    public void setUpgradeTargetOffers( List<String> value )
    {
        __UpgradeTargetOffers = value;
    }

    /**
     * Gets or sets the product.
     */
    private Product __Product;

    public Product getProduct()
    {
        return __Product;
    }

    public void setProduct( Product value )
    {
        __Product = value;
    }

    /**
     * Gets or sets the type of the unit.
     */
    private String __UnitType;

    public String getUnitType()
    {
        return __UnitType;
    }

    public void setUnitType( String value )
    {
        __UnitType = value;
    }

    /**
     * Gets or sets the learn more link.
     */
    private OfferLinks __Links;

    public OfferLinks getLinks()
    {
        return __Links;
    }

    public void setLinks( OfferLinks value )
    {
        __Links = value;
    }

    /**
     * Gets or sets a value indicating the Sales Group Id.
     */
    private String __SalesGroupId;

    public String getSalesGroupId()
    {
        return __SalesGroupId;
    }

    public void setSalesGroupId( String value )
    {
    	__SalesGroupId = value;
    }

    /**
     * Gets or sets a value indicating whether this is a trial offer.
     */
    private Boolean __IsTrial;

    public Boolean getIsTrial()
    {
        return __IsTrial;
    }

    public void setIsTrial( Boolean value )
    {
    	__IsTrial = value;
    }

    /**
     * Gets or sets a value indicating whether this offer has any add-ons
     */
    private Boolean __HasAddOns;

    public Boolean getHasAddOns()
    {
        return __HasAddOns;
    }

    public void setHasAddOns( Boolean value )
    {
    	__HasAddOns = value;
    }

    /**
     * Gets or sets the amount of subscriptions that can be purchased of this offer
     * based on the limitUnitOfMeasure
     */
    private int __Limit;

    public int getLimit()
    {
        return __Limit;
    }

    public void setLimit( int value )
    {
    	__Limit = value;
    }

    /**
     * Gets or sets the value used to indicate the type of the purchase limitation.
     */
    private String __LimitUnitOfMeasure;

    public String getLimitUnitOfMeasure()
    {
        return __LimitUnitOfMeasure;
    }

    public void setLimitUnitOfMeasure( String value )
    {
    	__LimitUnitOfMeasure = value;
    }

    /**
     * Gets or sets the supported billing cycles for the offer.
     */
    private List<BillingCycleType> __SupportedBillingCycles;

    public List<BillingCycleType> getSupportedBillingCycles()
    {
        return __SupportedBillingCycles;
    }

    public void setSupportedBillingCycles( List<BillingCycleType> value )
    {
    	__SupportedBillingCycles = value;
    }

    /**
     * Gets or sets qualifications required by the Partner in order to purchase the offer for a customer.
     */
    private String[] __ResellerQualifications;

    public String[] getResellerQualifications()
    {
        return __ResellerQualifications;
    }

    public void setResellerQualifications( String[] value )
    {
    	__ResellerQualifications = value;
    }

    /**
     * Gets or sets qualifications required by the customer for the partner to purchase it for the customer.
     */
    private String[] __ReselleeQualifications;

    public String[] getReselleeQualifications()
    {
        return __ReselleeQualifications;
    }

    public void setReselleeQualifications( String[] value )
    {
    	__ResellerQualifications = value;
    }
}