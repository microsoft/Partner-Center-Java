// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;

/**
 * Encapsulates the basic offers behavior.
 */
public interface IOfferCollection
    extends IPartnerComponentString
{

    /**
     * Retrieves the operations tied with a specific offer.
     * 
     * @param offerId The offer id.
     * @return The offer operations.
     */
    IOffer byId(String offerId);

    /**
     * Retrieves all the offers for the provided country.
     * 
     * @return The offers for the provided country.
     */
    ResourceCollection<Offer> get();

    /**
     * Retrieves all the offers for the provided country.
     * 
     * @param offset The starting index
     * @param size The maximum number of offers to return.
     * @return The requested segment of the offers for the given country.
     */
    ResourceCollection<Offer> get(int offset, int size);

    /**
     * Retrieves the operations that can be applied on offers that belong to an offer category.
     * 
     * @param categoryId The offer category identifier.
     * 
     * @return The category offers operations.
     */
    ICategoryOffersCollection byCategory(String categoryId);
}
