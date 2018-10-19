// -----------------------------------------------------------------------
// <copyright file="OrderOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Order operations implementation class.
 */
public class OrderOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IOrder
{
    /**
     * Initializes a new instance of the OrderOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param orderId The order identifier.
     */
    public OrderOperations( IPartner rootPartnerOperations, String customerId, String orderId )
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
     * Retrieves the customer order.
     * 
     * @return The customer order.
     */
    @Override
    public Order get()
    {
        IPartnerServiceProxy<Order, Order> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<Order>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetOrder" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

    /**
     * Updates a customer order.
     * 
     * @param order The order to update.
     * @return The updated order.
     */
    @Override
    public Order patch( Order order )
    {
        if ( order == null )
        {
            throw new IllegalArgumentException( "Order can't be null" );
        }

        IPartnerServiceProxy<Order, Order> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<Order>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdateOrder" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.patch( order );
    }

}
