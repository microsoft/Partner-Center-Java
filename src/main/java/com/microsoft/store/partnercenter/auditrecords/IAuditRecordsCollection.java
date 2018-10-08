// -----------------------------------------------------------------------
// <copyright file="IAuditRecordsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.auditrecords;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.auditing.AuditRecord;
import com.microsoft.store.partnercenter.models.query.IQuery;

/***
 * Represents the operations that can be done on partners audit collection.
 */
public interface IAuditRecordsCollection 
	extends IPartnerComponentString
{
    /***
     * Queries audit records associated to the partner.
     * The following queries are supported:
     * - Specify the number of audit record to return.
     * - Filter the result with a customer name.
     * 
     * @param startDate The start date of the audit record logs.
     * @param endDate The end date of the audit record logs.
     * @param query The query.
     * @return The audit records that match the given query.
     */
	SeekBasedResourceCollection<AuditRecord> query( DateTime startDate, DateTime endDate, IQuery query );
}