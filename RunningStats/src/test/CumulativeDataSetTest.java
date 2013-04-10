package src.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.lang.Exception;
import java.util.Arrays;

import src.main.CumulativeDataSet;

public class CumulativeDataSetTest {
    CumulativeDataSet a;
    /**
     * Sets up the test fixture. 
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        a = new CumulativeDataSet();
    }

    /**
     * Tears down the test fixture. 
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

//Test cases for empty sets
    @Test
    public void testEmptyAverage(){
        assertEquals(Double.NaN, a.getAverage(), 0);
    }

    @Test
    public void testEmptyVariance(){
        assertEquals(Double.NaN, a.getVariance(), 0);
    }

    @Test
    public void testEmptyStandardDeviation(){
        assertEquals(Double.NaN, a.getStandardDeviation(), 0);
    }

//Test a case with a set of size 1
    @Test
    public void testEmptyAverage(){
        
        assertEquals(Double.NaN, a.getAverage(), 0);
    }

    @Test
    public void testEmptyVariance(){
        assertEquals(Double.NaN, a.getVariance(), 0);
    }

    @Test
    public void testEmptyStandardDeviation(){
        assertEquals(Double.NaN, a.getStandardDeviation(), 0);
    }


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }

}