// -----------------------------------------------------------------------
// <copyright file="VettingSubStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VettingSubStatus
{
    /**
     * None vetting sub status
     */
    NONE("none"),

    /**
     * The entry step
     */
    ENTRY("entry"),

    /**
     * Email ownership check for business accounts
     */
    EMAIL_OWNERSHIP("email_ownership"),

    /**
     * Email Domain for business accounts
     */
    EMAIL_DOMAIN("email_domain"),

    /**
     * Employment verification sub status
     */
    EMPLOYMENT_VERIFICATION("employment_verification"),

    /**
     * Decision making process
     */
    DECISION("decision"),

    /**
     * Other vetting sub status
     */
    OTHER("other"),

    /**
     * Business verification sub status
     */
    BUSINESS_VERIFICATION("business_verification");

    private final String value;

    VettingSubStatus(String value)
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