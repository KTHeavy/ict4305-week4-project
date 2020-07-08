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
public class Manager extends Employee {
    public Manager(String name, double salary)
    {
        super(name, salary); 
        
    }
    @Override
    public void raiseSalary(double byPercent){
        double raise = super.getSalary() * (byPercent + 1) / 100;
        salary += raise;
    };
};
