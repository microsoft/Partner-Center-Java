// -----------------------------------------------------------------------
// <copyright file="CustomerRelationshipRequestOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.relationshiprequests;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.relationshiprequests.CustomerRelationshipRequest;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;

/**
 * Customer relationship request implementation class.
 */
public class CustomerRelationshipRequestOperations
    extends BasePartnerComponentString
    implements ICustomerRelationshipRequest
{
    /**
     * Initializes a new instance of the {@link #CustomerRelationshipRequestOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public CustomerRelationshipRequestOperations( IPartner rootPartnerOperations )
    {
        super( rootPartnerOperations );
    }

    /**
     * Retrieves the customer relationship request which can be used by a customer to establish a relationship with the
     * current partner.
     * 
     * @return A customer relationship request.
     */
    @Override
    public CustomerRelationshipRequest get()
    {
        IPartnerServiceProxy<CustomerRelationshipRequest, CustomerRelationshipRequest> partnerServiceProxy =
            new PartnerServiceProxy<CustomerRelationshipRequest, CustomerRelationshipRequest>( new TypeReference<CustomerRelationshipRequest>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerRelationshipRequest" ).getPath(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }
}