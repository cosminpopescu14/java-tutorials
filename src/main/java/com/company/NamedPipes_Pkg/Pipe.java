package com.company.NamedPipes_Pkg;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Pipe
{
    public static final String PIPE_NAME = "\\\\.\\\\pipe\\\\test_pipe";

    public static void Run() throws IOException
    {
        RandomAccessFile pipe = null;
        try
        {
            pipe = new RandomAccessFile(PIPE_NAME, "rw");

            String echoText = "hope it works !!";
            pipe.write(echoText.getBytes());

            String echoResponse = pipe.readLine();
            System.out.println("Response: " + echoResponse );
        }
        finally
        {
            if (pipe != null)
            {
                pipe.close();
            }
            System.err.println("Pipe not open");
        }
    }
}
