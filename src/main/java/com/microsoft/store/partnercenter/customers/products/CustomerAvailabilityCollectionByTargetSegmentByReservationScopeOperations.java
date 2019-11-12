// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers.products;

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
import com.microsoft.store.partnercenter.products.IAvailabilityCollectionByTargetSegmentByReservationScopeOperations;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implementation of customer availabilities operations by target segment by reservation scope.
 */
public class CustomerAvailabilityCollectionByTargetSegmentByReservationScopeOperations
		extends BasePartnerComponent<QuintupleTuple<String, String, String, String, String>>
        implements IAvailabilityCollectionByTargetSegmentByReservationScopeOperations 
{
    /**
	 * Initializes a new instance of the CustomerAvailabilityCollectionByTargetSegmentOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 * @param productId Identifier for the product.
	 * @param skuId Identifier for the SKU.
	 * @param targetSegment The target segment used for filtering the availabilities.
	 * @param reservationScope The reservation scope filter.
	 */
	protected CustomerAvailabilityCollectionByTargetSegmentByReservationScopeOperations(IPartner rootPartnerOperations, String customerId, String productId, String skuId, String targetSegment, String reservationScope) 
	{
		super(rootPartnerOperations, new QuintupleTuple<String, String, String, String, String>(customerId, productId, skuId, targetSegment, reservationScope));

		if (StringHelper.isNullOrWhiteSpace(customerId)) {
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(productId)) {
			throw new IllegalArgumentException("productId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(skuId)) {
			throw new IllegalArgumentException("skuId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(targetSegment)) {
			throw new IllegalArgumentException("targetSegment must be set");
        }
        
        if(StringHelper.isNullOrEmpty(reservationScope)){
			throw new IllegalArgumentException("reservationScope must be set");
        }
	}

	/**
	 * Gets all the availabilities for the provided SKU on a specific target segment.
	 * 
	 * @return The availability for the provided SKU on a specific target segment.
	 */
	@Override
    public ResourceCollection<Availability> get() 
    {
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("ReservationScope"),
				this.getContext().getItem5()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("TargetSegment"),
				this.getContext().getItem4()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Availability>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getPath(),
                this.getContext().getItem1(), 
                this.getContext().getItem2(), 
                this.getContext().getItem3()),
			parameters);
	}
}