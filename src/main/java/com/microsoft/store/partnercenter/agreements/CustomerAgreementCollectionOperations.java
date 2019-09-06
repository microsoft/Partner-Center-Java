// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.agreements;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.agreements.Agreement;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements the operations on an Agreement collection.
 */
public class CustomerAgreementCollectionOperations
        extends BasePartnerComponentString
        implements ICustomerAgreementCollection
{
    /**
     * Initializes a new instance of the CustomerAgreementCollectionOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerAgreementCollectionOperations(IPartner rootPartnerOperations, String customerId)
    {
        super(rootPartnerOperations, customerId);

        if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException("customerId must be set");
        }
    }

    /**
     * Creates an agreement between the partner and customer.
     *
     * @param newEntity The agreement to be created.
     * @return The newly created agreement.
     */
    @Override
    public Agreement create(Agreement newEntity)
    {
        if (newEntity == null)
        {
            throw new IllegalArgumentException("Agreement can't be null.");
        }

        return this.getPartner().getServiceClient().post(
            this.getPartner(), 
            new TypeReference<Agreement>(){},
            MessageFormat.format(
                PartnerService.getInstance().getConfiguration().getApis().get("CreateCustomerAgreement").getPath(),
                this.getContext()),
            newEntity);
    }

    /**
     * Gets the list of agreements between a partner and customer.
     *
     * @return The list of the customer's agreements.
     */
    @Override
    public ResourceCollection<Agreement> get()
    {
        return this.getPartner().getServiceClient().get(
            this.getPartner(), 
            new TypeReference<ResourceCollection<Agreement>>(){},
            MessageFormat.format(
                PartnerService.getInstance().getConfiguration().getApis().get("GetCustomerAgreements").getPath(),
                this.getContext()));
    }

    /**
     * Retrieves the operations tied with a specified agreement type.
     *
     * @param agreementType The agreement type filter.
     * @return The available operations for agreement details.
     */
    @Override
    public ICustomerAgreementCollectionByAgreementType byAgreementType(final String agreementType)
    {
        return new CustomerAgreementCollectionByAgreementTypeOperations(this.getPartner(), this.getContext(), agreementType);
    }
}