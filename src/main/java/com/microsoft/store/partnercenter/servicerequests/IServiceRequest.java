// -----------------------------------------------------------------------
// <copyright file="IServiceRequest.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.servicerequests;

import com.microsoft.store.partnercenter.IPartnerComponent;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.servicerequests.ServiceRequest;
import com.microsoft.store.partnercenter.models.utils.Tuple;

/**
 * Groups operations that can be performed on a single service request.
 */
public interface IServiceRequest
    extends IPartnerComponent<Tuple<String, String>>, IEntityGetOperations<ServiceRequest>,
    IEntityPatchOperations<ServiceRequest>
{
	/***
	 * Retrieves the service request.
	 * 
	 * @return The service request information.
	 */
    ServiceRequest get();
    
    /***
     * Patches a service request.
     * 
     * @param serviceRequest The service request that has the properties to be patched set.
     * @return The updated service request.
     */
    ServiceRequest patch( ServiceRequest serviceRequest );

}
