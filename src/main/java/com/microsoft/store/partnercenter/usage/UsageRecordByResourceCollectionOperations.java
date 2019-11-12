
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.usage.ResourceUsageRecord;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Implements operations related to a single subscription's meter usage records.
 */
public class UsageRecordByResourceCollectionOperations extends BasePartnerComponent<Tuple<String, String>>
        implements IUsageRecordByResourceCollection
{
    /**
     * Initializes a new instance of the UsageRecordByResourceCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     * @param subscriptionId The subscription identifier.
     */
    public UsageRecordByResourceCollectionOperations(IPartner rootPartnerOperations, String customerId, String subscriptionId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, subscriptionId));
        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId should be set.");
        }
        if (StringHelper.isNullOrWhiteSpace(subscriptionId)) {
            throw new IllegalArgumentException("subscriptionId should be set.");
        }
    }

    /**
     * Gets the subscription's resource usage records.
     * 
     * @return The subscription's resource usage records.
     */
    @Override
    public ResourceCollection<ResourceUsageRecord> get() 
    {
		return this.getPartner().getServiceClient().get(
			this.getPartner(),
			new TypeReference<ResourceCollection<ResourceUsageRecord>>(){}, 
			MessageFormat.format(
				PartnerService.getInstance().getConfiguration().getApis().get("GetSubscriptionUsageRecordsByResource").getPath(),
                this.getContext().getItem1(),
                this.getContext().getItem2()));
    }
}