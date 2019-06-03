// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * Implements offer add-ons behavior.
 */
public class OfferAddOnsOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IOfferAddOns
{
	/**
	 * Initializes a new instance of the OfferAddOnsOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param offerId The offer identifier to get its add on offers.
	 * @param country The country on which to base the offer add-ons.
	 */
	public OfferAddOnsOperations(IPartner rootPartnerOperations, String offerId, String country)
	{
		super(rootPartnerOperations, new Tuple<String, String>(offerId, country));

		ParameterValidator.isValidCountryCode(country);
	}

	/**
	 * Retrieves the add-ons for the given offer.
	 * 
	 * @return The offer add-ons.
	 */
	public ResourceCollection<Offer> get()
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getPath(),
				this.getContext().getItem1()),
			parameters);
	}

	/**
	 * Retrieves a subset of offers for the provided country.
	 * 
	 * @param offset The starting index.
	 * @param size The maximum number of offers to return.
	 * @return The requested segment of the offers for the provided country.
	 */
	@Override
	public ResourceCollection<Offer> get(int offset, int size)
	{
		ParameterValidator.isIntInclusive(0, Integer.MAX_VALUE, offset, "offset has to be non-negative.");
		ParameterValidator.isIntInclusive(1, Integer.MAX_VALUE, size, "size has to be positive.");

		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getParameters().get("Country"),
				this.getContext().getItem2()
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getParameters().get("Offset"),
				String.valueOf(offset)
			) 
		);

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getParameters().get("Size"),
				String.valueOf(size)
			) 
		);

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<Offer>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetOfferAddons").getPath(),
				this.getContext().getItem1()),
			parameters);
	}
}