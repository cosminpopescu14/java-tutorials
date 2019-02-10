package com.company.LambdaTutorial;

//a functional interface has only one abstract method
@FunctionalInterface
public interface DoubleOperator
{
    public Double apply(Double operand1, Double operand2);
}
