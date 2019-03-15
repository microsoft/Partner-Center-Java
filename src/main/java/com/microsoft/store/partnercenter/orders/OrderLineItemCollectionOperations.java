// -----------------------------------------------------------------------
// <copyright file="OrderLineItemCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Order operations implementation class.
 */
public class OrderLineItemCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IOrderLineItemCollection
{
    /**
     * Initializes a new instance of the OrderLineItemCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param orderId The order identifier.
     */
    public OrderLineItemCollectionOperations( IPartner rootPartnerOperations, String customerId, String orderId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, orderId ) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }

        if ( StringHelper.isNullOrWhiteSpace( orderId ) )
        {
            throw new IllegalArgumentException( "orderId must be set." );
        }
    }

    /**
     * Gets the order line item operations.
     * 
     * @param id The order line item number.
     * @return The order line item operations.
     */
    @Override
    public IOrderLineItem byId(Integer id) 
    {
        return new OrderLineItemOperations(
            this.getPartner(), 
            this.getContext().getItem1(), 
            this.getContext().getItem2(), 
            id);
    }
}