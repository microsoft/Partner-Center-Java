
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.MeterUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription's meter usage records.
 */
public class UsageRecordByMeterCollectionOperations extends BasePartnerComponent<Tuple<String, String>>
        implements IUsageRecordByMeterCollection
{
    /**
     * Initializes a new instance of the SubscriptionUsageRecordCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription identifier.
     */
    public UsageRecordByMeterCollectionOperations(IPartner rootPartnerOperations, String customerId, String subscriptionId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, subscriptionId));
        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId should be set.");
        }
        if (StringHelper.isNullOrWhiteSpace(subscriptionId)) {
            throw new IllegalArgumentException("subscriptionId should be set.");
        }
    }

    /**
     * Gets the subscription's meter usage records.
     * 
     * @return The subscription's meter usage records.
     */
    @Override
    public ResourceCollection<MeterUsageRecord> get() 
    {
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<MeterUsageRecord>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionUsageRecordsByMeter").getPath(),
                this.getContext().getItem1(),
                this.getContext().getItem2()));
    }
}