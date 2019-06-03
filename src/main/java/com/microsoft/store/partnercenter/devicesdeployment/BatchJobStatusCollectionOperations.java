// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Cart collection operations implementation class.
 */
public class BatchJobStatusCollectionOperations
    extends BasePartnerComponentString
    implements IBatchJobStatusCollection
{
    /**
     * Initializes a new instance of the BatchJobStatusCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId Identifier for the customer.
     */
    public BatchJobStatusCollectionOperations(IPartner rootPartnerOperations, String customerId)
    {
        super(rootPartnerOperations, customerId);

        if (StringHelper.isNullOrWhiteSpace(customerId))
        {
            throw new IllegalArgumentException("customerId must be set");
        }
    }

    /**
     *  Retrieves a specific customer's devices batch upload status operations.
     * 
     * @param trackingId The device collection upload tracking id.
     * @return The customer's devices batch upload status operations.
     */
    @Override
    public IBatchJobStatus byId(String trackingId)
    {
        return new BatchJobStatusOperations(this.getPartner(), this.getContext(), trackingId);
    }
}