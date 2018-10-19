// -----------------------------------------------------------------------
// <copyright file="PartnerRelationship.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.relationships;

import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * This represents a relationship between two partners.
 */
public class PartnerRelationship
    extends ResourceBase
{
    /**
     * Gets or sets the partner identifier.
     * The partner identifier specifies tenant id of the partner who is
     * in the recipient (from) side of relationship.
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
     * Gets or sets the name of the partner who is in the recipient (from) side of the relationship.
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
     * Gets or sets the name of the partner who is in the recipient (from) side of the relationship.
     */
    private PartnerRelationshipType __RelationshipType;

    public PartnerRelationshipType getRelationshipType()
    {
        return __RelationshipType;
    }

    public void setRelationshipType( PartnerRelationshipType value )
    {
        __RelationshipType = value;
    }
    
    /**
     * Gets or sets MPN Id.
     */
    private String __MpnId;

    public String getMpnId()
    {
        return __MpnId;
    }

    public void setMpnId( String value )
    {
        __MpnId = value;
    }

    /**
     * Gets or sets the location of the partner.
     */
    private String __Location;

    public String getLocation()
    {
        return __Location;
    }

    public void setLocation( String value )
    {
        __Location = value;
    }

    /**
     * Gets or sets the state of the relationship.
     */
    private String __State;

    public String getState()
    {
        return __State;
    }

    public void setState( String value )
    {
        __State = value;
    }
}