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
import com.microsoft.store.partnercenter.models.offers.Product;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the product operations by customer, by target view, by target segment, and by reservation scope.
 */
public class CustomerProductCollectionByTargetViewByTargetSegmentByReservationScopeOperations
	extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>>
	implements ICustomerProductCollectionByTargetViewByTargetSegmentByReservationScope
{
	/**
	 * Initializes a new instance of the CustomerProductCollectionByTargetViewByTargetSegmentByReservationScopeOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
     * @param targetSegment The target segment used for filtering the products.
	 * @param targetView The target view which contains the products.
     * @param reservationScope The reservation scope which contains the products.
	 */
	public CustomerProductCollectionByTargetViewByTargetSegmentByReservationScopeOperations(IPartner rootPartnerOperations, String customerId, String targetView, String targetSegment, String reservationScope)
	{
		super(rootPartnerOperations, new QuadrupleTuple<String, String, String, String>(customerId, targetView, targetSegment, reservationScope));

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(targetView))
		{
			throw new IllegalArgumentException("targetView must be set");
        }
        
        if(StringHelper.isNullOrEmpty(targetSegment))
        {
			throw new IllegalArgumentException("targetSegment must be set");
        }

		if (StringHelper.isNullOrWhiteSpace(reservationScope))
		{
			throw new IllegalArgumentException("reservationScope must be set");
        }
	}

    /**
     * Gets all the products in a given product collection and that apply to a given customer, filtered by reservation scope.
     * 
     * @return All the products in a given product collection and that apply to a given customer, filtered by reservation scope.
     */
    @Override
    public ResourceCollection<Product> get() 
    {
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("ReservationScope"),
				this.getContext().getItem4()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("TargetSegment"),
				this.getContext().getItem3()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("TargetView"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Product>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getPath(),
				this.getContext().getItem1()),
			parameters);
    }
}