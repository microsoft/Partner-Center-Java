// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.customers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.agreements.ICustomerAgreementCollection;
import com.microsoft.store.partnercenter.analytics.ICustomerAnalyticsCollection;
import com.microsoft.store.partnercenter.applicationconsents.ICustomerApplicationConsentCollection;
import com.microsoft.store.partnercenter.carts.ICartCollection;
import com.microsoft.store.partnercenter.customerdirectoryroles.IDirectoryRoleCollection;
import com.microsoft.store.partnercenter.customers.products.ICustomerProductCollection;
import com.microsoft.store.partnercenter.customers.profiles.ICustomerProfileCollection;
import com.microsoft.store.partnercenter.customers.servicecosts.ICustomerServiceCostsCollection;
import com.microsoft.store.partnercenter.customerusers.ICustomerUserCollection;
import com.microsoft.store.partnercenter.devicesdeployment.IBatchJobStatusCollection;
import com.microsoft.store.partnercenter.devicesdeployment.IConfigurationPolicyCollection;
import com.microsoft.store.partnercenter.devicesdeployment.ICustomerDeviceCollection;
import com.microsoft.store.partnercenter.devicesdeployment.IDevicesBatchCollection;
import com.microsoft.store.partnercenter.entitlements.IEntitlementCollection;
import com.microsoft.store.partnercenter.genericoperations.IEntityDeleteOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.managedservices.IManagedServiceCollection;
import com.microsoft.store.partnercenter.models.customers.Customer;
import com.microsoft.store.partnercenter.offers.ICustomerOfferCategoryCollection;
import com.microsoft.store.partnercenter.offers.ICustomerOfferCollection;
import com.microsoft.store.partnercenter.orders.IOrderCollection;
import com.microsoft.store.partnercenter.qualification.ICustomerQualification;
import com.microsoft.store.partnercenter.relationships.ICustomerRelationshipCollection;
import com.microsoft.store.partnercenter.servicerequests.IServiceRequestCollection;
import com.microsoft.store.partnercenter.subscribedskus.ICustomerSubscribedSkuCollection;
import com.microsoft.store.partnercenter.subscriptions.ISubscriptionCollection;
import com.microsoft.store.partnercenter.usage.ICustomerUsageSpendingBudget;
import com.microsoft.store.partnercenter.usage.ICustomerUsageSummary;

/**
 * Groups operations that can be performed on a single partner customer.
 */
public interface ICustomer
    extends IPartnerComponentString, IEntityGetOperations<Customer>, IEntityDeleteOperations<Customer>
{
    /**
     * Gets the agreements behavior for the customer.
     *
     * @return The customer agreements.
     */
    ICustomerAgreementCollection getAgreements();

    /**
     * Gets the application consent behavior for the customer.
     *
     * @return The customer application consents.
     */
    ICustomerApplicationConsentCollection getApplicationConsents();

    /**
     * Gets the orders behavior for the customer.
     *
     * @return The order behavior for the customer.
     */
    IOrderCollection getOrders();

    /**
     * Gets the profiles behavior for the customer.
     * 
     * @return The profiles behavior for the customer
     */
    ICustomerProfileCollection getProfiles();

    /**
     * Gets the subscriptions behavior for the customer.
     * 
     * @return The subscriptions behavior for the customer.
     */
    ISubscriptionCollection getSubscriptions();

    /**
     * Gets the service requests behavior for the customer.
     * 
     * @return The service requests behavior for the customer.
     */
    IServiceRequestCollection getServiceRequests();

    /**
     * Gets the managed services behavior for the customer.
     * 
     * @return The managed services behavior for the customer.
     */
    IManagedServiceCollection getManagedServices();

    /**
     * Gets the offer categories behavior for the customer.
     * 
     * @return The offer categories behavior for the customer.
     */
    ICustomerOfferCategoryCollection getOfferCategories();

    /**
     * Gets the offers behavior for the customer.
     * 
     * @return The offers behavior for the customer.
     */
    ICustomerOfferCollection getOffers();
    
    /**
     * Gets the customer usage summary behavior for the customer.
     * 
     * @return The customer usage summary behavior for the customer.
     */
    ICustomerUsageSummary getUsageSummary();

    /**
     * Gets the usage spending budget behavior for the customer.
     * 
     * @return The usage spending budget behavior for the customer.
     */
    ICustomerUsageSpendingBudget getUsageBudget();
    
    /**
     * Gets the qualification behavior of the customer.
     * 
     * @return The qualification behavior of the customer.
     */
    ICustomerQualification getQualification();

    /**
     * Gets the users behavior for the customer.
     * 
     * @return The users behavior for the customer.
     */
    ICustomerUserCollection getUsers();

    /**
     * Gets the directory role behavior for the customer.
     * 
     * @return The directory role behavior for the customer.
     */
    IDirectoryRoleCollection getDirectoryRoles();

    /**
     * Gets the directory role behavior for the customer.
     * 
     * @return The directory role behavior for the customer.
     */
    ICustomerSubscribedSkuCollection getSubscribedSkus();

    /**
     * Gets the Cart collection behavior for the customer.
     * 
     * @return The Cart collection behavior for the customer.
     */
    ICartCollection getCarts();
    
    /**
     * Gets the products behavior for the customer.
     * 
     * @return The products behavior for the customer.
     */
    ICustomerProductCollection getProducts();

    /**
     * Gets the service costs behavior for the customer.
     * 
     * @return The service costs behavior for the customer.
     */
    ICustomerServiceCostsCollection getServiceCosts();

    /**
     * Gets the devices batch behavior of the customer.
     * 
     * @return The devices batch behavior of the customer.
     */
    IDevicesBatchCollection getDeviceBatches();

    /**
     * Gets the device policy behavior of the customer.
     * 
     * @return The device policy behavior of the customer.
     */
    ICustomerDeviceCollection getDevicePolicy();

    /**
     * Gets the devices batch upload status behavior of the customer.
     * 
     * @return The devices batch upload status behavior of the customer.
     */
    IBatchJobStatusCollection getBatchUploadStatus();

    /**
     * Gets the relationship collection behavior for the customer.
     * 
     * @return The relationship collection behavior for the customer.
     */
    ICustomerRelationshipCollection getRelationships();

    /**
     * Gets the analytics collection behavior for the customer.
     * 
     * @return The analytics collection behavior for the customer.
     */
    ICustomerAnalyticsCollection getAnalytics();

    /**
     * Gets the entitlement collection behavior for the customer.
     * 
     * @return The entitlement collection behavior for the customer.
     */
    IEntitlementCollection getEntitlements();

    /**
     * Gets the configuration policies behavior for the customer.
     * 
     * @return The configuration policies behavior for the customer.
     */
    IConfigurationPolicyCollection getConfigurationPolicies();

    /**
     * Retrieves the customer information.
     * 
     * @return The customer information.
     */
    Customer get();
    
    /**
     * Deletes the customer from a testing in production account. This won't work for real accounts.
     */
    void delete();
}