// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordProfile {
    /**
     * Gets or sets a value indicating whether force change password on first login is required or not.
     */
	@JsonProperty("ForceChangePassword")
	private boolean __ForceChangePassword;
    
    public boolean getForceChangePassword()
    {
        return __ForceChangePassword;
    }

    public void setForceChangePassword(boolean value)
    {
    	__ForceChangePassword = value;
    }


    /**
     * Gets or sets the password.
     */
    @JsonProperty("Password")
    private String __Password;
    
    public String getPassword()
    {
        return __Password;
    }

    public void setPassword(String value)
    {
    	__Password = value;
    }
    
}
