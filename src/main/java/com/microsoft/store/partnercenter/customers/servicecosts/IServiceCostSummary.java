// -----------------------------------------------------------------------
// <copyright file="IServiceCostSummary.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.servicecosts;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsSummary;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds the operations related to a customer's service costs.
 */
public interface IServiceCostSummary
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<ServiceCostsSummary>
{
    /***
     * Retrieves the customer's service cost summary.
     * 
     * @return: The customer's service cost summary.
     */
    ServiceCostsSummary get();
}