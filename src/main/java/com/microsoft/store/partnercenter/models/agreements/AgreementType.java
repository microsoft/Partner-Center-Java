// -----------------------------------------------------------------------
// <copyright file="AgreementType.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enumeration to represent type of Agreements
 */
public enum AgreementType
{
    /**
     * Microsoft cloud agreement type.
     */
    @JsonProperty("MicrosoftCloudAgreement")
    MICROSOFT_CLOUD_AGREEMENT
}