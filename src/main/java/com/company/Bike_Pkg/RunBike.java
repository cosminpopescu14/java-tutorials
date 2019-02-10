package com.company.Bike_Pkg;

public class RunBike {

    public static void Run()
    {
	// write your code here



        var bike1 = new Bike(10, 3);
        Bike bike2 = new Bike(15, 3);

        MountainBike mountainBike = new MountainBike(5, 3, 4, false);

        var kidBike = new KidBike();

        bike1.speedUp(10);
        bike1.changeGear(2);


        bike2.speedUp(15);
        bike2.changeGear(-56);

        System.out.println(bike1.printStates());
        System.out.println(Bike.x);
        System.out.println(bike2.printStates());
        System.out.println("-------------------");
        System.out.println(mountainBike.toString());
        System.out.println("-------------------");
        System.out.println(kidBike.toString());

    }
}
