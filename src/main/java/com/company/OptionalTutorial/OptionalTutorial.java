package com.company.OptionalTutorial;

import com.company.Emplyeee;

import java.util.Optional;

public class OptionalTutorial
{
    Optional<Emplyeee> optionalEmplyeee = Optional.empty();

    static Emplyeee e = null;
    //Optional<Emplyeee> emplyeeeOptional = Optional.of(e); //throws npe

    /*
        Creating an optional from null. Things may be null :)
     */
    static Optional<Emplyeee> emplyeeeOptional1 = Optional.ofNullable(e);


    public static void Run()
    {
        if (!emplyeeeOptional1.isPresent())
            System.out.println("optional is null");

        System.out.println("it has value" + emplyeeeOptional1.get());

        //or
        emplyeeeOptional1.ifPresent(emplyeee -> {System.out.println("value:" + emplyeee);});
    }



}
