package com.company.GenericMethods_Pkg;

public class Pair <K, V>
{
    private K key;
    private V value;

    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key)
    {
        this.key = key;
    }

    K getKey()
    {
        return key;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    V getValue()
    {
        return value;
    }
}
