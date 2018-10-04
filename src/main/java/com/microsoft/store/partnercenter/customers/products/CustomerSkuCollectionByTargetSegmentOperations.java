// -----------------------------------------------------------------------
// <copyright file="CustomerSkuCollectionOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.customers.products;

import com.fasterxml.jackson.core.type.TypeReference;
import java.text.MessageFormat;

import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.products.Sku;
import com.microsoft.store.partnercenter.products.ISkuCollectionByTargetSegment;
import com.microsoft.store.partnercenter.utils.StringHelper;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.TripletTuple;

/**
 * Implementation of customer sku collection operations by target segment.
 */
public class CustomerSkuCollectionByTargetSegmentOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements ISkuCollectionByTargetSegment
{
    /**
     * Initializes a new instance of the CustomerSkuCollectionByTargetSegmentOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param customerId The customer id for which to retrieve the SKUs.
     * @param productId The product id for which to retrieve its SKUs.
     */
    public CustomerSkuCollectionByTargetSegmentOperations( IPartner rootPartnerOperations, String customerId, String productId, String targetSegment )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>(customerId, productId, targetSegment) );

        if ( StringHelper.isNullOrWhiteSpace( customerId ) )
        {
            throw new IllegalArgumentException( "customerId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( targetSegment ) )
        {
            throw new IllegalArgumentException( "targetSegment must be set" );
        }
    }

    /**
     * Retrieves all the SKUs for the provided product.
     * 
     * @return The SKUs for the provided product.
     */
    @Override
    public ResourceCollection<Sku> get()
    {
        IPartnerServiceProxy<Sku, ResourceCollection<Sku>> partnerServiceProxy =
        new PartnerServiceProxy<Sku, ResourceCollection<Sku>>( new TypeReference<ResourceCollection<Sku>>()
        {
        }, 
        this.getPartner(), 
        MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSkus" ).getPath(),
            this.getContext().getItem1(), this.getContext().getItem2() ) );

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetCustomerSkus" ).getParameters().get( "TargetSegment" ),
            this.getContext().getItem3() ) );

        return partnerServiceProxy.get();
    }
}