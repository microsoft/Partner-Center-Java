// -----------------------------------------------------------------------
// <copyright file="ICustomerQualification.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.qualification;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.customers.CustomerQualification;

public interface ICustomerQualification
		extends IPartnerComponentString, IEntityGetOperations<CustomerQualification>, IEntityUpdateOperations<CustomerQualification>
{
	/**
	 * Retrieves the customer qualification.
	 * 
	 * @return Customer Qualification.
	 */
    CustomerQualification get();
    
    /**
     * Updates the customer qualification.
     * 
     * @param customerQualification Customer Qualification.
     * @return The updated customer qualification.
     */
    CustomerQualification update( CustomerQualification customerQualification );

}
