/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.employeeproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class EmployeeTest {
    
    Employee employee = new Employee("Jessica", 55000);

    public EmployeeTest() {
        String expectedName = "Jessica";
        String actualName = employee.getName();
        
        double expectedSalary = 55000;
        double actualSalary = employee.getSalary();
        
        assertEquals(expectedName, actualName);
        
        assertEquals(expectedSalary, actualSalary);
    }

    /**
     * Test of thrown exception for salary argument, of class Employee.
     */
    @Test
    public void testSalaryIllegalArgumentException (){
        try {
            Employee employee = new Employee("Jessica", 0);
        } catch (IllegalArgumentException e) {
            String expectedError = "Salary cannot be less than or equal to 0";
            assertEquals(expectedError, e.getMessage());
        }
    }
    
    /**
     * Test of thrown exception for name argument, of class Employee.
     */
    @Test
    public void testNameIllegalArgumentException (){
        try {
            Employee employee = new Employee("", 200000);
        } catch (IllegalArgumentException e) {
            String expectedError = "Name must have at least one letter";
            assertEquals(expectedError, e.getMessage());
        }
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
        double expectedSalary = 55000;
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
