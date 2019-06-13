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
    @Override
    public void setUp() throws Exception {
    }

    @After
    @Override
    public void tearDown() throws Exception {
    }

    /**
     * Test of myNumbers method, of class PrimeNumbers.
     */
    @Test
    public void onetoHundred() {
        PrimeNumbers instance = new PrimeNumbers(0, 100);
        instance.myNumbers();
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(2);
        expResult.add(3);
        expResult.add(5);
        expResult.add(7);
        expResult.add(11);
        expResult.add(13);
        expResult.add(17);
        expResult.add(19);
        expResult.add(23);
        expResult.add(29);
        expResult.add(31);
        expResult.add(37);
        expResult.add(41);
        expResult.add(43);
        expResult.add(47);
        expResult.add(53);
        expResult.add(59);
        expResult.add(61);
        expResult.add(67);
        expResult.add(71);
        expResult.add(73);
        expResult.add(79);
        expResult.add(83);
        expResult.add(89);
        expResult.add(97);
        ArrayList<Integer> result = instance.myNumbers();
        assertEquals(expResult, result);
    }

    @Test
    public void onetoTen() {
        PrimeNumbers instance = new PrimeNumbers(0, 10);
        instance.myNumbers();
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(2);
        expResult.add(3);
        expResult.add(5);
        expResult.add(7);
        ArrayList<Integer> result = instance.myNumbers();
        assertEquals(expResult, result);
    }
}
