// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.partners;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;
import com.microsoft.store.partnercenter.models.StandardResourceLinks;

/**
 * Microsoft Partner Network profile of a partner
 */
public class MpnProfile
    extends ResourceBaseWithLinks<StandardResourceLinks>
{
    /**
     * Gets or sets the organization name.
     */
    private String __PartnerName;

    public String getPartnerName()
    {
        return __PartnerName;
    }

    public void setPartnerName(String value)
    {
        __PartnerName = value;
    }

    /**
     * Gets or sets the Microsoft Partner Network Id
     */
    private String __MpnId;

    public String getMpnId()
    {
        return __MpnId;
    }

    public void setMpnId(String value)
    {
        __MpnId = value;
    }
}