// -----------------------------------------------------------------------
// <copyright file="IOffer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds operations that can be performed on a single offer.
 */
public interface IOffer
    extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Gets the operations for the current offer's add-ons.
     */
    IOfferAddOns getAddOns();

    /**
     * Retrieves an offer for the provided offer Id, country.
     * 
     * @param country The country.
     * @return The requested offer for the given country and Id.
     */
    Offer get();
}