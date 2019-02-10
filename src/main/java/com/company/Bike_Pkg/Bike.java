package com.company.Bike_Pkg;

class Bike implements IBike
{
    private int id;
    int speed = 0;
    int gear = 1;

    static Object x = new Object();


    /*
        default constructor
     */
    Bike()
    {

    }

    Bike(int defaultSpeed, int defaultGear)
    {
        this.speed = defaultSpeed;
        this.gear = defaultGear;
        this.id = 0;
    }



    public void changeGear(int newValue)
    {
        if (newValue < 1 || newValue > 6)
        {
            System.out.println("gears must be between 1 and 6 ");
            return;
        }

        this.gear += newValue;
    }

    public void speedUp(int newSpeed)
    {
        this.speed += newSpeed;
    }

    public void applyBrakes(int decrement)
    {
        this.speed -= decrement;
    }

    String printStates()
    {
        return String.format("speed: %d, gear: %d", speed, gear );
    }

}
