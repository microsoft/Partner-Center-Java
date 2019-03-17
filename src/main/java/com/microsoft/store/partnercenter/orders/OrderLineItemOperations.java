// -----------------------------------------------------------------------
// <copyright file="OrderLineItemOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the order collection operations.
 */
public class OrderLineItemOperations 
    extends BasePartnerComponent<TripletTuple<String, String, Integer>>
    implements IOrderLineItem 
{
    /**
     * Initializes a new instance of the OrderLineItemOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param orderId The order identifier.
     * @param lineItemNumber The line item number.
     */
    public OrderLineItemOperations(IPartner rootPartnerOperations, String customerId, String orderId, int lineItemNumber) 
    {
        super(rootPartnerOperations, new TripletTuple<String, String, Integer>(customerId, orderId, lineItemNumber));

        if (StringHelper.isNullOrWhiteSpace(customerId)) 
        {
            throw new IllegalArgumentException("customerId must be set.");
        }

        if (StringHelper.isNullOrWhiteSpace(orderId)) 
        {
            throw new IllegalArgumentException("orderId must be set.");
        }
    }

    /** 
     * Gets the available customer order line item activation link operations.
     * 
     * @return The available customer order line item activation link operations.
     */
    public IOrderLineItemActivationLink getActivationLink()
    {
        return new OrderLineItemActivationLinkOperations(
            this.getPartner(), 
            this.getContext().getItem1(), 
            this.getContext().getItem2(), 
            this.getContext().getItem3());
    } 
}