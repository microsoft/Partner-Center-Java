// -----------------------------------------------------------------------
// <copyright file="Address.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Represents Customer or partner's address
 */
public class Address
{
    /**
     * Gets or sets the Country in ISO country code format.
     */
    private String country;

    public String getCountry()
    {
        return country;
    }

    public void setCountry( String value )
    {
        country = value;
    }

    /**
     * Gets or sets the region.
     */
    private String region;

    public String getRegion()
    {
        return region;
    }

    public void setRegion( String value )
    {
        region = value;
    }

    /**
     * Gets or sets the city.
     */
    private String city;

    public String getCity()
    {
        return city;
    }

    public void setCity( String value )
    {
        city = value;
    }

    /**
     * Gets or sets the state.
     */
    private String state;

    public String getState()
    {
        return state;
    }

    public void setState( String value )
    {
        state = value;
    }

    /**
     * Gets or sets the first address line.
     */
    private String addressLine1;

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public void setAddressLine1( String value )
    {
        addressLine1 = value;
    }

    /**
     * Gets or sets the second address line.
     */
    private String addressLine2;

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public void setAddressLine2( String value )
    {
        addressLine2 = value;
    }

    /**
     * Gets or sets the postal code.
     */
    private String postalCode;

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode( String value )
    {
        postalCode = value;
    }

    /**
     * Gets or sets the first name.
     */
    private String firstName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String value )
    {
        firstName = value;
    }

    /**
     * Gets or sets the last name.
     */
    private String lastName;

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String value )
    {
        lastName = value;
    }

    /**
     * Gets or sets the phone.
     */
    private String phoneNumber;

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String value )
    {
        phoneNumber = value;
    }
}