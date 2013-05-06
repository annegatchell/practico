package src.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.lang.Exception;
import java.util.Arrays;

import src.main.Sorter;
import src.main.Searcher;
import java.util.Arrays;

public class SearcherTest {
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
    public void testBinarySearch(){
        Integer[] input = Sorter.sortedIntArray0ToN(100);
        assertEquals(5, Searcher.binarySearch(input, 5));
        assertEquals(-1, Searcher.binarySearch(input, 101));
    }


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }



}