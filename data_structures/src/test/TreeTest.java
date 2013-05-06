package src.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.lang.Exception;
import java.util.Arrays;

import src.main.BinaryTree;

public class TreeTest {
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
    public void testPut(){
        BinaryTree bt = new BinaryTree();
        bt.put(3, "silly");
        bt.put(1, "My");
        bt.put(2, "super");
        bt.put(3, "dumb");
    }

    @Test
    public void testGet(){
        BinaryTree bt = new BinaryTree();
        bt.put(3, "silly");
        bt.put(1, "My");
        bt.put(2, "super");
        assertEquals("super", bt.get(2));
        assertEquals("silly", bt.get(3));
        bt.put(3, "dumb");
        assertEquals("dumb", bt.get(3));

    }

    @Test
    public void testMin(){
        BinaryTree bt = new BinaryTree();
        bt.put(3, "silly");
        bt.put(1, "My");
        bt.put(2, "super");
        bt.put(3, "dumb");
        bt.put(4, "!!");
        assertEquals("My", bt.min());
        bt = new BinaryTree();
        assertEquals(null, bt.min());
    }

    @Test
    public void testMax(){
        BinaryTree bt = new BinaryTree();
        bt.put(3, "silly");
        bt.put(1, "My");
        bt.put(2, "super");
        bt.put(3, "dumb");
        bt.put(4, "!!");
        assertEquals("!!", bt.max());
        bt = new BinaryTree();
        assertEquals(null, bt.max());
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }



}