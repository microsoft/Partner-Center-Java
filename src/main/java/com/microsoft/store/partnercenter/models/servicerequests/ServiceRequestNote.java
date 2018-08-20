// -----------------------------------------------------------------------
// <copyright file="ServiceRequestNote.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.servicerequests;

import org.joda.time.DateTime;

/**
 * Represents a Service Request Note class
 */
public class ServiceRequestNote
{
    /**
     * Gets or sets the name of the creator of the Note.
     */
    private String __CreatedByName;

    public String getCreatedByName()
    {
        return __CreatedByName;
    }

    public void setCreatedByName( String value )
    {
        __CreatedByName = value;
    }

    /**
     * Gets or sets the create date time of the Note.
     */
    private DateTime __CreatedDate;

    public DateTime getCreatedDate()
    {
        return __CreatedDate;
    }

    public void setCreatedDate( DateTime value )
    {
        __CreatedDate = value;
    }

    /**
     * Gets or sets the text of the Note.
     */
    private String __Text;

    public String getText()
    {
        return __Text;
    }

    public void setText( String value )
    {
        __Text = value;
    }

}
