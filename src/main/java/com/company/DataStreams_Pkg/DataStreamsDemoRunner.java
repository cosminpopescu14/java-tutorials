package com.company.DataStreams_Pkg;

import java.io.IOException;

public class DataStreamsDemoRunner
{
    public static void Run() throws IOException, InterruptedException
    {
        DataStreamDemo dataStreamDemo = new DataStreamDemo();

        dataStreamDemo.WriteFileWithDataOutputStreams();
        Thread.sleep(2000);
        dataStreamDemo.ReadFileWithDataInputStream();
    }
}
