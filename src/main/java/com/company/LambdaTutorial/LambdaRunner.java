package com.company.LambdaTutorial;

public class LambdaRunner
{
    public static void Run()
    {
        Double res1 = Calculator.calculate(10d, 20d, (a, b) -> a + b);
        System.out.println(res1);
    }
}
