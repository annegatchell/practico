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
    
    @Test
    public void testSelectionSort(){
        Integer[] input = {3,2,8,6,1,4,7,5};
        Sorter.selectionSort(input);
        Integer[] sorted = {1,2,3,4,5,6,7,8};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void insertionSort2(){
        Integer[] input = {3,2,8,6,1,4,7,5};
        Sorter.insertionSort2(input);
        Integer[] sorted = {1,2,3,4,5,6,7,8};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void shellSort(){
        Integer[] input = {3,2,13,8,12,6,1,15,10,11,4,7,5,14,16,9};
        Sorter.shellSort(input);
        Integer[] sorted = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        assertArrayEquals(sorted, input);
        Integer[] input2 = Sorter.randomIntArray(100);
        Sorter.shellSort(input2);
        assertArrayEquals(Sorter.sortedIntArray0ToN(100),input2);
    }

    @Test
    public void shuffleTest(){
        Integer[] sorted = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Sorter.shuffle(sorted);
        //System.out.println(Arrays.toString(sorted));
        Integer[] randomArray = Sorter.randomIntArray(16);
        //System.out.println(Arrays.toString(randomArray));
    }

    @Test
    public void testMergeSort2(){
        Integer[] randomArray = Sorter.randomIntArray(100);
        Sorter.mergeSort2(randomArray);
        //System.out.println(Arrays.toString(randomArray));
        assertArrayEquals(Sorter.sortedIntArray0ToN(100), randomArray);
    }

    @Test
    public void testBUMergeSort(){
        System.out.println();
        Integer[] input = Sorter.randomIntArray(20);
        Sorter.bottomUpMergeSort(input);
        //System.out.println(Arrays.toString(input));
        assertArrayEquals(Sorter.sortedIntArray0ToN(20), input);
    }

    @Test
    public void testQuickSort(){
        int size = 200;
        Integer[] input = Sorter.randomIntArray(size);
        Sorter.quickSort(input);
        //System.out.println(Arrays.toString(input));
        assertArrayEquals(Sorter.sortedIntArray0ToN(size), input);
    }

    @Test
    public void testQuickSelect(){
        int size = 100;
        int k1 = 2;
        int k2 = size-2;
        int k3 = (size/3)*2;
        Integer k4 = size + 3;
        Integer[] input = Sorter.randomIntArray(size);
        assertEquals(new Integer(k1), Sorter.quickSelect(input, k1));
        assertEquals(new Integer(k2), Sorter.quickSelect(input, k2));
        assertEquals(new Integer(k3), Sorter.quickSelect(input, k3));
        assertEquals(null, Sorter.quickSelect(input, k4));

    }

    @Test
    public void testQuickSortEO(){
        int size = 20;
        Integer[] input = Sorter.randomIntArray(size);
        System.out.println(Arrays.toString(input));
        Sorter.quickSortEO(input);
        System.out.println(Arrays.toString(input));
        assertArrayEquals(Sorter.sortedIntArray0ToN(size), input);
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }



}