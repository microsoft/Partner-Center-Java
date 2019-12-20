// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.compliance;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

/**
 * Implements the compliance collection operations.
 */
public class ComplianceCollectionOperations
    extends BasePartnerComponentString 
    implements IComplianceCollection 
{
    /**
     * Initializes a new instance of the ComplianceCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public ComplianceCollectionOperations(IPartner rootPartnerOperations) 
    {
        super(rootPartnerOperations);
    }

    /**
     * Gets the operations available for agreement signature status.
     */
     @Override
    public IAgreementSignatureStatus getAgreementSignatureStatus() 
    {
        return new AgreementSignatureStatusOperations(this.getPartner());
    }
}