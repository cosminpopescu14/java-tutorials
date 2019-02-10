package com.company.Enums_Pkg;

public class EnumTest
{
    Days day;

    public EnumTest(Days _days)
    {
        this.day = _days;
    }

    public void SayAboutDays()
    {
        switch (day)
        {
            case MONDAY:
                System.out.println("hmmm.Mondays");
                break;

            case TUESDAY:
                System.out.println("joi it's ok");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("sometimes weekend can be boring");
                break;

            default:
                System.out.println("other week days are ok");
                break;
        }
    }
}
