// -----------------------------------------------------------------------
// <copyright file="SubscriptionUpgradeCollectionOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Upgrade;
import com.microsoft.store.partnercenter.models.subscriptions.UpgradeResult;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * The customer subscription upgrade implementation.
 */
public class SubscriptionUpgradeCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISubscriptionUpgradeCollection
{
    /**
     * Initializes a new instance of the SubscriptionUpgradeCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer Id to whom the subscriptions belong.
     * @param subscriptionId The subscription Id where the upgrade is occurring.
     */
    public SubscriptionUpgradeCollectionOperations( IPartner rootPartnerOperations, String customerId,
                                                    String subscriptionId )
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
     * Retrieves all subscription upgrades.
     * 
     * @return The subscription upgrades.
     */
    @Override
    public ResourceCollection<Upgrade> get()
    {
        PartnerServiceProxy<Upgrade, ResourceCollection<Upgrade>> partnerServiceProxy =
            new PartnerServiceProxy<Upgrade, ResourceCollection<Upgrade>>( new TypeReference<ResourceCollection<Upgrade>>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "PostSubscriptionUpgrade" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.get();
    }

    /**
     * Performs a subscription upgrade.
     * 
     * @param subscriptionUpgrade The subscription upgrade to perform.
     * @return A task containing the subscription upgrade result.
     */
    @Override
    public UpgradeResult create( Upgrade subscriptionUpgrade )
    {
        PartnerServiceProxy<Upgrade, UpgradeResult> partnerServiceProxy =
            new PartnerServiceProxy<Upgrade, UpgradeResult>( new TypeReference<UpgradeResult>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "PostSubscriptionUpgrade" ).getPath(),
                                                        this.getContext().getItem1(), this.getContext().getItem2(),
                                                        Locale.US ) );
        return partnerServiceProxy.post( subscriptionUpgrade );
    }

}
