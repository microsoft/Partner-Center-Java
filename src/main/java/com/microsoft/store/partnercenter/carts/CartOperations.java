// -----------------------------------------------------------------------
// <copyright file="CartOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.carts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.carts.Cart;
import com.microsoft.store.partnercenter.models.carts.CartCheckoutResult;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Cart collection operations implementation class.
 */
public class CartOperations 
    extends BasePartnerComponent<Tuple<String, String>> implements ICart 
{
    /**
     * Initializes a new instance of the CartOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     * @param cartId                Identifier for the cart.
     */
    public CartOperations(IPartner rootPartnerOperations, String customerId, String cartId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, cartId));

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(cartId)) {
            throw new IllegalArgumentException("cartId must be set");
        }
    }

    /**
     * Checkouts the cart.
     * 
     * @return The cart checkout result.
     */
    @Override
    public CartCheckoutResult checkout() 
    {
        IPartnerServiceProxy<String, CartCheckoutResult> partnerServiceProxy = 
            new PartnerServiceProxy<String, CartCheckoutResult>(
                new TypeReference<CartCheckoutResult>() {
                }, this.getPartner(),
                MessageFormat.format(
                        PartnerService.getInstance().getConfiguration().getApis().get("PlaceOrder").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.post("success");
    }

    /**
     * Retrieves a customer cart.
     * 
     * @return The required cart object.
     */
    @Override
    public Cart get() 
    {
        IPartnerServiceProxy<Cart, Cart> partnerServiceProxy = new PartnerServiceProxy<Cart, Cart>(
                new TypeReference<Cart>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetCart").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.get();
    }

    /**
     * Updates an existing cart.
     * 
     * @param cart The cart to update.
     * 
     * @return The updated cart object.
     */
    @Override
    public Cart put(Cart cart) 
    {
        IPartnerServiceProxy<Cart, Cart> partnerServiceProxy = new PartnerServiceProxy<Cart, Cart>(
                new TypeReference<Cart>() {
                }, this.getPartner(),
                MessageFormat.format(
                        PartnerService.getInstance().getConfiguration().getApis().get("UpdateCart").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.put(cart);
    }
}