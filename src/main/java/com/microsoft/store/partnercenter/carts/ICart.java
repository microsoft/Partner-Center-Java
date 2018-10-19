// -----------------------------------------------------------------------
// <copyright file="ICart.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.carts;

import com.microsoft.store.partnercenter.models.carts.Cart;
import com.microsoft.store.partnercenter.models.carts.CartCheckoutResult;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPutOperations;
import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Encapsulates a customer cart behavior.
 */
public interface ICart 
	extends IPartnerComponent<Tuple<String, String>>, IEntityPutOperations<Cart>, IEntityGetOperations<Cart>
{
    /**
     * Checkouts the cart.
     * 
     * @return The cart checkout result.
     */
    CartCheckoutResult checkout();
}