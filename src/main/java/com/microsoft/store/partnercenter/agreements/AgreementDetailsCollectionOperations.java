// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Agreement details collection operations implementation class.
 */
public class AgreementDetailsCollectionOperations
        extends BasePartnerComponentString
        implements IAgreementDetailsCollection
{
    /**
     * The type of the agreement used to filter.
     */
    private String agreementType; 

    /**
     * Initializes a new instance of the AgreementDetailsCollectionOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     */
    public AgreementDetailsCollectionOperations(IPartner rootPartnerOperations)
    {
        super(rootPartnerOperations);
    }

    /**
     * Initializes a new instance of the AgreementDetailsCollectionOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     * @param agreementType The type of the agreement used to filter.
     */
    public AgreementDetailsCollectionOperations(IPartner rootPartnerOperations, String agreementType)
    {
        super(rootPartnerOperations);

        if (StringHelper.isNullOrWhiteSpace(agreementType))
        {
            throw new IllegalArgumentException("agreementType must be set");
        }

        this.agreementType = agreementType;         
    }

    /**
     * Retrieves the agreement details.
     *
     * @return A list of agreement details.
     */
    @Override
    public ResourceCollection<AgreementMetaData> get()
    {
        Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

        if(StringHelper.isNullOrWhiteSpace(agreementType))
        {
            return this.getPartner().getServiceClient().get(
                this.getPartner(),
                new TypeReference<ResourceCollection<AgreementMetaData>>(){}, 
                PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getPath());
        }

        parameters.add(new KeyValuePair<String, String>(
            PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getParameters().get("AgreementType"),
            agreementType));

        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ResourceCollection<AgreementMetaData>>(){}, 
            PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getPath(), 
            parameters);
    }

    /**
     * Retrieves the operations tied with a specified agreement type.
     *
     * @param agreementType The agreement type filter.
     * @return The available operations for agreement details.
     */
    @Override
    public IAgreementDetailsCollection byAgreementType(String agreementType)
    {
        return new AgreementDetailsCollectionOperations(this.getPartner(), agreementType);
    }
}