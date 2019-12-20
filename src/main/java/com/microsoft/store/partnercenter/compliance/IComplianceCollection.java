// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.compliance;

import com.microsoft.store.partnercenter.IPartnerComponent;

/**
 * Represents the compliance status of a partner.
 */
public interface IComplianceCollection 
	extends IPartnerComponent<String>
{
    /**
     * Gets the operations available for agreement signature status.
     */
    IAgreementSignatureStatus getAgreementSignatureStatus();
}