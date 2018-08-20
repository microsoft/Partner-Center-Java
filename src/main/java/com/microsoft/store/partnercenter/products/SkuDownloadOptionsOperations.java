// -----------------------------------------------------------------------
// <copyright file="SkuDownloadOptionsOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.SkuDownloadOptions;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * SKU download options operations implementation.
 */
public class SkuDownloadOptionsOperations 
    extends BasePartnerComponent<TripletTuple<String, String, String>> 
    implements ISkuDownloadOptions 
{
    /**
     * Initializes a new instance of the {@link #SkuDownloadOptionsOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier of the customer. 
     * @param skuId                 Identifier of the SKU.
     * @param availabilityId        Identifier of the availability.
     * @param country               The country on which to base the availability.
     */
    public SkuDownloadOptionsOperations(IPartner rootPartnerOperations, String productId, String skuId, String country)
    {
        super(rootPartnerOperations, new TripletTuple<String, String, String>(productId, skuId, country));

        if (StringHelper.isNullOrWhiteSpace(productId)) {
            throw new IllegalArgumentException("productId must be set");
        }

        if (StringHelper.isNullOrWhiteSpace(skuId)) {
            throw new IllegalArgumentException("skuId must be set");
        }
        
        ParameterValidator.isValidCountryCode(country);
    }

    /***
     * Retrieves all download options for the provided SKU
     * 
     * @return: The SKU download options
     */
    public ResourceCollection<SkuDownloadOptions> get()
    {
        IPartnerServiceProxy<SkuDownloadOptions, ResourceCollection<SkuDownloadOptions>> partnerServiceProxy = new PartnerServiceProxy<SkuDownloadOptions, ResourceCollection<SkuDownloadOptions>>(
            new TypeReference<ResourceCollection<SkuDownloadOptions>>() {
            }, this.getPartner(),
            MessageFormat.format(PartnerService.getInstance().getConfiguration().getApis().get("GetSkuDownloadOptions").getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2() ));

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSkuDownloadOptions" ).getParameters().get( "Country" ),
                this.getContext().getItem3()));          

        return partnerServiceProxy.get();
    }
}