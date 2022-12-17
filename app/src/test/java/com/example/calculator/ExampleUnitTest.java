package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }





    @Test
    public <Example> void testGetResult() {

        MainActivity mainActivity = new MainActivity();

        // Test the getResult() method with different input data
        assertEquals("5", mainActivity.getResult("2 + 3"));
        assertEquals("Err", mainActivity.getResult("2 + 3 +"));
        assertEquals("10", mainActivity.getResult("2 * 5"));
        assertEquals("2", mainActivity.getResult("10 / 5"));
    }


    @Test
    public void testGetResult1() {
        MainActivity mainActivity = new MainActivity();

        // Test a basic addition expression
        String result = mainActivity.getResult("2 + 3");
        assertEquals("5", result);

        // Test a more complex expression
        result = mainActivity.getResult("(2 + 3) * 4");
        assertEquals("20", result);

        // Test an invalid expression
        result = mainActivity.getResult("2 + + 3");
        assertEquals("Err", result);
    }
}


