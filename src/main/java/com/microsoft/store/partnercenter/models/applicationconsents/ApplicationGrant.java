// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.applicationconsents;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApplicationGrant resource. Represents the grants which enabled consents for an application.
 */
public class ApplicationGrant
{
    /**
     * Gets or sets the enterprise application id.
     */
    @JsonProperty("enterpriseApplicationId")
    private String enterpriseApplicationId;

    public String getEnterpriseApplicationId()
    {
        return enterpriseApplicationId;
    }

    public void setEnterpriseApplicationId(String value)
    {
        enterpriseApplicationId = value;
    }

    /**
     * Gets or sets the scope.
     */
    @JsonProperty("scope")
    private String scope;

    public String getScope()
    {
        return scope;
    }

    public void setScope(String value)
    {
        scope = value;
    }
}
