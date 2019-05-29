// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.validations;

import java.util.List;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.validationcodes.ValidationCode;

/**
 * Represents the behavior of a validation operations.
 */
public interface IValidationOperations
    extends IPartnerComponentString
{
    /**
     * Gets validation code which is used for Government Community Cloud customers qualification.
     * 
     * @return List of validation codes.
     */
    List<ValidationCode> getValidationCodes();

    /**
     * Checks if the address is valid or not.
     * 
     * @param address The address to be validated.
     * @return true if the address is valid, false otherwise.
     */
    Boolean isAddressValid(Address address);
}