// -----------------------------------------------------------------------
// <copyright file="CartCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.carts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.carts.Cart;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Cart collection operations implementation class.
 */
public class CartCollectionOperations
    extends BasePartnerComponentString
    implements ICartCollection
{
    /**
     * Initializes a new instance of the CartCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     */
    public CartCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
    }

    /**
     * Obtains a specific cart behavior.
     * 
     * @param cartId Identifier for the cart.
     * @return The available cart operations.
     */
    @Override
    public ICart byId( String cartId )
    {
        return new CartOperations( this.getPartner(), this.getContext(), cartId );
    }

    /**
     * Creates a new cart for the customer.
     * 
     * @param newCart A cart item to be created.
     * @return The customer information that was just created.
     */
    @Override
    public Cart create( Cart newCart )
    {
        if ( newCart == null )
        {
            throw new IllegalArgumentException( "Cart cannot be null" );
        }
        IPartnerServiceProxy<Cart, Cart> partnerServiceProxy =
            new PartnerServiceProxy<>( 
                new TypeReference<Cart>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "CreateCart" ).getPath(),
                    this.getContext() ) );

        return partnerServiceProxy.post( newCart );
    }
}