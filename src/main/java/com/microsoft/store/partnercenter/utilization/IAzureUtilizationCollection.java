// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utilization;

import org.joda.time.DateTime;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.SeekOperation;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationGranularity;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Groups behavior related to Azure subscription utilization records.
 */
public interface IAzureUtilizationCollection
	extends IPartnerComponent<Tuple<String, String>>
{
    /**
     * Retrieves utilization records for the Azure subscription.
     * @param startTime The starting time of when the utilization was metered in the billing system.
     * @param endTime The ending time of when the utilization was metered in the billing system.
     * @param granularity The resource usage time granularity. Can either be daily or hourly. Default is daily.
     * @param showDetails If set to true, the utilization records will be split by the resource instance levels. If set to false, the utilization records
    					   will be aggregated on the resource level. Default is true.
     * @param size Maximum number of records to return. The returned resource collection will specify a next link in case there
    				were more utilization records available.
     * @return The Azure resource utilization for the subscription.
     */
    ResourceCollection<AzureUtilizationRecord> query(
        DateTime startTime,
        DateTime endTime,
        AzureUtilizationGranularity granularity,
        boolean showDetails,
        int size);

    /**
     * Seeks pages of of utilization for resources that belong to an Azure subscription owned by a customer of the partner.
     * @param continuationToken The continuation token from the previous results.
     * @param seekOperation The seek operation to perform. Next is only supported.
     * @return The next page of utilization records.
     */
    ResourceCollection<AzureUtilizationRecord> seek( String continuationToken, SeekOperation seekOperation );
}