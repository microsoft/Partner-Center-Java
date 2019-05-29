// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    IEntityCreateOperations<Cart, Cart>, IEntitySelector<String, ICart>
{
    /**
     * Obtains a specific cart behavior.
     * 
     * @param cartId Identifier for the cart.
     * @return The available cart operations.
     */
    ICart byId( String cartId );
}