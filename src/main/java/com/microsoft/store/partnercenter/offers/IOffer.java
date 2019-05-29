// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
     * 
     * @return The operations for the current offer's add-ons
     */
    IOfferAddOns getAddOns();

    /**
     * Retrieves an offer for the provided offer identifer, country.
     * 
     * @return The requested offer for the given country and identifier.
     */
    Offer get();
}