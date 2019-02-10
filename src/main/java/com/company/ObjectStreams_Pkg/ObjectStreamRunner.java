package com.company.ObjectStreams_Pkg;

import java.io.IOException;

public class ObjectStreamRunner
{
    public static void Run() throws IOException, InterruptedException, ClassNotFoundException
    {
        var objectStreamDemo = new ObjectStreamDemo();

        objectStreamDemo.writeObject();
        Thread.sleep(1000);
        objectStreamDemo.readObject();
    }

}
