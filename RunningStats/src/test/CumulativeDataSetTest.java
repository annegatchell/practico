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
//Test scientific notation
    @Test
    public void testScientificNotation(){
        System.out.println(0e0);
        System.out.printf("%.5e\n",0e0+3);
        long l = Long.MAX_VALUE;
        System.out.println(l);
        Long lmax = new Long(Long.MAX_VALUE);
        double dbl = lmax.doubleValue();
        System.out.printf("%.19e\n",dbl);
        assertEquals(l, dbl,0);
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
    public void testAverageSize1(){
        a.addSampleToSet(5.5);
        assertEquals(5.5, a.getAverage(), 0);
    }

    @Test
    public void testVarianceSize1(){
        a.addSampleToSet(5.5);
        assertEquals(0, a.getVariance(), 0);
    }

    @Test
    public void testStandardDeviationSize1(){
        a.addSampleToSet(5.5);
        assertEquals(0, a.getStandardDeviation(), 0);
    }

//Test different types
    @Test
    public void testAddingByte(){
        byte b = 4;
        a.addSampleToSet(b);
        b = 6;
        a.addSampleToSet(b);
        b = 5;
        a.addSampleToSet(b);
        assertEquals(5, a.getAverage(),0);
        assertEquals(2.0/3.0, a.getVariance(),0);
        assertEquals(Math.sqrt(2.0/3.0), a.getStandardDeviation(),0);
    }

    @Test
    public void testAddingMaxLongs(){
        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        long l3 = Long.MAX_VALUE;
        a.addSampleToSet(l1);
        a.addSampleToSet(l2);
        a.addSampleToSet(l3);
        //assertEquals(3074457345618260000)
        System.out.println(a.getAverage());
        System.out.println(a.getVariance());
        System.out.println(a.getStandardDeviation());
    }
    @Test
    public void testAddingMaxDoubles(){
        double l1 = Double.MAX_VALUE;
        double l2 = Double.MIN_VALUE;
        double l3 = Double.MAX_VALUE;
        a.addSampleToSet(l1);
        a.addSampleToSet(l2);
        a.addSampleToSet(l3);
       // assertEquals(3074457345618260000)
        System.out.println("\n"+l1);
        System.out.println(a.getAverage());
        System.out.println(a.getVariance());
        System.out.println(a.getStandardDeviation());
    }

    @Test
    public void testABunchOfDecimals(){
        double d1 = 3.56;
        double d2 = 18902.48838;
        double d3 = 2323.8438;
        double d4 = 5555;
        double d5 = 29;
        a.addSampleToSet(d1);
        a.addSampleToSet(d2);
        a.addSampleToSet(d3);
        a.addSampleToSet(d4);
        a.addSampleToSet(d5);
        System.out.println(10.0/3);
        assertEquals(5362.778436, a.getAverage(), 0);
        assertEquals(49953246.5736601, a.getVariance(), 0.00001);
        assertEquals(7067.76107219677, a.getStandardDeviation(), 0.00001);
        System.out.println(a.getAverage());
        System.out.println(a.getVariance());
        System.out.println(a.getStandardDeviation());
    }
    


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }

}