// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.carts;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.carts.Cart;
import com.microsoft.store.partnercenter.models.carts.CartCheckoutResult;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

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
		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<CartCheckoutResult>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("PlaceOrder").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()),
			"success");
	}

	/**
	 * Retrieves a customer cart.
	 * 
	 * @return The required cart object.
	 */
	@Override
	public Cart get() 
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Cart>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCart").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()));
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
		return this.getPartner().getServiceClient().put(
			this.getPartner(),
			new TypeReference<Cart>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("UpdateCart").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()),
			cart);
	}
}