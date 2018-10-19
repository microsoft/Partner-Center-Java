// -----------------------------------------------------------------------
// <copyright file="ICartCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.carts;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.carts.Cart;

/**
 * Encapsulates a customer cart behavior.
 */
public interface ICartCollection
    extends IPartnerComponentString,
    IEntityCreateOperations<Cart, Cart>, IEntitySelector<ICart>
{
    /**
     * Obtains a specific cart behavior.
     * 
     * @param cartId Identifier for the cart.
     * @return The available cart operations.
     */
    ICart byId( String cartId );
}