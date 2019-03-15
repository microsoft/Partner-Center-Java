// -----------------------------------------------------------------------
// <copyright file="OrderOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.orders;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.orders.Order;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
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
        return get(false);
    }

    /**
     * Gets the order information.
     * 
     * @param includePrice A flag indicating whether to include pricing details in the order information or not.
     * @return The order information including pricing details (based on access permissions) when requested.
     */
    @Override
    public Order get(Boolean includePrice)
    {
        Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOrder").getParameters().get("IncludePrice"),
                String.valueOf(includePrice)));   
                
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<Order>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("GetOrder").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()),
            parameters);
    }

    /**
     * Gets line item collection operations.
     * 
     * @return The line item collection operations.
     */    
    @Override
    public IOrderLineItemCollection getOrderLineItems() 
    {
        return new OrderLineItemCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
    }

    /**
     * Gets the order provisioning status operations.
     * 
     * @return The order provisioning status operation.
     */
    @Override
    public IOrderProvisioningStatus getProvisioningStatus() 
    {
        return new OrderProvisioningStatusOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
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
            throw new IllegalArgumentException( "Order cannot be null" );
        }

        return this.getPartner().getServiceClient().patch(
            this.getPartner(),
            new TypeReference<Order>(){}, 
            MessageFormat.format( 
                PartnerService.getInstance().getConfiguration().getApis().get("UpdateOrder").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2()),
            order);
    }
}