package com.company.DefaultInterfaces_Pkg;

import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClientRunner implements ITimeClient
{

    private LocalDateTime dateAndTime;

    //private const int c = 1234;

    private SimpleTimeClientRunner()
    {
        this.dateAndTime = LocalDateTime.now();
    }

    @Override
    public void setTime(int hour, int minute, int second)
    {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }

    @Override
    public void setDate(int day, int month, int year)
    {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second)
    {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }

    public LocalDateTime getLocalDateTime()
    {
        return dateAndTime;
    }

    public String toString()
    {
        return dateAndTime.toString();
    }

    public static void Run()
    {
	// write your code here
        ITimeClient myTimeClient = new SimpleTimeClientRunner();
        System.out.println(myTimeClient.toString());

        System.out.println("Time in California: " +
                myTimeClient.getZonedDateTime("Europe/London").toString());
    }
}
