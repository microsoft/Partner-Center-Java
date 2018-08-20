// -----------------------------------------------------------------------
// <copyright file="UserCredentials.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * UserName and Password Credentials
 */
public class UserCredentials
{
    public UserCredentials()
    {
    }

    /**
     * Gets or sets the name of the user.
     */
    private String __UserName;

    public String getUserName()
    {
        return __UserName;
    }

    public void setUserName( String value )
    {
        __UserName = value;
    }

    /**
     * Gets or sets the password.
     */
    private String __Password;

    public String getPassword()
    {
        return __Password;
    }

    public void setPassword( String value )
    {
        __Password = value;
    }

}
