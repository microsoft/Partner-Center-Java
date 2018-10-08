// -----------------------------------------------------------------------
// <copyright file="OfferAddOnsOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;

/**
 * Implements offer add-ons behavior.
 */
public class OfferAddOnsOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IOfferAddOns
{
    /**
     * Initializes a new instance of the OfferAddOnsOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param offerId The offer Id to get its add on offers.
     * @param country The country on which to base the offer add-ons.
     */
    public OfferAddOnsOperations( IPartner rootPartnerOperations, String offerId, String country )
    {
        super( rootPartnerOperations, new Tuple<String, String>( offerId, country ) );

        ParameterValidator.isValidCountryCode(country);
    }

    /**
     * Retrieves the add-ons for the given offer.
     * 
     * @return The offer add-ons.
     */
    public ResourceCollection<Offer> get()
    {
        IPartnerServiceProxy<ResourceCollection<Offer>, ResourceCollection<Offer>> partnerServiceProxy =
            new PartnerServiceProxy<ResourceCollection<Offer>, ResourceCollection<Offer>>( 
                new TypeReference<ResourceCollection<Offer>>()
                {
                },
                this.getPartner(), 
                MessageFormat.format(
                    PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getPath(),
                    this.getContext().getItem1()));

        partnerServiceProxy.getUriParameters().add( 
            new KeyValuePair<String, String>( PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getParameters().get( "Country" ),
            this.getContext().getItem2() ) );

        return partnerServiceProxy.get();
    }

    /**
     * Retrieves a subset of offers for the provided country.
     * 
     * @param offset The starting index.
     * @param size The maximum number of offers to return.
     * @return The requested segment of the offers for the provided country.
     */
    @Override
    public ResourceCollection<Offer> get( int offset, int size )
    {
        ParameterValidator.isIntInclusive( 0, Integer.MAX_VALUE, offset, "offset has to be non-negative." );
        ParameterValidator.isIntInclusive( 1, Integer.MAX_VALUE, size, "size has to be positive." );
        IPartnerServiceProxy<Offer, ResourceCollection<Offer>> partnerServiceProxy =
            new PartnerServiceProxy<Offer, ResourceCollection<Offer>>( new TypeReference<ResourceCollection<Offer>>()
            {
            }, 
            this.getPartner(), 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getPath());

        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getParameters().get( "Country" ),
            this.getContext().getItem2() ) );
        
        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getParameters().get( "Offset" ),
            String.valueOf( offset ) ) );
       
        partnerServiceProxy.getUriParameters().add( new KeyValuePair<String, String>( 
            PartnerService.getInstance().getConfiguration().getApis().get( "GetOfferAddons" ).getParameters().get( "Size" ),
            String.valueOf( size ) ) );

        return partnerServiceProxy.get();
    }
}