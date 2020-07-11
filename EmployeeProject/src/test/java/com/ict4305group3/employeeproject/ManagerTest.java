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
public class ManagerTest {
    
    Manager manager = new Manager("Manager Bob", 100000);
    
    /**
     * Test of Manager class.
     */
    public ManagerTest() {

        //getName variables
        String expectedName = "Manager Bob";
        String actualName = manager.getName();

        //getSalary variables
        double expectedSalary = 100000;
        double actualSalary = manager.getSalary();

        //Test getName()
        assertEquals(expectedName, actualName);

        //Test getSalary() initial
        assertEquals(expectedSalary, actualSalary);

    }
    
        /**
     * Test of thrown exception for salary argument, of class Manager.
     */
    @Test
    public void testSalaryIllegalArgumentException (){
        try {
            Manager manager = new Manager("Wendy", 0);
        } catch (IllegalArgumentException e) {
            String expectedError = "Salary cannot be less than or equal to 0";
            assertEquals(expectedError, e.getMessage());
        }
    }
    
    /**
     * Test of thrown exception for name argument, of class Manager.
     */
    @Test
    public void testNameIllegalArgumentException (){
        try {
            Manager manager = new Manager("", 1);
        } catch (IllegalArgumentException e) {
            String expectedError = "Name must have at least one letter";
            assertEquals(expectedError, e.getMessage());
        }
    }

    /**
     * Test of raiseSalary method, of class Manager.
     */
    @Test
    public void testRaiseSalary() {
        //raiseSalary by 5 + 1 percent
        manager.raiseSalary(5);
        
        //raisedSalary variables
        double expectedRaisedSalary = 106000;
        double actualRaisedSalary = manager.getSalary();
        
        //Test getSalary() rasied
        assertEquals(expectedRaisedSalary, actualRaisedSalary);
        
    }

}
