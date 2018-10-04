// -----------------------------------------------------------------------
// <copyright file="OfferOperations.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.offers;

import java.text.MessageFormat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.store.partnercenter.BasePartnerComponent;
import com.microsoft.store.partnercenter.IPartner;
import com.microsoft.store.partnercenter.PartnerService;
import com.microsoft.store.partnercenter.models.offers.Offer;
import com.microsoft.store.partnercenter.models.utils.KeyValuePair;
import com.microsoft.store.partnercenter.models.utils.Tuple;
import com.microsoft.store.partnercenter.network.IPartnerServiceProxy;
import com.microsoft.store.partnercenter.network.PartnerServiceProxy;
import com.microsoft.store.partnercenter.utils.ParameterValidator;
import com.microsoft.store.partnercenter.utils.StringHelper;

/**
 * Single offer operations implementation.
 */
public class OfferOperations
    extends BasePartnerComponent<Tuple<String, String>>
    implements IOffer
{
    /**
     * The offer add on operations.
     */
    private IOfferAddOns addOns;

    /**
     * Initializes a new instance of the OfferOperations class.
     * 
     * @param rootPartnerOperations The root partner operations instance.
     * @param offerId The offer Id.
     * @param country The country on which to base the offer.
     */
    public OfferOperations( IPartner rootPartnerOperations, String offerId, String country )
    {
        super( rootPartnerOperations, new Tuple<String, String>( offerId, country ) );
        
        if ( StringHelper.isEmptyOrContainsWhiteSpace( offerId ) )
        {
            throw new IllegalArgumentException( "offerId has to be set." );
        }

        ParameterValidator.isValidCountryCode( country );
        
        this.addOns = new OfferAddOnsOperations( rootPartnerOperations, offerId, country );
    }

    /**
     * Gets the operations for the current offer's add-ons.
     */
    public IOfferAddOns getAddOns()
    {
        return this.addOns;
    }

    /**
     * Retrieves the offer details.
     * 
     * @param country The country.
     * @return The offer details.
     */
    public Offer get()
    {
        IPartnerServiceProxy<Offer, Offer> partnerServiceProxy =
            new PartnerServiceProxy<Offer, Offer>(
                 new TypeReference<Offer>()
                {
                }, 
                this.getPartner(), MessageFormat.format( 
                    PartnerService.getInstance().getConfiguration().getApis().get( "GetOffer" ).getPath(),
                    this.getContext().getItem1()) );

        partnerServiceProxy.getUriParameters().add( 
            new KeyValuePair<String, String>( 
                PartnerService.getInstance().getConfiguration().getApis().get( "GetOffers" ).getParameters().get( "Country" ),
                this.getContext().getItem2() ) );

        return partnerServiceProxy.get();
    }
}