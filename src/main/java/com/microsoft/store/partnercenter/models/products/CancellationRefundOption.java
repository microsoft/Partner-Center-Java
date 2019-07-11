// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

/**
 * Represents a refund policy.
 */
public class CancellationRefundOption  
{
    /**
     * The ISO standard representation of the duration allowed before this refund option expires.
     */
    private String expiresAfter;

    /**
     * The identifier that represents the position of this refund option (relative to other sibling refund options).
     */
    private String sequenceId;

    /**
     * The type of refund (full or partial).
     */
    private String type;

    /**
     * Gets the ISO standard representation of the duration allowed before this refund option expires..
     * 
     * @return The ISO standard representation of the duration allowed before this refund option expires.
     */
    public String getExpiresAfter()
    {
        return expiresAfter;
    }

    /**
     * Sets the ISO standard representation of the duration allowed before this refund option expires.
     * 
     * @param value The ISO standard representation of the duration allowed before this refund option expires.
     */
    public void setExpiresAfter(String value)
    {
        expiresAfter = value;
    }

    /**
     * Gets the identifier that represents the position of this refund option (relative to other sibling refund options).
     * 
     * @return The identifier that represents the position of this refund option (relative to other sibling refund options).
     */
    public String getSequenceId()
    {
        return sequenceId; 
    }

    /**
     * Sets the identifier that represents the position of this refund option (relative to other sibling refund options).
     * 
     * @param value The identifier that represents the position of this refund option (relative to other sibling refund options).
     */
    public void setSequenceId(String value)
    {
        sequenceId = value;
    }
    
    /**
     * Gets the type of refund (full or partial).
     * 
     * @return The type of refund (full or partial).
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the type of refund (full or partial).
     * 
     * @param value The type of refund (full or partial).
     */
    public void setType(String value)
    {
        type = value;
    }
}