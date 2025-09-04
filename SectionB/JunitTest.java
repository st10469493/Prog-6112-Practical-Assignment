/* 

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 

 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template 

 */ 

package rentacar; 

 

import java.util.ArrayList; 

import org.junit.jupiter.api.AfterEach; 

import org.junit.jupiter.api.AfterAll; 

import org.junit.jupiter.api.BeforeEach; 

import org.junit.jupiter.api.BeforeAll; 

import org.junit.jupiter.api.Test; 

import static org.junit.jupiter.api.Assertions.*; 

 

/** 

 * 

 * @author lab_services_student 

 */ 

public class RentaCarTest { 

     

    public RentaCarTest() { 

    } 

     

    @BeforeAll 

    public static void setUpClass() { 

    } 

     

    @AfterAll 

    public static void tearDownClass() { 

    } 

     

    @BeforeEach 

    public void setUp() { 

    } 

     

    @AfterEach 

    public void tearDown() { 

    } 

 

    /** 

     * Test of main method, of class RentaCar. 

     */ 

    @Test 

    public void testMain() { 

        System.out.println("main"); 

        String[] args = null; 

        RentaCar.main(args); 

        // TODO review the generated test code and remove the default call to fail. 

        fail("The test case is a prototype."); 

    } 

 

    /** 

     * Test of findVehicle method, of class RentaCar. 

     */ 

    @Test 

    public void testFindVehicle() { 

        System.out.println("findVehicle"); 

        ArrayList<Vehicle> list = null; 

        String id = ""; 

        Vehicle expResult = null; 

        Vehicle result = RentaCar.findVehicle(list, id); 

        assertEquals(expResult, result); 

        // TODO review the generated test code and remove the default call to fail. 

        fail("The test case is a prototype."); 

    } 

     

} 