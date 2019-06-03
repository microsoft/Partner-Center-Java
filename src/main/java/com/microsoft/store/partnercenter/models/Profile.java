// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String value)
    {
        id = value;
    }

    /**
     * Gets or sets the email.
     */
    private String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String value)
    {
        email = value;
    }

    /**
     * Gets or sets the country.
     */
    private String country;

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String value)
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

    public void setRegion(String value)
    {
        region = value;
    }

    /**
     * Gets or sets the language.
     */
    private String language;

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String value)
    {
        language = value;
    }
}