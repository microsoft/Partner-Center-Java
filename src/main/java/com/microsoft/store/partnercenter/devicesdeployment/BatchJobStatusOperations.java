// -----------------------------------------------------------------------
// <copyright file="BatchJobStatusOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.devicesdeployment.BatchUploadDetails;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Cart collection operations implementation class.
 */
public class BatchJobStatusOperations 
    extends BasePartnerComponent<Tuple<String, String>> implements IBatchJobStatus 
{
    /**
     * Initializes a new instance of the BatchJobStatusOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId            Identifier for the customer.
     * @param trackingId            The tracking identifier.
     */
    public BatchJobStatusOperations(IPartner rootPartnerOperations, String customerId, String trackingId) {
        super(rootPartnerOperations, new Tuple<String, String>(customerId, trackingId));

        if (StringHelper.isNullOrWhiteSpace(customerId)) {
            throw new IllegalArgumentException("customerId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(trackingId)) {
            throw new IllegalArgumentException("trackingId must be set");
        }
    }
    /**
     * Retrieves devices batch upload status of the customer.
     * 
     * @return Devices batch upload status.
     */
    @Override
    public BatchUploadDetails get() 
    {
        IPartnerServiceProxy<BatchUploadDetails, BatchUploadDetails> partnerServiceProxy = new PartnerServiceProxy<BatchUploadDetails, BatchUploadDetails>(
                new TypeReference<BatchUploadDetails>() {
                }, this.getPartner(),
                MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetBatchUploadStatus").getPath(),
                        this.getContext().getItem1(), this.getContext().getItem2()));

        return partnerServiceProxy.get();
    }
}