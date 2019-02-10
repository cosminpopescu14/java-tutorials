package com.company;

public class LoadDotNetLib
{
    static
    {
        try {
            System.load("C:\\Users\\EOPPINO\\source\\repos\\Lib\\Lib\\bin\\Debug\\Lib.dll");

        }
        catch (UnsatisfiedLinkError e)
        {
            System.err.println("Native code library failed to load.\n" + e);
        }

    }
}
