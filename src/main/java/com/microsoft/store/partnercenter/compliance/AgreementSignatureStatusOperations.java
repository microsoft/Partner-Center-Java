// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.compliance;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.compliance.AgreementSignatureStatus;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the agreement signature status operations.
 */
public class AgreementSignatureStatusOperations 
    extends BasePartnerComponentString
    implements IAgreementSignatureStatus 
{
    /**
     * Initializes a new instance of the AgreementSignatureStatusOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    protected AgreementSignatureStatusOperations(IPartner rootPartnerOperations) 
    {
        super(rootPartnerOperations);
    }

    /**
     * Gets the agreement signature status by Microsoft Partner Network identifier or tenant identifier.
     * 
     * @param mpnId Optional identifier for the Microsoft Partner Network.
     * @param tenantId Optional identifier for the tenant.
     * 
     * @return The agreement signature status by Microsoft Partner Network identifier or tenant identifier.
     */
    @Override
    public AgreementSignatureStatus get(String mpnId, String tenantId) 
    {
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

        if(!StringHelper.isNullOrEmpty(mpnId))
        {
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementSignatureStatus").getParameters().get("MpnId"),
					mpnId
				) 
			);
        }

        if(!StringHelper.isNullOrEmpty(tenantId))
        {
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementSignatureStatus").getParameters().get("TenantId"),
					tenantId
				) 
			);
        }

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
            new TypeReference<AgreementSignatureStatus>(){}, 
            PartnerService.getInstance().getConfiguration().getApis().get("GetAgreementSignatureStatus").getPath(),
			parameters); 
    }
}