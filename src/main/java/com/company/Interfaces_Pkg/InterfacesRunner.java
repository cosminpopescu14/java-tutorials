package com.company.Interfaces_Pkg;

import java.util.ArrayList;
import java.util.List;

public class InterfacesRunner {



    public static void Run()
    {
	// write your code here
        Rectangle rectangle = new Rectangle(500, 1000);
        RectanglePlus rp = new RectanglePlus(10, 20);
        System.out.println(rp.FindLargest(rectangle, rp));


    }
}
