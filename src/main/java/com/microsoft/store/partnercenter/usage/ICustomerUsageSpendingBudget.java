// -----------------------------------------------------------------------
// <copyright file="ICustomerUsageSpendingBudget.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.usage;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityPatchOperations;
import com.microsoft.store.partnercenter.models.usage.SpendingBudget;

/**
 * This interface defines the operations available on a customer's usage spending budget.
 */
public interface ICustomerUsageSpendingBudget
    extends IPartnerComponentString, IEntityGetOperations<SpendingBudget>,
    IEntityPatchOperations<SpendingBudget>
{
    /***
     * Retrieves the customer's usage spending budget.
     * @return: The customer's usage spending budget.
     */
    SpendingBudget get();

    /***
     * Patches the customer's usage spending budget.
     * @param spendingBudget: The new customer's usage spending budget.
     * @return The updated customer's usage spending budget. 
     */
    SpendingBudget patch( SpendingBudget spendingBudget );

}
