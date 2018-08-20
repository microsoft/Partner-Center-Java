// -----------------------------------------------------------------------
// <copyright file="AuditRecordSearchField.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.auditing;

/***
 * Lists the supported audit search fields.
 */
public enum AuditRecordSearchField {
    /***
     * Customer company name.
     */
    CompanyName,
    /***
     * Customer identifier (GUID).
     */
    CustomerId, 
    /***
     * Resource Type as defined in available Resource Types (Example: Order, Subscription).
     */
    ResourceType
}