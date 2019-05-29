// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.servicerequests;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
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
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * The partner's service requests operations and implementation.
 */
public class PartnerServiceRequestCollectionOperations
	extends BasePartnerComponentString
	implements IPartnerServiceRequestCollection
{
	/**
	 * The minimum allowed page size for the collection.
	 */
	private static final int MIN_PAGE_SIZE = 1;

	/**
	 * The maximum allowed page size for the collection.
	 */
	private static final int MAX_PAGE_SIZE = 1000;

	/**
	 * Initializes a new instance of the PartnerServiceRequestCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public PartnerServiceRequestCollectionOperations( IPartner rootPartnerOperations )
	{
		super( rootPartnerOperations );
	}

	/**
	 * Retrieves a collection of operations that can be performed on support topics.
	 * 
	 * @return a collection of operations that can be performed on support topics.
	 */
	@Override
	public ISupportTopicsCollection getSupportTopics()
	{
		return new SupportTopicsCollectionOperations( this.getPartner() );
	}

	/**
	 * Retrieves a Service Request specified by Id.
	 * 
	 * @param serviceRequestId Incident Id.
	 * @return Service Request Operations.
	 */
	@Override
	public IServiceRequest byId( String serviceRequestId )
	{
		return new PartnerServiceRequestOperations( this.getPartner(), serviceRequestId );
	}

	/**
	 * Queries for service requests associated with the partner.
	 * 
	 * @param serviceRequestsQuery The query with search parameters.
	 * @return A collection of service requests matching the criteria.
	 */
	@Override
	public ResourceCollection<ServiceRequest> query( IQuery serviceRequestsQuery )
	{
		if ( serviceRequestsQuery == null )
		{
			throw new IllegalArgumentException( "serviceRequestsQuery can't be null" );
		}

		if ( serviceRequestsQuery.getType() != QueryType.INDEXED && serviceRequestsQuery.getType() != QueryType.SIMPLE )
		{
			throw new IllegalArgumentException( "Specified query type is not supported." );
		}

		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();

		if ( serviceRequestsQuery.getType() == QueryType.INDEXED )
		{
			// if the query specifies a page size, validate it and add it to the request
			ParameterValidator.isIntInclusive( MIN_PAGE_SIZE, MAX_PAGE_SIZE, serviceRequestsQuery.getPageSize(),
											   MessageFormat.format( "Allowed page size values are from {0}-{1}",
																	 MIN_PAGE_SIZE, MAX_PAGE_SIZE ) );
			parameters.add(
				new KeyValuePair<String, String>(
					PartnerService.getInstance().getConfiguration().getApis().get("SearchPartnerServiceRequests").getParameters().get("Size"),
					String.valueOf(serviceRequestsQuery.getPageSize())));

			parameters.add(
				new KeyValuePair<String, String>(
					PartnerService.getInstance().getConfiguration().getApis().get("SearchPartnerServiceRequests").getParameters().get("Offset"),
					String.valueOf(serviceRequestsQuery.getIndex())));
		}
		if ( serviceRequestsQuery.getFilter() != null )
		{
			// add the filter to the request if specified
			ObjectMapper mapper = new ObjectMapper();

			try
			{
				parameters.add(
					new KeyValuePair<String, String>(
						PartnerService.getInstance().getConfiguration().getApis().get("SearchPartnerServiceRequests").getParameters().get("Filter"),
						URLEncoder.encode(mapper.writeValueAsString(serviceRequestsQuery.getFilter()),
						"UTF-8")));
			}
			catch ( JsonProcessingException e )
			{
				throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
			}
			catch ( UnsupportedEncodingException e )
			{
				throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
			}

		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ServiceRequest>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("SearchPartnerServiceRequests").getPath(),
			parameters); 
	}

	/**
	 * Retrieves Service Requests associated to the partner.
	 * 
	 * @return A collection of service requests.
	 */
	@Override
	public ResourceCollection<ServiceRequest> get()
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ServiceRequest>>(){}, 
			PartnerService.getInstance().getConfiguration().getApis().get("GetAllServiceRequestsPartner").getPath());
	}

	/**
	 * Creates a service request.
	 * 
	 * @param serviceRequest Service request to be created.
	 * @param agentLocale The agent locale.
	 * @return The created service request with associated Identifier.
	 */
	@Override
	public ServiceRequest create( ServiceRequest serviceRequest, String agentLocale )
	{
		if ( serviceRequest == null )
		{
			throw new IllegalArgumentException( "serviceRequest can't be null" );
		}
		if ( agentLocale == null )
		{
			throw new IllegalArgumentException( "agentLocale can't be null" );
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<ServiceRequest>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("CreateServiceRequest").getPath(),
				agentLocale),
			serviceRequest);
	}
}