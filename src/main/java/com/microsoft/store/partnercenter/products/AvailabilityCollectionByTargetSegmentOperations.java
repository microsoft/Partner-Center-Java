// -----------------------------------------------------------------------
// <copyright file="AvailabilityCollectionByTargetSegmentOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.products.Availability;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.QuadrupleTuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Availabilities implementation class.
 */
public class AvailabilityCollectionByTargetSegmentOperations
    extends BasePartnerComponent<QuadrupleTuple<String, String, String, String>>
    implements IAvailabilityCollectionByTargetSegment
{
    /**
     * Initializes a new instance of the {@link #AvailabilityCollectionByTargetSegmentOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier for the product.
     * @param skuId                 Identifier for the SKU.
     * @param country               The country on which to base the product.
     * @param targetSegment         The target segment used for filtering the availabilities.
     */
    public AvailabilityCollectionByTargetSegmentOperations( IPartner rootPartnerOperations, String productId, String skuId, String country, String targetSegment )
    {
        super( rootPartnerOperations, new QuadrupleTuple<String, String, String, String>(productId, skuId, country, targetSegment) );

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( skuId ) )
        {
            throw new IllegalArgumentException( "skuId must be set" );
        }

        ParameterValidator.isValidCountryCode(country);

        if ( StringHelper.isNullOrWhiteSpace( targetSegment ) )
        {
            throw new IllegalArgumentException( "targetSegment must be set" );
        }
    }

    /***
     * Retrieves all the availabilities for the provided SKU on a specific target segment.
     * 
     * @return: The availability for the provided SKU on a specific target segment.
     */
    public ResourceCollection<Availability> get()
    {
        IPartnerServiceProxy<Availability, ResourceCollection<Availability>> partnerServiceProxy =
            new PartnerServiceProxy<Availability, ResourceCollection<Availability>>(
                new TypeReference<ResourceCollection<Availability>>()
                {
                }, 
                this.getPartner(), 
                MessageFormat.format( PartnerService.getInstance().getConfiguration().getApis().get( "GetAvailabilities" ).getPath(),
                    this.getContext().getItem1(), this.getContext().getItem2() ) );

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetAvailabilities" ).getParameters().get( "Country" ),
                this.getContext().getItem3())); 

        partnerServiceProxy.getUriParameters().add(
            new KeyValuePair<String, String>(
                PartnerService.getInstance().getConfiguration().getApis().get( "GetAvailabilities" ).getParameters().get( "TargetSegment" ),
                this.getContext().getItem4()));   

        return partnerServiceProxy.get();
    }
}