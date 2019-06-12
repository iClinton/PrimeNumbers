/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Clinton
 */
public class PrimeNumbersTest extends TestCase {
    
    public PrimeNumbersTest(String testName) {
        super(testName);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    @Override
    public void tearDown() throws Exception {
    }
    
//    @Override
//    protected void setUp() throws Exception {
//    }
//    
//    @Override
//    protected void tearDown() throws Exception {
//     }

    /**
     * Test of myNumbers method, of class PrimeNumbers.
     */
    @Test
    public void testMyNumbers() {
        System.out.println("myNumbers");
        PrimeNumbers instance = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.myNumbers();
        assertEquals(expResult, result);

    }
    
}
