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
 * @author ipiesh
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
