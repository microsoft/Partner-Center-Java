// -----------------------------------------------------------------------
// <copyright file="CustomerServiceRequestCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.servicerequests;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * The customer's service requests operations implementation.
 */
public class CustomerServiceRequestCollectionOperations
    extends BasePartnerComponentString
    implements IServiceRequestCollection
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
     * Initializes a new instance of the CustomerServiceRequestCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerServiceRequestCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId can't be null" );
        }

    }

    /**
     * Retrieves a Service Request specified by Id
     * 
     * @param serviceRequestId Service Request Id
     * @return Service Request Operations
     */
    @Override
    public IServiceRequest byId( String serviceRequestId )
    {
        return new CustomerServiceRequestOperations( this.getPartner(), this.getContext(), serviceRequestId );
    }

    /**
     * Queries for service requests associated with a customer
     * 
     * @param serviceRequestsQuery The query with search parameters
     * @return A collection of service requests matching the criteria
     */
    @Override
    public SeekBasedResourceCollection<ServiceRequest> query( IQuery serviceRequestsQuery )
    {
        if ( serviceRequestsQuery == null )
        {
            throw new IllegalArgumentException( "serviceRequestsQuery can't be null" );
        }

        if ( serviceRequestsQuery.getType() != QueryType.INDEXED && serviceRequestsQuery.getType() != QueryType.SIMPLE )
        {
            throw new IllegalArgumentException( "Specified query type is not supported." );
        }

        PartnerServiceProxy<ServiceRequest, SeekBasedResourceCollection<ServiceRequest>> partnerServiceProxy =
            new PartnerServiceProxy<ServiceRequest, SeekBasedResourceCollection<ServiceRequest>>( new TypeReference<SeekBasedResourceCollection<ServiceRequest>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "SearchCustomerServiceRequests" ).getPath(),
                                                        this.getContext(), Locale.US ) );

        if ( serviceRequestsQuery.getType() == QueryType.INDEXED )
        {
            // if the query specifies a page size, validate it and add it to the request
            ParameterValidator.isIntInclusive( MIN_PAGE_SIZE, MAX_PAGE_SIZE, serviceRequestsQuery.getPageSize(),
                                               MessageFormat.format( "Allowed page size values are from {0}-{1}",
                                                                     MIN_PAGE_SIZE, MAX_PAGE_SIZE, Locale.US ) );
            partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "SearchCustomerServiceRequests" ).getParameters().get( "Size" ),
                                                                                          String.valueOf( serviceRequestsQuery.getPageSize() ) ) );
            partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "SearchCustomerServiceRequests" ).getParameters().get( "Offset" ),
                                                                                          String.valueOf( serviceRequestsQuery.getIndex() ) ) );
        }
        if ( serviceRequestsQuery.getFilter() != null )
        {
            // add the filter to the request if specified
            ObjectMapper mapper = new ObjectMapper();
            try
            {
                partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "SearchCustomerServiceRequests" ).getParameters().get( "Filter" ),
                                                                                              URLEncoder.encode( mapper.writeValueAsString( serviceRequestsQuery.getFilter() ),
                                                                                                                 "UTF-8" ) ) );
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
        return partnerServiceProxy.get();
    }

    /**
     * Retrieves Service Requests associated to the customer.
     * 
     * @return A collection of service requests
     */
    @Override
    public ResourceCollection<ServiceRequest> get()
    {
        IPartnerServiceProxy<ServiceRequest, ResourceCollection<ServiceRequest>> partnerServiceProxy =
            new PartnerServiceProxy<ServiceRequest, ResourceCollection<ServiceRequest>>( new TypeReference<ResourceCollection<ServiceRequest>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetAllServiceRequestsCustomer" ).getPath(),
                                                        this.getContext(), Locale.US ) );

        return partnerServiceProxy.get();
    }

}
