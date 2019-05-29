// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;

public interface ICustomerOfferCategoryCollection
	extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<OfferCategory, ResourceCollection<OfferCategory>>
{
    /**
     * Retrieves all the offer categories for the provided customer.
     * 
     * @return The offer categories for the provided customer.
     */
    ResourceCollection<OfferCategory> get();
}
