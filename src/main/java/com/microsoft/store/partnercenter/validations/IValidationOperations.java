// -----------------------------------------------------------------------
// <copyright file="IValidationOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.validations;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.Address;

/**
 * Represents the behavior of a validation operations.
 */
public interface IValidationOperations
    extends IPartnerComponentString
{
    /**
     * Checks if the address is valid or not.
     * 
     * @param address The address to be validated.
     * @return True if the address is valid, false otherwise.
     */
    Boolean isAddressValid(Address address);
}