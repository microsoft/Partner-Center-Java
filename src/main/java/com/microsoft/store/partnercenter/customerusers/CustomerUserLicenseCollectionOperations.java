// -----------------------------------------------------------------------
// <copyright file="CustomerUserLicenseCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customerusers;

import java.text.MessageFormat;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.licenses.License;
import com.microsoft.store.partnercenter.models.licenses.LicenseGroupId;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class CustomerUserLicenseCollectionOperations 
	extends BasePartnerComponent<Tuple<String,String>> 
	implements ICustomerUserLicenseCollection 
{

    /**
     * Initializes a new instance of the CustomerUserLicenseCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param userId The user identifier.
     */
    public CustomerUserLicenseCollectionOperations( IPartner rootPartnerOperations, String customerId, String userId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, userId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId can't be null" );
        }
        if ( StringHelper.isNullOrWhiteSpace( userId ) )
        {
            throw new IllegalArgumentException( "userId can't be null" );
        }
    }

    /**
     * Retrieves the assigned licenses to a customer user.
     * 
     * @return The customer user's directory roles.
     */
    public ResourceCollection<License> get()
    {
        IPartnerServiceProxy<License, ResourceCollection<License>> partnerServiceProxy =
                new PartnerServiceProxy<>( new TypeReference<ResourceCollection<License>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUserAssignedLicenses" ).getPath(),
        				this.getContext().getItem1(), this.getContext().getItem2() ) );

        return partnerServiceProxy.get();
    }
    
    /**
     * Retrieves the assigned licenses to a customer user.
     * 
     * @param licenseGroupIds License group identifier
     * @return The customer user's directory roles.
     */
    public ResourceCollection<License> get(List<LicenseGroupId> licenseGroupIds)
    {
        IPartnerServiceProxy<License, ResourceCollection<License>> partnerServiceProxy =
                new PartnerServiceProxy<>( new TypeReference<ResourceCollection<License>>()
                {
                }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUserAssignedLicenses" ).getPath(),
        				this.getContext().getItem1(), this.getContext().getItem2() ) );

        for (LicenseGroupId groupId : licenseGroupIds) {
            partnerServiceProxy.getUriParameters().add( 
                new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUserAssignedLicenses" ).getParameters().get( "licenseGroupIds" ),
                groupId.toString() ) );
        }

        return partnerServiceProxy.get();
    }
}