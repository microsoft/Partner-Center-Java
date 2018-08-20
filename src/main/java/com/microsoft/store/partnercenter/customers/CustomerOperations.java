// -----------------------------------------------------------------------
// <copyright file="CustomerOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.analytics.CustomerAnalyticsCollectionOperations;
import com.microsoft.store.partnercenter.analytics.ICustomerAnalyticsCollection;
import com.microsoft.store.partnercenter.carts.CartCollectionOperations;
import com.microsoft.store.partnercenter.carts.ICartCollection;
import com.microsoft.store.partnercenter.customerdirectoryroles.DirectoryRoleCollectionOperations;
import com.microsoft.store.partnercenter.customerdirectoryroles.IDirectoryRoleCollection;
import com.microsoft.store.partnercenter.customers.products.CustomerProductCollectionOperations;
import com.microsoft.store.partnercenter.customers.products.ICustomerProductCollection;
import com.microsoft.store.partnercenter.customers.profiles.CustomerProfileCollectionOperations;
import com.microsoft.store.partnercenter.customers.profiles.ICustomerProfileCollection;
import com.microsoft.store.partnercenter.customers.servicecosts.ICustomerServiceCostsCollection;
import com.microsoft.store.partnercenter.customers.servicecosts.CustomerServiceCostsCollectionOperations;
import com.microsoft.store.partnercenter.customerusers.CustomerUsersCollectionOperations;
import com.microsoft.store.partnercenter.customerusers.ICustomerUserCollection;
import com.microsoft.store.partnercenter.devicesdeployment.BatchJobStatusCollectionOperations;
import com.microsoft.store.partnercenter.devicesdeployment.ConfigurationPolicyCollectionOperations;
import com.microsoft.store.partnercenter.devicesdeployment.DevicesBatchCollectionOperations;
import com.microsoft.store.partnercenter.devicesdeployment.IBatchJobStatusCollection;
import com.microsoft.store.partnercenter.devicesdeployment.IConfigurationPolicyCollection;
import com.microsoft.store.partnercenter.devicesdeployment.ICustomerDeviceCollection;
import com.microsoft.store.partnercenter.devicesdeployment.CustomerDevicesCollectionOperations;
import com.microsoft.store.partnercenter.devicesdeployment.IDevicesBatchCollection;
import com.microsoft.store.partnercenter.entitlements.EntitlementCollectionOperations;
import com.microsoft.store.partnercenter.entitlements.IEntitlementCollection;
import com.microsoft.store.partnercenter.managedservices.IManagedServiceCollection;
import com.microsoft.store.partnercenter.managedservices.ManagedServiceCollectionOperations;
import com.microsoft.store.partnercenter.models.customers.Customer;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.offers.CustomerOfferCategoryCollectionOperations;
import com.microsoft.store.partnercenter.offers.CustomerOfferCollectionOperations;
import com.microsoft.store.partnercenter.offers.ICustomerOfferCategoryCollection;
import com.microsoft.store.partnercenter.offers.ICustomerOfferCollection;
import com.microsoft.store.partnercenter.orders.IOrderCollection;
import com.microsoft.store.partnercenter.orders.OrderCollectionOperations;
import com.microsoft.store.partnercenter.qualification.CustomerQualificationOperations;
import com.microsoft.store.partnercenter.qualification.ICustomerQualification;
import com.microsoft.store.partnercenter.relationships.ICustomerRelationshipCollection;
import com.microsoft.store.partnercenter.relationships.CustomerRelationshipCollectionOperations;
import com.microsoft.store.partnercenter.servicerequests.CustomerServiceRequestCollectionOperations;
import com.microsoft.store.partnercenter.servicerequests.IServiceRequestCollection;
import com.microsoft.store.partnercenter.subscribedskus.CustomerSubscribedSkuCollectionOperations;
import com.microsoft.store.partnercenter.subscribedskus.ICustomerSubscribedSkuCollection;
import com.microsoft.store.partnercenter.subscriptions.ISubscriptionCollection;
import com.microsoft.store.partnercenter.subscriptions.SubscriptionCollectionOperations;
import com.microsoft.store.partnercenter.usage.CustomerUsageSpendingBudgetOperations;
import com.microsoft.store.partnercenter.usage.CustomerUsageSummaryOperations;
import com.microsoft.store.partnercenter.usage.ICustomerUsageSpendingBudget;
import com.microsoft.store.partnercenter.usage.ICustomerUsageSummary;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements a single customer operations.
 */
