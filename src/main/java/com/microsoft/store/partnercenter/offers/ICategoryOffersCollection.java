// -----------------------------------------------------------------------
// <copyright file="ICategoryOffersCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.Tuple;

public interface ICategoryOffersCollection
    extends IPartnerComponent<Tuple<String, String>>, IEntityCollectionRetrievalOperations<Offer, ResourceCollection<Offer>>
{
    /**
     * Retrieves all the offers in the given offer category.
     * 
     * @return The offers in the given offer category.
     */
    ResourceCollection<Offer> get();

    /**
     *  Retrieves a subset of offers in the given offer category.
     * 
     * @param offset The starting index.
     * @param size The maximum number of offers to return.
     * @return The requested segment of the offers in the given offer category.
     */
    ResourceCollection<Offer> get( int offset, int size );

}
