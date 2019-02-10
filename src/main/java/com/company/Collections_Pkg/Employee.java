package com.company.Collections_Pkg;

import java.math.BigDecimal;

class Employee
{
    private String fullName;
    private int age;
    private String ssn; // smth like cnp :)
    private double salary;

    String getFullName()
    {
        return fullName;
    }

    void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public int getAge()
    {
        return age;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    String getSsn()
    {
        return ssn;
    }

    void setSsn(String ssn)
    {
        this.ssn = ssn;
    }

    Double getSalary()
    {
        return salary;
    }

    void setSalary(double salary)
    {
        this.salary = salary;
    }
}



