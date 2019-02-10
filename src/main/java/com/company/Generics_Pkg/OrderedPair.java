package com.company.Generics_Pkg;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OrderedPair<K, V> implements  IPair<K, V>
{
    private K key;
    private V value;

    OrderedPair(K _key, V _value)
    {
        this.key = _key;
        this.value = _value;
    }

    @Override
    public K getKey()
    {
        return key;
    }

    @Override
    public V getValue()
    {
        return value;
    }

    //iterator for key
    //not working
    /*class OrderPairIterator implements Iterator<K>
    {
        int current = 0; //current element


        public boolean hasNext()
        {
            if (current < OrderedPair.this.key.length)
                return true;
            else
                return false;
        }

        public K next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            return key[current++];
        }

        public Iterator<K> iterator()
        {
            return
        }*/

    //}
}

