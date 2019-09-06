// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;

/**
 * Agreement details collection operations implementation class.
 */
public class AgreementDetailsCollectionOperations
        extends BasePartnerComponentString
        implements IAgreementDetailsCollection
{
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
     * Retrieves the agreement details.
     *
     * @return A list of agreement details.
     */
    @Override
    public ResourceCollection<AgreementMetaData> get()
    {
        return this.getPartner().getServiceClient().get(
            this.getPartner(),
            new TypeReference<ResourceCollection<AgreementMetaData>>(){}, 
            PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getPath());
    }

    /**
     * Retrieves the operations tied with a specified agreement type.
     *
     * @param agreementType The agreement type filter.
     * @return The available operations for agreement details.
     */
    @Override
    public IAgreementDetailsCollectionByAgreementType byAgreementType(String agreementType)
    {
        return new AgreementDetailsCollectionByAgreementTypeOperations(this.getPartner(), agreementType);
    }
}