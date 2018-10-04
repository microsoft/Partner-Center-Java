// -----------------------------------------------------------------------
// <copyright file="IDevicesBatchCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;


import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityCreateOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntitySelector;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatch;
import com.microsoft.store.partnercenter.models.devicesdeployment.DeviceBatchCreationRequest;

/***
 * Represents the operations that can be done on the partner's devices batches.
 */
public interface IDevicesBatchCollection 
	extends IPartnerComponentString,
	IEntireEntityCollectionRetrievalOperations<DeviceBatch, ResourceCollection<DeviceBatch>>, IEntitySelector<IDevicesBatch>, IEntityCreateOperations<DeviceBatchCreationRequest, String>
{
	/***
	 * Retrieves a specific customer devices batch behavior.
	 * 
	 * @param deviceBatchId The devices batch id
	 * @return The devices batch behavior.
	 */
    IDevicesBatch byId( String deviceBatchId );

    /***
     * Retrieves all devices batches.
     * 
     * @return All of the device batches.
     */
    ResourceCollection<DeviceBatch> get();
}
