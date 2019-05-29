// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customerusers;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.exception.PartnerErrorCategory;
import com.microsoft.store.partnercenter.exception.PartnerException;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.users.CustomerUser;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerUsersCollectionOperations 
		extends BasePartnerComponent<String>
		implements ICustomerUserCollection {

	/**
	 * The minimum allowed page size for the collection.
	 */
	private static final int MIN_PAGE_SIZE = 1;

	/**
	 * The maximum allowed page size for the collection.
	 */
	private static final int MAX_PAGE_SIZE = 500;

	/**
	 * Initializes a new instance of the CustomerUsersCollectionOperations class.
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 * @param customerId The customer identifier.
	 */
	public CustomerUsersCollectionOperations( IPartner rootPartnerOperations, String customerId )
	{
		super( rootPartnerOperations, customerId );
		if ( StringHelper.isNullOrWhiteSpace( customerId ) )
		{
			throw new IllegalArgumentException( "customerId must be set" );
		}
	}

	/**
	 * Creates a new user.
	 * 
	 * @param newCustomerUser The user to be created.
	 * @return The newly created user.
	 */
	@Override
	public CustomerUser create( CustomerUser newCustomerUser ) 
	{
		if ( newCustomerUser == null )
		{
			throw new IllegalArgumentException("The newCustomerUser parameter cannot be null.");
		}

		return this.getPartner().getServiceClient().post(
			this.getPartner(), 
			new TypeReference<CustomerUser>(){},
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("CreateCustomerUser").getPath(),
				this.getContext()),
			newCustomerUser);
	}

	/**
	 * Retrieves all the customer users.
	 * 
	 * @return All the customer users.
	 */
	@Override
	public SeekBasedResourceCollection<CustomerUser> get() 
	{
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SeekBasedResourceCollection<CustomerUser>>(){}, 
			MessageFormat.format( 
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerUsers").getPath(),
				this.getContext()));
	}

	/**
	 * Retrieves the customer user operations for the specified user.
	 * 
	 * @param userId The user identifier.
	 * @return The customer user operations for the specified user.
	 */
	@Override
	public ICustomerUser byId( String userId ) 
	{
		return new CustomerUserOperations( this.getPartner(), this.getContext() , userId );
	}

	/**
	 * Queries customer users associated to the partner's customers.
	 * 
	 * @param customerUsersQuery A query to apply onto customer users. Check {@link com.microsoft.store.partnercenter.models.query.QueryFactory} to see how to build queries.
	 * @return Customer user collection.
	 */
	@Override
	public SeekBasedResourceCollection<CustomerUser> query( IQuery customerUsersQuery ) {
		if ( customerUsersQuery == null )
		{
			throw new IllegalArgumentException( "customerUsersQuery can't be null" );
		}

		if ( customerUsersQuery.getType() == QueryType.COUNT )
		{
			throw new IllegalArgumentException( "customerUsersQuery can't be a count query." );
		}

		Collection<KeyValuePair<String, String>> parameters = new ArrayList<KeyValuePair<String, String>>();
		Map<String, String> headers = new HashMap<>();

		if ( customerUsersQuery.getType() == QueryType.SEEK )
		{
			// if this is a seek query, add the seek operation and the continuation token to the request
			if ( customerUsersQuery.getToken() == null )
			{
				throw new IllegalArgumentException( "customerUsersQuery.Token is required." );
			}

			headers.put(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomers").getAdditionalHeaders().get("ContinuationToken"),
				customerUsersQuery.getToken().toString());
			
			parameters.add( 
				new KeyValuePair<String, String>( 
					PartnerService.getInstance().getConfiguration().getApis().get("GetCustomers").getParameters().get("SeekOperation"),
					customerUsersQuery.getSeekOperation().toString()));
		}
		else
		{
			if ( customerUsersQuery.getType() == QueryType.INDEXED )
			{
				// if the query specifies a page size, validate it and add it to the request
				ParameterValidator.isIntInclusive( MIN_PAGE_SIZE, MAX_PAGE_SIZE, customerUsersQuery.getPageSize(),
												   MessageFormat.format( "Allowed page size values are from {0}-{1}",
																		 MIN_PAGE_SIZE, MAX_PAGE_SIZE));

				parameters.add( 
					new KeyValuePair<String, String>(
						PartnerService.getInstance().getConfiguration().getApis().get("GetCustomers").getParameters().get("Size"),
						String.valueOf(customerUsersQuery.getPageSize())));
			}
			else
			{
				parameters.add(
					new KeyValuePair<String, String>(
						PartnerService.getInstance().getConfiguration().getApis().get("GetCustomers").getParameters().get("Size"),
						"0"));
			}
			if ( customerUsersQuery.getFilter() != null )
			{
				// add the filter to the request if specified
				ObjectMapper mapper = new ObjectMapper();
				try
				{
					parameters.add(
						new KeyValuePair<String, String>(
							PartnerService.getInstance().getConfiguration().getApis().get("GetCustomers").getParameters().get("Filter"),
							URLEncoder.encode(mapper.writeValueAsString(customerUsersQuery.getFilter()),
							"UTF-8")));
				}
				catch ( UnsupportedEncodingException e )
				{
					throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
				}
				catch ( JsonProcessingException e )
				{
					throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
				}
			}
			if ( customerUsersQuery.getSort() != null )
			{
				// add the sort details to the request if specified
				ObjectMapper sortMapper = new ObjectMapper();

				try
				{
					parameters.add( 
						new KeyValuePair<String, String>(
							PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerUsers").getParameters().get("Sort"),
							URLEncoder.encode( sortMapper.writeValueAsString( customerUsersQuery.getSort().getSortField()),
							"UTF-8"))); 

					parameters.add(
						new KeyValuePair<String, String>(
							PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerUsers").getParameters().get ("Sort"),
							URLEncoder.encode(sortMapper.writeValueAsString( customerUsersQuery.getSort().getSortDirection()),
							"UTF-8")));
				}
				catch ( UnsupportedEncodingException e )
				{
					throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
				}
				catch ( JsonProcessingException e )
				{
					throw new PartnerException( "", null, PartnerErrorCategory.REQUEST_PARSING, e );
				}
			}
			
		}

		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<SeekBasedResourceCollection<CustomerUser>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerUsers").getPath(),
				this.getContext()),
			headers,
			parameters);
	}
}