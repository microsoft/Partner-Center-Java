// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.products;

/**
 * Represents a cancellation policy.
 */
public class CancellationPolicy  
{
    /**
     * The refund options that can apply to this cancellation policy.
     */
    private Iterable<CancellationRefundOption> refundOption;

    /**
     * Gets the refund options that can apply to this cancellation policy.
     * 
     * @return The refund options that can apply to this cancellation policy.
     */
    public Iterable<CancellationRefundOption> getRefundOptions()
    {
        return refundOption;
    }

    /**
     * Sets the refund options that can apply to this cancellation policy.
     * 
     * @param value The refund options that can apply to this cancellation policy.
     */
    public void setRefundOptions(Iterable<CancellationRefundOption> value)
    {
        refundOption = value;
    }
}