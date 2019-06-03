// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.subscriptions;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.subscriptions.Upgrade;
import com.microsoft.store.partnercenter.models.subscriptions.UpgradeResult;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * This interface defines the upgrade operations available on a customer's subscription.
 */
public interface ISubscriptionUpgradeCollection
    extends IPartnerComponent<Tuple<String, String>>,
    IEntireEntityCollectionRetrievalOperations<Upgrade, ResourceCollection<Upgrade>>,
    IEntityCreateOperations<Upgrade, UpgradeResult>
{
	/**
	 * Submits a subscription upgrade.
     * 
	 * @param upgrade The new subscription upgrade information.
	 * @return The subscription upgrade results.
	 */
    UpgradeResult create(Upgrade upgrade);

    /**
     * Retrieves all subscription upgrades.
     * @return The subscription upgrades.
     */
    ResourceCollection<Upgrade> get();
}