package com.company.Enums_Pkg;

import java.util.Scanner;

public class EnumRunner {

    public static void Run()
    {
        EnumTest et = new EnumTest(Days.WEDNESDAY);
        et.SayAboutDays();

        System.out.println("--------------");

        /*if (args.length != 1)
        {
            System.err.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }*/

        double earthWeight = Double.parseDouble(new Scanner(System.in).nextLine());//Double.parseDouble(args[0]); //args[0] first argument

        double mass = earthWeight / Planets.EARTH.ComputeSurfaceGravity();

        for (Planets p : Planets.values())
        {
            System.out.printf("Your weight on %s is %f%n", p, p.ComputeSurfaceWeight(mass));
        }

        EnumRunner.Depercated();


    }

    @Deprecated
    public static void Depercated()
    {
        System.out.println("this is deparcated");
    }
}
