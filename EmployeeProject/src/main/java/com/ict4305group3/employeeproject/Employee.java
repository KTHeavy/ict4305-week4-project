/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.employeeproject;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class Employee {

    private String name;
    protected double salary;

    public Employee(String name, double salary)
    {
        if (salary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than "
                    + "or equal to 0");
        if (name.isBlank())
            throw new IllegalArgumentException("Name must have at least one letter");
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;    
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    };
    
       
        
};
