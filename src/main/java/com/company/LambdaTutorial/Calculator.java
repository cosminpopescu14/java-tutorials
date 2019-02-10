package com.company.LambdaTutorial;

import java.util.List;

class Calculator
{
    static Double calculate(Double op1, Double op2, DoubleOperator operator)
    {
        return operator.apply(op1, op1);
    }
}
