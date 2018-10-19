// -----------------------------------------------------------------------
// <copyright file="CustomerRelationshipCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.relationships;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.relationships.PartnerRelationship;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * For two-tier partner scenarios, holds the operations for retrieving partner relationships
 * of a customer with respect to the logged in partner.
 */
public class CustomerRelationshipCollectionOperations
    extends BasePartnerComponentString
    implements ICustomerRelationshipCollection
{
    /**
     * Initializes a new instance of the CustomerRelationshipCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     */
    public CustomerRelationshipCollectionOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }
    }

    /**
     * Retrieves all the partner relationships associated to the customer based on the logged in partner.
     * 
     * @return The partner relationships.
     */
    public ResourceCollection<PartnerRelationship> get()
    {
        IPartnerServiceProxy<PartnerRelationship, ResourceCollection<PartnerRelationship>> partnerServiceProxy = new PartnerServiceProxy<>(
            new TypeReference<ResourceCollection<PartnerRelationship>>() {
            }, 
            this.getPartner(),
            MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetPartnerRelationshipsForCustomer").getPath(),
                    this.getContext() ));

        return partnerServiceProxy.get();
    }
}