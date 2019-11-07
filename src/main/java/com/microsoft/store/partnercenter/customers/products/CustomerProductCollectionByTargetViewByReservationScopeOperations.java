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
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the product operations by customer and by reservation scope operations.
 */
public class CustomerProductCollectionByTargetViewByReservationScopeOperations
	extends BasePartnerComponent<TripletTuple<String, String, String>>
	implements ICustomerProductCollectionByTargetViewByReservationScope
{
	/**
	 * Initializes a new instance of the CustomerProductCollectionByTargetViewByReservationScopeOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 * @param targetView The target view which contains the products.
     * @param reservationScope The reservation scope which contains the products.
	 */
	public CustomerProductCollectionByTargetViewByReservationScopeOperations(IPartner rootPartnerOperations, String customerId, String targetView, String reservationScope)
	{
		super(rootPartnerOperations, new TripletTuple<String, String, String>(customerId, targetView, reservationScope));

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(targetView))
		{
			throw new IllegalArgumentException("targetView must be set");
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
				this.getContext().getItem3()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerProducts").getParameters().get("TargetView"),
				this.getContext().getItem3()
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