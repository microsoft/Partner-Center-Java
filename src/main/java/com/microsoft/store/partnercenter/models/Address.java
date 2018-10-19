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
    private String __Country;

    public String getCountry()
    {
        return __Country;
    }

    public void setCountry( String value )
    {
        __Country = value;
    }

    /**
     * Gets or sets the region.
     */
    private String __Region;

    public String getRegion()
    {
        return __Region;
    }

    public void setRegion( String value )
    {
        __Region = value;
    }

    /**
     * Gets or sets the city.
     */
    private String __City;

    public String getCity()
    {
        return __City;
    }

    public void setCity( String value )
    {
        __City = value;
    }

    /**
     * Gets or sets the state.
     */
    private String __State;

    public String getState()
    {
        return __State;
    }

    public void setState( String value )
    {
        __State = value;
    }

    /**
     * Gets or sets the first address line.
     */
    private String __AddressLine1;

    public String getAddressLine1()
    {
        return __AddressLine1;
    }

    public void setAddressLine1( String value )
    {
        __AddressLine1 = value;
    }

    /**
     * Gets or sets the second address line.
     */
    private String __AddressLine2;

    public String getAddressLine2()
    {
        return __AddressLine2;
    }

    public void setAddressLine2( String value )
    {
        __AddressLine2 = value;
    }

    /**
     * Gets or sets the postal code.
     */
    private String __PostalCode;

    public String getPostalCode()
    {
        return __PostalCode;
    }

    public void setPostalCode( String value )
    {
        __PostalCode = value;
    }

    /**
     * Gets or sets the first name.
     */
    private String __FirstName;

    public String getFirstName()
    {
        return __FirstName;
    }

    public void setFirstName( String value )
    {
        __FirstName = value;
    }

    /**
     * Gets or sets the last name.
     */
    private String __LastName;

    public String getLastName()
    {
        return __LastName;
    }

    public void setLastName( String value )
    {
        __LastName = value;
    }

    /**
     * Gets or sets the phone.
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
