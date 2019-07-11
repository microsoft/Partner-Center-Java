// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

/**
 *Represents the terms for an availability.
 */
public class AvailabilityTerm
{
    /**
     * The cancellation policies that can apply to this term.
     */
    private Iterable<CancellationPolicy> cancellationPolicies;

    /**
     * The description for the term.
     */
    private String description;

    /**
     * The ISO standard representation of this term's duration.
     */
    private String duration;

    /**
     * The renewal options.
     */
    private Iterable<RenewalOption> renewalOptions;

    /**
     * Gets the cancellation policies that can apply to this term.
     * 
     * @return The cancellation policies that can apply to this term.
     */
    public Iterable<CancellationPolicy> getCancellationPolicies()
    {
        return cancellationPolicies;
    }

    /**
     * Sets the cancellation policies that can apply to this term.
     * 
     * @param value The cancellation policies that can apply to this term.
     */
    public void setCancellationPolicies(Iterable<CancellationPolicy> value)
    {
        cancellationPolicies = value;
    }

    /**
     * Gets the description for the term.
     * 
     * @return The description for the term.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description for the term.
     * 
     * @param value The description for the term.
     */
    public void setDescription(String value)
    {
        description = value;
    }

    /**
     * Gets the ISO standard representation of this term's duration.
     * 
     * @return The ISO standard representation of this term's duration.
     */
    public String getDuration()
    {
        return duration;
    }

    /**
     * Sets the ISO standard representation of this term's duration.
     * 
     * @param value The ISO standard representation of this term's duration. 
     */
    public void setDuration(String value)
    {
        duration = value;
    }

    /**
     * Gets the renewal options.
     * 
     * @return The renewal options.
     */
    public Iterable<RenewalOption> getRenewalOptions()
    {
        return renewalOptions;
    }

    /**
     * Sets the renewal options.
     * 
     * @param value The renewal options.
     */
    public void setRenewalOptions(Iterable<RenewalOption> value)
    {
        renewalOptions = value;
    }
}