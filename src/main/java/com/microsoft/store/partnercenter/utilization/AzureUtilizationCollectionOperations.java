// -----------------------------------------------------------------------
// <copyright file="IUtilizationCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utilization;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.SeekOperation;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationGranularity;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationRecord;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class AzureUtilizationCollectionOperations 
		extends BasePartnerComponent<Tuple<String, String>>
		implements IAzureUtilizationCollection
{

	/**
	 * Initializes a new instance of the AzureUtilizationCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 * @param subscriptionId The subscription identifier.
	 */
	public AzureUtilizationCollectionOperations( IPartner rootPartnerOperations,
			String customerId, String subscriptionId )
	{
		super(rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ));
		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set" );
		}

		if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
		{
			throw new IllegalArgumentException( "subscriptionId must be set" );
		}
	}

	/**
	 * Retrieves utilization records for the Azure subscription.
	 * @param startTime The starting time of when the utilization was metered in the billing system.
	 * @param endTime The ending time of when the utilization was metered in the billing system.
	 * @param granularity The resource usage time granularity. Can either be daily or hourly. Default is daily.
	 * @param showDetails If set to true, the utilization records will be split by the resource instance levels. If set to false, the utilization records
						   will be aggregated on the resource level. Default is true.
	 * @param size An optional maximum number of records to return. The returned resource collection will specify a next link in case there
					were more utilization records available.
	 * @return The Azure resource utilization for the subscription.
	 */
	@Override
	public ResourceCollection<AzureUtilizationRecord> query( DateTime startTime, DateTime endTime,
			AzureUtilizationGranularity granularity, boolean showDetails, int size )
	{     
		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		if ( startTime != null )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAzureUtilizationRecords" ).getParameters().get( "StartTime" ),
					startTime.withZone(DateTimeZone.UTC).toString("yyyy-MM-dd'T'HH:mm:ss'Z'")
				) 
			);
		}
		
		if ( endTime != null )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAzureUtilizationRecords" ).getParameters().get( "EndTime" ),
					endTime.withZone(DateTimeZone.UTC).toString("yyyy-MM-dd'T'HH:mm:ss'Z'")
				) 
			);
		}

		if ( granularity != null )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAzureUtilizationRecords" ).getParameters().get( "Granularity" ),
					granularity.toString()
				)
			);
		}

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get( "GetAzureUtilizationRecords" ).getParameters().get( "ShowDetails" ),
				Boolean.toString( showDetails )
			)
		);

		if( size > 0 )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAzureUtilizationRecords" ).getParameters().get( "Size" ),
					Integer.toString( size )
				)
			);        	
		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<AzureUtilizationRecord>>(){}, 
			MessageFormat.format( 
					PartnerService.getInstance().getConfiguration().getApis().get("GetAzureUtilizationRecords").getPath(),
					this.getContext().getItem1(),
					this.getContext().getItem2()),
			parameters); 
	}

	/**
	 * Seeks pages of utilization for resources that belong to an Azure subscription owned by a customer of the partner.
	 * @param continuationToken The continuation token from the previous results.
	 * @param seekOperation The seek operation to perform. Next is only supported.
	 * @return The next page of utilization records.
	 */
	@Override
	public ResourceCollection<AzureUtilizationRecord> seek( String continuationToken, SeekOperation seekOperation )
	{
		if ( StringHelper.isNullOrWhiteSpace( continuationToken ) )
		{
			throw new IllegalArgumentException( "continuationToken must be non empty" );
		}
		
		if ( seekOperation == null )
		{
			throw new IllegalArgumentException( "SeekOperation can not be null" );
		}

		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();
		Map<String, String> headers = new HashMap<>();

		headers.put(
				PartnerService.getInstance().getConfiguration().getApis().get("SeekAzureUtilizationRecords").getAdditionalHeaders().get("ContinuationToken"),
				continuationToken);

		parameters.add(
			new KeyValuePair<String, String>(
				PartnerService.getInstance().getConfiguration().getApis().get( "SeekAzureUtilizationRecords" ).getParameters().get( "SeekOperation" ),
				seekOperation.toString()));

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<AzureUtilizationRecord>>(){}, 
			MessageFormat.format( 
					PartnerService.getInstance().getConfiguration().getApis().get("SeekAzureUtilizationRecords").getPath(),
					this.getContext().getItem1(),
					this.getContext().getItem2()),
			headers,
			parameters); 
	}
}