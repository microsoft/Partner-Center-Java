// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.compliance;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.compliance.AgreementSignatureStatus;

/**
 * Represents the agreement signature status operations.
 */
public interface IAgreementSignatureStatus 
	extends IPartnerComponent<String>
{
    /**
     * Gets the agreement signature status by Microsoft Partner Network identifier or tenant identifier.
     * 
     * @param mpnId Optional identifier for the Microsoft Partner Network.
     * @param tenantId Optional identifier for the tenant.
     * 
     * @return The agreement signature status by Microsoft Partner Network identifier or tenant identifier.
     */
    AgreementSignatureStatus get(String mpnId, String tenantId);
}