// -----------------------------------------------------------------------
// <copyright file="IOfferAddOns.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------
package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Defines the behavior of an offer's add-ons.
 */
public interface IOfferAddOns
    extends IPartnerComponent<Tuple<String, String>>, 
    IEntityCollectionRetrievalOperations<Offer, ResourceCollection<Offer>>
{
    /**
     * Retrieves all the offers for the provided country.
     * 
     * @return The offers for the provided country.
     */
    ResourceCollection<Offer> get();

    /**
     * Retrieves a subset of offers for the provided country.
     * 
     * @param offset The starting index.
     * @param size The maximum number of offers to return.
     * @return The requested segment of the offers for the given country.
     */
    ResourceCollection<Offer> get( int offset, int size );

}
