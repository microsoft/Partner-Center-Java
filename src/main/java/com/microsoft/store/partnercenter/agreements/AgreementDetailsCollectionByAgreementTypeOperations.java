// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.AgreementMetaData;
import com.microsoft.store.partnercenter.models.agreements.AgreementType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Agreement details operations by agreement type implementation class.
 */
public class AgreementDetailsCollectionByAgreementTypeOperations
    extends BasePartnerComponent<AgreementType>
    implements IAgreementDetailsCollectionByAgreementType
{
    /**
     * Initializes a new instance of the AgreementDetailsCollectionByAgreementTypeOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     * @param agreementType The identifier of the agreement type.
     */
    public AgreementDetailsCollectionByAgreementTypeOperations(IPartner rootPartnerOperations, AgreementType agreementType)
    {
        super(rootPartnerOperations, agreementType);

        if (agreementType == null)
        {
            throw new IllegalArgumentException("agreementType must be set");
        }
    }

    /**
     * Retrieves all current agreement metadata for specified agreement type.
     *
     * @return A list of agreement details for specified agreement type.
     */
    @Override
    public ResourceCollection<AgreementMetaData> get()
    {
        Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

        parameters.add
        (
            new KeyValuePair<String, String>
            (
                PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getParameters().get("AgreementType"),
                this.getContext().toString()
            )
        );

        return this.getPartner().getServiceClient().get(
                this.getPartner(),
                new TypeReference<ResourceCollection<AgreementMetaData>>(){},
                PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementsDetails").getPath(),
                parameters);
    }
}