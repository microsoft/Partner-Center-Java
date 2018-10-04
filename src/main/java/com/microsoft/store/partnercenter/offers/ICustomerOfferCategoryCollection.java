// -----------------------------------------------------------------------
// <copyright file="ICustomerOfferCategoryCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;

public interface ICustomerOfferCategoryCollection
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<OfferCategory, ResourceCollection<OfferCategory>>
{
    /***
     * Retrieves all the offer categories for the provided Customer.
     * 
     * @return The offers for the provided customer.
     */
    ResourceCollection<OfferCategory> get();
}
