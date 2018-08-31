// -----------------------------------------------------------------------
// <copyright file="AgreementMetaDataCollectionOperations.java" company="Microsoft">
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

import java.text.MessageFormat;
import java.util.Locale;

/**
 * Implements the operations on an Agreement metadata collection.
 */
public class AgreementMetaDataCollectionOperations
        extends BasePartnerComponentString
        implements IAgreementMetaDataCollection
{
    /**
     * Initializes a new instance of the {@link #AgreementMetaDataCollectionOperations} class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     */
    public AgreementMetaDataCollectionOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves all current agreement metadata.
     *
     * @return The current agreement metadata.
     */
    @Override
    public ResourceCollection<AgreementMetaData> get()
    {
        return new PartnerServiceProxy<AgreementMetaData, ResourceCollection<AgreementMetaData>>(
                new TypeReference<ResourceCollection<AgreementMetaData>>() {}, this.getPartner(),
                MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis()
                                .get( "GetAllAgreements" ).getPath(),
                        this.getContext(), Locale.US ) ).get();
    }
}