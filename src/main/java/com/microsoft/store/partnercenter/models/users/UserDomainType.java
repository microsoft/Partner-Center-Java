//-----------------------------------------------------------------------
//<copyright file="UserDomainType.java" company="Microsoft">
//   Copyright (c) Microsoft Corporation. All rights reserved.
//</copyright>
//-----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.users;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Types of user domains supported.
 */
public enum UserDomainType 
{
	/**
	  * Default - None.
	  */
	 @JsonProperty("none")
	 NONE,

	 /**
	  * Password sync directories support mixed mode 
	  * i.e. users that are cloud only or directory synced from an on premises directory.
	  */
	 @JsonProperty("managed")
	 MANAGED,

	 /**
	  * Federated domains don’t support mixed mode. 
	  * Users created have to be linked to an on premises directory account 
	  * with their immutable ids.
	  */
	 @JsonProperty("federated")
	 FEDERATED
}