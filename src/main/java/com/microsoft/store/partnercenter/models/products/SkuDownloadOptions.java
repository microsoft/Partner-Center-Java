// -----------------------------------------------------------------------
// <copyright file="SkuDownloadOptions.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.products;

/**
 * Class that represents a sku download option.
 */
public class SkuDownloadOptions
{
    /**
     * Gets or sets the option key.
     */
    private String __OptionKey;

    public String getOptionKey()
    {
        return __OptionKey;
    }

    public void setOptionKey( String value )
    {
        __OptionKey = value;
    }

    /**
     * Gets or sets the option title.
     */
    private String __OptionTitle;

    public String getOptionTitle()
    {
        return __OptionTitle;
    }

    public void setOptionTitle( String value )
    {
        __OptionTitle = value;
    }

    /**
     * Gets or sets the display rank.
     */
    private int __DisplayRank;

    public int getDisplayRank()
    {
        return __DisplayRank;
    }

    public void setDisplayRank( int value )
    {
        __DisplayRank = value;
    }

    /**
     * Gets or sets the CPU and file type.
     */
    private String __CPUandFileType;

    public String getCPUandFileType()
    {
        return __CPUandFileType;
    }

    public void setCPUandFileType( String value )
    {
        __OptionTitle = value;
    }

    /**
     *  Gets or sets the language code.
     */
    private String __LanguageCode;

    public String getLanguageCode()
    {
        return __LanguageCode;
    }

    public void setLanguageCode( String value )
    {
        __LanguageCode = value;
    }

    /**
     *  Gets or sets the language display name.
     */
    private String __LanguageName;

    public String getLanguageName()
    {
        return __LanguageName;
    }

    public void setLanguageName( String value )
    {
        __LanguageCode = value;
    }

    /**
     *  Gets or sets the file size in bytes.
     */
    private long __FileSize;

    public long getFileSize()
    {
        return __FileSize;
    }

    public void setFileSize( long value )
    {
        __FileSize = value;
    }
}