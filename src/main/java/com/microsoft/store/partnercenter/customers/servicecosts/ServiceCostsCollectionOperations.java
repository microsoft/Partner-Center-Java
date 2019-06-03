// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.servicecosts;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.servicecosts.ServiceCostsBillingPeriod;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Holds customer service costs behavior.
 */
public class ServiceCostsCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IServiceCostsCollection
{
    private IServiceCostLineItemsCollection serviceCostLineItems;

    private IServiceCostSummary serviceCostSummary; 

    /**
     * Initializes a new instance of the ServiceCostsCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     * @param billingPeriod The service cost billing period.
     */
    public ServiceCostsCollectionOperations(IPartner rootPartnerOperations, String customerId, ServiceCostsBillingPeriod billingPeriod)
    {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, billingPeriod.toString()));

        if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException("customerId must be set");
        }
    }

    /**
     * Gets the customer's service cost line items.
     * 
     * @return The customer's service cost line items.
     */
    public IServiceCostLineItemsCollection getLineItems()
    {
        if(this.serviceCostLineItems == null)
        {
           this.serviceCostLineItems = new ServiceCostLineItemsOperations(this.getPartner(), this.getContext());
        }

        return this.serviceCostLineItems;
    }

    /**
     * Gets the customer's service cost summary.
     * 
     * @return The customer's service cost summary.
     */
    public IServiceCostSummary getSummary()
    {
        if(serviceCostSummary == null)
        {
            serviceCostSummary = new ServiceCostSummaryOperations(this.getPartner(), this.getContext());
        }

        return serviceCostSummary;
    }
}