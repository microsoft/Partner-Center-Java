// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.qualification;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntityGetOperations;
import com.microsoft.store.partnercenter.genericoperations.IEntityUpdateOperations;
import com.microsoft.store.partnercenter.models.customers.CustomerQualification;
import com.microsoft.store.partnercenter.models.validationcodes.ValidationCode;

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
    CustomerQualification update(CustomerQualification customerQualification);

    /**
     * Updates the customer qualification. Used for GovernmentCommunityCloud with validation code after successful registration through Microsoft.
     * 
     * @param customerQualification The customer qualification value.
     * @param governmentCommunityCloudValidationCode Validation code necessary to complete only Government Community Cloud customer creation.
     * @return The updated customer qualification.
     */
    CustomerQualification update(CustomerQualification customerQualification, ValidationCode governmentCommunityCloudValidationCode);
}