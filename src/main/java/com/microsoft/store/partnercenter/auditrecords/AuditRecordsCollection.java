// -----------------------------------------------------------------------
// <copyright file="AuditRecordsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.auditrecords;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.auditing.AuditRecord;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;

import org.joda.time.DateTime;

/**
 * An Implementation of {@code IAuditRecordsCollection} for handling common partner component properties and behavior.
 *
 * See parent class {@code BasePartnerComponentString} for additional details.
 */
public class AuditRecordsCollection 
	extends BasePartnerComponentString
	implements IAuditRecordsCollection {

	public AuditRecordsCollection( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	@Override
	public SeekBasedResourceCollection<AuditRecord> query( DateTime startDate, DateTime endDate, IQuery query )
	{
		if ( query.getType() != QueryType.INDEXED && query.getType() != QueryType.SIMPLE )
		{
			throw new IllegalArgumentException( "This type of query is not supported." );
		}

		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		parameters.add
		(
			new KeyValuePair<String, String>
			(
				PartnerService.getInstance().getConfiguration().getApis().get("GetAuditRecordsRequest").getParameters().get("StartDate"),
				startDate.toString()
			) 
		);
		
		if ( endDate != null )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getParameters().get( "EndDate" ),
					endDate.toString() 
				) 
			);
		}

		if ( query.getType() == QueryType.INDEXED )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getParameters().get("Size"), 
					Integer.toString( query.getPageSize() )  
				)
			);
		}

		if ( query.getFilter() != null )
		{
			// add the filter to the request if specified
			ObjectMapper mapper = new ObjectMapper();
			try
			{
				parameters.add
				(
					new KeyValuePair<String, String>
					(
						PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getParameters().get("Filter"), 
						URLEncoder.encode
						( 
							mapper.writeValueAsString( query.getFilter() ),
							"UTF-8" 
						)
					)
				);
			}
			catch( JsonProcessingException e )
			{
				throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
			}
			catch ( UnsupportedEncodingException e )
			{
				throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
			}
		}

		if ( query.getToken() != null )
		{
			parameters.add
			(
				new KeyValuePair<String, String>
				(
					PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getAdditionalHeaders().get("ContinuationToken"),
					query.getToken().toString()
				)
			);
		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SeekBasedResourceCollection<AuditRecord>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetAuditRecordsRequest").getPath(),
			parameters);
	}
}