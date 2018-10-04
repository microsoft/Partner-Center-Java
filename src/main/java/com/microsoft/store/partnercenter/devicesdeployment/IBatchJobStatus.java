// -----------------------------------------------------------------------
// <copyright file="IBatchJobStatus.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.devicesdeployment;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.models.devicesdeployment.BatchUploadDetails;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/***
 * Represents the operations that can be done on the partner's device.
 */
public interface IBatchJobStatus
	extends IPartnerComponent<Tuple<String, String>>, 
    IEntityGetOperations<BatchUploadDetails>
{
    /***
     *  Retrieves a specific customer devices batch upload status details.
     * 
     * @return The devices batch upload status details.
     */
	BatchUploadDetails get();
}