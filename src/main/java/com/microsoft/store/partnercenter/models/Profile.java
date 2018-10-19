// -----------------------------------------------------------------------
// <copyright file="Profile.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Common profile template profile type
 */
public abstract class Profile<T>
    extends ResourceBase
{
    /**
     * Gets or sets the profile identifier.
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
     * Gets or sets the email.
     */
    private String __Email;

    public String getEmail()
    {
        return __Email;
    }

    public void setEmail( String value )
    {
        __Email = value;
    }

    /**
     * Gets or sets the country.
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
     * Gets or sets the language.
     */
    private String __Language;

    public String getLanguage()
    {
        return __Language;
    }

    public void setLanguage( String value )
    {
        __Language = value;
    }

}
