// -----------------------------------------------------------------------
// <copyright file="UserMemberCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerdirectoryroles;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.SeekBasedResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.query.QueryType;
import com.microsoft.store.partnercenter.models.roles.DirectoryRole;
import com.microsoft.store.partnercenter.models.roles.UserMember;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * UserMemberCollectionOperations
 *
 * Used for managing membership and access to directory roles.
 */
public class UserMemberCollectionOperations 
	extends BasePartnerComponent<Tuple<String, String>> 
	implements IUserMemberCollection
{

	/***
	 * Initializes a new instance of the UserMemberCollectionOperations class
	 * 
	 * @param rootPartnerOperations: The partner operations instance.
	 * @param customerId: Customer Id.
	 * @param roleId: The directory role Id.
	 */
	public UserMemberCollectionOperations( IPartner rootPartnerOperations, String customerId, String roleId )
	{
		super( rootPartnerOperations, new Tuple<String,String>( customerId, roleId ) );
		if ( StringHelper.isNullOrEmpty( customerId ) )
        {
            throw new IllegalArgumentException("customerId must be set.");
        }

        if ( StringHelper.isNullOrEmpty( roleId ) )
        {
            throw new IllegalArgumentException("roleId must be set.");
        }
	}

	/***
	 * Get a single user member operations object.
	 * 
	 * @param userId: The user id.
	 * @return: The user member operations instance.
	 */
	@Override
	public IUserMember byId(String userId)
	{
		return new UserMemberOperations( this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), userId );
	}

	/***
	 * Adds customer user to a directory role.
	 * 
	 * @param newEntity: UserMember to add.
	 * @return: The customer directory role user member.
	 */
	@Override
	public UserMember create( UserMember newEntity )
	{
		if ( newEntity == null )
        {
            throw new IllegalArgumentException("entity can't be null.");
        }

        IPartnerServiceProxy<UserMember, UserMember> partnerServiceProxy =
                new PartnerServiceProxy<UserMember, UserMember>( new TypeReference<UserMember>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "AddUserToCustomerDirectoryRole" ).getPath(),
        				this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );
        
        return partnerServiceProxy.post( newEntity );
	}

	/***
	 * Gets all the user members of a customer directory role.
	 * 
	 * @return: The directory role user memberships.
	 */
	@Override
	public SeekBasedResourceCollection<UserMember> get()
	{
        IPartnerServiceProxy<DirectoryRole, SeekBasedResourceCollection<UserMember>> partnerServiceProxy =
                new PartnerServiceProxy<DirectoryRole, SeekBasedResourceCollection<UserMember>>( new TypeReference<SeekBasedResourceCollection<UserMember>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerDirectoryRoleUserMembers" ).getPath(),
        				this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );
        
        return partnerServiceProxy.get();
	}

	/***
	 * Retrieves the user members of a customer directory role.
	 * 
	 * @param query: A query to apply onto user member collection.
	 * @return: The  directory role user memberships.
	 */
	@Override
	public SeekBasedResourceCollection<UserMember> query(IQuery query)
	{
        if ( query == null )
        {
            throw new IllegalArgumentException( "query can't be null" );
        }

        if ( query.getType() == QueryType.COUNT )
        {
            throw new IllegalArgumentException( "query can't be a count query." );
        }


        IPartnerServiceProxy<DirectoryRole, SeekBasedResourceCollection<UserMember>> partnerServiceProxy =
                new PartnerServiceProxy<DirectoryRole, SeekBasedResourceCollection<UserMember>>( new TypeReference<SeekBasedResourceCollection<UserMember>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerDirectoryRoleUserMembers" ).getPath(),
        				this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );

        if ( query.getType() == QueryType.SEEK )
        {
            // if this is a seek query, add the seek operation and the continuation token to the request.
            if ( query.getToken() == null )
            {
                throw new IllegalArgumentException( "query.Token is required." );
            }

            partnerServiceProxy.getAdditionalRequestHeaders().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsers" ).getAdditionalHeaders().get( "ContinuationToken" ),
                    query.getToken().toString() ) );
            
            partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsers" ).getParameters().get( "SeekOperation" ),
            		query.getSeekOperation().toString() ) );            
        }
        else
        {
            if ( query.getType() == QueryType.INDEXED )
            {
                // if the query specifies a page size, validate it and add it to the request
                partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsers" ).getParameters().get( "Size" ),
                                                                                              String.valueOf( query.getPageSize() ) ) );
            }
            else
            {
                partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsers" ).getParameters().get( "Size" ),
                        "0" ) );
            }
        }

        return partnerServiceProxy.get();
	}

}
