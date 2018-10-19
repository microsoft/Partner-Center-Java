// -----------------------------------------------------------------------
// <copyright file="SkuCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
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
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * SKU Collection operations implementation.
 */
public class SkuCollectionOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements ISkuCollection
{
    /**
     * Initializes a new instance of the SkuCollectionOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier for the product.
     * @param country               The country on which to base the product.
     */
    public SkuCollectionOperations( IPartner rootPartnerOperations, String productId, String country )
    {
        super( rootPartnerOperations, new Tuple<String, String>(productId, country) );

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        ParameterValidator.isValidCountryCode(country);
    }

    /**
     * Retrieves the operations tied with a specific SKU.
     * 
     * @param skuId Identifier for the SKU.
     * @return The available SKU operations.
     */
    public ISku byId(String skuId)
    {
        return new SkuOperations(this.getPartner(), this.getContext().getItem1(), skuId, this.getContext().getItem2());
    }
    
    /**
     * Retrieves the operations that can be applied on SKUs that belong to a segment.
     * 
     * @param targetSegment The SKU segment filter.
     * @return The SKU collection operations by target segment.
     */
    public ISkuCollectionByTargetSegment byTargetSegment(String targetSegment)
    {
        return new SkuCollectionByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), targetSegment);
    }

    /**
     * Retrieves all the SKUs for the provided product.
     * 
     * @return The SKUs for the provided product.
     */
    public ResourceCollection<Sku> get()
    {
        IPartnerServiceProxy<Sku, ResourceCollection<Sku>> partnerServiceProxy =
            new PartnerServiceProxy<>(
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

        return partnerServiceProxy.get();
    }
}