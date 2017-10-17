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
 * @author cosmos 2011
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
        double[] tab = {1,25,30,-30};
        double[] restab = {-30,1,25,30};
        int taille = 4;
       
        VectorHelper.tabTrie(tab, taille);
       // assert.assertArrayEquals(restab, tab);
        //assert.assertArrayEquals(restab, tab,);
        assertArrayEquals(restab, tab, 0.000000000000000000000000000000000000000000000000001);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class VectorHelper.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        double[] tab = {12,25,30,15,1258.125};
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
        double[] result = {350,12.5,500,40,15.5,1.2};
        double[] expResult = {350,12.5,500,40,15.5,1.2};
        int i = 0;
        int j = 0;
        VectorHelper.echanger(result, i, j);
        assertArrayEquals(expResult, result,0.0000000000000000000000000000000001);
        System.out.println("premier test marche");
         i = 2;
         j = 5;
       double[] result1 = {350,12.5,500,40,15.5,1.2};
        double[] expResult1 = {350,12.5,1.2,40,15.5,500};
        VectorHelper.echanger(result1, i, j);
        assertArrayEquals(expResult1, result1,0.0000000000000000000000000000000001);
        System.out.println("deuxieme test marche");

        // TODO review the generated test code and remove the default call to fail.
        
    }

 

    /**
     * Test of inverse method, of class VectorHelper.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        double[] result = {1.20,15.5,40,500,12.5,350};
        double[] expResult = {350,12.5,500,40,15.5,1.2};
        VectorHelper.inverse(result);
              assertArrayEquals(expResult, result,0.0000000000000000000000000000000001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of somme method, of class VectorHelper.
     */
    @Test
    public void testSomme() throws Exception {
        System.out.println("somme");
        double[] tab1 = {1.20,15.5,40};
        double[] tab2 = {1.20,15.5,40};
        double[] expResult ={2.40,31,80};
        double[] result = VectorHelper.somme(tab1, tab2);
        assertArrayEquals(expResult, result,0.0000000000000000000000000000000001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
