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
import com.microsoft.store.partnercenter.models.utils.QuintupleTuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the operations for availabilities by target segment and reservation scope.
 */
public class AvailabilityCollectionByTargetSegmentByReservationScopeOperations
	extends BasePartnerComponent<QuintupleTuple<String, String, String, String, String>>
	implements IAvailabilityCollectionByTargetSegmentByReservationScopeOperations
{
	/**
	 * Initializes a new instance of the AvailabilityCollectionByTargetSegmentByReservationScopeOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param productId Identifier for the product.
	 * @param skuId Identifier for the SKU.
	 * @param country The country on which to base the product.
	 * @param targetSegment The target segment used for filtering the availabilities.
     * @param reservationScope The reservation scope filter.
	 */
	public AvailabilityCollectionByTargetSegmentByReservationScopeOperations(IPartner rootPartnerOperations, String productId, String skuId, String country, String targetSegment, String reservationScope)
	{
		super(rootPartnerOperations, new QuintupleTuple<String, String, String, String, String>(productId, skuId, country, targetSegment, reservationScope));

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
        
		if (StringHelper.isNullOrWhiteSpace(reservationScope))
		{
			throw new IllegalArgumentException("reservationScope must be set");
        }
    }
    
	/**
	 * Gets all the availabilities for the provided SKU on a specific reservation scope given a target segment.
	 * 
	 * @return The availabilities for the provided SKU on a specific reservation scope given a target segment.
	 */
	@Override
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

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAvailabilities").getParameters().get("ReservationScope"),
				this.getContext().getItem5()
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