// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 *Represents a form of support contact for a customer's subscription.
 */
public class SupportContact
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the support tenant id.
     */
    private String __SupportTenantId;

    public String getSupportTenantId()
    {
        return __SupportTenantId;
    }

    public void setSupportTenantId( String value )
    {
        __SupportTenantId  = value;
    }

    /**
     * Gets or sets the support MPN id.
     */
    private String __SupportMpnId;

    public String getSupportMpnId()
    {
        return __SupportMpnId;
    }

    public void setSupportMpnId( String value )
    {
        __SupportMpnId = value;
    }

    /**
     * Gets or sets the name.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
        __Name = value;
    }
}