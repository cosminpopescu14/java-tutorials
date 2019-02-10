package com.company.BoundedWildcards;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildcardsRunner {

    public static void Run() {
	// write your code here

        List<Double> integerList = Arrays.asList(1d, 2d, 3d, (double)6);
        System.out.println(SumOfList(integerList));



        System.out.println("---------------------------");
        PrintList(Arrays.asList(1, 2, null));
        PrintList(Arrays.asList("a", "b"));
        System.out.println("*********************************");
        String s = "cosmin";
        byte[] byteArray = s.getBytes(StandardCharsets.UTF_8);
        PrintList(Arrays.asList(new Object(), 2f, 'b', true, byteArray, Arrays.toString(byteArray/*"cosmin".getBytes()*/)));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        List<Number> integerList1 = new  ArrayList<>();
        AddNumbers(integerList1);

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number> numberList = new ArrayList<>(); //Integer extends Number

        List<? super Number> oLista = new ArrayList<>();
        oLista.add(1256);

        PrintList(oLista);
    }


    //List<? extends Number> - upper bounded wildcard
    // ? - wildcard in java :)
    //
    public static double SumOfList(List<? extends Number> list)
    {
        double sum = 0.0;

        for (Number number : list)
        {
            sum += number.doubleValue();
        }
        return sum;
    }

    //List<?> - list of unknown type
    // var works in foreach :)
    // can print any type of list
    public static void PrintList(List<?> aList)
    {
        for (var listElem : aList)
        {
            System.out.println(listElem);
        }
    }


    //lower
    public static void AddNumbers(List<? super Integer> list)
    {
        for (int i = 10; i > 0; i--)
        {
            list.add(i);
        }

        PrintList(list);
    }



}
