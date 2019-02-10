package com.company.InterfaceMethodOverridingAndHidingMethods_Pkg;

class HorseRunner
{
    public String identifyMyself()
    {
        return "I am a horse.";
    }

    public interface IFlyer
    {
        default public String identifyMysel()
        {
            return "i am able to fly";
        }
    }

    public interface IMythical
    {
        default public String identifyMyself()
        {
            return "i am a mythical creature";
        }
    }
}

class Pegasus extends HorseRunner implements HorseRunner.IFlyer, HorseRunner.IMythical
{
    public static void main(String... args)
    {

        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself()); // Instance methods are preferred over interface default methods.
    }
}