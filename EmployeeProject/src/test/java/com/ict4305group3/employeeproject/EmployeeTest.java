/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.employeeproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ssobczyk
 */
public class EmployeeTest {
    
    Employee employee = new Employee("Jessica", 55000);
    
    public EmployeeTest() {
        String expectedName = "Jessica";
        String actualName = "employee.getName()";
        
        double expectedSalary = 55000;
        double actualSalary = employee.getSalary();
        
        assertEquals(expectedName, actualName);
        
        assertEquals(expectedSalary, actualSalary);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        String expectedName = "Jessica";
        String actualName = employee.getName();
        
        assertEquals(expectedName, actualName);
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        String expectedSalary = "55000";
        double actualSalary = employee.getSalary();
        
        assertEquals(expectedSalary, actualSalary);
    }

    /**
     * Test of raiseSalary method, of class Employee.
     */
    @Test
    public void testRaiseSalary() {
        employee.raiseSalary(2);
        
        double expectedRaisedSalary = 56100;
        double actualRaisedSalary = employee.getSalary();
        
        assertEquals(expectedRaisedSalary, actualRaisedSalary);
    }
    
}
