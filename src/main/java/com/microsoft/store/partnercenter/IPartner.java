// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter;

import com.microsoft.store.partnercenter.agreements.IAgreementDetailsCollection;
import com.microsoft.store.partnercenter.analytics.IPartnerAnalyticsCollection;
import com.microsoft.store.partnercenter.auditrecords.IAuditRecordsCollection;
import com.microsoft.store.partnercenter.compliance.IComplianceCollection;
import com.microsoft.store.partnercenter.countryvalidationrules.ICountryValidationRulesCollection;
import com.microsoft.store.partnercenter.customers.ICustomerCollection;
import com.microsoft.store.partnercenter.domains.IDomainCollection;
import com.microsoft.store.partnercenter.enumerators.IResourceCollectionEnumeratorContainer;
import com.microsoft.store.partnercenter.extensions.IExtensions;
import com.microsoft.store.partnercenter.genericoperations.ICountrySelector;
import com.microsoft.store.partnercenter.invoices.IInvoiceCollection;
import com.microsoft.store.partnercenter.network.IPartnerServiceClient;
import com.microsoft.store.partnercenter.offers.IOfferCategoryCollection;
import com.microsoft.store.partnercenter.offers.IOfferCollection;
import com.microsoft.store.partnercenter.products.IProductCollection;
import com.microsoft.store.partnercenter.productupgrades.IProductUpgradeCollection;
import com.microsoft.store.partnercenter.profiles.IPartnerProfileCollection;
import com.microsoft.store.partnercenter.ratecards.IRateCardCollection;
import com.microsoft.store.partnercenter.relationships.IRelationshipCollection;
import com.microsoft.store.partnercenter.requestcontext.IRequestContext;
import com.microsoft.store.partnercenter.serviceincidents.IServiceIncidentCollection;
import com.microsoft.store.partnercenter.servicerequests.IPartnerServiceRequestCollection;
import com.microsoft.store.partnercenter.usage.IPartnerUsageSummary;
import com.microsoft.store.partnercenter.validations.IValidationOperations;

/**
 * The main entry point into using the partner SDK functionality. Represents a partner and encapsulates all the behavior
 * attached to partners. Use this interface to get to the partner's customers, profiles, and customer orders, profiles
 * and subscriptions and more.
 */
public interface IPartner
{
    /**
     * Gets the compliance operations available to the partner.
     * 
     * @return The compliance operations available to the partner.
     */
    IComplianceCollection getCompliance();

    /**
     * Gets the partner credentials.
     * 
     * @return The partner credentials.
     */
    IPartnerCredentials getCredentials();

    /**
     * Gets the request context.
     *
     * @return The request context.
     */
    IRequestContext getRequestContext();

    /**
     * Gets the collection enumerators available for traversing through results.
     * 
     * @return The collection enumerators available for traversing through results.
     */
    IResourceCollectionEnumeratorContainer getEnumerators();

    /**
     * Gets the offer categories operations available to the partner.
     * 
     * @return The offer categories operations available to the partner.
     */
    ICountrySelector<IOfferCategoryCollection> getOfferCategories();

    /**
     * Gets the offer operations available to the partner.
     * 
     * @return The offer operations available to the partner.
     */
    ICountrySelector<IOfferCollection> getOffers();

    /**
     * Gets the product upgrades operations available to the partner.
     * 
     * @return The product upgrades operations available to the partner.
     */
    IProductUpgradeCollection getProductUpgrades();

    /**
     * Gets the profiles operations available to the partner.
     * 
     * @return The profiles operations available to the partner. 
     */
    IPartnerProfileCollection getProfiles();

    /**
     * Gets the partner customers operations.
     * 
     * @return The partner customers operations.
     */
    ICustomerCollection getCustomers();

    /**
     * Gets the partner invoice operations.
     * 
     * @return The partner invoice operations.
     */
    IInvoiceCollection getInvoices();

    /**
     * Gets the operations that can be performed on a partners' service requests.
     * 
     * @return The operations that can be performed on a partners' service requests.
     */
    IPartnerServiceRequestCollection getServiceRequests();
    
    /**
     * Gets the service health operations that can be performed on a partner's subscribed services.
     * 
     * @return The service health operations that can be performed on a partner's subscribed services.
     */
    IServiceIncidentCollection getServiceIncidents();

    /**
     *  Gets the country validation rules collection operations available to the partner.
     * 
     * @return The country validation rules collection operations available to the partner.
     */
    ICountryValidationRulesCollection getCountryValidationRules();
    
    /**
     * Gets the usage summary operations available to the partner.
     * 
     * @return The usage summary operations available to the partner.
     */
    IPartnerUsageSummary getUsageSummary();

    /**
     * Gets the domains operations available to the partner.
     * 
     * @return The domains operations available to the partner.
     */
    IDomainCollection getDomains();

    /**
     * Gets the audit records operations available to the partner.
     * 
     * @return The audit records operations available to the partner.
     */
    IAuditRecordsCollection getAuditRecords();

    /**
     * Gets the rate card operations available to the partner.
     * 
     * @return The rate card operations available to the partner.
     */
    IRateCardCollection getRateCards();

    /**
     * Gets the analytics collection operations.
     * 
     * @return The analytics collection operations.
     */
    IPartnerAnalyticsCollection getAnalytics();

    /**
     * Gets the extensions operations available to the partner.
     * 
     * @return The extensions operations available to the partner.
     */
    IExtensions getExtensions();

    /**
     * Gets the product operations available to the partner.
     * 
     * @return The product operations available to the partner.
     */
    IProductCollection getProducts();

    /**
     * Gets the relationship collection operations available to the partner.
     * 
     * @return The relationship collection operations available to the partner.
     */    
    IRelationshipCollection getRelationships();

    /**
     * Gets the validation operations available to the partner.
     * 
     * @return The validation operations available to the partner.
     */    
    IValidationOperations getValidations();

    /**
     * Gets the agreement metadata operations.
     * 
     * @return The agreement metadata operations.
     */
    IAgreementDetailsCollection getAgreementDetails();

    /**
     * Gets the partner service client.
     * 
     * @return The partner service client.
     */
    IPartnerServiceClient getServiceClient();
}