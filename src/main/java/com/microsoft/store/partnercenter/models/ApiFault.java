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
    private String __ErrorCode;

    public String getErrorCode()
    {
        return __ErrorCode;
    }

    public void setErrorCode( String value )
    {
        __ErrorCode = value;
    }

    /**
     * Gets or sets the error message.
     */
    private String __ErrorMessage;

    public String getErrorMessage()
    {
        return __ErrorMessage;
    }

    public void setErrorMessage( String value )
    {
        __ErrorMessage = value;
    }

    /**
     * Gets or sets the error data.
     */
    private Iterable<Object> __ErrorData;

    public Iterable<Object> getErrorData()
    {
        return __ErrorData;
    }

    public void setErrorData( Iterable<Object> value )
    {
        __ErrorData = value;
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