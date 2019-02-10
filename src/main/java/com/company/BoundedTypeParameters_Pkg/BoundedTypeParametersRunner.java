package com.company.BoundedTypeParameters_Pkg;

import java.text.MessageFormat;
import java.util.Date;

public class BoundedTypeParametersRunner {

    public static void Run() {
        // write your code here

        Box<Integer> integerBox = new Box<>();
        integerBox.set(45);

        integerBox.inspect(10);

        NaturalNumber<Short> naturalNumber = new NaturalNumber<>((short)330000000);
        System.out.println(naturalNumber.isEven() ? "par" : "impar");

        Box<Object> b = new Box<>(); // Box<Integer> has it's parent class java.lang.Object

        System.out.println(b.getClass().getName());

        int planet = 7;
        String event = "a disturbance in the Force";

        String result = MessageFormat.format(
                "At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
                planet, new Date(), event);

        System.out.println(result);
    }
}