// -----------------------------------------------------------------------
// <copyright file="ValidationOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.validations;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.Address;
import com.microsoft.store.partnercenter.models.validationcodes.ValidationCode;

/**
 * The validations collection operations implementation.
 */
public class ValidationOperations
    extends BasePartnerComponentString
    implements IValidationOperations
{
    /**
     * Initializes a new instance of the ValidationOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     */
    public ValidationOperations(IPartner rootPartnerOperations)
    {
        super(rootPartnerOperations);
    }

    /**
     * Gets validation code which is used for Government Community Cloud customers qualification.
     * 
     * @return List of validation codes.
     */
    public List<ValidationCode> getValidationCodes()
    {
		return this.getPartner().getServiceClient().get(
			this.getPartner(), 
			new TypeReference<List<ValidationCode>>(){},
			PartnerService.getInstance().getConfiguration().getApis().get("GetValidationCodes").getPath());
    }

    /**
     * Checks if the address is valid or not.
     * 
     * @param address The address to be validated.
     * @return True if the address is valid, false otherwise.
     */
    public Boolean isAddressValid(Address address)
    {
        if ( address == null )
        {
            throw new IllegalArgumentException("The address is a required parameter.");
        }

        return this.getPartner().getServiceClient().post(
            this.getPartner(), 
            new TypeReference<Boolean>(){},
            PartnerService.getInstance().getConfiguration().getApis().get("AddressValidation").getPath(),
            address);
    }
}