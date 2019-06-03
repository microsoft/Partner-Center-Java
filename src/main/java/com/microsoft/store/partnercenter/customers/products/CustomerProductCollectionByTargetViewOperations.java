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
import com.microsoft.store.partnercenter.models.products.Product;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Product operations by customer id and by target view implementation class.
 */
public class CustomerProductCollectionByTargetViewOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements ICustomerProductCollectionByTargetView
{
	/**
	 * Initializes a new instance of the CustomerProductCollectionByTargetViewOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId Identifier for the customer.
	 * @param targetView The target view which contains the products.
	 */
	public CustomerProductCollectionByTargetViewOperations(IPartner rootPartnerOperations, String customerId, String targetView)
	{
		super(rootPartnerOperations, new Tuple<String, String>(customerId, targetView));

		if (StringHelper.isNullOrWhiteSpace(customerId))
		{
			throw new IllegalArgumentException("customerId must be set");
		}

		if (StringHelper.isNullOrWhiteSpace(targetView))
		{
			throw new IllegalArgumentException("targetView must be set");
		}
	}

	/**
	 * Retrieves all the products in a given catalog view that apply to a given customer.
	 * 
	 * @return The products in a given catalog view that apply to a given customer.
	 */
	@Override
	public ResourceCollection<Product> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

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

	/**
	 * Retrieves the operations that can be applied on products in a given catalog view and that apply to a given customer, filtered by target segment.
	 * 
	 * @param targetSegment The product segment filter.
	 * @return The product collection operations by customer, by target view and by target segment.
	 */
	@Override
	public ICustomerProductCollectionByTargetViewByTargetSegment byTargetSegment(String targetSegment)
	{
		return new CustomerProductCollectionByTargetViewByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), targetSegment, this.getContext().getItem2());
	}
}