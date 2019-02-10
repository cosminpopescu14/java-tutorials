package com.company.IO_Pkg;

import java.io.IOException;

public class IORunner
{
    public static void Run() throws IOException, InterruptedException
    {
        IO.CopyBytes();
        System.out.println("Sleeping...");
        Thread.sleep(2000);
        System.out.println("Woken up...");
        IO.CopyCharacters();
    }
}
