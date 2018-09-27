// -----------------------------------------------------------------------
// <copyright file="AgreementDetailsCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.agreements;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Agreement details collection operations implementation class.
 */
public class AgreementDetailsCollectionOperations
        extends BasePartnerComponentString
        implements IAgreementDetailsCollection
{
    /**
     * Initializes a new instance of the {@link #AgreementDetailsCollectionOperations} class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     */
    public AgreementDetailsCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the agreement details.
     *
     * @return A list of agreement details.
     */
    @Override
    public ResourceCollection<AgreementMetaData> get()
    {
        return new PartnerServiceProxy<AgreementMetaData, ResourceCollection<AgreementMetaData>>(
                new TypeReference<ResourceCollection<AgreementMetaData>>() {}, this.getPartner(),
                PartnerService.getInstance().getConfiguration().getApis()
                                .get( "GetAgreementsDetails" ).getPath()).get();
    }
}