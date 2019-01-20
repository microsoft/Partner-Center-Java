// -----------------------------------------------------------------------
// <copyright file="CustomerApplicationConsentCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.applicationconsents;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.applicationconsents.ApplicationConsent;
import com.microsoft.store.partnercenter.utils.StringHelper;

import java.text.MessageFormat;

/**
 * Implements the operations on an Application consent collection.
 */
public class CustomerApplicationConsentCollectionOperations
        extends BasePartnerComponent<String>
        implements ICustomerApplicationConsentCollection
{
    /**
     * Initializes a new instance of the CustomerApplicationConsentCollectionOperations class.
     *
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            The customer identifier.
     */
    public CustomerApplicationConsentCollectionOperations(IPartner rootPartnerOperations, String customerId)
    {
        super(rootPartnerOperations, customerId);
        if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException("customerId must be set");
        }
    }

    /**
     * Get a single application consent operations object.
     *
     * @param applicationId The application identifier.
     *
     * @return The application consents operations instance.
     */
    @Override
    public IApplicationConsent byId(String applicationId)
    {
        return new ApplicationConsentOperations(
                this.getPartner(), this.getContext(), applicationId);
    }

    /**
     * Adds application consents.
     *
     * @param newApplicationConsent ApplicationConsent to add.
     * @return ApplicationConsent entity.
     */
    @Override
    public ApplicationConsent create(ApplicationConsent newApplicationConsent)
    {
        if (newApplicationConsent == null)
        {
            throw new IllegalArgumentException("Application consent can't be null.");
        }

        return this.getPartner().getServiceClient().post(
                this.getPartner(),
                new TypeReference<ApplicationConsent>() {},
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis()
                        .get("CreateCustomerApplicationConsent").getPath(), this.getContext()),
                newApplicationConsent);
    }
}
