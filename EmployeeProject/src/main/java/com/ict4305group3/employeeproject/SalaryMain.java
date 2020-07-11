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
public class SalaryMain {
    public static void main(String[] args) {
        Employee e = new Employee("John", 50000);
        Manager m = new Manager ("Karen", 51000);
        
        System.out.println("Salaries before rasie: ");
        System.out.println("Employee: " + e.getName() + ", Salary: " + e.getSalary());
        System.out.println("Manager: " + m.getName() + ", Salary: " + m.getSalary());
        
        m.raiseSalary(5);
        e.raiseSalary(3);
        
        System.out.println("\nSalaries after rasie: ");
        System.out.println("Employee: " + e.getName() + ", Salary: " + e.getSalary());
        System.out.println("Manager: " + m.getName() + ", Salary: " + m.getSalary());
    }
}
