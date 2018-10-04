// -----------------------------------------------------------------------
// <copyright file="Subscription.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.Contract;
import com.microsoft.store.partnercenter.models.ContractType;
import com.microsoft.store.partnercenter.models.invoices.BillingType;

/**
 * The subscription resource represents the life cycle of a subscription and includes properties that define the states
 * throughout the subscription life cycle
 */
public class Subscription
    extends Contract
{
    /**
     * Initializes a new instance of the subscription class.
     */
    public Subscription()

    {
        this.setLinks( new SubscriptionLinks() );
    }

    /**
     * Gets or sets the subscription identifier.
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
     * Gets or sets the offer identifier.
     */
    private String __OfferId;

    public String getOfferId()
    {
        return __OfferId;
    }

    public void setOfferId( String value )
    {
        __OfferId = value;
    }

    /**
     * Gets or sets the offer identifier.
     */
    private String __OfferName;

    public String getOfferName()
    {
        return __OfferName;
    }

    public void setOfferName( String value )
    {
    	__OfferName = value;
    }

    /**
     * Gets or sets the friendly name for the subscription.
     */
    private String __FriendlyName;

    public String getFriendlyName()
    {
        return __FriendlyName;
    }

    public void setFriendlyName( String value )
    {
        __FriendlyName = value;
    }

    /**
     * Gets or sets the quantity. For example, in case of seat based billing, this property is set to seat count
     */
    private int __Quantity;

    public int getQuantity()
    {
        return __Quantity;
    }

    public void setQuantity( int value )
    {
        __Quantity = value;
    }

    /**
     * Gets or sets the units defining Quantity for the subscription.
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
     * Gets or sets the parent subscription identifier.
     */
    private String __ParentSubscriptionId;

    public String getParentSubscriptionId()
    {
        return __ParentSubscriptionId;
    }

    public void setParentSubscriptionId( String value )
    {
        __ParentSubscriptionId = value;
    }

    /**
     * Gets or sets the creation date.
     */
    private DateTime __CreationDate;

    public DateTime getCreationDate()
    {
        return __CreationDate;
    }

    /*@JsonProperty( "creationDate" )
    public void setCreationDate( String value )
    {
        __CreationDate = ISODateTimeFormat.dateTimeNoMillis().parseLocalDateTime( value );
    }*/

    public void setCreationDate( DateTime value )
    {
        __CreationDate = value;
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