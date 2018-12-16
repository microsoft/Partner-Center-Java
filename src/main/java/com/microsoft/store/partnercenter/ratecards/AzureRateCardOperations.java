// -----------------------------------------------------------------------
// <copyright file="AzureRateCardOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------
package com.microsoft.store.partnercenter.ratecards;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ratecards.AzureRateCard;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class AzureRateCardOperations 
	extends BasePartnerComponentString 
	implements IAzureRateCard 
{
	/**
	 * Initializes a new instance of the "AzureRateCardOperations" class.
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public AzureRateCardOperations(IPartner rootPartnerOperations)
	{
		super(rootPartnerOperations);
	}

	/**
	 * Gets the Azure rate card which provides real-time prices for Azure offers.
	 * @param currency An optional three letter ISO code for the currency in which the resource rates will be provided.
	 * 				    The default is the currency associated with the market in the partner's profile.
	 * @param region An optional two-letter ISO country/region code that indicates the market where the offer is purchased.
	 * 				  The default is the country/region code set in the partner profile.
	 * @return The Azure rate card for the partner.
	 */
	public AzureRateCard get(String currency, String region)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		if ( !StringHelper.isEmptyOrContainsWhiteSpace( currency ) )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAzureRateCard").getParameters().get("Currency"),
					currency
				) 
			);
		}

		if ( !StringHelper.isEmptyOrContainsWhiteSpace( region ) )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAzureRateCard").getParameters().get("Region"),
					region
				) 
			);
		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<AzureRateCard>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetAzureRateCard").getPath(),
			parameters);
	}

	/**
	 * Gets the Azure CSL rate card which provides real-time prices for Azure offers.
	 * @param currency An optional three letter ISO code for the currency in which the resource rates will be provided.
	 * 				    The default is the currency associated with the market in the partner's profile.
	 * @param region An optional two-letter ISO country/region code that indicates the market where the offer is purchased.
	 * 				  The default is the country/region code set in the partner profile.
	 * @return The Azure rate card for the partner.
	 */
	public AzureRateCard getShared(String currency, String region)
	{
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		if ( !StringHelper.isEmptyOrContainsWhiteSpace( currency ) )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAzureSharedRateCard").getParameters().get("Currency"),
					currency
				) 
			);
		}

		if ( !StringHelper.isEmptyOrContainsWhiteSpace( region ) )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAzureSharedRateCard").getParameters().get("Region"),
					region
				) 
			);
		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<AzureRateCard>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetAzureSharedRateCard").getPath(),
			parameters);
	}
}