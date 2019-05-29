// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.validationcodes;

/**
 * Represents validation codes. Used to create Government Community Cloud (GCC) accounts.
 */
public class ValidationCode
{
    /**
     * The etag value for the object.
     */
    private String etag; 

    /**
     * The maximum number of customer creates for this code.
     */
    private int maxCreates;

    /**
     * The name of the organization.
     */
    private String organizationName;

    /**
     * The identifier for the partner.
     */
    private String partnerId; 

    /** 
     * The remaining number of customer creates for this code.
     */
    private int remainingCreates;

    /**
     * The identifier for the validation.
     */
    private String validationId;

    /**
     * Gets the ETag value for the object.
     * 
     * @return The ETag value for the object.
     */
    public String getETag()
    {
        return etag;
    }

    /**
     * Sets the ETag value for the object.
     * 
     * @param value The ETag value for the object.
     */
    public void setETag(String value)
    {
        etag = value;
    }

    /**
     * Gets the maximum number of customer creates for this code.
     * 
     * @return The maximum number of customer creates for this code.
     */
    public int getMaxCreates()
    {
        return maxCreates;
    }

    /**
     * Sets the maximum number of customer creates for this code.
     * 
     * @param value The maximum number of customer creates for this code.
     */
    public void setMaxCreates(int value)
    {
        maxCreates = value;
    }

    /**
     * Gets the name of the organization.
     * 
     * @return The name of the organization.
     */
    public String getOrganizationName()
    {
        return organizationName;
    }

    /**
     * Sets the name of the organization.
     * 
     * @param value The name of the organization.
     */
    public void setOrganizationName(String value)
    {
        organizationName = value;
    }

    /**
     * Gets the identifier for the partner.
     * 
     * @return The identifier for the partner.
     */
    public String getPartnerId()
    {
        return partnerId;
    }

    /**
     * Sets the identifier for the partner.
     * 
     * @param value The identifier for the partner.
     */
    public void setPartnerId(String value)
    {
        partnerId = value;
    }

    /**
     * Gets the remaining number of customer creates for this code.
     * 
     * @return The remaining number of customer creates for this code.
     */
    public int getRemainingCreates()
    {
        return remainingCreates;
    }

    /**
     * Sets the remaining number of customer creates for this code.
     * 
     * @param value The remaining number of customer creates for this code.
     */
    public void setRemainingCreates(int value)
    {
        remainingCreates = value;
    }

    /**
     * Gets the identifier for the validation.
     * 
     * @return The identifier for the validation.
     */
    public String getValidationId()
    {
        return validationId;
    }

    /**
     * Sets the identifier for the validation.
     * 
     * @param value The identifier for the validation.
     */
    public void setValidationId(String value)
    {
        validationId = value;
    }
}