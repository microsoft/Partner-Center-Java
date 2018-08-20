// -----------------------------------------------------------------------
// <copyright file="Upgrade.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;
import com.microsoft.store.partnercenter.models.offers.Offer;

/**
 * Represents a form of upgrade for a subscription
 */
public class Upgrade
    extends ResourceBase
{
    /**
     * Gets or sets the offer.
     */
    private Offer __TargetOffer;

    public Offer getTargetOffer()
    {
        return __TargetOffer;
    }

    public void setTargetOffer( Offer value )
    {
        __TargetOffer = value;
    }

    /**
     * Gets or sets the type of upgrade.
     */
    private UpgradeType __UpgradeType;

    public UpgradeType getUpgradeType()
    {
        return __UpgradeType;
    }

    public void setUpgradeType( UpgradeType value )
    {
        __UpgradeType = value;
    }

    /**
     * Gets or sets a value indicating whether the upgrade can be performed.
     */
    private Boolean __IsEligible;

    public Boolean isEligible()
    {
        return __IsEligible;
    }

    public void setIsEligible( Boolean value )
    {
        __IsEligible = value;
    }

    /**
     * Gets or sets the quantity to be purchased. Defaults to the source subscription quantity.
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
     * Gets or sets the reasons the upgrade cannot be performed, if applicable.
     */
    private Iterable<UpgradeError> __UpgradeErrors;

    public Iterable<UpgradeError> getUpgradeErrors()
    {
        return __UpgradeErrors;
    }

    public void setUpgradeErrors( Iterable<UpgradeError> value )
    {
        __UpgradeErrors = value;
    }

}
