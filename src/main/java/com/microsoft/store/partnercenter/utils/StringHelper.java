// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.microsoft.store.partnercenter.exception.PartnerException;

public class StringHelper
{
    public static String fromInputStream(InputStream is)
    {
        return StringHelper.fromInputStream(is, "UTF-16");
    }

    public static String fromInputStream(InputStream is, String encoding)
    {
        BufferedReader bufferedReader;

        if (is == null)
        {
            return "";
        }

        try
        {
            bufferedReader = new BufferedReader(new InputStreamReader(is, encoding));
        }
        catch (UnsupportedEncodingException e)
        {
            throw new PartnerException("Incorrect character encoding", e);
        }

        StringBuilder stringBuilder = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        String line;

        try
        {
            while ((line = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(line);
                stringBuilder.append(newLine);
            }
        }
        catch (IOException e)
        {
            throw new PartnerException("Error trying to obtain the response content body", e);
        }
        finally 
        {
			try { if(bufferedReader != null) bufferedReader.close(); } catch (IOException ex) { throw new PartnerException("There was an issue closing the buffer reader.", ex); }
			try { if(is != null) is.close(); } catch (IOException ex) { throw new PartnerException("There was an issue closing the stream.", ex); }
        }

        return stringBuilder.toString();
    }

    public static boolean isNullOrEmpty(String string)
    {
        return string == null || string.isEmpty();
    }

    public static boolean isNullOrWhiteSpace(String string)
    {
        return string == null || string.isEmpty() || isWhiteSpace(string);
    }

    public static boolean isEmptyOrContainsWhiteSpace(String string)
    {
        return string == null || string.isEmpty() || containsWhiteSpace(string);
    }

    private static boolean isWhiteSpace(String string)
    {
        int length = string.length();
        if (length > 0)
        {
            for (int i = 0; i < length; i++)
            {
                if (!Character.isWhitespace(string.charAt(i)))
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean containsWhiteSpace(String string)
    {
        int length = string.length();
        if (length > 0)
        {
            for (int i = 0; i < length; i++)
            {
                if (Character.isWhitespace(string.charAt(i)))
                {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}