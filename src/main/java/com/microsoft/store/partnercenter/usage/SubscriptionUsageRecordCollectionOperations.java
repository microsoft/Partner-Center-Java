
// -----------------------------------------------------------------------
// <copyright file="SubscriptionUsageRecordCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single customer's subscription usage records.
 */
public class SubscriptionUsageRecordCollectionOperations
    extends BasePartnerComponent<Tuple<String,String>>
    implements ISubscriptionUsageRecordCollection
{
    /**
     * Initializes a new instance of the SubscriptionUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription identifier.
     */
    public SubscriptionUsageRecordCollectionOperations( IPartner rootPartnerOperations, String customerId, String subscriptionId )
    {
        super( rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId should be set." );
        }
        if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
        {
            throw new IllegalArgumentException( "subscriptionId should be set." );
        }
    }

    /**
     * Gets the subscription usage records grouped by resources.
     * 
     * @return The subscription usage records grouped by resources.
     */
    public IResourceUsageRecordCollection getResources()
    {
    	return new ResourceUsageRecordCollectionOperations( this.getPartner(), 
    			this.getContext().getItem1(), this.getContext().getItem2() );
    }

    /**
     * Gets the subscription usage records grouped by days.
     * 
     * @return The subscription usage records grouped by days.
     */
    public ISubscriptionDailyUsageRecordCollection getDaily()
    {
    	return new SubscriptionDailyUsageRecordCollectionOperations( this.getPartner(), 
    			this.getContext().getItem1(), this.getContext().getItem2() );
    }
}