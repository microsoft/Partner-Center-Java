// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.servicerequests;

/**
 * Represents a File Information
 */
public class FileInfo
{
    /**
     * Gets or sets the comment associated with a File Link Upload.
     */
    private String __Comment;

    public String getComment()
    {
        return __Comment;
    }

    public void setComment( String value )
    {
        __Comment = value;
    }

    /**
     * Gets or sets File Extension.
     */
    private String __FileExtension;

    public String getFileExtension()
    {
        return __FileExtension;
    }

    public void setFileExtension( String value )
    {
        __FileExtension = value;
    }

    /**
     * Gets or sets File Name.
     */
    private String __FileNameWithoutExtension;

    public String getFileNameWithoutExtension()
    {
        return __FileNameWithoutExtension;
    }

    public void setFileNameWithoutExtension( String value )
    {
        __FileNameWithoutExtension = value;
    }

    /**
     * Gets or sets File Size.
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

    /**
     * Gets or sets the File Identifier.
     */
    private String __Id;

    public String getId()
    {
        return __Id;
    }

    public void setId( String value )
    {
        __Id = value;
    }

}
