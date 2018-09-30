// -----------------------------------------------------------------------
// <copyright file="AuditRecordSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Lists the supported audit search fields.
 */
public enum AuditRecordSearchField {
    /***
     * Customer company name.
     */
    @JsonProperty("CompanyName")
    COMPANY_NAME,

    /***
     * Customer identifier (GUID).
     */
    @JsonProperty("CustomerId")
    CUSTOMER_ID,

    /***
     * Resource Type as defined in available Resource Types (Example: Order, Subscription).
     */
    @JsonProperty("ResourceType")
    RESOURCE_TYPE
}