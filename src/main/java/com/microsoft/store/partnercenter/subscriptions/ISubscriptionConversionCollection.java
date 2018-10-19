// -----------------------------------------------------------------------
// <copyright file="ISubscriptionConversionCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Conversion;
import com.microsoft.store.partnercenter.models.subscriptions.ConversionResult;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * This interface defines the conversion operations available on a customer's trial subscription.
 */
public interface ISubscriptionConversionCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<Conversion, ResourceCollection<Conversion>>, IEntityCreateOperations<Conversion, ConversionResult>
{
    /**
     * Submits a trial subscription conversion.
     *
     * @param conversion The new subscription conversion information
     * @return The customer subscription usage record.
     */
	ConversionResult create(Conversion conversion);
  
    /**
     * Retrieves all conversions for the trial subscription.
     * @return The subscription conversions.
     */
    ResourceCollection<Conversion> get();
}