// -----------------------------------------------------------------------
// <copyright file="ICustomer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.agreements.IAgreementCollection;
import com.microsoft.store.partnercenter.analytics.ICustomerAnalyticsCollection;
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
    IAgreementCollection getAgreements();

    /**
     * Gets the orders behavior for the customer.
     *
     * @return The customer orders.
     */
    IOrderCollection getOrders();

    /**
     * Obtains the profiles behavior for the customer.
     * 
     * @return The customer profiles.
     */
    ICustomerProfileCollection getProfiles();

    /**
     * Obtains the subscriptions behavior for the customer.
     * 
     * @return The customer subscriptions.
     */
    ISubscriptionCollection getSubscriptions();

    /**
     * Obtains the service requests behavior for the customer.
     */
    IServiceRequestCollection getServiceRequests();

    /**
     * Obtains the managed services behavior for the customer.
     */
    IManagedServiceCollection getManagedServices();

    /***
     * Obtains the Offer Categories behavior for the customer.
     */
    ICustomerOfferCategoryCollection getOfferCategories();

    /***
     * Obtains the Offers behavior for the customer.
     */
    ICustomerOfferCollection getOffers();
    
    /**
     * Obtains the customer usage summary behavior for the customer.
     */
    ICustomerUsageSummary getUsageSummary();

    /**
     * Obtains the usage spending budget behavior for the customer.
     */
    ICustomerUsageSpendingBudget getUsageBudget();
    
    /***
     * Obtains the qualification behavior of the customer.
     */
    ICustomerQualification getQualification();


    /***
     * Obtains the users behavior for the customer.
     */
    ICustomerUserCollection getUsers();

    /***
     * Obtains the directory role behavior for the customer.
     */
    IDirectoryRoleCollection getDirectoryRoles();

    /***
     * Obtains the directory role behavior for the customer.
     */
    ICustomerSubscribedSkuCollection getSubscribedSkus();

    /***
     * Obtains the Cart collection behavior for the customer.
     */
    ICartCollection getCarts();
    
    /***
     * Obtains the Products behavior for the customer.
     */
    ICustomerProductCollection getProducts();

    /***
     * Obtains the service costs behavior for the customer.
     */
    ICustomerServiceCostsCollection getServiceCosts();

    /***
     * Obtains the devices batch behavior of the customer.
     */
    IDevicesBatchCollection getDeviceBatches();

    /***
     * Obtains the device policy behavior of the customer.
     */
    ICustomerDeviceCollection getDevicePolicy();

    /***
     * Obtains the devices batch upload status behavior of the customer.
     */
    IBatchJobStatusCollection getBatchUploadStatus();

    /***
     * Obtains the relationship collection behavior for the customer.
     */
    ICustomerRelationshipCollection getRelationships();

    /***
     * Obtains the analytics collection behavior for the customer.
     */
    ICustomerAnalyticsCollection getAnalytics();

    /***
     * Obtains the entitlement collection behavior for the customer.
     */
    IEntitlementCollection getEntitlements();

    /***
     * Obtains the configuration policies behavior for the customer.
     */
    IConfigurationPolicyCollection getConfigurationPolicies();

    /***
     * Retrieves the customer information.
     * 
     * @return: The customer information.
     */
    Customer get();
    
    /***
     * Deletes the customer from a testing in production account. This won't work for real accounts.
     */
    void delete();
}