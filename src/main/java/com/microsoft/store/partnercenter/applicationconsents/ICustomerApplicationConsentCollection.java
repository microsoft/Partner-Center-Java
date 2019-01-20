// -----------------------------------------------------------------------
// <copyright file="ICustomerApplicationConsentCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.applicationconsents;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.applicationconsents.ApplicationConsent;

/**
 * Encapsulates the operations on the ApplicationConsent collection.
 */
public interface ICustomerApplicationConsentCollection
        extends IPartnerComponentString,
        IEntitySelector<IApplicationConsent>,
        IEntityCreateOperations<ApplicationConsent, ApplicationConsent>
{
    /**
     * Gets a single application consent behavior.
     *
     * @param applicationId The application identifier.
     *
     * @return The application consent operations.
     */
    IApplicationConsent byId(String applicationId);

    /**
     * Adds application consents.
     *
     * @param newEntity ApplicationConsent to add.
     *
     * @return ApplicationConsent entity.
     */
    ApplicationConsent create(ApplicationConsent newEntity);
}
