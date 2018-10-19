// -----------------------------------------------------------------------
// <copyright file="KeyValuePair.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation. All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.models.utils;

public class KeyValuePair<K, V>
{
    private K key;

    private V value;

    public KeyValuePair()
    {
    }

    public KeyValuePair( K key, V value )
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

}
