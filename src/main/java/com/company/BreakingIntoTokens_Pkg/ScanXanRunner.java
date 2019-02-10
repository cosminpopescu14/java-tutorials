package com.company.BreakingIntoTokens_Pkg;

import java.io.IOException;

public class ScanXanRunner
{
    public static void Run() throws IOException
    {
        var scan = new ScanXan();

        scan.TokenizeText();
        System.out.println("***********************");
        scan.TokenizeDoubleText();
    }
}
