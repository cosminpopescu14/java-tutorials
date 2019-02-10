package com.company.Exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ListOfNumbers
{
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers()
    {
        this.list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
        {
            this.list.add(i);
        }
    }

    //modifiy this method to allow compiling
    public void WriteList() /*throws java.io.IOException, IndexOutOfBoundsException*/
    {
        PrintWriter out = null;
        try
        {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("outfile.txt"));

            for (int i = 0; i < SIZE; i++)
            {
                out.println("Value at: " + i + " = " + list.get(i));
            }

        }
        catch (IndexOutOfBoundsException e)
        {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.err.println("Caught IOException: " + e.getMessage());
        }
        //or catch (IndexOutOfBoundsException | IOException). >java se 7
        finally
        {
            if (out != null)
            {
                System.out.println("closing PrintWriter");
                out.close();
            }
            else
            {
                System.out.println("PrintWriter not open");
            }
        }

    }
}
