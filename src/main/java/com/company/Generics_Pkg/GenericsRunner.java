package com.company.Generics_Pkg;

import java.util.HashMap;
import java.util.Map;

public class GenericsRunner {

    public static void Run()
    {
	// write your code here

        //Box b = new Box();
        //ArrayStoreException arrayStoreException = new ArrayStoreException();
        //b.set(args);

        //System.out.println(b.get().toString().split("@")[1]);

        //System.out.println("---------------------");

        BoxGeneric<Integer> integerBoxGeneric = new BoxGeneric<>(); //<> the diamond. available since java se7

        integerBoxGeneric.setT(new Integer(45));
        System.out.println(integerBoxGeneric.getT());

        System.out.println("*********************************************");

        BoxGeneric<Object> objectBoxGeneric = new BoxGeneric<>();
        objectBoxGeneric.setT(new Thread());

        System.out.println(objectBoxGeneric.getT());

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        OrderedPair<Integer, String> orderedPair1 = new OrderedPair<>(1, "cosmin");

        OrderedPair<String, BoxGeneric<Integer>> orderedPair2 = new OrderedPair<String, BoxGeneric<Integer>>("cheie1", new BoxGeneric<Integer>(new Integer(45)));
        System.out.println(orderedPair1.getKey());
        System.out.println(orderedPair2.getValue().getT());


    }
}