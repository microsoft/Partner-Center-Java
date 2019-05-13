// -----------------------------------------------------------------------
// <copyright file="ApiFault.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents API failures.
 */
 @JsonIgnoreProperties(ignoreUnknown = true)
public class ApiFault
    extends ResourceBase
{
    /**
     * The error code returned by the API.
     */
    @JsonProperty("code")    
    private String errorCode;
    
    /**
     * Additional fault information regarding the error.
     */
    @JsonProperty("data")
    private Iterable<Object> errorData;

    /**
     * The error message returned by the API.
     */
    @JsonProperty("description")    
    private String errorMessage;

    /**
     * Initializes a new instance of the ApiFault class.
     */
    protected ApiFault()
    {
        super();
    }

    /**
     * Gets the error code.
     * 
     * @return The error code.
     */
    public String getErrorCode()
    {
        return errorCode;
    }

    /**
     * Sets the error code.
     * 
     * @param value The error code.
     */
    public void setErrorCode(String value)
    {
        errorCode = value;
    }

    /**
     * Gets the error message.
     * 
     * @return The error message.
     */
    public String getErrorMessage()
    {
        return errorMessage;
    }

    /**
     * Sets the error message.
     * 
     * @param value The error message.
     */
    public void setErrorMessage(String value)
    {
        errorMessage = value;
    }

    /**
     * Gets the additional fault information if present.
     * 
     * @return The additional fault information if present.
     */
    public Iterable<Object> getErrorData()
    {
        return errorData;
    }

    /**
     * Sets the additional fault information. 
     * 
     * @param value The additional fault information.
     */
    public void setErrorData(Iterable<Object> value)
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

        apiFaultDescription.append("Error code: " + this.getErrorCode() + "\n");
        apiFaultDescription.append("Error message: " + this.getErrorMessage() + "\n");

        if (this.getErrorData() != null)
        {
            apiFaultDescription.append("Error data:\n");

            for (Object errorData : this.getErrorData())
            {
                if (errorData != null)
                {
                    apiFaultDescription.append(errorData + "\n");
                }
            }
        }

        apiFaultDescription.append(super.toString() + "\n");
        return apiFaultDescription.toString();
    }
}