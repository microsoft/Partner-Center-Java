// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Product operations by country and by target view implementation class.
 */
public class ProductCollectionByCountryByTargetViewOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IProductCollectionByCountryByTargetView
{
	/**
	 * Initializes a new instance of the ProductCollectionByCountryByTargetViewByTargetSegmentOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param targetView             The target view which contains the products.
	 * @param country               The country on which to base the products.
	 */
	public ProductCollectionByCountryByTargetViewOperations(IPartner rootPartnerOperations, String targetView, String country)
	{
		super(rootPartnerOperations, new Tuple<String, String>(targetView, country));

		if (StringHelper.isNullOrWhiteSpace(targetView))
		{
			throw new IllegalArgumentException("targetView must be set");
		}

		ParameterValidator.isValidCountryCode(country);
	}

	/**
	 * Retrieves the operations that can be applied on products that belong to a given country, catalog view and target segment.
	 * 
	 * @param targetSegment The target segment filter.
	 * @return The product collection operations by country, by target view and by target segment.
	 */
	public IProductCollectionByCountryByTargetViewByTargetSegment byTargetSegment(String targetSegment)
	{
		return new ProductCollectionByCountryByTargetViewByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), targetSegment);
	}

	/**
	 * Retrieves all the products in the given country, catalog view and target segment.
	 * 
	 * @return The products in the given country, catalog view and target segment.
	 */
	public ResourceCollection<Product> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProducts").getParameters().get("TargetView"),
				this.getContext().getItem1()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetProducts").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Product>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetProducts").getPath(),
			parameters);
	}
}