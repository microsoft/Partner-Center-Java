// -----------------------------------------------------------------------
// <copyright file="AgreementType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration to represent type of Agreements
 */
public enum AgreementType
{
    /**
     * Microsoft cloud agreement type.
     */
    MICROSOFT_CLOUD_AGREEMENT("MicrosoftCloudAgreement");

    private final String value;

    AgreementType(String value)
    {
        this.value = value;
    }

    /**
     * Converts the object to a string.
     *
     * @return A string that represents this object.
     */
    @JsonValue
    @Override
    public String toString()
    {
        return value;
    }
}