// -----------------------------------------------------------------------
// <copyright file="UtilizationCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utilization;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.utils.StringHelper;

public class UtilizationCollectionOperations
	extends BasePartnerComponent<Tuple<String, String>>
	implements IUtilizationCollection
{
	
    /***
     * A reference to Azure utilization collection object.
     */
    private IAzureUtilizationCollection azureUtilizationOperations;


	public UtilizationCollectionOperations(IPartner rootPartnerOperations, String customerId, String subscriptionId )
	{
		/***
		 * Initializes a new instance of the UtilizationCollectionOperations class.
         * @param rootPartnerOperations: The root partner operations.
         * @param customerId: The customer ID.
         * @param subscriptionId: The subscription ID.
		 */
		super( rootPartnerOperations, new Tuple<String, String>( customerId, subscriptionId ) );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( subscriptionId ) )
        {
            throw new IllegalArgumentException( "subscriptionId must be set" );
        }
        
        this.azureUtilizationOperations = 
        		new AzureUtilizationCollectionOperations
        		( 
        			this.getPartner(),
        			this.getContext().getItem1(),
        			this.getContext().getItem2()
        		);
	}

	/***
	 * Gets Azure subscription utilization behavior.
	 */
	@Override
	public IAzureUtilizationCollection getAzure()
	{
		return this.azureUtilizationOperations;
	}

}
