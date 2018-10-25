// -----------------------------------------------------------------------
// <copyright file="VettingVersion.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.partners;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VettingVersion 
{
    /**
     *  None vetting version
     */
    NONE("none"),

    /**
     * Latest vetting information: Will always get the latest vetting information no
     * matter if it is vetted or not
     */
    CURRENT("current"),

    /**
     * Latest finalized vetting information: Will return the latest vetting information
     * that is either (Authorized or Rejected)
     */
    LAST_FINALIZED("last_finalized");

    private final String value;

    VettingVersion(String value)
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