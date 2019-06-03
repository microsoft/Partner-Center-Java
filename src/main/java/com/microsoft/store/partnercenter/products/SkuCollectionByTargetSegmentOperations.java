// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.products;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Sku Collection operations implementation.
 */
public class SkuCollectionByTargetSegmentOperations
	extends BasePartnerComponent<TripletTuple<String, String, String>>
	implements ISkuCollectionByTargetSegment
{
	/**
	 * Initializes a new instance of the SkuCollectionByTargetSegmentOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId             Identifier for the product.
	 * @param country               The country on which to base the product.
	 * @param targetSegment         The target segment used for filtering the availabilities.
	 */
	public SkuCollectionByTargetSegmentOperations(IPartner rootPartnerOperations, String productId, String country, String targetSegment)
	{
		super(rootPartnerOperations, new TripletTuple<String, String, String>(productId, country, targetSegment));

		if (StringHelper.isNullOrWhiteSpace(productId))
		{
			throw new IllegalArgumentException("productId must be set");
		}

		ParameterValidator.isValidCountryCode(country);

		if (StringHelper.isNullOrWhiteSpace(targetSegment))
		{
			throw new IllegalArgumentException("targetSegment must be set");
		}
	}

	/**
	 * Retrieves all the skus for the provided product and target segment.
	 * 
	 * @return The SKUs for the provided product and target segment.
	 */
	public ResourceCollection<Sku> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSkus").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSkus").getParameters().get("TargetSegment"),
				this.getContext().getItem3()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Sku>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSkus").getPath(),
				this.getContext().getItem1()),
			parameters);
	}
}