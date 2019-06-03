// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.roles;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a customer directory role object.
 */
public class DirectoryRole extends ResourceBase {
    /**
     * Gets or sets the name of the directory role.
     */
	@JsonProperty("name")
    private String __Name;
    
    public String getName()
    {
    	return __Name;
    }

    public void setName(String value)
    {
    	__Name = value;
    }

    /**
     * Gets or sets the id of the directory role.
     */
	@JsonProperty("id")
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId(String value)
    {
    	__Id = value;
    }

}
