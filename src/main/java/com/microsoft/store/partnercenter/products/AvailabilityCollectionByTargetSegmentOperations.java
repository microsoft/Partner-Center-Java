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
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Availabilities implementation class.
 */
public class AvailabilityCollectionByTargetSegmentOperations
	extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>>
	implements IAvailabilityCollectionByTargetSegment
{
	/**
	 * Initializes a new instance of the AvailabilityCollectionByTargetSegmentOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId             Identifier for the product.
	 * @param skuId                 Identifier for the SKU.
	 * @param country               The country on which to base the product.
	 * @param targetSegment         The target segment used for filtering the availabilities.
	 */
	public AvailabilityCollectionByTargetSegmentOperations(IPartner rootPartnerOperations, String productId, String skuId, String country, String targetSegment)
	{
		super(rootPartnerOperations, new QuadrupleTuple<String, String, String, String>(productId, skuId, country, targetSegment));

		if (StringHelper.isNullOrWhiteSpace(productId))
		{
			throw new IllegalArgumentException("productId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(skuId))
		{
			throw new IllegalArgumentException("skuId must be set");
		}

		ParameterValidator.isValidCountryCode(country);

		if (StringHelper.isNullOrWhiteSpace(targetSegment))
		{
			throw new IllegalArgumentException("targetSegment must be set");
		}
	}

	/**
	 * Retrieves all the availabilities for the provided SKU on a specific target segment.
	 * 
	 * @return The availability for the provided SKU on a specific target segment.
	 */
	public ResourceCollection<Availability> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getParameters().get("Country"),
				this.getContext().getItem3()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getParameters().get("TargetSegment"),
				this.getContext().getItem4()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Availability>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2()),
			parameters);
	}
}