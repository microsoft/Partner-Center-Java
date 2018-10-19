// -----------------------------------------------------------------------
// <copyright file="IServiceIncidentCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.serviceincidents;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.query.IQuery;
import com.microsoft.store.partnercenter.models.serviceincidents.ServiceIncidents;

public interface IServiceIncidentCollection
		extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<ServiceIncidents, ResourceCollection<ServiceIncidents>>
{
	/**
	 * Retrieves all service incidents.
	 * 
	 * @param serviceIncidentsQuery A query to retrieve service incidents based on the active status.
	 * @return The list of service incidents.
	 */
    ResourceCollection<ServiceIncidents> get( IQuery serviceIncidentsQuery );   
}
