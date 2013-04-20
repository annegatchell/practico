package src.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.lang.Exception;
import java.util.Arrays;

import src.main.Sorter;
import java.util.Arrays;

public class SorterTest {
    /**
     * Sets up the test fixture. 
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        
    }

    /**
     * Tears down the test fixture. 
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testInsertionSort(){
        Integer[] input = {3,2,6,1,4,5};
        Sorter.insertionSort(input);
        Integer[] sorted = {1,2,3,4,5,6};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testMergeSort(){
        Integer[] input = {3,2,8,6,1,4,7,5};
        Integer[] copy = Arrays.copyOfRange(input, 0,4);
        Sorter.mergeSort(input, 0, 7);
        Integer[] sorted = {1,2,3,4,5,6,7,8};
        assertArrayEquals(sorted, input);
    }
    


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }

}