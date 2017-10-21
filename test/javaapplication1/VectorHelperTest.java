/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karim
 */
public class VectorHelperTest {
    
    public VectorHelperTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 

    /**
     * Test of getMinMax2 method, of class VectorHelper.
     */
    @Test
    public void testGetMinMax2() {
        System.out.println("getMinMax2");
        int[] tab = {0, 21000, 58, 326, 74, 8500};
        int taille = 6;
        int[] expResult = {0, 21000};
        int[] result = VectorHelper.getMinMax2(tab, taille);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of formule2 method, of class VectorHelper.
     */
    @Test
    public void testFormule2() {
        System.out.println("formule2");
        int[] tab = {21, 85, 0, 120, 10};
        int taille = 5;
        int[] expResult = {42, 170, 0, 240, 20};
        int[] result = VectorHelper.formule2(tab, taille);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
