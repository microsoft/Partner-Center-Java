// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.usage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class defines the usage summary for a specific subscription.
 */
@JsonIgnoreProperties({ "lastModifiedDate", "id", "name" })
public class SubscriptionUsageSummary
    extends UsageSummaryBase
{
        /**
         * Gets or sets the Id of the subscription which this usage summary applies to.
         */
        private String __ResourceId;

        public String getResourceId()
        {
            return __ResourceId;
        }

        public void setResourceId( String value )
        {
            __ResourceId = value;
        }

        /**
         * Gets or sets the name of the subscription which this usage summary applies to.
         */
        private String __ResourceName;

        public String getResourceName()
        {
            return __ResourceName;
        }

        public void setResourceName( String value )
        {
            __ResourceName = value;
        }
}