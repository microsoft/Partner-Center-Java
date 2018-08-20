// -----------------------------------------------------------------------
// <copyright file="IServiceCostLineItemsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostLineItem;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/***
 * Represents the behavior of the customer service cost line items as a whole.
 */
public interface IServiceCostLineItemsCollection 
	extends IPartnerComponent<Tuple<String, String>>, IEntireEntityCollectionRetrievalOperations<ServiceCostLineItem, ResourceCollection<ServiceCostLineItem>>
{
    /***
     * Retrieves a customer's service cost line items.
     * 
     * @return: The service cost line items.
     */
	ResourceCollection<ServiceCostLineItem> get();
}