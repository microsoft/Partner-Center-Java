// -----------------------------------------------------------------------
// <copyright file="Subscription.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.Contract;
import com.microsoft.store.partnercenter.models.ContractType;
import com.microsoft.store.partnercenter.models.invoices.BillingType;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.ISODateTimeFormat;

/**
 * The subscription resource represents the life cycle of a subscription and includes properties that define the states
 * throughout the subscription life cycle
 */
public class Subscription
    extends Contract
{
    /**
     * The available actions for the subscription.
     */
    @JsonProperty("actions")
    private Iterable<String> actions;

    /** 
     * The date and time the subscription was created.
     */
    @JsonProperty("creationDate")
    private DateTime creationDate;

    /** 
     * The friendly name for the subscription.
     */
    @JsonProperty("friendlyName")
    private String friendlyName;

    /**
     * A flag indicating whether or not the subscription has purchasable addons. 
     */
    @JsonProperty("hasPurchasableAddons")
    private boolean hasPurchasableAddons;

    /**
     * The identifier for the subscription.
     */
    @JsonProperty("id")
    private String id; 

    /**
     * A flag indicating whether or not the subscription is a trial.
     */
    @JsonProperty("isTrial")
    private boolean isTrial;

    /**
     * The identifier for the offer that created the subscription.
     */
    @JsonProperty("offerId")
    private String offerId;

    /**
     * The name of the offer that created the subscription.
     */
    @JsonProperty("offerName")
    private String offerName;

    /**
     * The partner subscription identifier for the subscription.
     */
    @JsonProperty("parentSubscriptionId")
    private String parentSubscriptionId;

    /**
     * The entitlement identifier for the subscription.
     */
    @JsonProperty("entitlementId")
    private String entitlementId;

    /**
     * The quantity for the subscription.
     */
    @JsonProperty("quantity")
    private int quantity;

    /**
     * The units defining the quantity for the subscription.
     */
    @JsonProperty("unitType")
    private String unitType;

    /**
     * Initializes a new instance of the subscription class.
     */
    public Subscription()
    {
        this.setLinks( new SubscriptionLinks() );
    }

    /**
     * Gets the available actions for the subscription.
     * 
     * @return The available actions for the subscription.
     */
    public Iterable<String> getActions()
    {
        return actions;
    }

    /**
     * Gets the date and time when the subscription was created.
     * 
     * @return The date and time when the subscription was created.
     */
    public DateTime getCreationDate()
    {
        return creationDate;
    }

    /**
     * Sets the date and time when the subscription was created.
     * 
     * @param value The date and time when the subscription was created.
     */
    public void setCreationDate( DateTime value )
    {
        creationDate = value;
    }

    /**
     * Gets the friendly name for the subscription.
     * 
     * @return The friendly name for the subscription.
     */
    public String getFriendlyName()
    {
        return friendlyName;
    }

    /**
     * Sets the friendly name for the subscription.
     * 
     * @param value The friendly name for the subscription.
     */
    public void setFriendlyName( String value )
    {
        friendlyName = value;
    }

    /**
     * Gets a flag indicating whether or not the subscription has purchasable addons.
     * 
     * @return A flag indicating whether or not the subscription has purchasable addons.
     */
    public Boolean getHasPurchasableAddOns()
    {
        return hasPurchasableAddons;
    }

    /**
     * Gets the subscription identifier.
     * 
     * @return The identifier for the subscription.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the identifier for the subscription.
     * 
     * @param value The identifier for the subscription.
     */
    public void setId( String value )
    {
        id = value;
    }

    /**
     * Gets a flag indicating whether or not the subscription is a trial.
     * 
     * @return A flag indicating whether or not the subscription is a trial.
     */
    public Boolean getIsTrial()
    {
        return isTrial;
    }

    /**
     * Gets the offer identifier that created the subscription.
     * 
     * @return The offer identifier that created the subscription.
     */
    public String getOfferId()
    {
        return offerId;
    }

    /**
     * Sets the offer identifier that created the subscription.
     * 
     * @param value The offer identifier that created the subscription.
     */
    public void setOfferId( String value )
    {
        offerId = value;
    }

    /**
     * Get the name of the offer that created the subscription. 
     * 
    * @return The name of the offer that created the subscription.
    */
    public String getOfferName()
    {
        return offerName;
    }

    /**
     * Sets the name of the offer that created the subscription.
     * 
     * @param value The name of the offer that created the subscription.
     */
    public void setOfferName( String value )
    {
    	offerName = value;
    }

    /**
     * Gets the parent subscription identifier for the subscription. 
     * 
     * @return The parent subscription identifier for the subscription. 
     */
    public String getParentSubscriptionId()
    {
        return parentSubscriptionId;
    }

    /**
     * Sets the parent subscription identifier for the subscription. 
     * 
     * @param value The parent subscription identifier for the subscription. 
     */
    public void setParentSubscriptionId( String value )
    {
        parentSubscriptionId = value;
    }

    /**
     * Gets the entitlement identifier for the subscription.
     *
     * @return The entitlement identifier for the subscription.
     */
    public String getEntitlementId()
    {
        return entitlementId;
    }

    /**
     * Sets the entitlement identifier for the subscription.
     *
     * @param value The entitlement identifier for the subscription.
     */
    public void setEntitlementId( final String value )
    {
        entitlementId = value;
    }

    /**
     * Gets the quantity for the subscription. In the case of seat based billing, this value is the seat count.
     * 
     * @return The quantity for the subscription.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the quantity for the subscription. In the case of seat based billing, this value is the seat count.
     * 
     * @param value The quantity for the subscription.
     */
    public void setQuantity( int value )
    {
        quantity = value;
    }

    /**
     * Gets the units defining the quantity for the subscription.
     * 
     * @return The units defining the quantity for the subscription.
     */
    public String getUnitType()
    {
        return unitType;
    }

    /**
     * Sets the units defining the quantity for the subscription.
     * 
     * @param value The units defining the quantity for the subscription.
     */
    public void setUnitType( String value )
    {
        unitType = value;
    }

    /**
     * Gets or sets the effective start date for this subscription. It is used to back date a migrated subscription or
     * to align it with another.
     */
    private LocalDateTime __EffectiveStartDate;

    public LocalDateTime getEffectiveStartDate()
    {
        return __EffectiveStartDate;
    }

    @JsonProperty( "effectiveStartDate" )
    public void setEffectiveStartDate( String value )
    {
        __EffectiveStartDate = ISODateTimeFormat.dateTimeNoMillis().parseLocalDateTime( value );
    }

    public void setEffectiveStartDate( LocalDateTime value )
    {
        __EffectiveStartDate = value;
    }

    /**
     * Gets or sets the commitment end date for this subscription. For the subscription which are not auto renewable
     * this represents a date far away in the future.
     */
    private LocalDateTime __CommitmentEndDate;

    public LocalDateTime getCommitmentEndDate()
    {
        return __CommitmentEndDate;
    }

    @JsonProperty( "commitmentEndDate" )
    public void setCommitmentEndDate( String value )
    {
        __CommitmentEndDate = ISODateTimeFormat.dateTimeNoMillis().parseLocalDateTime( value );

    }

    public void setCommitmentEndDate( LocalDateTime value )
    {
        __CommitmentEndDate = value;
    }

    /**
     * Gets or sets the subscription status.
     */
    private SubscriptionStatus __Status = SubscriptionStatus.NONE;

    public SubscriptionStatus getStatus()
    {
        return __Status;
    }

    public void setStatus( SubscriptionStatus value )
    {
        __Status = value;
    }

    /**
     * Gets or sets a value indicating whether [automatic renew enabled].
     */
    private boolean __AutoRenewEnabled;

    public boolean getAutoRenewEnabled()
    {
        return __AutoRenewEnabled;
    }

    public void setAutoRenewEnabled( boolean value )
    {
        __AutoRenewEnabled = value;
    }

    /**
     * Gets or sets the billing type Revisit this property - do we need this having UnitType.
     */
    private BillingType __BillingType;

    public BillingType getBillingType()
    {
        return __BillingType;
    }

    public void setBillingType( BillingType value )
    {
        __BillingType = value;
    }

    /**
     * Gets or sets the MPN identifier. This only applies to 2-tier partner scenarios.
     */
    private String __PartnerId;

    public String getPartnerId()
    {
        return __PartnerId;
    }

    public void setPartnerId( String value )
    {
        __PartnerId = value;
    }

    /**
     * Gets the type of contract
     */
    @Override
    public ContractType getContractType()
    {
        return ContractType.SUBSCRIPTION;
    }

    public void setContractType( ContractType type )
    {
        if ( type != ContractType.SUBSCRIPTION )
        {
            throw new PartnerException( "API error: the subscription contract type should be subscription" );
        }
    }

    /**
     * Gets or sets the links.
     */
    private SubscriptionLinks __Links;

    public SubscriptionLinks getLinks()
    {
        return __Links;
    }

    public void setLinks( SubscriptionLinks value )
    {
        __Links = value;
    }

    /**
     * Gets or sets the links.
     */
    private Iterable<String> __SuspensionReasons;

    public Iterable<String> getSuspensionReasons()
    {
        return __SuspensionReasons;
    }

    public void setSuspensionReasons( Iterable<String> value )
    {
        __SuspensionReasons = value;
    }
}