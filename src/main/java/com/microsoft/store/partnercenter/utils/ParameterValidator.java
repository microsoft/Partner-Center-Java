// -----------------------------------------------------------------------
// <copyright file="ParameterValidator.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utils;

public class ParameterValidator
{
    public static void isIntInclusive( int min, int max, int parameterValue, String errorMessage )
    {
        if ( parameterValue < min || max < parameterValue )
        {
            throw new IllegalArgumentException( errorMessage );
        }
    }

    public static void isValidUriQueryValue( String string, String errorMessage )
    {
        if ( StringHelper.isEmptyOrContainsWhiteSpace( string ) )
        {
            throw new IllegalArgumentException( errorMessage );
        }
    }
    
    /**
     * Ensures that a given country code is valid.
     * @param countryCode The country code to validate.
     */
    public static void isValidCountryCode(String countryCode)
    {
        if ( StringHelper.isEmptyOrContainsWhiteSpace( countryCode ) )
        {
            throw new IllegalArgumentException( "Country can't be empty" );
        }
        else if ( countryCode.length() != 2 )
        {
            throw new IllegalArgumentException("Country has to be a 2 letter string");
        }
    }

}
