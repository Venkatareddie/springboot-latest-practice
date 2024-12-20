package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinAvgSalary {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
            new Employee("Venkat", 50000.00),
            new Employee("Swathi", 40000.00),
            new Employee("Ram", 60000.00),
            new Employee("Sujatha", 55000.00)
        );

        Optional<Employee> maxSalaryEmployee= employees.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.empSal)));
        System.out.println("Max salary of the employee:"+maxSalaryEmployee.get().empSal);
        
        Optional<Employee> minSalaryEmployee= employees.stream().collect(Collectors.minBy(Comparator.comparing(e->e.empSal)));
        System.out.println("Min salary of the employee:"+minSalaryEmployee.get().empSal);
       Double  avgSalaryEmployee= employees.stream().collect(Collectors.averagingDouble(e->e.empSal));
        System.out.println("Average salary of the employee:"+avgSalaryEmployee);
        
    }


	// Employee class
static  class Employee {
        String empName;
        double empSal;

        // Constructor
        public Employee(String empName, double empSal) {
            this.empName = empName;
            this.empSal = empSal;
        }

        // Override toString method to display employee info
        @Override
        public String toString() {
            return "Employee [empName=" + empName + ", empSal=" + empSal + "]";
        }
    }
}
