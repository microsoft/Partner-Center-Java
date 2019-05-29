// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.applicationconsents;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * The ApplicationConsent resource. Represents the enabled consents for an application.
 */
public class ApplicationConsent extends ResourceBase
{
    /**
     * Gets or sets the name of the application which enabled consents.
     */
    @JsonProperty("displayName")
    private String displayName;

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String value)
    {
        displayName = value;
    }

    /**
     * Gets or sets the identifier of the application which enabled consents.
     */
    @JsonProperty("applicationId")
    private String applicationId;

    public String getApplicationId()
    {
        return applicationId;
    }

    public void setApplicationId(String value)
    {
        applicationId = value;
    }

    /**
     * Gets or sets the grants of the application which enabled consents.
     */
    @JsonProperty("applicationGrants")
    private ApplicationGrant[] applicationGrants;

    public ApplicationGrant[] getApplicationGrants()
    {
        return applicationGrants;
    }

    public void setApplicationGrants(ApplicationGrant[] value)
    {
        applicationGrants = value;
    }
}
