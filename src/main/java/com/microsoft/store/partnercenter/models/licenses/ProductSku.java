// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for product details.
 */
public class ProductSku {
    /**
     * Gets or sets the product id for the product SKU.
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

    /**
     * Gets or sets a localized display name for the product SKU.
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
     * Gets or sets a SKU part number name for the product.
     * For example, for Office 365 Plan E3 , this value is "EnterprisePack".
     * This can be used in place of Id if the id is not available.
     */
    @JsonProperty("skuPartNumber")
    private String __SkuPartNumber;

    public String getSkuPartNumber()
    {
        return __SkuPartNumber;
    }

    public void setSkuPartNumber(String value)
    {
    	__SkuPartNumber = value;
    }

    /**
     * Gets or sets the target type of a product.
     * It can be used to filter products which are applicable to user or tenant.
     * For example, if we need to know all products applicable to user , we can filter where target type == "User".
     */
    @JsonProperty("TargetType")
    private String __TargetType;

    public String getTargetType()
    {
        return __TargetType;
    }

    public void setTargetType(String value)
    {
    	__TargetType = value;
    }

    /**
     * Gets or sets the group id of a license. For example 'Windows 10 Enterprise E3'
     * is managed through Group1.
     */
    @JsonProperty("LicenseGroupId")
    private LicenseGroupId __LicenseGroupId;

    public LicenseGroupId getLicenseGroupId()
    {
        return __LicenseGroupId;
    }

    public void setLicenseGroupId(LicenseGroupId value)
    {
    	__LicenseGroupId = value;
    }
}