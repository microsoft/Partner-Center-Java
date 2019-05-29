// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.products.IProduct;
import com.microsoft.store.partnercenter.products.ISkuCollection;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Single product by customer id operations implementation.
 */
public class CustomerProductOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IProduct
{
	private ISkuCollection skus;  

	/**
	 * Initializes a new instance of the CustomerProductOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer id for which to retrieve the product.
	 * @param productId Identifier for the product.
	 */
	public CustomerProductOperations( IPartner rootPartnerOperations, String customerId, String productId )
	{
		super( rootPartnerOperations, new Tuple<String, String>( customerId, productId ) );

		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( productId ) )
		{
			throw new IllegalArgumentException( "productId must be set" );
		}
	}

	/**
	 * Retrieves the product information
	 * 
	 * @return The product information.
	 */
	@Override
	public Product get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Product>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProduct").getPath(),
				this.getContext().getItem1(),
				this.getContext().getItem2()));
	}

	/**
	 * Retrieves the SKUs for the product.
	 * 
	 * @return The SKUs for the product.
	 */
	@Override
	public ISkuCollection getSkus()
	{
		if(skus == null)
		{
			skus = new CustomerSkuCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
		}

		return skus;
	}
}