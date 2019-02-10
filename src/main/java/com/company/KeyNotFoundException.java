package com.company;

class KeyNotFoundException extends Exception
{
    KeyNotFoundException()
    {

    }

    KeyNotFoundException(String msg)
    {
        super(msg);
    }

    KeyNotFoundException(String msg, Throwable cause)
    {
        super(msg, cause);
    }

}
