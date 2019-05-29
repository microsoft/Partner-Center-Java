// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.models.serviceincidents;

import org.joda.time.DateTime;

/**
 * Represents the message history for service incident. *
 */
public class ServiceIncidentHistory
{
	/**
	 * Gets or sets the published time.
	 */
    private DateTime __PublishedTime;

	/**
	 * @return the __PublishedTime
	 */
	public DateTime getPublishedTime() {
		return __PublishedTime;
	}

	/**
	 * @param __PublishedTime the __PublishedTime to set
	 */
	public void setPublishedTime(DateTime __PublishedTime) {
		this.__PublishedTime = __PublishedTime;
	}

    /**
     * Gets or sets the Message text.
     */
    private String __MessageText;

	/**
	 * @return the __MessageText
	 */
	public String getMessageText() {
		return __MessageText;
	}

	/**
	 * @param __MessageText the __MessageText to set
	 */
	public void setMessageText(String __MessageText) {
		this.__MessageText = __MessageText;
	}
}
