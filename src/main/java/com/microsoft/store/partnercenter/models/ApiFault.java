// -----------------------------------------------------------------------
// <copyright file="ApiFault.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

/**
 * Represents API failures.
 */
public class ApiFault
    extends ResourceBase
{
    protected ApiFault()

    {
        super();
    }

    protected ApiFault( String objectType )

    {
        super( objectType );
    }

    /**
     * Gets or sets the error code.
     */
    private String errorCode;

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode( String value )
    {
        errorCode = value;
    }

    /**
     * Gets or sets the error message.
     */
    private String errorMessage;

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage( String value )
    {
        errorMessage = value;
    }

    /**
     * Gets or sets the error data.
     */
    private Iterable<Object> errorData;

    public Iterable<Object> getErrorData()
    {
        return errorData;
    }

    public void setErrorData( Iterable<Object> value )
    {
        errorData = value;
    }

    /**
     * Returns a meaningful summary about the API fault.
     * 
     * @return The API fault summary.
     */
    public String toString()
    {
        StringBuilder apiFaultDescription = new StringBuilder();
        apiFaultDescription.append( "Error code: " + this.getErrorCode() + "\n" );
        apiFaultDescription.append( "Error message: " + this.getErrorMessage() + "\n" );
        if ( this.getErrorData() != null )
        {
            apiFaultDescription.append( "Error data:\n" );
            for ( Object errorData : this.getErrorData() )
            {
                if ( errorData != null )
                {
                    apiFaultDescription.append( errorData.toString() + "\n" );
                }

            }
        }

        apiFaultDescription.append( super.toString() + "\n" );
        return apiFaultDescription.toString();
    }
}