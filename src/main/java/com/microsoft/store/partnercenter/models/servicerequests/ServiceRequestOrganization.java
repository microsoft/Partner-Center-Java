// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicerequests;

/**
 * Represents an Organization profile
 */
public class ServiceRequestOrganization
{
    /**
     * Gets or sets the organization identifier.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

    /**
     * Gets or sets the name of the organization.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
        __Name = value;
    }

    /**
     * Gets or sets the tenant phone number.
     */
    private String __PhoneNumber;

    public String getPhoneNumber()
    {
        return __PhoneNumber;
    }

    public void setPhoneNumber( String value )
    {
        __PhoneNumber = value;
    }

}
