package com.company.Bike_Pkg;

public class KidBike extends Bike implements IBike
{
    static
    {
        System.out.println("just a text in static block");
    }

    @Override
    public void speedUp(int newSpeed)
    {
        super.speedUp(newSpeed);
    }

    @Override
    public void changeGear(int newValue)
    {
        super.changeGear(newValue);
    }
}
