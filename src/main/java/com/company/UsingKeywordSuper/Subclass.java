package com.company.UsingKeywordSuper;

import java.util.AbstractMap;
import java.util.Set;

public class Subclass extends Superclass
{


    public void PrintMethod()
    {
        //inherit method from superclass
        super.PrintMethod();

        System.out.println("Printed in subclass");
    }

    public static void Run()
    {
	// write your code here
        Subclass s = new Subclass();
        s.PrintMethod();

        String myString = "a-bcdefgh";
        StringBuilder sb = new StringBuilder();


        System.out.println(myString.split("-")[1].substring(3));
        System.out.println(sb.append("cosmin").reverse());



    }
}
