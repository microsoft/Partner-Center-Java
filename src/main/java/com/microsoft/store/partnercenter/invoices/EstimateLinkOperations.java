// -----------------------------------------------------------------------
// <copyright file="EstimateLinkOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Represents the operations that can be done on the partner's estimate
 * collection.
 */
public class EstimateLinkOperations
    extends BasePartnerComponentString
    implements IEstimateLink    
{
	/**
	 * Initializes a new instance of the EstimateLinkOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public EstimateLinkOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

    /**
     * Gets the operations that can be applied on products from a given country.
     * 
     * @param currencyCode The currency code for the country.
     * @return The operations that can be performed on estimate link collection that belong to a given currency.
     */
    @Override
    public IEstimateLinkCollectionByCurrency byCurrency(String currencyCode) 
    {
        return new EstimateLinkCollectionByCurrencyOperations(this.getPartner(), currencyCode);
    }
}