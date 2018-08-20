//-----------------------------------------------------------------------
//<copyright file="IRateCardCollection.java" company="Microsoft">
// Copyright (c) Microsoft Corporation.  All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.ratecards;

import com.microsoft.store.partnercenter.IPartnerComponentString;

/***
* Holds operations that apply to rate cards.
*/
public interface IRateCardCollection
	extends IPartnerComponentString
{
	/***
	 * Gets the Azure rate card operations.
	 */
	IAzureRateCard getAzure();
}