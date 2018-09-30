//-----------------------------------------------------------------------
//<copyright file="UserState.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation.  All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * User state
 */
public enum UserState 
{
	 /***
	  * Active user.
	  */
	 @JsonProperty("active")
	 ACTIVE,

	 /***
	  * Inactive user.
	  */
	 @JsonProperty("inactive")
	 INACTIVE
}