public class CustomerOperations
    extends BasePartnerComponentString
    implements ICustomer
{
    /**
     * The customer subscriptions operations.
     */
    private ISubscriptionCollection subscriptions;

    /**
     * The customer orders operations.
     */
    private IOrderCollection orders;

    /**
     * The customer profiles operations.
     */
    private ICustomerProfileCollection profiles;

    /**
     * The customer service requests operations.
     */
    private IServiceRequestCollection serviceRequests;

    /**
     * The customer managed services.
     */
    private IManagedServiceCollection managedServices;

    /***
     * The offer operations.
     */
    private ICustomerOfferCollection offers;

    /***
     * The offer category operations.
     */
    private ICustomerOfferCategoryCollection offerCategories;

    /**
     * The customer summary for usage-based subscriptions operations.
     */
    private ICustomerUsageSummary usageSummary;

    /**
     * The operations for the spending budget allocated to the customer by the partner.
     */
    private ICustomerUsageSpendingBudget usageBudget;

    /***
     * The customer qualification operations.
     */
    private ICustomerQualification customerQualification;

    /**
     * The operations for the customer users associated with the customer.
     */
    private ICustomerUserCollection customerUserCollectionOperations;

    /***
     * The directory role collection operations.
     */
    private IDirectoryRoleCollection directoryRoleCollectionOperations;

    /**
     * The operations for the subscribed skus associated with the customer.
     */
    private ICustomerSubscribedSkuCollection customerSubscribedSkuCollectionOperations;

    /**
     * The operations for the carts associated with the customer.
     */
    private ICartCollection cartOperations;

    /**
     * The operations for the products associated with the customer.
     */
    private ICustomerProductCollection productOperations;

    /**
     * The operations for the products associated with the customer.
     */
    private ICustomerServiceCostsCollection serviceCostsOperations;

    /**
     * The operations for the device batches associated with the customer.
     */
    private IDevicesBatchCollection deviceBatches;

    /**
     * The operations for the device associated with the customer.
     */
    private ICustomerDeviceCollection devices;

    /**
     * The operations for the batch upload status associated with the customer.
     */
    private IBatchJobStatusCollection batchUploadStatusCollection;

    /**
     * The customer relationship collection operations.
     */
    private ICustomerRelationshipCollection customerRelationshipCollectionOperations;

    /***
     * The customer analytics collection operations.
     */
    private ICustomerAnalyticsCollection analytics;

    /***
     * The entitlement collection operations.
     */
    private IEntitlementCollection entitlements;

    /***
     * The customer configuration policies operations.
     */
    private IConfigurationPolicyCollection configurationPolicies; 

    private String customerId;

    /**
     * Initializes a new instance of the {@link #CustomerOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer Id.
     */
    public CustomerOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }
        this.customerId = customerId;
    }

    /**
     * Gets the orders behavior for the customer.
     *
     * @return The customer orders.
     */
    @Override
    public IOrderCollection getOrders()
    {
        if ( this.orders == null )
        {
            this.orders = new OrderCollectionOperations( this.getPartner(), this.getContext() );
        }
        return this.orders;
    }

    /**
     * Obtains the profiles behavior for the customer.
     * 
     * @return The customer profiles.
     */
    @Override
    public ICustomerProfileCollection getProfiles()
    {
        if ( this.profiles == null )
        {
            this.profiles = new CustomerProfileCollectionOperations( this.getPartner(), this.getContext() );
        }
        return this.profiles;
    }

    @Override
    public ISubscriptionCollection getSubscriptions()
    {
        if ( subscriptions == null )
        {
            subscriptions = new SubscriptionCollectionOperations( this.getPartner(), this.getContext() );
        }
        return subscriptions;
    }

    /**
     * Obtains the service requests behavior for the customer.
     *
     * @return The customer service request operations.
     */
    @Override
    public IServiceRequestCollection getServiceRequests()
    {
        if ( this.serviceRequests == null )
        {
            this.serviceRequests = new CustomerServiceRequestCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.serviceRequests;
    }

    /**
     * Obtains the managed services behavior for the customer.
     *
     * @return The customer managed services operations.
     */
    @Override
    public IManagedServiceCollection getManagedServices()
    {
        if ( this.managedServices == null )
        {
            this.managedServices = new ManagedServiceCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.managedServices;
    }

	/***
	 * Obtains the Offer Categories behavior for the customer.
	 */
    @Override
	public ICustomerOfferCategoryCollection getOfferCategories() {
        if ( this.offerCategories == null )
        {
            this.offerCategories = new CustomerOfferCategoryCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.offerCategories;
	}

	/***
	 * Obtains the Offers behavior for the customer.
	 */
	@Override
	public ICustomerOfferCollection getOffers() {
        if ( this.offers == null )
        {
            this.offers = new CustomerOfferCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.offers;
	}

    /**
     * Obtains the customer usage summary behavior for the customer.
     *
     * @return The customer usage summary operations.
     */
    @Override
    public ICustomerUsageSummary getUsageSummary()
    {
        if ( this.usageSummary == null )
        {
            this.usageSummary = new CustomerUsageSummaryOperations( this.getPartner(), customerId );
        }
        return this.usageSummary;
    }

    /**
     * Obtains the usage spending budget behavior for the customer.
     *
     * @return The customer usage spending budget operations.
     */
    @Override
    public ICustomerUsageSpendingBudget getUsageBudget()
    {
        if ( this.usageBudget == null )
        {
            this.usageBudget = new CustomerUsageSpendingBudgetOperations( this.getPartner(), customerId );
        }
        return this.usageBudget;
    }

	/***
	 * Obtains the Customer qualification.
	 */
	@Override
	public ICustomerQualification getQualification()
	{
        if ( this.customerQualification == null )
        {
            this.customerQualification = new CustomerQualificationOperations( this.getPartner(), this.customerId );
        }
        return this.customerQualification;
	}

    /**
     * Obtains the users for the customer.
     *
     * @return The customer usage spending budget operations.
     */
	@Override
	public ICustomerUserCollection getUsers()
	{
        if ( this.customerUserCollectionOperations == null )
        {
            this.customerUserCollectionOperations = new CustomerUsersCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.customerUserCollectionOperations;
	}

	/***
	 * Obtains the Customer qualification.
	 */
	@Override
	public IDirectoryRoleCollection getDirectoryRoles()
	{
        if ( this.directoryRoleCollectionOperations == null )
        {
            this.directoryRoleCollectionOperations = new DirectoryRoleCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.directoryRoleCollectionOperations;
	}

    /**
     * Obtains the subscribed skus for the customer.
     *
     * @return The customer usage spending budget operations.
     */
	@Override
	public ICustomerSubscribedSkuCollection getSubscribedSkus()
	{
        if ( this.customerSubscribedSkuCollectionOperations == null )
        {
            this.customerSubscribedSkuCollectionOperations = new CustomerSubscribedSkuCollectionOperations( this.getPartner(), this.customerId );
        }
        return this.customerSubscribedSkuCollectionOperations;
    }
    
    /**
     * Gets the cart behavior for the customer.
     *
     * @return The customer carts.
     */
    @Override
    public ICartCollection getCarts()
    {
        if ( this.cartOperations == null )
        {
            this.cartOperations = new CartCollectionOperations( this.getPartner(), this.getContext() );
        }

        return this.cartOperations;
    }

    /**
     * Gets the cart behavior for the customer.
     *
     * @return The customer carts.
     */
    @Override
    public ICustomerProductCollection getProducts()
    {
        if ( this.productOperations == null )
        {
            this.productOperations = new CustomerProductCollectionOperations(this.getPartner(), this.getContext() );
        }

        return this.productOperations;
    }

    /**
     * Gets the cart behavior for the customer.
     *
     * @return The customer carts.
     */
    @Override
    public ICustomerServiceCostsCollection getServiceCosts()
    {
        if ( this.serviceCostsOperations == null )
        {
            this.serviceCostsOperations = new CustomerServiceCostsCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.serviceCostsOperations;
    }

    /**
     * Obtains the devices batches behavior of the customer.
     *
     * @return The devices batches behavior of the customer.
     */
    @Override 
     public IDevicesBatchCollection getDeviceBatches()
    {
        if ( this.deviceBatches == null )
        {
            this.deviceBatches = new  DevicesBatchCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.deviceBatches;
    }

    /**
     * Obtains the device policy behavior of the customer.
     *
     * @return The device policy behavior of the customer.
     */
    @Override
    public ICustomerDeviceCollection getDevicePolicy()
    {
        if(this.devices == null)
        {
            this.devices = new CustomerDevicesCollectionOperations(this.getPartner(), this.getContext());
        }        

        return this.devices;
    }

    /**
     * Obtains the devices batch upload job status behavior of the customer.
     *
     * @return The device batch upload job status beavior of the customer.
     */
    @Override
    public IBatchJobStatusCollection getBatchUploadStatus()
    {
        if ( this.batchUploadStatusCollection == null )
        {
            this.batchUploadStatusCollection = new BatchJobStatusCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.batchUploadStatusCollection;
    }

    /***
     * Obtains the relationship collection behavior for the customer.
     */
    public ICustomerRelationshipCollection getRelationships()
    {
        if(this.customerRelationshipCollectionOperations == null)
        {
            this.customerRelationshipCollectionOperations = new CustomerRelationshipCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.customerRelationshipCollectionOperations;
    }

    /***
     * Obtains the customer level analytics collection object.
     */
    public ICustomerAnalyticsCollection getAnalytics()
    {
        if(this.analytics == null)
        {
            this.analytics = new CustomerAnalyticsCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.analytics;
    }

    /***
     * Obtains the entitlement collection object.
     */
    public IEntitlementCollection getEntitlements()
    {
        if(this.entitlements == null)
        {
            this.entitlements = new EntitlementCollectionOperations(this.getPartner(), this.getContext()); 
        }   
        
        return this.entitlements;
    }

    /***
     * Obtains the configuration policies behavior for the customer.
     */
    public IConfigurationPolicyCollection getConfigurationPolicies()
    {
        if(this.configurationPolicies == null)
        {
            this.configurationPolicies = new ConfigurationPolicyCollectionOperations(this.getPartner(), this.getContext());
        }

        return this.configurationPolicies;
    }
    
	/**
     * Retrieves information of a specific customer.
     * 
     * @return The customer object.
     */
    @Override
    public Customer get()
    {
        IPartnerServiceProxy<Customer, Customer> partnerServiceProxy =
            new PartnerServiceProxy<Customer, Customer>( new TypeReference<Customer>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomer" ).getPath(),
                                                        this.getContext(), Locale.US ) );
        return partnerServiceProxy.get();
    }

    /**
     * Deletes the customer from a testing in production account. This won't work for real accounts.
     */
    @Override
    public void delete()
    {
        IPartnerServiceProxy<Customer, Customer> partnerServiceProxy =
            new PartnerServiceProxy<Customer, Customer>( new TypeReference<Customer>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "DeleteCustomer" ).getPath(),
                                                        this.getContext(), Locale.US ) );
        partnerServiceProxy.delete();
    }
}