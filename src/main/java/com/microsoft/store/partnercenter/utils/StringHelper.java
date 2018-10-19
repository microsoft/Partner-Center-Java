// -----------------------------------------------------------------------
// <copyright file="StringHelper.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.microsoft.store.partnercenter.exception.PartnerException;

public class StringHelper
{
    public static String fromInputStream( InputStream is )
    {
        return StringHelper.fromInputStream( is, "UTF-16" );
    }

    public static String fromInputStream( InputStream is, String encoding )
    {
        if ( is == null )
        {
            return "";
        }
        BufferedReader bufferedReader;
        try
        {
            bufferedReader = new BufferedReader( new InputStreamReader( is, encoding ) );
        }
        catch ( UnsupportedEncodingException e )
        {
            throw new PartnerException( "Incorrect character encoding", e );
        }
        StringBuilder stringBuilder = new StringBuilder();
        String newLine = System.getProperty( "line.separator" );
        String line;
        try
        {
            while ( ( line = bufferedReader.readLine() ) != null )
            {
                stringBuilder.append( line );
                stringBuilder.append( newLine );
            }
            is.close();
            bufferedReader.close();
        }
        catch ( IOException e )
        {
            throw new PartnerException( "Error trying to obtain the response content body", e );
        }
        return stringBuilder.toString();
    }

    public static boolean isNullOrEmpty( String string )
    {
        return string == null || string.isEmpty();
    }

    public static boolean isNullOrWhiteSpace( String string )
    {
        return string == null || string.isEmpty() || isWhiteSpace( string );
    }

    public static boolean isEmptyOrContainsWhiteSpace( String string )
    {
        return string == null || string.isEmpty() || containsWhiteSpace( string );
    }

    private static boolean isWhiteSpace( String string )
    {
        int length = string.length();
        if ( length > 0 )
        {
            for ( int i = 0; i < length; i++ )
            {
                if ( !Character.isWhitespace( string.charAt( i ) ) )
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean containsWhiteSpace( String string )
    {
        int length = string.length();
        if ( length > 0 )
        {
            for ( int i = 0; i < length; i++ )
            {
                if ( Character.isWhitespace( string.charAt( i ) ) )
                {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

}
