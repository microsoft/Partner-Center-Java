// -----------------------------------------------------------------------
// <copyright file="ManagedService.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.managedservices;

import com.microsoft.store.partnercenter.models.ResourceBaseWithLinks;

/**
 * Partner managed services (AOBO links) for customers
 */
public class ManagedService
    extends ResourceBaseWithLinks<ManagedServiceLinks>
{
    /**
     * Initializes a new instance of the ManagedService class.
     */
    public ManagedService()
    {
        this.setLinks( new ManagedServiceLinks() );
    }

    /**
     * Gets or sets the identifier.
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

    /**
     * Gets or sets the name.
     */
    private String __Name;

    public String getName()
    {
        return __Name;
    }

    public void setName( String value )
    {
        __Name = value;
    }

    /**
     * Gets or sets the name of the group.
     */
    private String __GroupName;

    public String getGroupName()
    {
        return __GroupName;
    }

    public void setGroupName( String value )
    {
        __GroupName = value;
    }

    /**
     * Gets or sets the links.
     */
    private ManagedServiceLinks __Links;

    @Override
    public ManagedServiceLinks getLinks()
    {
        return __Links;
    }

    @Override
    public void setLinks( ManagedServiceLinks value )
    {
        __Links = value;
    }
}