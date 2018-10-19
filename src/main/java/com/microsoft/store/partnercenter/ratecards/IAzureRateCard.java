//-----------------------------------------------------------------------
//<copyright file="IAzureRateCard.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.ratecards;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.ratecards.AzureRateCard;

/**
 * Holds operations that apply to Azure rate card.
 */
public interface IAzureRateCard
	extends IPartnerComponentString
{
	/**
	 * Gets the Azure rate card which provides real-time prices for Azure offers.
	 * @param currency An optional three letter ISO code for the currency in which the resource rates will be provided.
	 * 				    The default is the currency associated with the market in the partner's profile.
	 * @param region An optional two-letter ISO country/region code that indicates the market where the offer is purchased.
	 * 				  The default is the country/region code set in the partner profile.
	 * @return The Azure rate card for the partner.
	 */
	AzureRateCard get( String currency, String region );

	/**
	 * Gets the Azure CSL rate card which provides real-time prices for Azure offers.
	 * @param currency An optional three letter ISO code for the currency in which the resource rates will be provided.
	 * 				    The default is the currency associated with the market in the partner's profile.
	 * @param region An optional two-letter ISO country/region code that indicates the market where the offer is purchased.
	 * 				  The default is the country/region code set in the partner profile.
	 * @return The Azure rate card for the partner.
	 */
	AzureRateCard getShared( String currency, String region );
}