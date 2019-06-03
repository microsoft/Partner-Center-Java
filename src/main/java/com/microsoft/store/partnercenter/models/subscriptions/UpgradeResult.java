// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.subscriptions;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Represents the result of performing a subscription Upgrade
 */
public class UpgradeResult
    extends ResourceBase
{
    /**
     * Gets or sets the source subscription id.
     */
    private String __SourceSubscriptionId;

    public String getSourceSubscriptionId()
    {
        return __SourceSubscriptionId;
    }

    public void setSourceSubscriptionId(String value)
    {
        __SourceSubscriptionId = value;
    }

    /**
     * Gets or sets the target subscription id.
     */
    private String __TargetSubscriptionId;

    public String getTargetSubscriptionId()
    {
        return __TargetSubscriptionId;
    }

    public void setTargetSubscriptionId(String value)
    {
        __TargetSubscriptionId = value;
    }

    /**
     * Gets or sets the type of upgrade.
     */
    private UpgradeType __UpgradeType;

    public UpgradeType getUpgradeType()
    {
        return __UpgradeType;
    }

    public void setUpgradeType(UpgradeType value)
    {
        __UpgradeType = value;
    }

    /**
     * Gets or sets the errors encountered while attempting to perform the upgrade, if applicable.
     */
    private Iterable<UpgradeError> __UpgradeErrors;

    public Iterable<UpgradeError> getUpgradeErrors()
    {
        return __UpgradeErrors;
    }

    public void setUpgradeErrors(Iterable<UpgradeError> value)
    {
        __UpgradeErrors = value;
    }

    /**
     * Gets or sets the errors encountered while attempting to migrate user licenses, if applicable.
     */
    private Iterable<UserLicenseError> __LicenseErrors;

    public Iterable<UserLicenseError> getLicenseErrors()
    {
        return __LicenseErrors;
    }

    public void setLicenseErrors(Iterable<UserLicenseError> value)
    {
        __LicenseErrors = value;
    }

}
