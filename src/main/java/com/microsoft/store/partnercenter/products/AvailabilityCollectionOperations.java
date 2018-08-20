// -----------------------------------------------------------------------
// <copyright file="AvailabilityCollectionOperations.java" company="Microsoft">
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
import com.microsoft.store.partnercenter.models.utils.TripletTuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Availabilities implementation class
 */
public class AvailabilityCollectionOperations
    extends BasePartnerComponent<TripletTuple<String, String, String>>
    implements IAvailabilityCollection
{
    /**
     * Initializes a new instance of the {@link #AvailabilityCollectionOperations} class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param productId             Identifier for the product.
     * @param skuId                 Identifier for the SKU.
     * @param country               The country on which to base the product.
     */
    public AvailabilityCollectionOperations( IPartner rootPartnerOperations, String productId, String skuId, String country )
    {
        super( rootPartnerOperations, new TripletTuple<String, String, String>(productId, skuId, country) );

        if ( StringHelper.isNullOrWhiteSpace( productId ) )
        {
            throw new IllegalArgumentException( "productId must be set" );
        }

        if ( StringHelper.isNullOrWhiteSpace( skuId ) )
        {
            throw new IllegalArgumentException( "skuId must be set" );
        }

        ParameterValidator.isValidCountryCode(country);
    }

    /***
     * Retrieves the operations tied with a specific availability.
     * 
     * @param availabilityId Identifier for the availability.
     * @return: The availability operations.
     */    
    public IAvailability byId( String availabilityId )
    {
        return new AvailabilityOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), availabilityId, this.getContext().getItem3());
    }

    /***
     * Retrieves the operations that can be applied on availabilities filtered by a specific target segment.
     * 
     * @param targetSegment The availability segment filter.
     * @return: The availability collection operations by target segment.
     */    
    public IAvailabilityCollectionByTargetSegment byTargetSegment(String targetSegment)
    {
        return new AvailabilityCollectionByTargetSegmentOperations(this.getPartner(), this.getContext().getItem1(), this.getContext().getItem2(), this.getContext().getItem3(), targetSegment);
    }

    /***
     * Retrieves all the availabilities for the provided SKU.
     * 
     * @return: The availabilities for the provided SKU.
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

        return partnerServiceProxy.get();
    }
}