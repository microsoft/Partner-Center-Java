// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.orders.OrderLineItemActivationLink;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Order collection operations implementation class.
 */
public class OrderLineItemActivationLinkOperations 
    extends BasePartnerComponent<TripletTuple<String, String, Integer>>
    implements IOrderLineItemActivationLink         
{
    /**
     * Initializes a new instance of the OrderLineItemActivationLinkOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The identifier for the customer.
     * @param orderId The identifier for the order.
     * @param lineItemNumber The order line item number.
     */
    public OrderLineItemActivationLinkOperations(IPartner rootPartnerOperations, String customerId, String orderId, int lineItemNumber) 
    {
        super(rootPartnerOperations, new TripletTuple<String, String, Integer>(customerId, orderId, lineItemNumber));

        if (StringHelper.isNullOrWhiteSpace(customerId)) 
        {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(orderId)) 
        {
            throw new IllegalArgumentException("orderId must be set");
        }
    }

    /**
     * Gets the order line item activation link collection.
     * 
     * @return The order line item activation link collection.
     */
    @Override
    public ResourceCollection<OrderLineItemActivationLink> get() 
    {
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ResourceCollection<OrderLineItemActivationLink>>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("GetActivationLinksByLineItemNumber").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2(),
                this.getContext().getItem3()));
    }
}