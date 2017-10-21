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
    * Test of tabTrie method, of class VectorHelper.
    */
    @Test
    public void testTabTrie() {
        System.out.println("tabTrie");
        int[] tab = {1,25,30,-30};
        int[] restab = {-30,1,25,30};
        int taille = 4;
       
        VectorHelper.tabTrie(tab, taille);
       // assert.assertArrayEquals(restab, tab);
        //assert.assertArrayEquals(restab, tab,);
        assertArrayEquals(restab, tab);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
    /**
     * Test of max method, of class VectorHelper.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int[] tab = {12,25,30,15,1258};
        int taille = 5;
        int expResult = 4;
        int result = VectorHelper.max(tab, taille);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    
    
    /**
     * Test of echanger method, of class VectorHelper.
     */
    @Test
    public void testEchanger() {
        System.out.println("echanger");
        int[] result = {350,12,500,40,15,1};
        int[] expResult = {350,12,500,40,15,1};
        int i = 0;
        int j = 0;
        VectorHelper.echanger(result, i, j);
        assertArrayEquals(expResult, result);
        System.out.println("premier test marche");
         i = 2;
         j = 5;
       int[] result1 = {350,12,500,40,15,1};
        int[] expResult1 = {350,12,1,40,15,500};
        VectorHelper.echanger(result1, i, j);
        assertArrayEquals(expResult1, result1);
        System.out.println("deuxieme test marche");

        // TODO review the generated test code and remove the default call to fail.
        
    }

 

    /**
     * Test of inverse method, of class VectorHelper.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        int[] result = {1,15,40,500,12,350};
        int[] expResult = {350,12,500,40,15,1};
        VectorHelper.inverse(result);
              assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
    /**
    * Test of somme method, of class VectorHelper.
    */
    @Test
    public void testSomme() throws Exception {
        System.out.println("somme \n la meme taille");
        int[] tab1 = {1,15,40};
        int[] tab2 = {1,15,40};
        int[] expResult ={2,30,80};
        int[] result = VectorHelper.somme(tab1, tab2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("somme \n la taille different");
        int[] tab11 = {1,15,40};
        int[] tab22 = {1,15,40,30};
        int[] expResult2 =null;
        int[] result2 = VectorHelper.somme(tab11, tab22);
        assertArrayEquals(expResult2, result2);
        
        
        
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
