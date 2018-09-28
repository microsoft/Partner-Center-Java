// -----------------------------------------------------------------------
// <copyright file="AuditRecordsCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.auditrecords;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.joda.time.DateTime;

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
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

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
        if ( query != null && query.getType() != QueryType.INDEXED && query.getType() != QueryType.SIMPLE )
        {
            throw new IllegalArgumentException( "This type of query is not supported." );
        }

        IPartnerServiceProxy<AuditRecord, SeekBasedResourceCollection<AuditRecord>> partnerServiceProxy = 
        		new PartnerServiceProxy<AuditRecord, SeekBasedResourceCollection<AuditRecord>>( new TypeReference<SeekBasedResourceCollection<AuditRecord>>()
                {
                }, this.getPartner(), PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getPath() );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>(
        		PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getParameters().get( "StartDate" ),
        		startDate.toString() ) );

        
        if ( endDate != null )
        {
            partnerServiceProxy.getUriParameters().add
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
            partnerServiceProxy.getUriParameters().add
            (
            	new KeyValuePair<String, String>
            	(
            		PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getParameters().get("Size"), 
            		Integer.valueOf( query.getPageSize() ).toString()  
            	)
            );
        }

        if ( query.getFilter() != null )
        {
            // add the filter to the request if specified
        	ObjectMapper mapper = new ObjectMapper();
            try
            {
	            partnerServiceProxy.getUriParameters().add
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
            partnerServiceProxy.getAdditionalRequestHeaders().add
            (
            	new KeyValuePair<String, String>
            	(
            		PartnerService.getInstance().getConfiguration().getApis().get( "GetAuditRecordsRequest" ).getAdditionalHeaders().get("ContinuationToken"),
            		query.getToken().toString()
            	)
            );
        }

        return partnerServiceProxy.get();
	}

}
