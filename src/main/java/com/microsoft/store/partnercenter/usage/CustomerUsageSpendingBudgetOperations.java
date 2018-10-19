// -----------------------------------------------------------------------
// <copyright file="CustomerUsageSpendingBudgetOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.usage.SpendingBudget;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * This class implements the operations available on a customer's usage spending budget.
 */
public class CustomerUsageSpendingBudgetOperations
    extends BasePartnerComponentString
    implements ICustomerUsageSpendingBudget
{
    /**
     * Initializes a new instance of the CustomerUsageSpendingBudgetOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer identifier.
     */
    public CustomerUsageSpendingBudgetOperations( IPartner rootPartnerOperations, String customerId )
    {
        super( rootPartnerOperations, customerId );
        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set." );
        }
    }

    /**
     * Gets the usage spending budget allocated to a customer by the partner.
     * 
     * @return The customer usage spending budget.
     */
    @Override
    public SpendingBudget get()
    {
        IPartnerServiceProxy<SpendingBudget, SpendingBudget> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<SpendingBudget>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerUsageSpendingBudget" ).getPath(),
                                                        this.getContext() ) );
        return partnerServiceProxy.get();
    }

    /**
     * Patches the usage spending budget allocated to a customer by the partner.
     * 
     * @param usageSpendingBudget The new customer usage spending budget.
     * @return The updated customer usage spending budget.
     */
    @Override
    public SpendingBudget patch( SpendingBudget usageSpendingBudget )
    {
        if ( usageSpendingBudget == null )
        {
            throw new IllegalArgumentException( "usage spending budget is required." );
        }
        IPartnerServiceProxy<SpendingBudget, SpendingBudget> partnerServiceProxy =
            new PartnerServiceProxy<>( new TypeReference<SpendingBudget>()
            {
            }, this.getPartner(), MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "PatchCustomerUsageSpendingBudget" ).getPath(),
                                                        this.getContext() ) );
        return partnerServiceProxy.patch( usageSpendingBudget );
    }

}
