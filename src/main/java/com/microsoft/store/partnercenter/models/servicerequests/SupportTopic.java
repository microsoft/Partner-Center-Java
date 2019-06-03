// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicerequests;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents a Service Request Support Topic Info class
 */
public class SupportTopic
    extends ResourceBase
{
    /**
     * Gets or sets the name of the support Topic
     */
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
     * Gets or sets the description of the support Topic
     */
    private String __Description;

    public String getDescription()
    {
        return __Description;
    }

    public void setDescription(String value)
    {
        __Description = value;
    }

    /**
     * Gets or sets the id of support Topic
     */
    private int __Id;

    public int getId()
    {
        return __Id;
    }

    public void setId(int value)
    {
        __Id = value;
    }

}
