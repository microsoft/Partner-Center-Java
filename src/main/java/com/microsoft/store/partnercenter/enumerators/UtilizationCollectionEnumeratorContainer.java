// -----------------------------------------------------------------------
// <copyright file="UtilizationCollectionEnumeratorContainer.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.enumerators;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.factory.IResourceCollectionEnumeratorFactory;
import com.microsoft.store.partnercenter.factory.IndexBasedCollectionEnumeratorFactory;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.utilizations.AzureUtilizationRecord;

/**
 * Utilization collection enumerator container implementation class.
 */
public class UtilizationCollectionEnumeratorContainer
	extends BasePartnerComponentString
	implements IUtilizationCollectionEnumeratorContainer
{
	/**
     * A reference to an Azure utilization record enumerator factory.
     */
    private IndexBasedCollectionEnumeratorFactory<AzureUtilizationRecord, ResourceCollection<AzureUtilizationRecord>> azureUtilizationRecordEnumeratorFactory;

    /**
     * Initializes a new instance of the UtilizationCollectionEnumeratorContainer class.
     * @param rootPartnerOperations The root partner operations instance.
     */
    public UtilizationCollectionEnumeratorContainer(IPartner rootPartnerOperations)
    {
		super(rootPartnerOperations);
		this.azureUtilizationRecordEnumeratorFactory =
			new IndexBasedCollectionEnumeratorFactory<>
			(
				this.getPartner(), 
				new TypeReference<ResourceCollection<AzureUtilizationRecord>>(){}  
			);
	}

	/**
	 * Gets a factory that creates Azure utilization record collection enumerators.
	 * 
	 * @return A factory that creates Azure utilization record collection enumerators.
	 */
	@Override
	public IResourceCollectionEnumeratorFactory<ResourceCollection<AzureUtilizationRecord>> getAzure()
	{
		return this.azureUtilizationRecordEnumeratorFactory;
	}
}