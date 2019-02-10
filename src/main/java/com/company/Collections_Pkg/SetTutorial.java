package com.company.Collections_Pkg;

import java.util.*;
import java.util.stream.Collectors;

public class SetTutorial
{
    public static void Run()
    {
        Employee employee = new Employee();
        employee.setFullName("Cosmin");
        employee.setAge(25);
        employee.setSsn("abcf1212121");
        employee.setSalary(123456789D);

        Employee employee1 = new Employee();
        employee.setFullName("Cosmin");
        employee.setAge(23);
        employee.setSsn("abcf1212121f");
        employee.setSalary(1234567489D);

        List<Employee> employeeList = Arrays.asList(employee, employee1);

        Collection<Employee> employeeCollections = new HashSet<Employee>(employeeList);

        //or

        employeeList.stream()
                .collect(Collectors.toSet());

        var words = Arrays.asList("cosmin", "cosmin", "gabi", "1", "1");
        Set<String> noDups = words
                .stream()
                .collect(Collectors.toSet()); //put into a set for no duplicates elements

        System.out.println(noDups);
    }
}
