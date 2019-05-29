// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.extensions;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.extensions.products.IProductExtensions;

/**
 *  Holds operations that extend another set of operations.
 */
public interface IExtensions 
	extends IPartnerComponentString
{
	/**
	 * Retrieves the product extension operations.
	 * 
	 * @return The product extensions operations.
	 */
    IProductExtensions getProduct();
}