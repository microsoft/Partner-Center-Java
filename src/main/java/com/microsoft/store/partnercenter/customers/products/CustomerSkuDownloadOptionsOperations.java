// -----------------------------------------------------------------------
// <copyright file="CustomerSkuDownloadOptionsOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.SkuDownloadOptions;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.products.ISkuDownloadOptions;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Implementation of customer SKU download options operations.
 */
public class CustomerSkuDownloadOptionsOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements ISkuDownloadOptions
{
    /**
     * Initializes a new instance of the CustomerSkuDownloadOptionsOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer id for which to retrieve the download options.
     * @param productId The product id for which to retrieve the download options.
     * @param skuId The sku id for which to retrieve its download options.
     */
    public CustomerSkuDownloadOptionsOperations( IPartner rootPartnerOperations, String customerId, String productId, String skuId )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>( customerId, productId, skuId ) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( skuId ) )
        {
            throw new IllegalArgumentException( "skuId must be set" );
        }
    }

    /**
     * Retrieves all download options for the provided SKU
     * 
     * @return The SKU download options
     */
    @Override
    public ResourceCollection<SkuDownloadOptions> get()
    {
        IPartnerServiceProxy<SkuDownloadOptions, ResourceCollection<SkuDownloadOptions>> partnerServiceProxy =
        new PartnerServiceProxy<>( new TypeReference<ResourceCollection<SkuDownloadOptions>>()
        {
        }, 
        this.getPartner(), 
        MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSkuDownloadOptions" ).getPath(),
            this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3() ) );

        return partnerServiceProxy.get();
    }
}