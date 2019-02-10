package com.company.GenericMethods_Pkg;

public class GenericMethodsRunner {

    public static void Run()
    {
	// write your code here

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");

        boolean same = Utils.compare(p1, p2); // type inference

        System.out.println(same);
    }
}
