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
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Single availability operations implementation.
 */
public class AvailabilityOperations 
	extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>> implements IAvailability 
{
	/**
	 * Initializes a new instance of the AvailabilityOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId             Identifier of the product.. 
	 * @param skuId                 Identifier of the SKU.
	 * @param availabilityId        Identifier of the availability.
	 * @param country               The country on which to base the availability.
	 */
	public AvailabilityOperations(IPartner rootPartnerOperations, String productId, String skuId, String availabilityId, String country) 
	{
		super(rootPartnerOperations, new QuadrupleTuple<String, String, String, String>(productId, skuId, availabilityId, country));

		if (StringHelper.isNullOrWhiteSpace(productId)) {
			throw new IllegalArgumentException("productId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(skuId)) {
			throw new IllegalArgumentException("skuId must be set");
		}
		
		if (StringHelper.isNullOrWhiteSpace(availabilityId)) {
			throw new IllegalArgumentException("availabilityId must be set");
		}

		ParameterValidator.isValidCountryCode(country);
	}

	/**
	 * Retrieves the availability information.
	 * 
	 * @return The availability information.
	 */
	public Availability get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailability").getParameters().get("Country"),
				this.getContext().getItem4()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<Availability>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailability").getPath(),
				this.getContext().getItem1(), 
				this.getContext().getItem2(),
				this.getContext().getItem3()),
			parameters);
	}
}