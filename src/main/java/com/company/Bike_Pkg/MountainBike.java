package com.company.Bike_Pkg;

public class MountainBike extends Bike
{
    private int seatHigh;
    private Boolean hasSomethingSpecial;


    MountainBike(int defaultSpeed, int defaultGear, int defaultSeatHigh, Boolean defaultHasSpecial)
    {
        /*
            super(defaultSpeed, defaultSpeed);
            base constructor of bike class
         */
        super(defaultGear, defaultSpeed);
        if (defaultSeatHigh < 0 || defaultSeatHigh > 10)
        {
            /*System.out.println("height between 1 and 10");
            return;*/
            throw new BikeException("height between 1 and 10");
        }

        this.seatHigh = defaultSeatHigh;
        this.hasSomethingSpecial = defaultHasSpecial;
    }

    public void setSeatHigh(int newHeight)
    {
        if (newHeight < 0 || newHeight > 10)
        {
            /*System.out.println("between 1 and ten");
            return;*/
            throw new BikeException("height between 1 and 10");
        }

        this.seatHigh = newHeight;
    }


    /*
        fields must be public for inherit them too
        Overriding toString()

     */
    @Override
    public String toString()
    {
        return String.format("new mountain bike: %d'\n', %b'\n', %d'\n' %d", this.seatHigh, this.hasSomethingSpecial,
                             super.gear, super.speed);
    }

}
