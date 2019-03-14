// -----------------------------------------------------------------------
// <copyright file="EstimateCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.invoices;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Defines the operations available for estimate collection.
 */
public class EstimateCollectionOperations 
    extends BasePartnerComponentString
    implements IEstimateCollection 
{
    /**
     * Initializes a new instance of the EstimateCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public EstimateCollectionOperations(IPartner rootPartnerOperations)
    {
        super(rootPartnerOperations);
    }

    /**
     * Gets the estimate links of the recon line items.
     */
    @Override
    public IEstimateLink getLinks() 
    {
        return new EstimateLinkOperations(this.getPartner());
    }
}