// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.compliance;

/**
 * Represent the agreement signature status
 */
public class AgreementSignatureStatus
{
    /**
     * A value indicating whether agreement is signed.
     */
    private boolean isAgreementSigned;

    /**
     * Gets a value indicating whether agreement is signed.
     * 
     * @return A value indicating whether agreement is signed.
     */
    public boolean getIsAgreementSigned()
    {
        return isAgreementSigned;
    }

    /**
     * Sets a value indicating whether agreement is signed.
     * 
     * @param value A value indicating whether agreement is signed.
     */
    public void setIsAgreementSigned(boolean value)
    {
        isAgreementSigned = value;
    }
}