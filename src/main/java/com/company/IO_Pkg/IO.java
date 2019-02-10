package com.company.IO_Pkg;

import java.io.*;

class IO
{
    static void CopyBytes() throws IOException
    {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try
        {
            inputStream = new FileInputStream("poem.txt");
            outputStream = new FileOutputStream("output.txt");
            int c;
            while ((c = inputStream.read()) != -1)
            {
                outputStream.write(c);
            }
        }

        finally
        {
            if (inputStream != null && outputStream != null)
            {
                inputStream.close();
                outputStream.close();
            }
        }

    }

    static void CopyCharacters() throws IOException
    {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try
        {
            //in this method i am using Character Streams
            fileReader = new FileReader("poem.txt");
            fileWriter = new FileWriter("characteroutput.txt");

            int chars;

            while ((chars = fileReader.read()) != -1)
            {
                fileWriter.write(chars);
            }

        }
        finally
        {
            if (fileReader != null && fileWriter != null)
            {
                fileReader.close();
                fileWriter.close();
            }
        }
    }

    static void CopyLines() throws IOException
    {
        BufferedReader input = null;
        PrintWriter output = null;

        try
        {
            //in this method i am reading with line oriented io.
            input = new BufferedReader(new FileReader("poem.txt"));
            output = new PrintWriter(new FileWriter("characteroutput.txt"));

            String lines;

            while ((lines = input.readLine()) != null)
            {
                output.write(lines); //writes a line and appends line terminator in which os, the app is lunnin
            }

        }
        finally
        {
            if (input != null && output != null)
            {
                input.close();
                output.close();
            }
        }
    }
}
