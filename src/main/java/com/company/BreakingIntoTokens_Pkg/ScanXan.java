package com.company.BreakingIntoTokens_Pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//Objects of type Scanner are useful for breaking down formatted input
//into tokens and translating individual tokens according to their data type.

class ScanXan
{
    private final String XANADU = "poem.txt";
    private final String US_NUMBERS = "usnumbers.txt";

    //read the individual words. default spearator in white space
    void TokenizeText() throws IOException
    {
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader(XANADU)));

            while (scanner.hasNext())
            {
                System.out.println(scanner.next());
            }
        }
        finally
        {
            if (scanner != null)
            {
                scanner.close(); //closing the underlying stream
            }
        }
    }

    void TokenizeDoubleText() throws IOException
    {
        Scanner scanner = null;
        double sum = 0;

        try
        {
            scanner = new Scanner(new BufferedReader(new FileReader(US_NUMBERS)));
            scanner.useLocale(Locale.US); //specify to Scanner what locale to use

            while(scanner.hasNext())
            {
                if (scanner.hasNextDouble())
                {
                    sum += scanner.nextDouble();
                }
                else
                {
                    scanner.next();
                }
            }
        }
        finally
        {
            if (scanner != null)
            {
                scanner.close();
            }
        }

        System.out.println(sum);
    }
}
