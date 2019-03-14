// -----------------------------------------------------------------------
// <copyright file="EstimateLinkCollectionByCurrencyOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.invoices.EstimateLink;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Represents the operations available on an estimate link collection by
 * currency.
 */
public class EstimateLinkCollectionByCurrencyOperations 
    extends BasePartnerComponentString
    implements IEstimateLinkCollectionByCurrency 
{
    /**
     * Initializes a new instance of the EstimateLinkCollectionByCurrencyOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param currencyCode          The currency code.
     */
    public EstimateLinkCollectionByCurrencyOperations(IPartner rootPartnerOperations, String currencyCode) {
        super(rootPartnerOperations, currencyCode);

        if (StringHelper.isNullOrWhiteSpace(currencyCode)) {
            throw new IllegalArgumentException("currencyCode has to be set.");
        }
    }

    /**
     * Gets the estimate link resource collection.
     * 
     * @return The estimate link resource collection
     */
    @Override
    public ResourceCollection<EstimateLink> get() 
    {
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
            new TypeReference<ResourceCollection<EstimateLink>>(){}, 
            MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetEstimatesLinks").getPath(),
				this.getContext()));
    }
}