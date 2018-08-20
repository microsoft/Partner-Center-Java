// -----------------------------------------------------------------------
// <copyright file="SkuCollectionByTargetSegmentOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Sku Collection operations implementation.
 */
public class SkuCollectionByTargetSegmentOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements ISkuCollectionByTargetSegment
{
    /**
     * Initializes a new instance of the {@link #SkuCollectionByTargetSegmentOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier for the product.
     * @param skuId                 Identifier for the SKU.
     * @param country               The country on which to base the product.
     * @param targetSegment         The target segment used for filtering the availabilities.
     */
    public SkuCollectionByTargetSegmentOperations( IPartner rootPartnerOperations, String productId, String country, String targetSegment )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>(productId, country, targetSegment) );

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        ParameterValidator.isValidCountryCode(country);

        if ( StringHelper.isNullOrWhiteSpace( targetSegment ) )
        {
            throw new IllegalArgumentException( "targetSegment must be set" );
        }
    }

    /***
     * Retrieves all the skus for the provided product and target segment.
     * 
     * @return: The SKUs for the provided product and target segment.
     */
    public ResourceCollection<Sku> get()
    {
        IPartnerServiceProxy<Sku, ResourceCollection<Sku>> partnerServiceProxy =
            new PartnerServiceProxy<Sku, ResourceCollection<Sku>>(
                new TypeReference<ResourceCollection<Sku>>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetSkus" ).getPath(),
                    this.getContext().getItem1() ) );

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSkus" ).getParameters().get( "Country" ),
                this.getContext().getItem2())); 

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetSkus" ).getParameters().get( "TargetSegment" ),
                this.getContext().getItem3()));   

        return partnerServiceProxy.get();
    }
}