// -----------------------------------------------------------------------
// <copyright file="SubscriptionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.subscriptions;

import java.text.MessageFormat;
import java.util.Locale;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.subscriptions.Subscription;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.usage.ISubscriptionUsageRecordCollection;
import com.microsoft.store.partnercenter.usage.ISubscriptionUsageSummary;
import com.microsoft.store.partnercenter.usage.SubscriptionUsageRecordCollectionOperations;
import com.microsoft.store.partnercenter.usage.SubscriptionUsageSummaryOperations;
import com.microsoft.store.partnercenter.utilization.IUtilizationCollection;
import com.microsoft.store.partnercenter.utilization.UtilizationCollectionOperations;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations for a customer's subscription.
 */
public class SubscriptionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscription
{
    private String customerId;

    private String subscriptionId;

    /**
     * A reference to the current subscription's add-ons operations.
     */
    private ISubscriptionAddOnCollection subscriptionAddOnsOperations;

    /**
     * A reference to the current subscription's upgrade operations.
     */
    private ISubscriptionUpgradeCollection subscriptionUpgradeOperations;
    
    /***
     * A reference to the current subscription's resource usage records operations.
     */
    private ISubscriptionUsageRecordCollection usageRecordsOperations;

    /**
     * A reference to the current subscription's usage summary operations.
     */
    private ISubscriptionUsageSummary subscriptionUsageSummaryOperations;
    
    /***
     * A reference to the current subscription's utilities operations.
     */
    private IUtilizationCollection subscriptionUtilizationOperations;

    /***
     * A reference to the current subscription's provisioning status operations.
     */
    private ISubscriptionProvisioningStatus subscriptionProvisioningStatusOperations;

    /***
     * A reference to the current subscription's support contact operations.
     */
    private ISubscriptionSupportContact subscriptionSupportContactOperations;

    /***
     * A reference to the current subscription's registration status operations.
     */
    private ISubscriptionRegistration subscriptionRegistrationOperations;

    /***
     * A reference to the current subscription's registration status operations.
     */
    private ISubscriptionRegistrationStatus subscriptionRegistrationStatusOperations; 

    /***
     * A lazy reference to the current subscription's conversion operations.
     */
    private ISubscriptionConversionCollection subscriptionConversionOperations; 

    /**
     * Initializes a new instance of the SubscriptionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription id.
     */
    public SubscriptionOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }

        if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
        {
            throw new IllegalArgumentException( "subscriptionId must be set." );
        }
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Gets the current subscription's add-ons operations.
     */
    @Override
    public ISubscriptionAddOnCollection getAddOns()
    {
        if ( this.subscriptionAddOnsOperations == null )
        {
            this.subscriptionAddOnsOperations =
                new SubscriptionAddOnCollectionOperations( this.getPartner(), this.customerId, this.subscriptionId );
        }
        return this.subscriptionAddOnsOperations;
    }

    /**
     * Gets the current subscription's upgrade operations.
     */
    @Override
    public ISubscriptionUpgradeCollection getUpgrades()
    {
        if ( this.subscriptionUpgradeOperations == null )
        {
            this.subscriptionUpgradeOperations =
                new SubscriptionUpgradeCollectionOperations( this.getPartner(), this.customerId, this.subscriptionId );
        }
        return this.subscriptionUpgradeOperations;
    }

    /**
     * Gets the current subscription's resource usage records operations.
     */
    @Override
    public ISubscriptionUsageRecordCollection getUsageRecords()
    {
        if ( this.usageRecordsOperations == null )
        {
            this.usageRecordsOperations =
                new SubscriptionUsageRecordCollectionOperations( this.getPartner(), customerId, subscriptionId );
        }
        return this.usageRecordsOperations;
    }

    /**
     * Gets the current subscription's usage summary operations.
     */
    @Override
    public ISubscriptionUsageSummary getUsageSummary()
    {
        if ( this.subscriptionUsageSummaryOperations == null )
        {
            this.subscriptionUsageSummaryOperations =
                new SubscriptionUsageSummaryOperations( this.getPartner(), customerId, subscriptionId );
        }
        return this.subscriptionUsageSummaryOperations;
    }

    /**
     * Gets the current subscription's utilization operations.
     */
    @Override
    public IUtilizationCollection getUtilization()
    {
        if ( this.subscriptionUtilizationOperations == null )
        {
            this.subscriptionUtilizationOperations =
                new UtilizationCollectionOperations( this.getPartner(), customerId, subscriptionId );
        }
        return this.subscriptionUtilizationOperations;
    }

    /***
     * Gets the current subscription's provisioning status operations.
     */
    public ISubscriptionProvisioningStatus getProvisioningStatus()
    {
        if(subscriptionProvisioningStatusOperations == null)
        {
            subscriptionProvisioningStatusOperations = new SubscriptionProvisioningStatusOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }

        return subscriptionProvisioningStatusOperations;
    }

    /***
     * Gets the current subscription's support contact operations.
     */
    public ISubscriptionSupportContact getSupportContact()
    {
        if(subscriptionSupportContactOperations == null)
        {
            subscriptionSupportContactOperations = new SubscriptionSupportContactOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }

        return subscriptionSupportContactOperations; 
    }

    /***
     * Gets the current subscription's registration operations.
     */
    public ISubscriptionRegistration getRegistration()
    {
        if(subscriptionRegistrationOperations == null)
        {
            subscriptionRegistrationOperations = new SubscriptionRegistrationOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }

        return subscriptionRegistrationOperations;
    }

    /***
     * Gets the current subscription's registration status operations.
     */
    public ISubscriptionRegistrationStatus getRegistrationStatus()
    {
        if (subscriptionRegistrationStatusOperations == null)
        {
            subscriptionRegistrationStatusOperations = new SubscriptionRegistrationStatusOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }

        return subscriptionRegistrationStatusOperations;
    }

    public ISubscriptionConversionCollection getConversions()
    {
        if (this.subscriptionConversionOperations == null)
        {
            subscriptionConversionOperations = new SubscriptionConversionCollectionOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2());
        }
        
        return subscriptionConversionOperations; 
    }

    /**
     * Gets the subscription.
     * 
     * @return The subscription.
     */
    @Override
    public Subscription get()
    {
        IPartnerServiceProxy<Subscription, Subscription> partnerServiceProxy =
            new PartnerServiceProxy<Subscription, Subscription>( new TypeReference<Subscription>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetSubscription" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

    /**
     * Patches a subscription.
     * 
     * @param subscription The subscription information.
     * @return The updated subscription information.
     */
    @Override
    public Subscription patch( Subscription subscription )
    {
        if ( subscription == null )
        {
            throw new IllegalArgumentException( "subscription is required." );
        }
        PartnerServiceProxy<Subscription, Subscription> partnerApiServiceProxy =
            new PartnerServiceProxy<Subscription, Subscription>( new TypeReference<Subscription>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "UpdateSubscription" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerApiServiceProxy.patch( subscription );
    }

}
