// -----------------------------------------------------------------------
// <copyright file="LicenseGroupId.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * License Group Id.
 */
public enum LicenseGroupId {
	/**
	 * Indicates nothing - no type, used as an initializer. If any invalid value is 
     * passed, then it will be defaulted to this.
	 */
    @JsonProperty("none")
    NONE,

    /**
     * Azure Active Directory This indicates that product SKU is managed by Azure AD.
     */
    @JsonProperty("group1")
    GROUP1,

    /**
     * Store for Business This indicates that product SKU is not managed by Azure AD.
     */
    @JsonProperty("group2")
    GROUP2
}