package com.sumit.maths.calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testSquares() {
       Calculator calculator=new Calculator();
        int input = 7;           // input is predefined
        int expected = 49;
        int result = calculator.square(input);
        assertEquals(25,calculator.square(5));
        System.out.println("Square of " + input + " is " + result);
    }
}
