// -----------------------------------------------------------------------
// <copyright file="CustomerUserOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.users.CustomerUser;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerUserOperations 
	extends BasePartnerComponent<Tuple<String,String>> 
	implements ICustomerUser {

    /**
     * The customer user directory role collection operations.
     */
    private ICustomerUserRoleCollection customerUserDirectoryRoleCollectionOperations;
    
    /**
     * The customer user license collection operations.
     */
    private ICustomerUserLicenseCollection customerUserLicenseCollectionOperations;

    /**
     * The customer user license update operations.
     */
    private ICustomerUserLicenseUpdates customerUserLicenseUpdateOperations;

    /**
     * Initializes a new instance of the CustomerUserOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param userId The user identifier.
     */
    public CustomerUserOperations( IPartner rootPartnerOperations, String customerId, String userId )
    {
        super( rootPartnerOperations, new Tuple<String,String>(customerId, userId) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
        if ( StringHelper.isNullOrWhiteSpace( userId ) )
        {
            throw new IllegalArgumentException( "userId must be set" );
        }
    }

    /**
     * Retrieves information of a specific customer user.
     * 
     * @return The customer user object.
     */
	@Override
	public CustomerUser get() {
        IPartnerServiceProxy<CustomerUser, CustomerUser> partnerServiceProxy =
                new PartnerServiceProxy<CustomerUser, CustomerUser>( new TypeReference<CustomerUser>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUserDetails" ).getPath(),
                                                            this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );
        return partnerServiceProxy.get();
	}

    /**
     * Deletes the customer user.
     */
	@Override
	public void delete() {
		IPartnerServiceProxy<CustomerUser, CustomerUser> partnerServiceProxy =
	            new PartnerServiceProxy<CustomerUser, CustomerUser>( new TypeReference<CustomerUser>()
	            {
	            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "DeleteCustomerUser" ).getPath(),
	                                                        this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );
	    partnerServiceProxy.delete();
	}

    /**
     * Updates the customer user.
     * 
     * @param customerUser The customer to be updated.
     * @return The updated user. 
     */
	@Override
	public CustomerUser patch( CustomerUser customerUser ) {		
        if ( customerUser == null )
        {
            throw new IllegalArgumentException( "customerUser null" );
        }
        PartnerServiceProxy<CustomerUser, CustomerUser> partnerServiceProxy =
            new PartnerServiceProxy<CustomerUser, CustomerUser>( new TypeReference<CustomerUser>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdateCustomerUser" ).getPath(),
            												this.getContext().getItem1(), this.getContext().getItem2(), Locale.US ) );
        return partnerServiceProxy.patch( customerUser );
	}
	
	/**
	 * Retrieves the customer user's directory roles.
	 * 
	 * @return The customer user's directory roles.
	 */
	@Override
	public ICustomerUserRoleCollection getDirectoryRoles() {
        if ( customerUserDirectoryRoleCollectionOperations == null )
        {
        	customerUserDirectoryRoleCollectionOperations = new CustomerUserRoleCollectionOperations( this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2() );
        }
        return customerUserDirectoryRoleCollectionOperations;
	}

	/**
	 * Gets the current user's license collection operation.
	 * 
	 * @return The customer user's licenses collection operations.
	 */
	@Override
	public ICustomerUserLicenseCollection getLicenses() {
        if ( customerUserLicenseCollectionOperations == null )
        {
        	customerUserLicenseCollectionOperations = new CustomerUserLicenseCollectionOperations( this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2() );
        }
        return customerUserLicenseCollectionOperations;
	}

	/**
	 * Gets the current user's license updates operation.
	 * 
	 * @return The customer user's license updates collection operations.
	 */
	@Override
	public ICustomerUserLicenseUpdates getLicenseUpdates() {
        if ( customerUserLicenseUpdateOperations == null )
        {
        	customerUserLicenseUpdateOperations = new CustomerUserLicenseUpdateOperations( this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2() );
        }
        return customerUserLicenseUpdateOperations;
	}
}