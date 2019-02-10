package com.company;

public class Recursion
{
    public static void Run()
    {
        MAXIMUMRECURSIONNNNNNNNNNNNNNNNN(0);
    }

    public static void MAXIMUMRECURSIONNNNNNNNNNNNNNNNN(int depth)
    {
        try
        {
            MAXIMUMRECURSIONNNNNNNNNNNNNNNNN(depth + 1);

        }
        catch (StackOverflowError e)
        {
            System.err.println("Recursion depth on this system is " + depth + "." + e.getMessage());
        }
    }
}
