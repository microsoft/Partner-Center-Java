// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

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
    private String userName;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String value )
    {
        userName = value;
    }

    /**
     * Gets or sets the password.
     */
    private String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String value )
    {
        password = value;
    }
}