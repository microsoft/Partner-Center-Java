// -----------------------------------------------------------------------
// <copyright file="LicenseUpdate.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.licenses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.store.partnercenter.models.ResourceBase;

/**
 * Model for assigning and removing licenses to user.
 */
public class LicenseUpdate extends ResourceBase {
    /**
     * Gets or sets the list of licenses to be assigned.
     */
	@JsonProperty( "LicensesToAssign" )
	private Iterable<LicenseAssignment> __LicensesToAssign;
    
    public Iterable<LicenseAssignment> getLicensesToAssign()
    {
        return __LicensesToAssign;
    }

    public void setLicensesToAssign( Iterable<LicenseAssignment> value )
    {
    	__LicensesToAssign = value;
    }

    /**
     * Gets or sets the list of license id's to be removed.
     */
    @JsonProperty( "LicensesToRemove" )
    private Iterable<String> __LicensesToRemove;
    
    public Iterable<String> getLicensesToRemove()
    {
        return __LicensesToRemove;
    }

    public void setLicensesToRemove( Iterable<String> value )
    {
    	__LicensesToRemove = value;
    }

    /**
     * Gets list of warnings that occurred during license assignment. This is a read only property.
     */
    @JsonProperty( "LicenseWarnings" )
    private Iterable<LicenseWarning> __LicenseWarnings;
    
    public Iterable<LicenseWarning> getLicenseWarnings()
    {
        return __LicenseWarnings;
    }

    @SuppressWarnings("unused")
	private void setLicenseWarnings( Iterable<LicenseWarning> value )
    {
    	__LicenseWarnings = value;
    }

}
