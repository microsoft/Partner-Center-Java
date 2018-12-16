// -----------------------------------------------------------------------
// <copyright file="SkuOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Single product operations implementation.
 */
public class ProductOperations 
	extends BasePartnerComponent<Tuple<String, String>> 
	implements IProduct 
{
	/**
	 * The product skus operations..
	 */  
	private ISkuCollection skus;
   
	/**
	 * Initializes a new instance of the ProductOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId             Identifier of the product. 
	 * @param country               The country on which to base the availability.
	 */
	public ProductOperations(IPartner rootPartnerOperations, String productId, String country)
	{
		super(rootPartnerOperations, new Tuple<String, String>(productId, country));

		if (StringHelper.isNullOrWhiteSpace(productId)) {
			throw new IllegalArgumentException("productId must be set");
		}
		
		ParameterValidator.isValidCountryCode(country);
	}

	/**
	 * Retrieves the SKUs for the product.
	 * 
	 * @return The SKUs for the product.
	 */
	public ISkuCollection getSkus()
	{
		if(skus == null)
		{
			skus = new SkuCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
		}

		return skus; 
	}

	/**
	 * Retrieves the product information
	 * 
	 * @return The product information.
	 */
	public Product get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProduct").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Product>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProduct").getPath(),
				this.getContext().getItem1()),
			parameters);
	}
}