package src.test;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Assert;
import java.lang.Exception;
import java.util.Arrays;

import src.main.Stack;
import java.util.Arrays;

public class StackTest {
    Stack<Integer> a;
    /**
     * Sets up the test fixture. 
     * (Called before every test case method.)
     */
    @Before
    public void setUp() {
        a = new Stack<Integer>(5);
        System.out.println(new Integer(3).getClass()+ " "+Integer.class);
        Stack<Integer> b = new Stack<Integer>(Integer.class,5);
    }

    /**
     * Tears down the test fixture. 
     * (Called after every test case method.)
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testPushPop(){
        try{a.push(1);}
        catch(Exception e){}
        try{a.push(2);}
        catch(Exception e){}
        try{a.push(3);}
        catch(Exception e){}
        try{a.push(4);}
        catch(Exception e){}
        try{a.push(5);}
        catch(Exception e){}
        Integer p = new Integer(-1);
        try{p = a.pop();}
        catch(Exception e){}
        assertEquals(5, p.intValue());
        try{p = a.pop();}
        catch(Exception e){}
        assertEquals(4, p.intValue());
        try{p = a.pop();}
        catch(Exception e){}
        assertEquals(3, p.intValue());
        try{p = a.pop();}
        catch(Exception e){}
        assertEquals(2, p.intValue());
        try{p = a.pop();}
        catch(Exception e){}
        assertEquals(1, p.intValue());
    }
    @Test
    public void testOverflow(){
        try{a.push(1);}
        catch(Exception e){}
        try{a.push(2);}
        catch(Exception e){}
        try{a.push(3);}
        catch(Exception e){}
        try{a.push(4);}
        catch(Exception e){}
        try{a.push(5);}
        catch(Exception e){}
        try{a.push(6);}
        catch(Exception e){
            assertEquals("Stack overflow", e.getMessage());
        }
    }

    @Test
    public void testUnderflow(){
        try{Integer i = a.pop();}
        catch(Exception e)
        {
            assertEquals("Stack underflow", e.getMessage());
        }
    }
    @Test
    public void testUnderflowAfterPush(){
        try{a.push(3);}
        catch(Exception e){}
        Integer i = new Integer(-1);
        try{i  = a.pop();}
        catch(Exception e){
            assertEquals(3, i.intValue());
        }
        
        try{a.pop();}
        catch(Exception e){
            assertEquals("Stack underflow",e.getMessage());
        }
    }

    
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("src.test.ElementTest");
    }

}