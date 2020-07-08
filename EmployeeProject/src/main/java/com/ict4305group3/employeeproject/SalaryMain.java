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
        System.out.println(e.getSalary());
        System.out.println(e.getName());
        Manager m = new Manager ("Karen", 51000);
        System.out.println(m.getName() + " , " + m.getSalary());
        m.raiseSalary(5);
        System.out.println(m.getSalary());
        e.raiseSalary(3);
        System.out.println(e.getSalary());
    }
}
